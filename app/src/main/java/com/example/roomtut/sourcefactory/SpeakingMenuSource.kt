package com.example.roomtut.sourcefactory

import com.example.roomtut.R
import com.example.roomtut.model.SpeakingMenu

class SpeakingMenuSource {
    companion object{
        fun createDataSet(): ArrayList<SpeakingMenu>{
            val list = ArrayList<SpeakingMenu>()
            list.add(
                SpeakingMenu(
                    "Мӣ",
                    "Я",
                    R.drawable.greeting,
                )
            )
            list.add(
                SpeakingMenu(
                    "Здравствуйте!",
                    "Ба̄чигоапу!",
                    R.drawable.meeting,
                )
            )
            list.add(
                    SpeakingMenu("Родственники",
                            "Дёӈкан",
                            R.drawable.family,
                    )
            )

            list.add(
                    SpeakingMenu("Работа",
                            "Дёбон",
                            R.drawable.work,
                    )
            )


            list.add(
                    SpeakingMenu("В селе",
                            "Ихонду",
                            R.drawable.cow,
                    )
            )

            list.add(
                    SpeakingMenu("В магазине",
                            "Гаори",
                            R.drawable.shopping,
                    )
            )

            list.add(
                    SpeakingMenu("В городе",
                            "Хотонду",
                            R.drawable.city,
                    )
            )

            list.add(
                    SpeakingMenu("На празднике",
                            "Аняду",
                            R.drawable.birthday,
                    )
            )

            list.add(
                    SpeakingMenu("В школе",
                            "Школаду",
                            R.drawable.school,
                    )
            )

            list.add(
                    SpeakingMenu("Природа (Снаружи)",
                            "Боа",
                            R.drawable.sun)
            )

            list.add(
                    SpeakingMenu("Поход",
                            "Пурэнду",
                            R.drawable.mountain,
                    )
            )

            list.add(
                    SpeakingMenu("Рыба",
                            "Согдата",
                            R.drawable.fishing,
                    )
            )



            list.add(
                SpeakingMenu("Дом",
                    "Дё",
                    R.drawable.home,
                )
            )
            list.add(
                SpeakingMenu("Готовить",
                    "Пуюри",
                    R.drawable.kitchen,
                )
            )
            list.add(
                SpeakingMenu("Вкусно",
                    "Амта",
                    R.drawable.food,
                )
            )
            list.add(
                    SpeakingMenu("Тело",
                            "Бэе",
                            R.drawable.body

                    )
            )

            list.add(
                SpeakingMenu("В интернете",
                    "Интернетаду",
                    R.drawable.internet,
                )
            )

            list.add(
                SpeakingMenu("Мысли",
                    "Мурун",
                    R.drawable.thinking,
                )
            )

            list.add(
                    SpeakingMenu("Сколько?",
                            "Хаду",
                            R.drawable.numbers
                    )
            )
            return list
        }
    }
}