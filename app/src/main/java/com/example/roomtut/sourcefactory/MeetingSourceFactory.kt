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
                    R.raw.misigerbusiuj
            )
        )
        list.add(
            Phrase("Мӣ гэрбуи Нина."+"\n"+"Меня зовут Коля."+"\n"+"Меня зовут Таня.",
                "Мӣ гэрбуи Нина."+"\n"+"Мӣ гэрбуи Коля."+"\n"+"Мӣ гэрбуи Таня.",
                    R.drawable.listening,
                    R.raw.mimigerbui
            )
        )
        list.add(
                Phrase("Как твоя фамилия?",
                        "Сӣ халаси хо̄ни бӣ?",
                        R.drawable.listening,
                        R.raw.misixalasi
                )
        )
        list.add(
            Phrase("Моя фамилия Бельды.",
                "Мӣ халаи Бельды.",
                    R.drawable.listening,
                    R.raw.mimixalai
            )
        )
        list.add(
            Phrase("Ты где живёшь?",

                        "Сӣ хайду балдиси?",
                    R.drawable.listening,
                    R.raw.misixaidubaldisi
            )
        )
        list.add(
                Phrase(
                        "Я живу в Ачане, в Амурском районе, Хабаровский край. Я тут живу, в Хабаровске.",
                        "Мӣ балдии Ачанду, Амурскай районду, Хабаровскай край. Мӣ эйду балдии, Буриду.",
                        R.drawable.listening,
                        R.raw.mimibaldii
                )
        )
        list.add(
                Phrase(
                        "Я - житель(ница) Найхина, я живу в Даде, ты живёшь в Даде.",
                        "Мӣ Найхиӈкан, мӣ Даӈкан, сӣ Да̄ӈкан.",
                        R.drawable.listening,
                        R.raw.minaixinka
                )
        )
        list.add(
            Phrase("Я родил(ся/ась) в Даде.",

                        "Мӣ Да̄ду балдихамби.",
                    R.drawable.listening,
                    R.raw.mimibaldixambi
            )
        )

        list.add(
                Phrase("Тебе сколько лет?",

                        "Хаду сэ̄си?",
                        R.drawable.listening,
                        R.raw.mixadusesi
                )
        )
        list.add(
                Phrase(
                        "Мне двадцать лет.",
                        "Мӣ хорин сэ̄и.",
                        R.drawable.listening,
                        R.raw.mimixorinsesi
                )
        )
        list.add(
                Phrase(
                        "Я тебя знаю.",
                        "Мӣ симбивэ са̄хамби.",
                        R.drawable.listening,
                        R.raw.mimisimbiwesaxambi
                )
        )







        return list
    }
}