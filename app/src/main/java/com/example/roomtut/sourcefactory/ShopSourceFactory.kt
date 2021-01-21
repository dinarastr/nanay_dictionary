package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase
class ShopSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase> {
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Сахару купи!",
                        "Сиатава гаду!",
                        R.drawable.listening,
                        R.raw.magsiatawagadu
                )
        )
        list.add(
                Phrase("Сегодня этот магазин работает?",
                        "Эй магазин эйниэ дёбойни?",
                        R.drawable.listening,
                        R.raw.mageimagazinjoboini
                )
        )
        list.add(
                Phrase("В этом магазине что есть?",
                        "Эй магазинду хай би?",
                        R.drawable.listening,
                        R.raw.mageimagazinduxaibi
                )
        )
        list.add(
                Phrase("Cвежий хлеб, свежие хлеб, рыба. Масло/жир, сахар, всё есть.",
                        "Тэӈ парпӣн эпэн, парпӣн эпэн, согдата. Симуксэ, сиата, хай-да хэм би.",
                        R.drawable.listening,
                        R.raw.magtenparpiepensogdata
                )
        )

        list.add(
                Phrase("Яблоки, капусту дай-ка.",
                        "Амтакава, солгива бӯру.",
                        R.drawable.listening,
                        R.raw.magamtakawasolgiwaburu
                )
        )

        list.add(
                Phrase("Свежий хлеб и масло дай-ка.",
                        "Парпи эпэмбэ, гучи симуксэвэ бӯру.",
                        R.drawable.listening,
                        R.raw.magparpiepesimukseweburu
                )
        )

        list.add(
                Phrase("То лампочки?",
                        "Тэй ихэрэ?",
                        R.drawable.listening,
                        R.raw.magteiixere
                )
        )

        list.add(
                Phrase("Это ткань?",
                        "Эй босо би?",
                        R.drawable.listening,
                        R.raw.mageiboso
                )
        )
        list.add(
                Phrase("В городе, в Комсомольске, в магазин пошли, «Ткани» назвается, всего накупились.",
                        "Хотонду, Комсомольскаду, магазин ба̄рони пулсихэпу, «Ткани» гэрбуни, хайва-дэ хэм гачин тахапу.",
                        R.drawable.listening,
                        R.raw.magxotondutkani
                )
        )
        list.add(
                Phrase("Вкусные яблоки?",
                        "Амтани яблоко?",
                        R.drawable.listening,
                        R.raw.magamtaniiablok
                )
        )
        list.add(
                Phrase("Да, хорошие, вкусные!",
                        "Ӣ, тэӈ улэн, амта!",
                        R.drawable.listening,
                        R.raw.magitenulenamta
                )
        )
        list.add(
                Phrase("Яблок продайте мне.",
                        "Яблокова ходасиусу минду.",
                        R.drawable.listening,
                        R.raw.magiablokowaxodasiusu
                )
        )
        list.add(
                Phrase("Возьми. Возьмите.",
                        "Дяпу. Дяпаосу.",
                        R.drawable.listening,
                        R.raw.magjapujapaosu
                )
        )
        list.add(
                Phrase("Один килограмм муки сколько стоит?",
                        "Эм кило опа хаду ходани?",
                        R.drawable.listening,
                        R.raw.magemkiloopa
                )
        )
        list.add(
                Phrase("Сорок три рубля стоит.",
                        "Дэхи илан тэсэ ходани.",
                        R.drawable.listening,
                        R.raw.magilantesoxodani
                )
        )
        list.add(
                Phrase("Запишите на меня.",
                        "Мӣ гачимби ходава нирусу минду.",
                        R.drawable.listening,
                        R.raw.magmigacininirusu
                )
        )
        list.add(
                Phrase("Ничего не забыли?",
                        "Хайва-да эчиэ оӈбоасу?",
                        R.drawable.listening,
                        R.raw.magxaiwadaongboasu
                )
        )
        list.add(
                Phrase("Он(а) хорошую кастрюлю купил(а).",
                        "Нёани улэн каламба гачини.",
                        R.drawable.listening,
                        R.raw.magnioaniulekalmbagacini
                )
        )
        list.add(
                Phrase("Я сетку купил(а).",
                        "Мӣ адолива гачимби.",
                        R.drawable.listening,
                        R.raw.magmiadoliwagacimbi
                )
        )
        list.add(
                Phrase("Я кожаный кошелёк купил(а).",
                        "Мӣ нанта партамавани гачимби.",
                        R.drawable.listening,
                        R.raw.magnioaninantapartamavani
                )
        )


        return list
    }
}