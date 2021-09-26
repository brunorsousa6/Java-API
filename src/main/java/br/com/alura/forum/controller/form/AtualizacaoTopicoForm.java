package br.com.alura.forum.controller.form;

import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
public class AtualizacaoTopicoForm {

    @NotNull
    @NotEmpty
    @Length(min = 5, max=100)
    private String titulo;

    @NotNull
    @NotEmpty
    @Length(min = 10, max=100)
    private String mensagem;

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getById(id);

        topico.setTitulo(this.titulo);
        topico.setMensagem((this.mensagem));

        return topico;
    }
}
