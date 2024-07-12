package com.emanuel3k.forum.services.topico

import com.emanuel3k.forum.models.Curso
import com.emanuel3k.forum.models.Topico
import com.emanuel3k.forum.models.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private var topicos: List<Topico>
) {

    init {
        val topico1 = Topico(
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
        val topico2 = Topico(
            id = 2,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis do kotlin",
            curso = Curso(
                id = 2,
                nome = "Kotlin",
                categoria = "Programacao",
            ),
            autor = Usuario(
                id = 2,
                nome = "Ana Silva",
                email = "ana@email.com"
            ),
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Duvida Kotlin",
            mensagem = "Variaveis do kotlin",
            curso = Curso(
                id = 3,
                nome = "Kotlin",
                categoria = "Programacao",
            ),
            autor = Usuario(
                id = 3,
                nome = "Ana Silva",
                email = "ana@email.com"
            ),
        )

        topicos = listOf(topico1, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico? {
        return topicos.find { topico ->
            topico.id == id
        }
    }
}
