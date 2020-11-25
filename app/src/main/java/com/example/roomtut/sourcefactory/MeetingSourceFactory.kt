package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class MeetingSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
            Phrase(
                "Как тебя зовут?",

                "Сӣ гэрбуси уй?",
                    R.drawable.listening,
                    R.raw.gerbuthirteen
            )
        )
        list.add(
            Phrase("Меня зовут Коля."+"\n"+"Меня зовут Таня.",
                "Мӣ гэрбуи Коля."+"\n"+"Мӣ гэрбуи Таня.",
                    R.drawable.listening,
                    R.raw.gerbufive
            )
        )
        list.add(
            Phrase("Моя фамилия Бельды.",
                "Мӣ халаи Бельды.",
                    R.drawable.listening,
                    R.raw.gerbunine
            )
        )
        list.add(
            Phrase("Ты где живёшь?",

                        "Сӣ хайду балди(й)си?",
                    R.drawable.listening,
                    R.raw.gerbuforteen
            )
        )
        list.add(
            Phrase("Я родил(ся/ась) в Даде.",

                        "Мӣ Да̄ду балдихамби.",
                    R.drawable.listening,
                    R.raw.gerbuseven
            )
        )
        list.add(
            Phrase(
                    "Я - житель(ница) Найхина, я живу в Даде, ты живёшь в Даде.",
                        "Мӣ Найхиӈкан, мӣ Даӈкан, сӣ Да̄ӈкан.",
                    R.drawable.listening,
                    R.raw.gerbueight
            )
        )
        list.add(
            Phrase("Я тут живу, в Хабаровске.",

                        "Мӣ эйду балди(й)и, Буриду.",
                    R.drawable.listening,
                    R.raw.gerbutwelve
            )
        )
        list.add(
            Phrase("Ты где работаешь?",

                        "Хайду дёбойси?",
                    R.drawable.listening,
                    R.raw.gerbueighteen
            )
        )
        list.add(
            Phrase("Я в школе работаю.",

                        "Мӣ школаду дёбо(й)и.",
                    R.drawable.listening,
                    R.raw.gerbueleven
            )
        )
        list.add(
            Phrase(
                    "Я - учитель.",

                        "Мӣ - ало̄симди.",
                    R.drawable.listening,
                    R.raw.gerbutwo
            )
        )
        list.add(
            Phrase("Тебе сколько лет?",

                        "Хаду сэ̄си?",
                    R.drawable.listening,
                    R.raw.gerbusixteen
            )
        )
        list.add(
            Phrase(
                    "Мне двадцать лет.",
                        "Мӣ хорин сэ̄и.",
                    R.drawable.listening,
                    R.raw.gerbuten
            )
        )
        return list
    }
}