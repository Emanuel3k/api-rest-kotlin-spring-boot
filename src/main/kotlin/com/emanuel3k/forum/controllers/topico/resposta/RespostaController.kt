package com.emanuel3k.forum.controllers.topico.resposta

import com.emanuel3k.forum.models.Resposta
import com.emanuel3k.forum.services.topico.resposta.RespostaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos/{id}/respostas")
class RespostaController(
    private val service: RespostaService
) {

    @GetMapping
    fun listar(@PathVariable id: Long): List<Resposta> {
        return service.listar(id)
    }


}
