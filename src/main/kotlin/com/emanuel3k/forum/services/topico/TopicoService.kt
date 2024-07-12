package com.emanuel3k.forum.services.topico

import com.emanuel3k.forum.domain.dto.NovoTopicoDTO
import com.emanuel3k.forum.domain.models.Topico
import com.emanuel3k.forum.services.autor.UsuarioService
import com.emanuel3k.forum.services.curso.CursoService
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService,
    private val topicos: MutableList<Topico> = ArrayList(),
) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun cadastrar(dto: NovoTopicoDTO) {

        topicos.add(
            Topico(
                id = topicos.size.toLong() + 1,
                titulo = dto.titulo,
                mensagem = dto.mensagem,
                curso = cursoService.buscarPorId(dto.idCurso),
                autor = usuarioService.buscarPorId(dto.idAutor)
            )
        )
    }

    fun buscarPorId(id: Long): Topico? {
        return topicos.find { topico ->
            topico.id == id
        }
    }

}
