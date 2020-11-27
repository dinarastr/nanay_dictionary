package com.example.roomtut.repository

import androidx.lifecycle.LiveData
import com.example.roomtut.data.RussianDao
import com.example.roomtut.data.WordDao
import com.example.roomtut.model.RussianWord
import com.example.roomtut.model.Word

class WordRepository(private val wordDao: WordDao, private val russianDao: RussianDao) {

    suspend fun addWord(newWord: Word) {
        wordDao.addWord(newWord)
    }

    suspend fun addRussianWord(newWord: RussianWord) {
        russianDao.addWord(newWord)
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

    fun filterRussianWordsBy(
        word: String,
        pageSize: Int,
        offset: Int
    ): LiveData<List<RussianWord>> = russianDao.filterRussian(
        name = "$word%",
        pageSize = pageSize,
        offset = offset
    )

    fun loadAllWords(pageSize: Int, offset: Int): LiveData<List<Word>> = wordDao.readAllData(
            pageSize = pageSize,
            offset = offset
    )

    fun loadAllRussianWords(pageSize: Int, offset: Int): LiveData<List<RussianWord>> = russianDao.readAllRussianData(
        pageSize = pageSize,
        offset = offset
    )
}