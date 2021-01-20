package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class HomeSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Ко мне приходи в гости!",

                                "Минчи димару!",
                        R.drawable.listening,
                        R.raw.jomincidimaru
                )
        )
        list.add(
                Phrase("Заходи ко мне, погости!",
                        "Ӣру минду, диманду!",
                        R.drawable.listening,
                        R.raw.joirumincidimandu
                )
        )
        list.add(
                Phrase("Видишь три окна?",
                        "Илан па̄ва ичэйси?",
                        R.drawable.listening,
                        R.raw.joilanpawa
                )
        )
        list.add(
                Phrase("Мой дом зелёный, белый, чёрный.",

                        "Дёгби нёӈгиан, чагдян, сахарин.",
                        R.drawable.listening,
                        R.raw.josaxarin
                )
        )
        list.add(
                Phrase("Твой дом старый / новый?",

                        "Сӣ дёкси балапчи-ну, сикун-ну?",
                        R.drawable.listening,
                        R.raw.josijoksibalapci
                )
        )
        list.add(
                Phrase(
                        "Твой дом закрыт на замок?",
                        "Дёкси ёсолакто?",
                        R.drawable.listening,
                        R.raw.jojoksijosolakto
                )
        )
        list.add(
                Phrase("Эй сӣ дёкси-ну?",

                        "Это твой дом?",
                        R.drawable.listening,
                        R.raw.joeisijoksinu
                )
        )
        list.add(
                Phrase("Это мой дом.",

                        "Эй м̄и дёи.",
                        R.drawable.listening,
                        R.raw.joeimijoi
                )
        )
        list.add(
                Phrase("Это в моём доме.",

                        "Эй мӣ дёгдуи.",
                        R.drawable.listening,
                        R.raw.joeimijogdui
                )
        )
        list.add(
                Phrase(
                        "Заходи ко мне домой.",

                        "Ӣру мӣ дёкчии.",
                        R.drawable.listening,
                        R.raw.joirumijokcii
                )
        )

        list.add(
                Phrase(
                        "В этом моём доме две комнаты.",
                        "Эй мӣ дёгдуи дюэр комната.",
                        R.drawable.listening,
                        R.raw.jojuerkomnata
                )
        )

        list.add(
                Phrase(
                        "Не бойся собаку!",
                        "Эй индади эди ӈэлэ!",
                        R.drawable.listening,
                        R.raw.joindadiedi
                )
        )
        list.add(
                Phrase(
                        "Эта собака — пёстрая / трёхцветная / разномастная.",
                        "Эй инда — алха.",
                        R.drawable.listening,
                        R.raw.joeiindaalxa
                )
        )
        list.add(
            Phrase(
                "Ставь обувь сюда!",
                "Отаи эйду нэ̄ру!",
                R.drawable.listening,
                R.raw.jootai
            )
        )
        list.add(
            Phrase(
                "Вешай одежду!",
                "Эйду хадёмби ло̄ру!",
                R.drawable.listening,
                R.raw.joxajombi
            )
        )
        list.add(
                Phrase(
                        "Проходи внутрь!",
                        "До̄чи ӣру!",
                        R.drawable.listening,
                        R.raw.jodociiru
                )
        )
        list.add(
            Phrase(
                "Садись вот сюда, вот на эту лавочку.",
                "Эуси тэ̄ру, эй банданду тэ̄ру.",
                R.drawable.listening,
                R.raw.jodociiru
            )
        )
        list.add(
                Phrase(
                        "Выпьем чаю.",
                        "Чаива омигоари!",
                        R.drawable.listening,
                        R.raw.jodociiru
                )
        )

        list.add(
                Phrase(
                        "Давай телевизор посмотрим!",
                        "Гэ̄, телевизорба ичэгуэри!",
                        R.drawable.listening,
                        R.raw.jotelevizorba
                )
        )
        list.add(
                Phrase(
                        "Давай послушаем музыку! Ну, давай эту песню послушаем!",
                        "Дяримба досодигоари! Гэ̄, эй дяримба досодигоари!",
                        R.drawable.listening,
                        R.raw.jojarimba
                )
        )
        list.add(
                Phrase(
                        "Молодёжь, дети все в своих домах.",
                        "Нучикэндюэн пиктэи хэм мэнэ дёгдуи бӣчи.",
                        R.drawable.listening,
                        R.raw.jopiktemene
                )
        )
        list.add(
                Phrase(
                        "В моём доме мы с мужем вдвоём живём.",
                        "Мӣ дёгдуи буэ мапади дюэр бӣпу.",
                        R.drawable.listening,
                        R.raw.jobuemapadi
                )
        )
        list.add(
                Phrase(
                        "Это одеяло — тёплое.",
                        "Эй полта няма.",
                        R.drawable.listening,
                        R.raw.joeipoltaniama
                )
        )
        list.add(
                Phrase(
                        "Полы помой! Помой!",
                        "Паламба сиолкору! Сиолко!",
                        R.drawable.listening,
                        R.raw.jopalambasiolkoru
                )
        )
        list.add(
                Phrase(
                        "Я книгу/книги читаю.",
                        "Мӣ даӈсава холаи.",
                        R.drawable.listening,
                        R.raw.jodangsawaxolai
                )
        )
        list.add(
                Phrase(
                        "Окна заклеить хорошо бы.",
                        "Па̄вава хобалами ая.",
                        R.drawable.listening,
                        R.raw.jopawawaxobolamiaia
                )
        )
        list.add(
                Phrase(
                        "Молоток, гвозди дай.",
                        "Палоава, тукпэмбэ ало̄ру.",
                        R.drawable.listening,
                        R.raw.jopaloawatukpembe
                )
        )
        list.add(
                Phrase(
                        "Доску пилой отрежь.",
                        "Ундэхэмбэ по̄понди ча̄лиу.",
                        R.drawable.listening,
                        R.raw.joundexevbepopondi
                )
        )
        list.add(
                Phrase(
                        "Я на крыше спрятал(а) лыжи.",
                        "Мӣ ускинду соктава дяяхамби.",
                        R.drawable.listening,
                        R.raw.jomiuskindusoktawa
                )
        )
        list.add(
                Phrase(
                        "Свет гаси!",
                        "Ихэрэ гӯпу!",
                        R.drawable.listening,
                        R.raw.joixeregupu
                )
        )
        return list
    }
}