package com.example.roomtut.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.roomtut.data.WordDataBase
import com.example.roomtut.model.RussianWord
import com.example.roomtut.repository.WordRepository
import com.example.roomtut.model.Word
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application): AndroidViewModel(application) {

    private var repository: WordRepository

    init {
        val wordDao = WordDataBase.getDataBase(application).wordDao()
        val russianDao = WordDataBase.getDataBase(application).RussianDao()
        repository = WordRepository(wordDao, russianDao)
    }


    fun addWord(word: Word){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addWord(word)
        }
    }

    fun addRussianWord(word: RussianWord){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addRussianWord(word)
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

    fun filterRussianWords(
        word: String,
        pageSize: Int,
        offset: Int
    ): LiveData<List<RussianWord>> = repository.filterRussianWordsBy(
        word = word,
        pageSize = pageSize,
        offset = offset
    )

    fun loadAllWords(pageSize: Int, offset: Int): LiveData<List<Word>> {
        return repository.loadAllWords(pageSize = pageSize, offset = offset)
    }

    fun loadAllRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>> {
        return repository.loadAllRussianWords(pageSize = pageSize, offset = offset)
    }
}