package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class FishingSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Сегодня рыбачить сеткой ходили?",
                        "Эйниэ нарими пулсихэсу?",
                        R.drawable.listening,
                        R.raw.sogeinienarimipulsixesu
                )
        )
        list.add(
                Phrase("Я рыбу поймать поехал.",
                        "Мӣ согдатава ва̄ндами энэ̄мби.",
                        R.drawable.listening,
                        R.raw.sogmisogdatawawandami
                )
        )
        list.add(
                Phrase("Рыбу поймать поедемте!",
                        "Согдатава ва̄ндамари энэгуэри!",
                        R.drawable.listening,
                        R.raw.sogsogdatawawamienegueri
                )
        )
        list.add(
                Phrase("На твоей лодке быстро ехать.",

                        "Огдадиаси тургэн энэури. ",
                        R.drawable.listening,
                        R.raw.sogogdadiasiturge
                )
        )
        list.add(
                Phrase("На этой твоей лодке медленно ехать.",

                        "Эй сӣ огдадиаси элкэн энэури.",
                        R.drawable.listening,
                        R.raw.sogeiogdadiasielke
                )
        )
        list.add(
                Phrase("Что медлишь?",

                        "Хайва ня̄доалайси?",
                        R.drawable.listening,
                        R.raw.sogxaiwaniadalaisi
                )
        )
        list.add(
                Phrase("Быстро греби!",

                        "Тургэн гиолиу!",
                        R.drawable.listening,
                        R.raw.sogturgengioliu
                )
        )
        list.add(
                Phrase("Вот здесь много рыбы.",

                        "Эйду согдата эгди.",
                        R.drawable.listening,
                        R.raw.sogeidusogdataegdi
                )
        )
        list.add(
                Phrase("Как ловить?",

                        "Хо̄ни ва̄ори?",
                        R.drawable.listening,
                        R.raw.sogxoniwaori
                )
        )
        list.add(
                Phrase("Сеткой, удочкой... ещё как рыбачить.",

                        "Адолиди, умэкэ̄нди... гучи хо̄ни вайчаори.",
                        R.drawable.listening,
                        R.raw.sogadolidiumekendi
                )
        )
        list.add(
                Phrase("Щуку, карася, кету, сазана, сома, разную рыбу я наловил(а).",

                        "Гӯчэ̄мбэ, хаӈгова, давава, кэчӣвэ, лахава, гой-гой согдатава ва̄хамби.",
                        R.drawable.listening,
                        R.raw.soggucembexangowa
                )
        )
        list.add(
                Phrase("Хватит рыбу ловить перестаньте!",

                        "Элэ согдатава ва̄вари ходиосо!",
                        R.drawable.listening,
                        R.raw.sogelesogdatawawawari
                )
        )
        list.add(
                Phrase("Поехали домой!",

                        "Дёкчи энэгуэри.",
                        R.drawable.listening,
                        R.raw.sogjokcienegueri
                )
        )
        list.add(
                Phrase("Много наловили?",

                        "Эгди ва̄хасо-ну?",
                        R.drawable.listening,
                        R.raw.sogegdiwaxasonu
                )
        )
        list.add(
                Phrase("Этим вечером, рыбача сеткой, мой отец сотню кетин наловил.",

                        "Эй сиксэ нарими амимби эмун таӈго давава ва̄хани.",
                        R.drawable.listening,
                        R.raw.sogeisikseamimbiemtango
                )
        )
        list.add(
                Phrase("Сетку хорошо положи, спрячь.",

                        "Адолива улэн нэ̄ру, дяяу.",
                        R.drawable.listening,
                        R.raw.sogadoliwaukenneru
                )
        )
        return list
    }
}