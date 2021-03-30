package com.andreamw96.mysimplecleanarchitecture.domain

//abstract class yang akan menjadi basis dari semua Use Case
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}