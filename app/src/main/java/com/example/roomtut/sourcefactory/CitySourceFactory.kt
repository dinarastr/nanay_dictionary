package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class CitySourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Я собираюсь поехать в город.",
                        "Мӣ хотончи энэуривэ мурчии.",
                        R.drawable.listening,
                        R.raw.xotmixotoncieneuriwemurcii
                )
        )
        list.add(
                Phrase("Сегодня ездили в город, в Комсомольск ездили.",
                        "Эйниэ пулсихэпу хотон ба̄рони, Комсомольска ба̄рони пулсихэпу.",
                        R.drawable.listening,
                        R.raw.xoteiniexotoncikomsomolskaci
                )
        )
        list.add(
                Phrase("Автобус до города ходит редко.",
                        "Автобус хотончи пулсини эмдэ-эмдэ.",
                        R.drawable.listening,
                        R.raw.xotaftobusxotoncipulsini
                )
        )
        list.add(
                Phrase("В город хорошо ехать на машине, но это дорого.",

                        "Машинади энэми улэн, (тотами) ходани маӈга.",
                        R.drawable.listening,
                        R.raw.xotmashinadienemiulexodasimanga
                )
        )
        list.add(
                Phrase("Моя машина сломалась.",
                        "Мӣ машинаи бояхани.",
                        R.drawable.listening,
                        R.raw.xotmimashinaiboiaxani
                )
        )
        list.add(
                Phrase("Ночью ехать страшно.",
                        "Долбо пулсими ӈэлэпси.",
                        R.drawable.listening,
                        R.raw.xotdolbopulsimingelepsi
                )
        )
        list.add(
                Phrase("Кто завтра в Хабаровск едет, знаешь?",
                        "Уй чимана Буричи энэйни, са̄риси?",
                        R.drawable.listening,
                        R.raw.xotuicimanaburicieneini
                )
        )

        list.add(
                Phrase("В городе много улиц и высокие дома.",
                        "Хотонду эгди гиансал, эгди тэӈнеӈку дёсал.",
                        R.drawable.listening,
                        R.raw.xotxotonduegdigiansal
                )
        )
        list.add(
                Phrase("Ездят туда-сюда машины.",
                        "Эуси-таоси машина пулсӣчи.",
                        R.drawable.listening,
                        R.raw.xoteusitaosi
                )
        )
        list.add(
                Phrase("Красивую одежду купить собираюсь. Я хорошую одежду, красивую одежду купить собираюсь.",
                        "Гучкули хадёмба гагой та̄мби. Мӣ улэн хадёмба, гучкули хадёмба гагой та̄мби.",
                        R.drawable.listening,
                        R.raw.xotmiguckulixajomba
                )
        )
        list.add(
                Phrase("Какой автобус ходит до торгового центра?",
                        "Хай автобусани энэйни торговай центр ба̄рони?",
                        R.drawable.listening,
                        R.raw.xotxaiaftobusani
                )
        )
        list.add(
                Phrase("Я позвоню другу, чтобы встретиться.",
                        "Мӣ андарчии звониламби бачигогуй.",
                        R.drawable.listening,
                        R.raw.xotmiadnarciizvanila
                )
        )
        return list
    }
}