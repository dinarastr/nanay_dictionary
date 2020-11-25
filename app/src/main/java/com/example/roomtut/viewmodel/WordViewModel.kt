package com.example.roomtut.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.roomtut.data.WordDataBase
import com.example.roomtut.repository.WordRepository
import com.example.roomtut.model.Word
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application): AndroidViewModel(application) {

    private var repository: WordRepository

    init {
        val wordDao = WordDataBase.getDataBase(application).wordDao()
        repository = WordRepository(wordDao)
    }


    fun addWord(word: Word){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addWord(word)
        }
    }

    fun filterWords(
            word: String,
            pageSize: Int,
            offset: Int
    ): LiveData<List<Word>> = repository.filterWordsBy(
            word = word,
            pageSize = pageSize,
            offset = offset
    )

    fun loadAllWords(pageSize: Int, offset: Int): LiveData<List<Word>> {
        return repository.loadAllWords(pageSize = pageSize, offset = offset)
    }
}