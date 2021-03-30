package com.andreamw96.mysimplecleanarchitecture.domain

//Class untuk Use Case
class MessageInteractor(private val repository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return repository.getWelcomeMessage(name)
    }
}