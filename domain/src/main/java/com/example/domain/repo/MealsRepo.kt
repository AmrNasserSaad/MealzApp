package com.example.domain.repo

import com.example.domain.entity.CategoryResponse

interface MealsRepo {

    // to get data from api (the online data)
    fun getMealsFromRemote():CategoryResponse
}