package com.example.roomtut.sourcefactory



object SpeakingFactory {
    fun getWordsVmFactory(category: String): ISourceFactory = when(category) {
        "0" -> MeetingSourceFactory()
        "1" -> GreetingSourceFactory()
        "2" -> FamilySourceFactory()
        "3" -> WorkSourceFactory()
        "4" -> VillageSourceFactory()
        "5" -> ShopSourceFactory()
        "6" -> CitySourceFactory()
        "7" -> FeistSourceFactory()
        "8" -> SchoolSourceFactory()
        "9" -> NatureSourceFactory()
        "10" -> MountainSourceFactory()
        "11" -> FishingSourceFactory()
        "12" -> HomeSourceFactory()
        "13" -> KitchenSourceFactory()
        "14" -> FoodSourceFactory()
        "15" -> BodySourceFactory()
        "16" -> InternetSourceFactory()
        "17" -> ThinkSourceFactory()
        "18" -> NumberSourceFactory()
        else -> throw IllegalArgumentException()
    }
}