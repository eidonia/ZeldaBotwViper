package com.example.zeldabotwviper.ui.detail_monster.api

import com.example.zeldabotwviper.app.model.detail_monster.MonsterDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DetailApi {

    @GET("entry/{monsterId}")
    suspend fun getMonsterDetail(@Path("monsterId") monsterID: Int): MonsterDetailDto

}