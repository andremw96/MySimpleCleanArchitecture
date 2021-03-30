package com.andreamw96.mysimplecleanarchitecture.domain

// Kelas ini berisi proses bisnis yang akan dipanggil dari Use Case
interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}