package com.example.zeldabotwviper.ui.list_monster

import com.example.zeldabotwviper.app.model.MonsterDetail
import com.example.zeldabotwviper.app.model.list_monster.DataMonsterDto

interface ListContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun publishList(data: List<MonsterDetail>)
    }

    interface Presenter {
        fun onViewCreated()
        fun onItemClicked()
    }

    interface ViewModel {
        fun getMonsters(onLoading: () -> Unit, onSuccess: (List<MonsterDetail>) -> Unit, onError: (Throwable) -> Unit)
    }

    interface Router {
        fun finish()
        fun openMonsterDetail(monsterDetail: MonsterDetail)
    }

    interface Repo {
        fun getMonsters(): DataMonsterDto
    }
}