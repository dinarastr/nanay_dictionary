package com.example.roomtut.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomtut.model.Word

@Database(entities = [Word::class], version = 1, exportSchema = false)
abstract class WordDataBase: RoomDatabase() {
    abstract fun wordDao(): WordDao

    companion object{
        @Volatile
        private var INSTANCE: WordDataBase? = null

        fun getDataBase(context: Context): WordDataBase{
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordDataBase::class.java,
                    "talysh_to_russian",
                ).createFromAsset("talysh_to_russian")
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}