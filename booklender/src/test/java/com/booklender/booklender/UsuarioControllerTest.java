package com.booklender.booklender;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.booklender.booklender.model.Usuario;
import com.booklender.booklender.controller.UsuarioController;
import com.booklender.booklender.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UsuarioControllerTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioController usuarioController;

    @Test
    public void criarUsuarioTest() {
        Usuario usuario = new Usuario();
        usuario.setNome("João Silva");
        usuario.setEmail("joao.silva@email.com");

        when(usuarioRepository.save(any(Usuario.class))).thenReturn(usuario);

        Usuario resultado = usuarioController.criarUsuario(usuario).getBody();

        assertNotNull(resultado);
        assertEquals("João Silva", resultado.getNome());
    }
}
