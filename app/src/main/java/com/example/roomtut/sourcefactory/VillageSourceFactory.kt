package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class VillageSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase> {
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Хаоси энэйси?",
                        "Куда идёшь?",
                        R.drawable.listening,
                        R.raw.ixoxaosieneisi
                )
        )
        list.add(
                Phrase(
                        "Суэ хаоси энэйсу?",
                        "Вы куда идёте?",
                        R.drawable.listening,
                        R.raw.ixosuexaosieneisu
                )
        )
        list.add(
                Phrase("Иду на автобусную остановку.",
                        "Автобуснай остановкачи энэи.",
                        R.drawable.listening,
                        R.raw.ixoaftobusnaiostanofkaci
                )
        )
        list.add(
                Phrase("В твоём селе где тут администрация?",
                        "Сӣ ихондоаси хайду бини администрация?",
                        R.drawable.listening,
                        R.raw.ixosiixondoasixaiduadmin
                )
        )
        list.add(
                Phrase("Направо иди, затем налево поверни, потом вот так (прямо) иди.",
                        "А̄ӈгиа ба̄рони эну, тотапи деуӈгиа ба̄рони кэчэригу, тотара тэрэк эну.",
                        R.drawable.listening,
                        R.raw.ixoangiabaronienutotapi
                )
        )
        list.add(
                Phrase("Администрация ба̄рони пулсихэмби, заявление нирухэмби, районнай депутата ба̄рони нирухэмби.",
                        "В администрацию я пошёл/пошла, заявление написал(а), районному депутату написал(а).",
                        R.drawable.listening,
                        R.raw.ixoadministraciadeputat
                )
        )
        list.add(
                Phrase("У районного депутата я сказала про эту проблему. Он(а) сказал(а): Помогу, — сказал(а).",
                        "Районнай депутатаду уӈкимби  эй проблемава. Нёани уӈкини: Бэлэчиуриэ, — уӈки.",
                        R.drawable.listening,
                        R.raw.ixoraionnaideputatunkiproblema
                )
        )
        list.add(
                Phrase("Сюда-туда ходит.",
                        "Эуси-таоси пулсини.",
                        R.drawable.listening,
                        R.raw.ixoeositaosipulsini
                )
        )
        list.add(
                Phrase("Где тут продают рыбу?",
                        "Согдатава хайду ходасичи?",
                        R.drawable.listening,
                        R.raw.ixosogdatawaxaidu
                )
        )
        list.add(
                Phrase("К дому на берегу иди!",
                        "Вайла би дёкчи эугу!",
                        R.drawable.listening,
                        R.raw.ixowailajkci
                )
        )
        list.add(
                Phrase("Иди прямо, поверни налево, потом направо.",
                        "Туй эну, тотапи-тани сапси кирачи эну. ",
                        R.drawable.listening,
                        R.raw.ixotuienutotaptanisapsikiraci
                )
        )
        list.add(
                Phrase("Сто метров пройдя, затем в левую сторону поверни, потом  к берегу всё время иди.",
                        "Эм таӈго метэрду энэй, тотапи-тани деуӈгиан ба̄рони кэчэригу, тотара сапси кирачиани дек эну.",
                        R.drawable.listening,
                        R.raw.ixoemtangometrdu
                )
        )
        list.add(
                Phrase("Когда мы туда пойдём?",
                        "Халиа буэ таоси энэйпу?",
                        R.drawable.listening,
                        R.raw.ixowaliabuetaosieneipu
                )
        )
        list.add(
                Phrase("Таоси энэгуэри!",
                        "Туда пойдём!",
                        R.drawable.listening,
                        R.raw.ixotaosienegueri
                )
        )
        list.add(
                Phrase("Куда направляешься?",
                        "Хаоси дуэриси?",
                        R.drawable.listening,
                        R.raw.ixoxaosiduerisi
                )
        )

        return list
    }
}