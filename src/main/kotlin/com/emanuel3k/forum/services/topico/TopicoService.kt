package com.emanuel3k.forum.services.topico

import com.emanuel3k.forum.domain.dto.topico.NovoTopicoForm
import com.emanuel3k.forum.domain.dto.topico.TopicoView
import com.emanuel3k.forum.domain.models.Topico
import com.emanuel3k.forum.mapper.topico.TopicoFormMapper
import com.emanuel3k.forum.mapper.topico.TopicoViewMapper
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper,
    private val topicos: MutableList<Topico> = ArrayList(),
) {

    fun listar(): List<TopicoView> {
        return topicos.map { topico ->
            topicoViewMapper.map(topico)
        }
    }

    fun cadastrar(dto: NovoTopicoForm) {
        val topico = topicoFormMapper.map(dto)
        topico.id = topicos.size.toLong() + 1
        topicos.add(topico)
    }

    fun buscarPorId(id: Long): TopicoView? {
        return topicos.find { topico ->
            topico.id == id
        }?.let { topico ->
            topicoViewMapper.map(topico)
        }
    }
}
