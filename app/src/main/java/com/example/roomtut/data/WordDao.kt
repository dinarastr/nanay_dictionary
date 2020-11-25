package com.example.roomtut.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomtut.model.Word


@Dao
interface WordDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addWord(word: Word)

    @Query("SELECT * FROM talysh_to_russian ORDER BY id ASC LIMIT :pageSize OFFSET :offset")
    fun readAllData(pageSize: Int, offset: Int): LiveData<List<Word>>

    @Query("SELECT * FROM talysh_to_russian WHERE talysh LIKE :name LIMIT :pageSize OFFSET :offset")
    fun filter(name: String, pageSize: Int, offset: Int): LiveData<List<Word>>
}