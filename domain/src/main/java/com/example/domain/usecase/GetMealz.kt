package com.example.domain.usecase

import com.example.domain.repo.MealsRepo

class GetMealz(private val mealsRepo: MealsRepo) {

    // operator fun that call when i just take an object from this class in another class
    // GetMeals()
    suspend operator fun invoke() = mealsRepo.getMealsFromRemote()
}