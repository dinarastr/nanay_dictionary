package com.example.roomtut.repository

import androidx.lifecycle.LiveData
import com.example.roomtut.data.WordDao
import com.example.roomtut.model.Word

class WordRepository(private val wordDao: WordDao) {

    suspend fun addWord(newWord: Word) {
        wordDao.addWord(newWord)
    }

    fun filterWordsBy(
            word: String,
            pageSize: Int,
            offset: Int
    ): LiveData<List<Word>> = wordDao.filter(
            name = "$word%",
            pageSize = pageSize,
            offset = offset
    )

    fun loadAllWords(pageSize: Int, offset: Int): LiveData<List<Word>> = wordDao.readAllData(
            pageSize = pageSize,
            offset = offset
    )
}