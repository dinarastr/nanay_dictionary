package com.example.roomtut

import com.example.roomtut.model.SpeakingMenu

class SpeakingMenuSource {
    companion object{
        fun createDataSet(): ArrayList<SpeakingMenu>{
            val list = ArrayList<SpeakingMenu>()
            list.add(
                SpeakingMenu(
                    "Знакомство",

                    "Гэрбу",
                    R.drawable.meeting,
                )
            )
            list.add(
                SpeakingMenu(
                    "Здравствуйте!",
                    "Ба̄чигоапу!",
                    R.drawable.greeting,
                )
            )
            list.add(
                SpeakingMenu("Дом",
                    "Дё",
                    R.drawable.home,
                )
            )
            list.add(
                SpeakingMenu("На кухне",
                    "Пуюри",
                    R.drawable.kitchen,
                )
            )
            list.add(
                SpeakingMenu("Еда",
                    "Сиаори/Депчиури",
                    R.drawable.food,
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
                SpeakingMenu("Поход в горы",
                    "?",
                    R.drawable.mountain,
                )
            )
            list.add(
                SpeakingMenu("На рыбалке",
                    "?",
                    R.drawable.fishing,
                )
            )
            list.add(
                SpeakingMenu("В интернете",
                    "Интернетаду",
                    R.drawable.internet,
                )
            )
            list.add(
                SpeakingMenu("В школе",
                    "Школаду",
                    R.drawable.school,
                )
            )
            list.add(
                SpeakingMenu(
                    "Разговор с ребёнком",
                    "Пояди гисурэн",
                    R.drawable.child,
                )
            )
            list.add(
                SpeakingMenu("Я думаю...",
                    "Мурчимби",
                    R.drawable.thinking,
                )
            )
            return list
        }
    }
}