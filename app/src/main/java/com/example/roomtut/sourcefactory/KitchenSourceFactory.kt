package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class KitchenSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Что сегодня будем готовить?",
                        "Хайва эйниэ пую̄вури?",
                        R.drawable.listening,
                        R.raw.puixaiwaeiniepujuwuri
                )
        )
        list.add(
                Phrase("Давай суп сварим.",
                        "Гэ̄, чолова пуюгуэри.",
                        R.drawable.listening,
                        R.raw.puicolowapuiugueri
                )
        )
        list.add(
                Phrase("Жирный суп свари!",
                        "Уликсэ чоломбани пую̄ру!",
                        R.drawable.listening,
                        R.raw.puiuliksecolombanipuiuru
                )
        )
        list.add(
                Phrase("Ты сегодня что готовишь?",
                        "Сӣ эйниэ хайва пую̄риси?",
                        R.drawable.listening,
                        R.raw.puisieiniexaiwapuiurisi
                )
        )
        list.add(
                Phrase("Боду (кашеобразное блюдо) я сварил(а).",
                        "Бодава пую̄хэмби.",
                        R.drawable.listening,
                        R.raw.puibodawapuiuxembi
                )
        )
        list.add(
                Phrase("Завтра боду буду варить.",

                        "Чимана бодава пую̄демби.",
                        R.drawable.listening,
                        R.raw.puicimanabodawapuiujembi
                )
        )
        list.add(
                Phrase("Что нужно по рецепту?",

                        "Пуюгуй хайва гэлэйни?",
                        R.drawable.listening,
                        R.raw.puipuiugui
                )
        )
        list.add(
                Phrase(
                        "Этой картошки кожуру почисть.",
                        "Эй дудуэсэ хорактавани ачу.",
                        R.drawable.listening,
                        R.raw.puieiduduesexoraktawani
                )
        )
        list.add(
                Phrase("Нарежь картошку / огурцы.",

                        "Дудуэсэвэ / хоаӈгоамба кучэнди ча̄су.",
                        R.drawable.listening,
                        R.raw.puiduduesexoagoamba
                )
        )
        list.add(
                Phrase("Я талу нарезаю.",

                        "Мӣ пиармава кэрчии.",
                        R.drawable.listening,
                        R.raw.puimipiarmawakercii
                )
        )
        list.add(
                Phrase("Таксу (рыбный паштет) сложно делать.",

                        "Таксамба маӈга аӈговори.",
                        R.drawable.listening,
                        R.raw.puitaksambaangori
                )
        )
        list.add(
                Phrase(
                        "Этот суп в течение часа варить надо.",

                        "Эй чоломба эм часаду пуюми ая.",
                        R.drawable.listening,
                        R.raw.puieicolombaemcasadu
                )
        )

        list.add(
            Phrase(
                "Попробуй, вкусно? Как?",

                "Пэргу, улэн? Хо̄ни бӣ?",
                R.drawable.listening,
                R.raw.puipergu
            )
        )
        list.add(
            Phrase(
                "Еще соли добавь.",

                "Даосомба гучи нэ̄ру.",
                R.drawable.listening,
                R.raw.puidaosombaguci
            )
        )
        list.add(
                Phrase(
                        "Соль / сахар туда добавь.",

                        "Даосомба, сиатава чаду нэ̄ру.",
                        R.drawable.listening,
                        R.raw.puidaosombasiatawa
                )
        )
        list.add(
                Phrase(
                        "Этот суп вкусный стал!",

                        "Тэй чоло амта очини!",
                        R.drawable.listening,
                        R.raw.puiteicoloamta
                )
        )
        list.add(
                Phrase(
                        "Зажги!",

                        "Дегдю!",
                        R.drawable.listening,
                        R.raw.puijegju
                )
        )
        list.add(
                Phrase(
                        "Зажги огонь!",

                        "Тавава та̄ву!",
                        R.drawable.listening,
                        R.raw.puitawawatawu
                )
        )
        list.add(
                Phrase(
                        "Горячо!",

                        "Пэкэ!",
                        R.drawable.listening,
                        R.raw.puipeke
                )
        )
        list.add(
                Phrase(
                        "Погрей!",

                        "Хулдиру!",
                        R.drawable.listening,
                        R.raw.puixuldiru
                )
        )
        list.add(
                Phrase(
                        "Собираю своему ребёнку еду с собой (поесть в дороге или в перерыве: «ссобойка», «тормозок», «еда в котомочке»)",

                        "Хуйгэсэвэ пиктэдуи баргии.",
                        R.drawable.listening,
                        R.raw.puixuigesewepiktedui
                )
        )


        return list
    }
}