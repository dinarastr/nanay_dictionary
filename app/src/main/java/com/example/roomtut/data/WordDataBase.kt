package com.example.roomtut.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomtut.model.RussianWord
import com.example.roomtut.model.Word

@Database(entities = [Word::class, RussianWord::class], version = 2, exportSchema = false)
abstract class WordDataBase: RoomDatabase() {
    abstract fun wordDao(): WordDao
    abstract fun RussianDao(): RussianDao

    companion object{
        @Volatile
        private var INSTANCE: WordDataBase? = null

        private val migration_1_2 = object : Migration(1, 2) {
            override fun migrate(dataBase: SupportSQLiteDatabase) {
                dataBase.execSQL("CREATE TABLE IF NOT EXISTS 'russian_to_nanay' ('id' INTEGER NOT NULL, " +
                        "'russian' TEXT NOT NULL, 'nanay' TEXT NOT NULL, " + "PRIMARY KEY('id'))")
            }
        }

        private val migration_3_2 = object : Migration(3, 2) {
            override fun migrate(dataBase: SupportSQLiteDatabase) {
                dataBase.execSQL("DROP TABLE IF EXISTS 'nanayy'")
            }
        }


        //private val migration_3_4 = object : Migration(3, 4) {
            //override fun migrate(dataBase: SupportSQLiteDatabase) {
                //dataBase.execSQL("DROP TABLE 'nanay - Лист1(3)'")
            //}
       // }

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
                .addMigrations(migration_1_2, migration_3_2)
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}