package com.emanuel3k.forum.services.curso

import com.emanuel3k.forum.domain.models.Curso
import org.springframework.stereotype.Service

@Service
class CursoService(
    private var cursos: List<Curso>
) {

    init {
        val curso = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programacao"
        )
        cursos = listOf(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return cursos.find { curso ->
            curso.id == id
        }!!
    }
}
