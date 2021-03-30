package com.andreamw96.mysimplecleanarchitecture.di

import com.andreamw96.mysimplecleanarchitecture.data.IMessageDataSource
import com.andreamw96.mysimplecleanarchitecture.data.MesageDataSource
import com.andreamw96.mysimplecleanarchitecture.data.MessageRepository
import com.andreamw96.mysimplecleanarchitecture.domain.IMessageRepository
import com.andreamw96.mysimplecleanarchitecture.domain.MessageInteractor
import com.andreamw96.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MesageDataSource()
    }
}