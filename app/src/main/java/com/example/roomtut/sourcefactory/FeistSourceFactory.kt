package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class FeistSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "На этот праздник приезжает много людей!",
                        "Анячи эгди найсал дидий!",
                        R.drawable.listening,
                        R.raw.feistone
                )
        )
        list.add(
                Phrase("Я встретил(а) много друзей.",
                        "Эгди диасилби бачихамби.",
                        R.drawable.listening,
                        R.raw.feisttwo
                )
        )
        list.add(
                Phrase("Сегодня красиво пели и танцевали.",
                        "Эйниэ улэн дяричи гучи тэптэхэчи.",
                        R.drawable.listening,
                        R.raw.feistthree
                )
        )
        list.add(
                Phrase("Сегодня твой день рождения!",

                        "Эйниэ си балдихан иниси!",
                        R.drawable.listening,
                        R.raw.feistfour
                )
        )
        list.add(
                Phrase(
                        "Какой хороший праздник!",
                        "Хони улэн аня!",
                        R.drawable.listening,
                        R.raw.feistfive
                )
        )
        list.add(
                Phrase("Пусть всё будет хорошо!",
                        "Ая, улэн балдиусу!",
                        R.drawable.listening,
                        R.raw.feistsix
                )
        )
        list.add(
                Phrase("Счастливо живите!",
                        "Кэсику балдиусу!",
                        R.drawable.listening,
                        R.raw.feistseven
                )
        )
        list.add(
                Phrase("Новый год называется “Новый год”.",

                        "Сикун айнганиа гэрбуни “Новый год”.",
                        R.drawable.listening,
                        R.raw.feistnine
                )
        )
        list.add(
                Phrase("Какие праздники знаешь?",

                        "Хай анямбани сариси?",
                        R.drawable.listening,
                        R.raw.feistten
                )
        )

        return list
    }
}