package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class KitchenSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Что сегодня будем готовить?",
                        "Хайва эйниэ пуювури?",
                        R.drawable.listening,
                        R.raw.puyurione
                )
        )
        list.add(
                Phrase("Что нужно по рецепту?",
                        "Пуюгуй хайва гэлэйни?",
                        R.drawable.listening,
                        R.raw.puyuritwo
                )
        )
        list.add(
                Phrase("Почисть картошку!",
                        "Эй дудуэсэвэ хорактава ачу!",
                        R.drawable.listening,
                        R.raw.puyurithree
                )
        )
        list.add(
                Phrase("Нарежь картошку / огурцы.",

                        "Дудуэсэвэ / хоаӈгоамба кучэнди ча̄су!",
                        R.drawable.listening,
                        R.raw.puyurifour
                )
        )
        list.add(
                Phrase("Надо варить суп в течение часа",

                        "Эй чоломба эм часаду пуюми ая",
                        R.drawable.listening,
                        R.raw.puyurifive
                )
        )
        list.add(
                Phrase(
                        "Попробуй, вкусно? Как?",
                        "Пэргу, улэн? Хонь би?",
                        R.drawable.listening,
                        R.raw.puyurisix
                )
        )
        list.add(
                Phrase("Добавь соль / сахар",

                        "Даосомба / сиатава гучи нэ̄ру",
                        R.drawable.listening,
                        R.raw.puyuriseven
                )
        )
        list.add(
                Phrase("Зажги огонь!",

                        "Тавава та̄ву!",
                        R.drawable.listening,
                        R.raw.puyurieight
                )
        )
        list.add(
                Phrase("Горячо!",

                        "Пэкэ!",
                        R.drawable.listening,
                        R.raw.puyurinine
                )
        )
        list.add(
                Phrase(
                        "Погрей!",

                        "Хулдиру!",
                        R.drawable.listening,
                        R.raw.puyuriten
                )
        )

        return list
    }
}