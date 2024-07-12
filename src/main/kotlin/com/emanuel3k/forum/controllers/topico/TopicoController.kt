package com.emanuel3k.forum.controllers.topico

import com.emanuel3k.forum.domain.dto.NovoTopicoDTO
import com.emanuel3k.forum.domain.models.Topico
import com.emanuel3k.forum.services.topico.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(
    private val service: TopicoService
) {

    @GetMapping
    fun listar(): List<Topico> {
        return service.listar()
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoDTO) {
        service.cadastrar(dto)
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): Topico? {
        return service.buscarPorId(id)
    }

}
