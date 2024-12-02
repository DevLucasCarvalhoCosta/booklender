package com.booklender.booklender;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import com.booklender.booklender.model.Emprestimo;
import com.booklender.booklender.model.Livro;
import com.booklender.booklender.model.Usuario;
import com.booklender.booklender.repository.EmprestimoRepository;
import com.booklender.booklender.repository.LivroRepository;
import com.booklender.booklender.repository.UsuarioRepository;
import com.booklender.booklender.controller.EmprestimoController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class EmprestimoControllerTest {

    @Mock
    private EmprestimoRepository emprestimoRepository;

    @Mock
    private LivroRepository livroRepository;

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private EmprestimoController emprestimoController;

    @Test
    public void criarEmprestimoTest() {
        Livro livro = new Livro();
        livro.setId(1L);
        livro.setTitulo("Clean Code");
        livro.setQuantidadeDisponivel(5);

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("João Silva");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);

        when(livroRepository.findById(1L)).thenReturn(java.util.Optional.of(livro));
        when(usuarioRepository.findById(1L)).thenReturn(java.util.Optional.of(usuario));
        when(emprestimoRepository.save(any(Emprestimo.class))).thenReturn(emprestimo);

        Emprestimo resultado = emprestimoController.criarEmprestimo(emprestimo).getBody();

        assertNotNull(resultado);
        assertEquals("Clean Code", resultado.getLivro().getTitulo());
    }
}
