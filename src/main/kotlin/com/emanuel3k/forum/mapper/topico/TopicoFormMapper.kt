package com.emanuel3k.forum.mapper.topico

import com.emanuel3k.forum.domain.dto.topico.NovoTopicoForm
import com.emanuel3k.forum.domain.models.Topico
import com.emanuel3k.forum.mapper.Mapper
import com.emanuel3k.forum.services.autor.UsuarioService
import com.emanuel3k.forum.services.curso.CursoService
import org.springframework.stereotype.Component

@Component
class TopicoFormMapper(
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService,
) : Mapper<NovoTopicoForm, Topico> {

    override fun map(t: NovoTopicoForm): Topico {
        return Topico(
            titulo = t.titulo,
            mensagem = t.mensagem,
            curso = cursoService.buscarPorId(t.idCurso),
            autor = usuarioService.buscarPorId(t.idAutor)
        )
    }
}
