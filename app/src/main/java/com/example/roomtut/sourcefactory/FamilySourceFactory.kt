package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class FamilySourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Про родственников разговор.",
                        "Дёӈкамба гисурэн.",
                        R.drawable.listening,
                        R.raw.jonkjonkambagisuren
                )
        )
        list.add(
                Phrase(
                        "Моя родня.",
                        "Мӣ дёӈкамби.",
                        R.drawable.listening,
                        R.raw.jonkmijonkambi
                )
        )
        list.add(
                Phrase(
                        "Это моя мама, мой папа,",
                        "Эй энимби,  амимби,",
                        R.drawable.listening,
                        R.raw.jonkenimbiamimbi
                )
        )
        list.add(
                Phrase(
                        "это мой младший брат / младшая сестра,",
                        "эй нэуи, а̄гби, эйкэи,",
                        R.drawable.listening,
                        R.raw.jonkeineuiagbieikei
                )
        )
        list.add(
                Phrase("мой ребёнок,",
                        "пиктэи,",
                        R.drawable.listening,
                        R.raw.jonkpiktei
                )
        )
        list.add(
            Phrase(
                "мой друг / моя подруга,",
                "диасилби,",
                R.drawable.listening,
                R.raw.jonkjasilbi
            )
        )
        list.add(
            Phrase(
                "моя незамужняя родственница,",
                "пандандёмби,",
                R.drawable.listening,
                R.raw.jonkpandanjombi
            )
        )
        list.add(
            Phrase(
                "моя тётя (младшая сестра отца), моя тётя (старшая сестра матери).",
                "гугуи, дадаи.",
                R.drawable.listening,
                R.raw.jonkguguidadai
            )
        )
        list.add(
            Phrase(
                "Моя родня: ребёнок-дети, муж, дети детей.",
                "Мӣ дёӈкаи: пиктэи пиктэсэлби, мапаи, пиктэсэл пиктэсэлни.",
                R.drawable.listening,
                R.raw.jonkjonkaipiktepikteselbi
            )
        )
        list.add(
            Phrase(
                "Мой сосед — охотник.",
                "Мӣ никэмби боатоӈго най.",
                R.drawable.listening,
                R.raw.jonknikembiboatongo
            )
        )
        list.add(
                Phrase(
                        "Мой отец много работает.",
                        "Мӣ амимби маӈга дёбойни.",
                        R.drawable.listening,
                        R.raw.jonkmiamimbimangajoboini
                )
        )
        list.add(
                Phrase(
                        "Моя мать очень умная.",
                        "Мӣ энимби муруни эгди.",
                        R.drawable.listening,
                        R.raw.jonkmienimbimurunku
                )
        )
        list.add(
                Phrase(
                        "Моя мама многих детей родила. (для себя нашла)",
                        "Мӣ энимби эгдивэ пиктэгуи бахани.",
                        R.drawable.listening,
                        R.raw.jonkmienimbiegdiwepikte
                )
        )
        list.add(
                Phrase(
                        "У меня друга два.",
                        "Минду диаи дюэр.",
                        R.drawable.listening,
                        R.raw.jonkmindujaijuer
                )
        )
        list.add(
                Phrase(
                        "Мама, надев очки, газету читает.",
                        "Эниэ насаптолара газетава холайни.",
                        R.drawable.listening,
                        R.raw.jonkenienasaptalora
                )
        )


        return list
    }
}