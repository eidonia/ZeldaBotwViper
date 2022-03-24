package com.example.zeldabotwviper.ui.list_monster.api

import com.example.zeldabotwviper.app.model.list_monster.DataMonsterDto
import retrofit2.http.GET

interface ListApi {

    @GET("category/monsters")
    suspend fun getMonsters(): DataMonsterDto

}