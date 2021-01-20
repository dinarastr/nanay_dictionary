package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase
class GreetingSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase> {
        val list = ArrayList<Phrase>()
        list.add(
            Phrase(
                "Здравствуйте!",

                        "Ба̄чигоапу!",
                    R.drawable.listening,
                    R.raw.bacbacigoapu
            )
        )
        list.add(
            Phrase("Как дела?",
                "Хо̄ни бӣси?",
                    R.drawable.listening,
                    R.raw.bacxonibisi
            )
        )
        list.add(
            Phrase("Хорошо. Хорошо. Хорошо у нас.",
                "Улэн. Улэн би. Ая бипу.",
                    R.drawable.listening,
                    R.raw.baculebipu
            )
        )

        list.add(
            Phrase("Все люди хорошо живут, здоровы.",

                "Хэмту най улэн би, ая.",
                R.drawable.listening,
                R.raw.bacxemtuule
            )
        )

        list.add(
                Phrase("Плохо!",

                        "Ай, чукин!...",
                        R.drawable.listening,
                        R.raw.baccuki
                )
        )

        list.add(
                Phrase("Ты откуда приехал(а)?",

                        "Сӣ хаяди дидюхэси?",
                        R.drawable.listening,
                        R.raw.bacsixaiadidijuxesi
                )
        )

        list.add(
                Phrase("Что нового?",

                        "Хай мэдэ?",
                        R.drawable.listening,
                        R.raw.bacxaimede
                )
        )

        list.add(
            Phrase("Что нового? Новости хорошие...",

                "Хай мэдэ? Мэдэ улэн...",
                R.drawable.listening,
                R.raw.bacxaimedemedeaba
            )
        )


        list.add(
            Phrase(
                "Ничего нового...",
                "Мэдэ аба...",
                    R.drawable.listening,
                    R.raw.bacmedeaba
            )
        )
        list.add(
            Phrase("Спасибо!",
                "Баниха! Вакади кэсиэ",
                    R.drawable.listening,
                    R.raw.bacbanixa
            )
        )
        list.add(
            Phrase("Что делаешь?",

                "Хайва тайси?",
                    R.drawable.listening,
                    R.raw.bacxaiwataisi
            )
        )
        list.add(
            Phrase(
                "Ничего не делаю.",

                "Хайва-да тарасимби.",
                    R.drawable.listening,
                    R.raw.bacxaiwadatarasimbi
            )
        )
        list.add(
            Phrase("Всего хорошего тебе/вам!",

                "Улэн биу(су)!",
                    R.drawable.listening,
                    R.raw.baculebiusu
            )
        )
        list.add(
            Phrase(
                "До свидания! (остающемуся)",
                "Пэдэм дэрэдигу!",
                    R.drawable.listening,
                    R.raw.bacpedemderedigu
            )
        )
        list.add(
                Phrase(
                        "До свидания! (остающимся)",
                        "Пэдэм дэрэдигусу!",
                        R.drawable.listening,
                        R.raw.bacpedemderedigusu
                )
        )
        list.add(
            Phrase(
                "До свидания! (уходящему)",
                "Пэдэм эну!",
                    R.drawable.listening,
                    R.raw.bacpedemenu
            )
        )
        list.add(
            Phrase(
                "До свидания! (уходящим)",
                "Пэдэм энусу!",
                    R.drawable.listening,
                    R.raw.bacpedemenusu
            )
        )
        return list
    }
}