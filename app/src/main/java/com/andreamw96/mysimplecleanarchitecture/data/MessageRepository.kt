package com.andreamw96.mysimplecleanarchitecture.data

import com.andreamw96.mysimplecleanarchitecture.domain.IMessageRepository
import com.andreamw96.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}