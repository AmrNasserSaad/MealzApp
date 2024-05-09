package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.entity.CategoryResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {

    // to override the fun from the meals repo interface from domain layer
    override fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()


}