package com.emanuel3k.forum.domain.dto.topico

data class NovoTopicoForm(
    val titulo: String,
    val mensagem: String,
    val idCurso: Long,
    val idAutor: Long,
)
