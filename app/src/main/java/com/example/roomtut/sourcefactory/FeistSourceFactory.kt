package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class FeistSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Сегодня в селе большой праздник!",
                        "Эйниэ ихонду да̄и аня!",
                        R.drawable.listening,
                        R.raw.anieinieixondudaiania
                )
        )
        list.add(
                Phrase("Праздник у нас наступил, 22 августа, в Джуене, фестиваль «Аист над Амуром» наступил.",
                        "Аня бунду одини, 22 августаду, Джуенду, фестиваль \"Аист над Амуром\" одини.",
                        R.drawable.listening,
                        R.raw.anibunduaistnadamurom
                )
        )
        list.add(
                Phrase("На праздник приезжает много людей.",
                        "Анячи эгди найсал дидий.",
                        R.drawable.listening,
                        R.raw.anianiaciegdinaididii
                )
        )
        list.add(
                Phrase("Сегодня красиво пели и танцевали.",

                        "Эйниэ улэн дяричи, гучи тэптэхэчи.",
                        R.drawable.listening,
                        R.raw.anieinieulejarici
                )
        )
        list.add(
                Phrase(
                        "Эта девушка хорошо поёт, красиво!",
                        "Эй паталан улэн дярини, гучкули!",
                        R.drawable.listening,
                        R.raw.anieipatalaulejarini
                )
        )
        list.add(
                Phrase("Я встретил(а) много друзей.",
                        "Эгди диасилби ба̄чихамби.",
                        R.drawable.listening,
                        R.raw.aniegdidiasilbacixambi
                )
        )
        list.add(
                Phrase("Сегодня твой день рождения!",
                        "Эйниэ си балдихан иниси.",
                        R.drawable.listening,
                        R.raw.anieiniesibaldixanini
                )
        )
        list.add(
                Phrase("Какой хороший праздник!",

                        "Хо̄ни улэн аня!",
                        R.drawable.listening,
                        R.raw.anixoniuleaia
                )
        )
        list.add(
                Phrase("Хорошо живите!",

                        "Ая / улэн балдиусу!",
                        R.drawable.listening,
                        R.raw.aniaiaulenbaldiusu
                )
        )
        list.add(
                Phrase("Счастливо живите!",
                        "Кэсику балдиусу!",
                        R.drawable.listening,
                        R.raw.anikesikubaldiusu
                )
        )
        list.add(
                Phrase("Новый год называется “Новый год”.",

                        "Сикун айӈаниа гэрбуни “Новый год”.",
                        R.drawable.listening,
                        R.raw.anisikuaingani
                )
        )
        list.add(
                Phrase("Какие праздники знаешь?",

                        "Хай анявани са̄риси?",
                        R.drawable.listening,
                        R.raw.anixaianiawani
                )
        )

        return list
    }
}