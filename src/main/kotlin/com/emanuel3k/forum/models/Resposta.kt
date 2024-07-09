package com.emanuel3k.forum.models

import java.time.LocalDateTime

data class Resposta(
    val id: Long? = null,
    val menssagem: String,
    val dataCriacao: LocalDateTime = LocalDateTime.now(),
    val autor: Usuario,
    val topico: Topico,
    val solucao: Boolean
)
