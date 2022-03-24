package com.example.zeldabotwviper.ui.list_monster.di

import com.example.zeldabotwviper.ui.list_monster.api.ListApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
class ListDi {

    @Provides
    fun api(retrofit: Retrofit) = retrofit.create(ListApi::class.java)

}