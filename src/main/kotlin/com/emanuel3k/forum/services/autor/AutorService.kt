package com.emanuel3k.forum.services.autor

import com.emanuel3k.forum.domain.models.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(
    private var usuarios: List<Usuario>
) {
    init {
        val usuario = Usuario(
            id = 1,
            nome = "Jeremias",
            email = "Jeremias@email.com"
        )

        usuarios = listOf(usuario)
    }

    fun buscarPorId(idAutor: Long): Usuario {
        return usuarios.find { usuario ->
            usuario.id == idAutor
        }!!
    }
}
