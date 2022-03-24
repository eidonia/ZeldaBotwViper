package com.example.zeldabotwviper.ui.list_monster.repo

import com.example.zeldabotwviper.app.model.list_monster.DataMonsterDto
import com.example.zeldabotwviper.ui.list_monster.ListContract
import com.example.zeldabotwviper.ui.list_monster.api.ListApi
import javax.inject.Inject

class ListRepo @Inject constructor(private val api: ListApi): ListContract.Repo {
    override fun getMonsters(): DataMonsterDto {
        TODO("Not yet implemented")
    }
}