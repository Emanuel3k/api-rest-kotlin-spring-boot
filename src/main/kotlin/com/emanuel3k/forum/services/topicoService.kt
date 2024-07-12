package com.emanuel3k.forum.services

import com.emanuel3k.forum.models.Curso
import com.emanuel3k.forum.models.Topico
import com.emanuel3k.forum.models.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService {

    fun listar(): List<Topico> {
        val topico = Topico(
            id = 1,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis do kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programacao",
            ),
            autor = Usuario(
                id = 1,
                nome = "Ana Silva",
                email = "ana@email.com"
            ),
        )

        return listOf(topico, topico, topico)
    }
}
