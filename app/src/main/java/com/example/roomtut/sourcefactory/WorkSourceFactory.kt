package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class WorkSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()

        list.add(
                Phrase("Ты где работаешь?",
                        "Хайду дёбойси?",
                        R.drawable.listening,
                        R.raw.jobxaidujoboisi
                )
        )
        list.add(
                Phrase(
                        "Я учителем в школе работаю.",
                        "Мӣ алосимди школаду дёбои.",
                        R.drawable.listening,
                        R.raw.jobmialosimdishkoladujoboi
                )
        )
        list.add(
                Phrase(
                        "Моя тётя в больнице работает.",
                        "Мӣ гугуи больницаду дёбойни.",
                        R.drawable.listening,
                        R.raw.jobmiguguibolnica
                )
        )
        list.add(
                Phrase(
                        "Я работаю: в детском саду / в школе / в магазине / в администрации.",
                        "Ми дёбои детский сададу, школаду, магазинду, администрацияду.",
                        R.drawable.listening,
                        R.raw.jobmijoboidetsadshkolamagazin
                )
        )
        list.add(
                Phrase(
                        "Я работаю в ассоциации / в доме культуры / в кафе / в больнице / на кирпичи делающем заводе, на рыбозаводе.",
                        "Мӣ дёбои ассоциацияду, клубаду, кафеду, больницаду, кирпич аӈгой заводаду, рыбозаводаду,",
                        R.drawable.listening,
                        R.raw.jobmijoboiassociacijakirpic
                )
        )
        list.add(
                Phrase(
                        "Там чтобы работать, в каком-то месте поработав, домой возвращаюсь. Так работаю (вахтами).",
                        "Чаду дёбондагоха,  эму  биадо дёбора дёкчи дидюй. Туй дёбои.",
                        R.drawable.listening,
                        R.raw.jobcadujobondagoxa
                )
        )
        list.add(
                Phrase(
                        "Я — водитель / начальник(ца) / охотник / продав(ец/щица).",
                        "мӣ водитель, дяӈгиан, боатоӈго най, ходаси най.",
                        R.drawable.listening,
                        R.raw.jobmivoditeljangiaxodasinai
                )
        )
        list.add(
                Phrase("людей красивыми чтобы делать работаю (в салоне красоты)",
                        "най гучкули осигоани дёбои",
                        R.drawable.listening,
                        R.raw.jobnaiguckuliosigoanijoboi
                )
        )
        list.add(
                Phrase("В этом селе люди чем заняты? Кем работают?",
                        "Эй ихонду хайва най тайчи? Хайва най дёбойчи?",
                        R.drawable.listening,
                        R.raw.jobeiixondujoboici
                )
        )

        return list
    }
}