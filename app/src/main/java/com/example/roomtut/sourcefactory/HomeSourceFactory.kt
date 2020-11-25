package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class HomeSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Видишь три окна?",

                                "Илан пава ичэйси?",
                        R.drawable.listening,
                        R.raw.deone
                )
        )
        list.add(
                Phrase("Твой дом старый / новый?",
                        "Сӣ дёкси балапчи-ну, сикун-ну?",
                        R.drawable.listening,
                        R.raw.detwo
                )
        )
        list.add(
                Phrase("Это твой дом?",
                        "Эй сӣ дёкси-ну?",
                        R.drawable.listening,
                        R.raw.dethree
                )
        )
        list.add(
                Phrase("Это мой дом.",

                        "Эй м̄и дёи.",
                        R.drawable.listening,
                        R.raw.defour
                )
        )
        list.add(
                Phrase("Заходи ко мне домой.",

                        "Ӣру ми дёкчии.",
                        R.drawable.listening,
                        R.raw.defive
                )
        )
        list.add(
                Phrase(
                        "В моём доме две комнаты.",
                        "Эй ми дёгдуи дюэр комната.",
                        R.drawable.listening,
                        R.raw.desix
                )
        )
        list.add(
                Phrase("Не бойся собаку!",

                        "Эй индади эди ӈэлэ!",
                        R.drawable.listening,
                        R.raw.deseven
                )
        )
        list.add(
                Phrase("Ставь обувь сюда!",

                        "Отаи эйду нэ̄ру!",
                        R.drawable.listening,
                        R.raw.deeight
                )
        )
        list.add(
                Phrase("Вешай одежду!",

                        "Эйду хадёмби ло̄ру!",
                        R.drawable.listening,
                        R.raw.denine
                )
        )
        list.add(
                Phrase(
                        "Проходи внутрь!",

                        "До̄чи ӣру!",
                        R.drawable.listening,
                        R.raw.deten
                )
        )
        list.add(
                Phrase("Выпьем чаю.",

                        "Чаива омигоари.",
                        R.drawable.listening,
                        R.raw.deeleven
                )
        )
        list.add(
                Phrase(
                        "Давай телевизор посмотрим.",
                        "Гэ, телевизорба ичэгоари.",
                        R.drawable.listening,
                        R.raw.detwelve
                )
        )

        list.add(
                Phrase(
                        "Давай послушаем музыку!",
                        "Дяримба досодигоари!",
                        R.drawable.listening,
                        R.raw.dethirteen
                )
        )
        list.add(
                Phrase(
                        "Давай послушаем эту песню.",
                        "Гэ эй дяримба досодигоари!",
                        R.drawable.listening,
                        R.raw.defourteen
                )
        )
        return list
    }
}