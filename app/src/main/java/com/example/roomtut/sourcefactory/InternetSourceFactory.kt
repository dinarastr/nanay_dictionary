package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class InternetSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "У тебя ватсап есть?",
                        "Синду вачап бӣ?",
                        R.drawable.listening,
                        R.raw.intsinduvacapbi
                )
        )
        list.add(
                Phrase("Давай поговорим в ватсапе!",
                        "Хисаӈгосигоари вачападу!",
                        R.drawable.listening,
                        R.raw.intxisangogoarivacapdu
                )
        )
        list.add(
                Phrase("Позвони мне!",
                        "Минчи званилу!",
                        R.drawable.listening,
                        R.raw.intmincizvanilu
                )
        )
        list.add(
                Phrase("Мне напиши.",

                        "Минду ниру, минчи ниру.",
                        R.drawable.listening,
                        R.raw.intminduniruminciniru
                )
        )
        list.add(
               Phrase("Запиши звуковое сообщение! Запиши голосовуху!",

                       "Дилганди унду! Хэсэди унду!",
                      R.drawable.listening,
                        R.raw.intdilgandundu
                )
        )
        list.add(
                Phrase("Мне напиши письмо.",

                        "Минду ниру бичхэвэ.",
                        R.drawable.listening,
                        R.raw.intmindunirubicxewe
                )
        )
        list.add(
                Phrase("У меня плохо работает  интернет.",

                        "Мӣ чукин интернет дёбойни.",
                        R.drawable.listening,
                        R.raw.intminducukiinternet
                )
        )
        list.add(
                Phrase("Я не могу с тобой поговорить.",

                        "Мӣ синди хисаӈгоми мутэ̄симби.",
                        R.drawable.listening,
                        R.raw.intmisindixisangomimutesimbi
                )
        )
        list.add(
                Phrase("Смотри что я нашёл/нашла в интернете.",

                        "Ичэу хайва мӣ ба̄хамби интернетаду.",
                        R.drawable.listening,
                        R.raw.inticeuxaiwami
                )
        )
        list.add(
                Phrase("Ссылку/сайт мне пришли.",

                        "Сайтава минчи уйгу.",
                        R.drawable.listening,
                        R.raw.intsaitawauigu
                )
        )
        return list
    }
}