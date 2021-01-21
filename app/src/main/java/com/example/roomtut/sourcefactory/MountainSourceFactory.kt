package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class MountainSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "В лес чтобы идти — крепкую, хорошую обувь бери. Чтобы идти крепкую одежду бери.",
                        "Пурэн ба̄рони энэгуй — маси, улэн отава дяпу. Энэгуи маси хадёмба дяпу.",
                        R.drawable.listening,
                        R.raw.puulexajomba
                )
        )
        list.add(
                Phrase("И обувь... Хорошую, крепкую обувь бери.",
                        "Гучи отава... Улэн, маси отава дяпу!",
                        R.drawable.listening,
                        R.raw.puotawajapu
                )
        )
        list.add(
                Phrase("Мои штаны — удобные.",
                        "Мӣ пэруи намчиан.",
                        R.drawable.listening,
                        R.raw.pumiperuinamca
                )
        )
        list.add(
                Phrase("Твоя ноша слишком тяжела. Твой рюкзак слишком тяжёлый. Твой рюкзак тяжёл.",

                        "Сӣ пинаси кэту маӈга. Сӣ пинаси кэту хуйгэ. Сӣ пинаси хуйгэни.",
                        R.drawable.listening,
                        R.raw.pusipinasi
                )
        )
        list.add(
                Phrase("Тебе помочь? Ну, я тебе помогу!",

                        "Мӣ симбивэ бэлэчигуи? Гэ̄, симбивэ бэлэчиамби!",
                        R.drawable.listening,
                        R.raw.pumisimbiwebeleci
                )
        )
        list.add(
                Phrase("Вы если устали, давайте отдохнём!",

                        "Суэ идахаси осини, тэиӈгоари!",
                        R.drawable.listening,
                        R.raw.pusiidaxasi
                )
        )
        list.add(
                Phrase("Сейчас уже придём!",

                        "Эси исидяпу!",
                        R.drawable.listening,
                        R.raw.puesiisijapu
                )
        )
        list.add(
                Phrase("Здесь - сопка Тордоки-Яни, а там Анюй течёт.",

                        "Эйду — хурэ̄н Тордоки-Яни, чаду — Они хэейни.",
                        R.drawable.listening,
                        R.raw.pueidutordokiiani
                )
        )
        list.add(
                Phrase("Можно ловить рыбу?",

                        "Согдатава ва̄ми ая-ну?",
                        R.drawable.listening,
                        R.raw.pusogdatawamiaia
                )
        )
        list.add(
                Phrase("Нельзя. / Можно (хорошо).",

                        "Ачаси. / Ая.",
                        R.drawable.listening,
                        R.raw.puacasiaia
                )
        )
        list.add(
                Phrase("Огонь весь погас.",

                        "Тава хэм суптэхэни.",
                        R.drawable.listening,
                        R.raw.putawaxemsuptexeni
                )
        )
        list.add(
                Phrase("Костёр разожги.",

                        "Тавава иванду.",
                        R.drawable.listening,
                        R.raw.putawawaiwandu
                )
        )
        list.add(
                Phrase("На, возьми спички!",

                        "Ма, спичкэвэ дяпу!",
                        R.drawable.listening,
                        R.raw.pumaspickewejapu
                )
        )
        list.add(
                Phrase("За клюквой пойдём!",

                        "Гактава нанигоари!",
                        R.drawable.listening,
                        R.raw.pugaktawananigoari
                )
        )
        list.add(
                Phrase("Грибы в лес собирать пойдём!",

                        "Могова дуэнтэчи нанигоари!",
                        R.drawable.listening,
                        R.raw.pumogowaduenteci
                )
        )
        return list
    }
}