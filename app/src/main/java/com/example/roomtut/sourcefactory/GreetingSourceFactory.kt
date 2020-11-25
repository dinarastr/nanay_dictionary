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
                    R.raw.bachione
            )
        )
        list.add(
            Phrase("Как дела?",
                "Хо̄ни бӣси?",
                    R.drawable.listening,
                    R.raw.bachitwo
            )
        )
        list.add(
            Phrase("Хорошо.",
                "Улэн.",
                    R.drawable.listening,
                    R.raw.bachithree
            )
        )
        list.add(
            Phrase("Плохо!",

                "Ай, чукин!...",
                    R.drawable.listening,
                    R.raw.bachifour
            )
        )
        list.add(
            Phrase("Что нового?",

                "Хай мэдэ?",
                    R.drawable.listening,
                    R.raw.bachifive
            )
        )
        list.add(
            Phrase(
                "Ничего нового...",
                "Мэдэ аба...",
                    R.drawable.listening,
                    R.raw.bachisix
            )
        )
        list.add(
            Phrase("Сегодня стало пасмурно, не выходи наружу.",
                "Эйниэ тугдэ осини эди боачи ниэрэ.",
                    R.drawable.listening,
                    R.raw.bachiseven
            )
        )
        list.add(
            Phrase("Спасибо!",
                "Баниха! Вакади кэсиэ",
                    R.drawable.listening,
                    R.raw.bachieight
            )
        )
        list.add(
            Phrase("Что делаешь?",

                "Хайва тайси?",
                    R.drawable.listening,
                    R.raw.bachinine
            )
        )
        list.add(
            Phrase(
                "Ничего не делаю.",

                "Хайва-да тарасимби.",
                    R.drawable.listening,
                    R.raw.bachiten
            )
        )
        list.add(
            Phrase("Всего хорошего тебе/вам!",

                "Улэн биу(су)!",
                    R.drawable.listening,
                    R.raw.bachieleven
            )
        )
        list.add(
            Phrase(
                "До свидания! (остающемуся)",
                "Пэдэм дэрэдигу!",
                    R.drawable.listening,
                    R.raw.bachitweve
            )
        )
        list.add(
            Phrase(
                "До свидания! (уходящему)",
                "Пэдэм эну!",
                    R.drawable.listening,
                    R.raw.bachithirteen
            )
        )
        list.add(
            Phrase(
                "До свидания! (уходящим)",
                "Пэдэм энусу!",
                    R.drawable.listening,
                    R.raw.bachiforteen
            )
        )
        return list
    }
}