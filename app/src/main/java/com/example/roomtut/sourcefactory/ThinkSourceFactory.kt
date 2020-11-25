package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class ThinkSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Ешь!",
                        "Сиару!",
                        R.drawable.listening,
                        R.raw.foodone
                )
        )
        list.add(
                Phrase("Вкусно!",
                        "Амта!",
                        R.drawable.listening,
                        R.raw.foodtwo
                )
        )
        list.add(
                Phrase("Передай, пожалуйста, нож / палочки.",
                        "Кучэмба / соргова бӯру.",
                        R.drawable.listening,
                        R.raw.foodthree
                )
        )
        list.add(
                Phrase("Сегодня у нас полынный суп, копчёная рыба и чай с солима.",

                        "Эйниэ соакта чолони, лала силумэ согдатади, гучи чаи солимади сиарипу.",
                        R.drawable.listening,
                        R.raw.foodfour
                )
        )
        return list
    }
}