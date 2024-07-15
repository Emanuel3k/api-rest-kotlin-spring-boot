package com.emanuel3k.forum.domain.dto.topico

import com.emanuel3k.forum.domain.models.StatusTopico
import java.time.LocalDateTime

data class TopicoView (
    val id: Long?,
    val titulo: String,
    val mensagem: String,
    val status: StatusTopico,
    val dataCriacao: LocalDateTime
)
