package com.andreamw96.mysimplecleanarchitecture.data

import com.andreamw96.mysimplecleanarchitecture.domain.MessageEntity

//implementasi datasource yang merupakan sumber data message yang akan didapat.
class MesageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name! Welcome!")
    }
}