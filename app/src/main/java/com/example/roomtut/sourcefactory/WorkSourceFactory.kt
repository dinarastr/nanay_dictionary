package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class WorkSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Я учитель(ница).",
                        "Мӣ алосимди.",
                        R.drawable.listening,
                        R.raw.workone
                )
        )
        list.add(
                Phrase("Я работаю: в детском саду / в школе / в магазине / в администрации / в ассоциации / в доме культуры / в кафе / в больнице, в пекарне / на кирпичном заводе / на рыборазводном заводе / вахтами.",
                        "Ми дёбои… детский сададу, школаду, магазинду, администрацияду, ассоциацияду, клубаду, кафеду, больницаду, кирпич аӈгой заводаду, рыбозаводаду, Чаду дёбондагуха,  эму  биадо дёбора дёкчи дидзуй. Туй дёбои.",
                        R.drawable.listening,
                        R.raw.worktwo
                )
        )
        list.add(
                Phrase("Ты где работаешь?",
                        "Хайду дёбойси?",
                        R.drawable.listening,
                        R.raw.workthree
                )
        )

        return list
    }
}