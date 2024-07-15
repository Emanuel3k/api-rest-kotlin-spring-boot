package com.emanuel3k.forum.controllers.topico

import com.emanuel3k.forum.domain.dto.topico.NovoTopicoForm
import com.emanuel3k.forum.domain.dto.topico.TopicoView
import com.emanuel3k.forum.services.topico.TopicoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topicos")
class TopicoController(
    private val service: TopicoService
) {

    @GetMapping
    fun listar(): List<TopicoView> {
        return service.listar()
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: NovoTopicoForm) {
        service.cadastrar(dto)
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): TopicoView? {
        return service.buscarPorId(id)
    }

}
