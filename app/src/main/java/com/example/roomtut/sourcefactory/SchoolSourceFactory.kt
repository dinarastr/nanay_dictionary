package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class SchoolSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Хорошо все люди в школе учатся.",
                        "Ая, хэмту най школаду тачиочӣчи.",
                        R.drawable.listening,
                        R.raw.shkaiaxemnaishkoladutacioci
                )
        )
        list.add(
                Phrase("В школу идите!",
                        "Школачи энэусу!",
                        R.drawable.listening,
                        R.raw.shkshkolacieneusu
                )
        )
        list.add(
                Phrase("Где находится у вас школа?",
                        "Хайду бӣни сунду школа?",
                        R.drawable.listening,
                        R.raw.shkxaidubinisundushkola
                )
        )
        list.add(
                Phrase("Наша школа вон там находится.",

                        "Буэ школапу то̄чикан бӣ.",
                        R.drawable.listening,
                        R.raw.shkbueshkolatocikan
                )
        )
        list.add(
                Phrase("Ты сделал(а) домашнее задание?",

                        "Домашнее задание тагохаси?",
                        R.drawable.listening,
                        R.raw.shkdomashneezadanie
                )
        )
        list.add(
                Phrase("Мне неинтересно.",

                        "Минду эрдэӈгэ ана̄.",
                        R.drawable.listening,
                        R.raw.shkminduerdengeana
                )
        )
        list.add(
                Phrase("Ну, пойдём, детка.",

                        "Гэ, энэгуэри, поя!",
                        R.drawable.listening,
                        R.raw.shkgeenegueripoia
                )
        )
        list.add(
                Phrase("Давай, урок заканчивается, пойдём играть! Давай, пошли!",

                        "Гэ, урок ходиачӣни, хупиндэгуэри. Гэ, энэгуэри!",
                        R.drawable.listening,
                        R.raw.shkurokxodiacini
                )
        )
        list.add(
                Phrase("Какой следующий урок?",

                        "Хай урокани гучи одӣни?",
                        R.drawable.listening,
                        R.raw.shkxaiurokaniodini
                )
        )
        list.add(
                Phrase("Не носись!",

                        "Эди хасира!",
                        R.drawable.listening,
                        R.raw.shkedixasira
                )
        )
        list.add(
                Phrase("Помоги мне!",

                        "Мимбивэ бэлэчиу!",
                        R.drawable.listening,
                        R.raw.shkmimbiwebeleciu
                )
        )
        list.add(
                Phrase("Я тебе помогаю.",

                        "Мӣ симбивэ бэлэчии.",
                        R.drawable.listening,
                        R.raw.shkmisimbiwebelecii
                )
        )
        return list
    }
}