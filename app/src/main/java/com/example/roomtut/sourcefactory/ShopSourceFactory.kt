package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase
class ShopSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase> {
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Хаоси энэйси?",
                        "Куда идёшь?",
                        R.drawable.listening,
                        R.raw.villageone
                )
        )
        list.add(
                Phrase("Иду на автобусную остановку.",
                        "Автобуснай остановкачи энэ(й)и.",
                        R.drawable.listening,
                        R.raw.villagetwo
                )
        )
        list.add(
                Phrase("В твоём селе где тут администрация?",
                        "Ихонси хайду администрация би?",
                        R.drawable.listening,
                        R.raw.villagethree
                )
        )

        return list
    }
}