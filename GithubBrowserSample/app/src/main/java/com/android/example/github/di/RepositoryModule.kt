package com.android.example.github.di

import com.android.example.github.repository.RepoRepository
import com.android.example.github.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {

    single { RepoRepository(get(), get(), get(), get()) }

    single { UserRepository(get(), get(), get()) }
}
