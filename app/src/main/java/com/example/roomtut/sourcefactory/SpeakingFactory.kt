package com.example.roomtut.sourcefactory



object SpeakingFactory {
    fun getWordsVmFactory(category: String): ISourceFactory = when(category) {
        "0" -> MeetingSourceFactory()
        "1" -> GreetingSourceFactory()
        "2" -> HomeSourceFactory()
        "3" -> KitchenSourceFactory()
        "4" -> FoodSourceFactory()
        "5" -> FamilySourceFactory()
        "6" -> WorkSourceFactory()
        "7" -> VillageSourceFactory()
        "8" -> ShopSourceFactory()
        "9" -> CitySourceFactory()
        "10" -> FeistSourceFactory()
        "11" -> MountainSourceFactory()
        "12" -> FishingSourceFactory()
        "13" -> InternetSourceFactory()
        "14" -> SchoolSourceFactory()
        "15" -> ChildSourceFactory()
        "16" -> ThinkSourceFactory()
        else -> throw IllegalArgumentException()
    }
}