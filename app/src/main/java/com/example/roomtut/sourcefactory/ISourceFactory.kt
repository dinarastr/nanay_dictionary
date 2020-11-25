package com.example.roomtut.sourcefactory

import com.example.roomtut.model.Phrase

interface ISourceFactory {
    fun createDataSet (): List<Phrase>
}