package com.andreamw96.mysimplecleanarchitecture

import com.andreamw96.mysimplecleanarchitecture.domain.IMessageRepository
import com.andreamw96.mysimplecleanarchitecture.domain.MessageEntity
import com.andreamw96.mysimplecleanarchitecture.domain.MessageInteractor
import com.andreamw96.mysimplecleanarchitecture.domain.MessageUseCase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {
    companion object {
        const val NAME = "Dicoding"
    }

    private lateinit var messageUseCase: MessageUseCase

    @Mock
    private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test
    fun `should get data from repository`() {
        messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
    }
}