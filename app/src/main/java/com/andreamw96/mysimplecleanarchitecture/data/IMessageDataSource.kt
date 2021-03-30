package com.andreamw96.mysimplecleanarchitecture.data

import com.andreamw96.mysimplecleanarchitecture.domain.MessageEntity

//nterface untuk datasource yang merupakan template untuk implementasinya nanti
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}