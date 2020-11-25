package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class FamilySourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Моя родня!",
                        "Мӣ дёӈкамби!",
                        R.drawable.listening,
                        R.raw.familyone
                )
        )
        list.add(
                Phrase("Это моя семья: моя мама, мой папа, мой/я младший брат/сестра, мой старший брат, моя старшая сестра.",
                        "Дёнкамби - эй эйнемби,  амимби, нэуи, агби, эйкэи.",
                        R.drawable.listening,
                        R.raw.familytwo
                )
        )

        return list
    }
}