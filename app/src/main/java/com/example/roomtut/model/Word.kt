package com.example.roomtut.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "talysh_to_russian")
data class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val talysh: String,
    val russian: String
): Parcelable