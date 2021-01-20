package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class ThinkSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase("Я его/её люблю.",

                        "Мӣ нёамбани улэ̄сӣи.",
                        R.drawable.listening,
                        R.raw.murminioambaniulesii
                )
        )
        list.add(
                Phrase("Ты что любишь?",

                        "Сӣ хайва улэ̄сӣси?",
                        R.drawable.listening,
                        R.raw.mursixaiwaulesisi
                )
                )
        list.add(
                Phrase("Моя мама любит фильмы про войну.",

                        "Мӣ энимби чаоха киновани улэ̄сӣни.",
                        R.drawable.listening,
                        R.raw.murmienimbicaoxa
                )
                )
        list.add(
                Phrase("Сказку детям расскажи!",

                        "Ниӈмамба нучикэндюэнду гусэру!",
                        R.drawable.listening,
                        R.raw.murningmambanucikenjuendu
                )
                )

        list.add(
                Phrase(
                        "Так я думаю.",
                        "Туй мӣ мурчии.",
                        R.drawable.listening,
                        R.raw.murtuimimurcii
                )
        )
        list.add(
                Phrase("Это что такое?",
                        "Эй хай дяка?",
                        R.drawable.listening,
                        R.raw.mureixaijaka
                )
        )
        list.add(
                Phrase("Я не знаю.",
                        "Мӣ сарасимби.",
                        R.drawable.listening,
                        R.raw.murmisarasimbi
                )
        )
        list.add(
                Phrase("Это я знаю.",

                        "Эй мӣ сарамби.",
                        R.drawable.listening,
                        R.raw.mureimisarambi
                )
        )
        list.add(
            Phrase("Я не понимаю.",

                "Мӣ отолиасимби.",
                R.drawable.listening,
                R.raw.murotoliasimbi
            )
        )
        list.add(
            Phrase("Понял(а), понимаю.",

                "Отолихамби.",
                R.drawable.listening,
                R.raw.murotolixambi
            )
        )
        list.add(
                Phrase("Что хочешь?",

                        "Хайва гэлэйси?",
                        R.drawable.listening,
                        R.raw.murxaiwageleisi
                )
        )
        list.add(
                Phrase("Эта книга интересная, почитаю.",

                        "Эй даӈса эрдэӈгэни, холадямби.",
                        R.drawable.listening,
                        R.raw.mureidansaerdenge
                )
        )
        list.add(
                Phrase("Ты понимаешь, что он(а) говорит?",

                        "Сӣ отолийси нёани ундивэниэ?",
                        R.drawable.listening,
                        R.raw.mursiotolisinioaniundeiwenie
                )
        )
        list.add(
                Phrase("Ничего не понимает.",

                        "Хамача-да отолиаси.",
                        R.drawable.listening,
                        R.raw.murxamacadaotoliasii
                )
        )
        list.add(
                Phrase("Садись, я с тобой хочу поговорить.",

                        "Тэ̄гу, мӣ синди хисаӈгогоиэ.",
                        R.drawable.listening,
                        R.raw.murtegumisindixisangogoie
                )
        )
        list.add(
                Phrase("Ты меня слышишь?",

                        "Си мимбивэ долдиси?",
                        R.drawable.listening,
                        R.raw.mursimimbiwedoldisi
                )
        )
        list.add(
                Phrase("Он(а) обиделся(ась), ушёл/ушла.",

                        "Нёани аксара, энэхэни.",
                        R.drawable.listening,
                        R.raw.muraksaraenexeni
                )
        )
        list.add(
                Phrase("Как ножом отрезать.",

                        "Кучэнди чари-ма.",
                        R.drawable.listening,
                        R.raw.murkucendicarima
                )
        )
        list.add(
                Phrase("Ему/ей стыдно.",

                        "Нёани иламосӣни.",
                        R.drawable.listening,
                        R.raw.murnioanielamosini
                )
        )
        list.add(
                Phrase("Наглый человек.",

                        "Дарако най.",
                        R.drawable.listening,
                        R.raw.murdarakonai
                )
        )
        list.add(
                Phrase("Хитрый человек.",

                        "Арган най.",
                        R.drawable.listening,
                        R.raw.murarganai
                )
        )

        list.add(
                Phrase("Как лисица (человек).",

                        "Эм соликама бӣ!",
                        R.drawable.listening,
                        R.raw.muremsolikamabi
                )
        )
        list.add(
                Phrase("Меня послушай!",

                        "Мимбивэ досадиу!",
                        R.drawable.listening,
                        R.raw.murmimbiwedosadiu
                )
        )
        list.add(
                Phrase("Не бойся!",

                        "Эди нэлэчиэ!",
                        R.drawable.listening,
                        R.raw.muredingelece
                )
                )
        return list
    }
}