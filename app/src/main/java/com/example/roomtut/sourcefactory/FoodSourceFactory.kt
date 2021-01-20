package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.Phrase

class FoodSourceFactory: ISourceFactory {
    override fun createDataSet(): ArrayList<Phrase>{
        val list = ArrayList<Phrase>()
        list.add(
                Phrase(
                        "Ты сегодня ел(а)?",
                        "Сӣ эйниэ сиахаси?",
                        R.drawable.listening,
                        R.raw.amsieiniesiaxasi
                )
        )
        list.add(
                Phrase("Там садись, это твоё место.",
                        "Чаду тэ̄ру, эй си боунси.",
                        R.drawable.listening,
                        R.raw.amcaduteru
                )
        )
        list.add(
                Phrase("Садись, перекусим?",
                        "Тэ̄ру, сиагоари!",
                        R.drawable.listening,
                        R.raw.amterusiagoari
                )
        )
        list.add(
                Phrase("Сегодня мы кушаем: полынный суп, кашу с копчёной рыбой, а еще чай с солима (десерт из ягод с жиром).",

                        "Эйниэ буэ сиарипу: соакта чоломбани, лала силумэ согдатади, гучи чаи солимади.",
                        R.drawable.listening,
                        R.raw.ameiniebuesiaripu
                )
        )
        list.add(
            Phrase("Кофе будешь пить? Чай будешь пить? Кофе будешь пить? Сладкую воду будешь пить?",
                "Кофе омидячи-ну? Чаи омидячи-ну? Кофе омидячи-ну? Амтаси муэвэ омидячи-ну?",
                R.drawable.listening,
                R.raw.amkofeomijacinu
            )
        )
        list.add(
            Phrase("Из капусты сваренную мной солянку будешь есть?",
                "Эй солгиди пуюхэмби солянкава сиадячи-ну?",
                R.drawable.listening,
                R.raw.amsolgiji
            )
        )
        list.add(
            Phrase("Ешь!",
                "Сиару!",
                R.drawable.listening,
                R.raw.amsiaru
            )
        )
        list.add(
            Phrase("Рыбные пельмени люблю!",
                "Согдата биансивани улэсии!",
                R.drawable.listening,
                R.raw.amsogdatabiansi
            )
        )
        list.add(
            Phrase("Воду подай!",
                "Муэвэ алору!",
                R.drawable.listening,
                R.raw.ammuewealoru
            )
        )

        list.add(
            Phrase("Дай мне тарелку!",
                "Алору минду пилиава!",
                R.drawable.listening,
                R.raw.amalorumindupiliawa
            )
        )
        list.add(
                Phrase("Сюда дай нож / ложку / палочки (для еды)!",
                        "Эуси бӯру кучэмбэ / хонямба / сарбива!",
                        R.drawable.listening,
                        R.raw.ameusiburukucembe
                )
        )
        list.add(
                Phrase("Мне еще дай суп, кашу, хлеб. Тут мне дайте суп, кашу, хлеб.\tAmMinduburulalawa",
                        "А минду гучи бӯру чоломба, лалава, эпэмбэ. Эйду минду бӯрусу чоломба, лалава, эпэмбэ. ",
                        R.drawable.listening,
                        R.raw.amminduburulalawa
                )
        )
        list.add(
                Phrase("Как хорош полынный суп!",
                        "Хо̄ни-да улэн соакта чолони!",
                        R.drawable.listening,
                        R.raw.amxonidaulesoakta
                )
        )
        list.add(
                Phrase("Хорошо, вкусно!",
                        "Эй улэн, амта!",
                        R.drawable.listening,
                        R.raw.amuleamta
                )
        )

        return list
    }
}