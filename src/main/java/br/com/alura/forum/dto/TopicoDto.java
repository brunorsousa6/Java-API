package br.com.alura.forum.dto;

import br.com.alura.forum.model.Topico;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class TopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    @JsonProperty("data_criacao")
    private LocalDateTime dataCriacao;

    public TopicoDto(Topico t){
        this.id = t.getId();
        this.titulo = t.getTitulo();
        this.mensagem = t.getMensagem();
        this.dataCriacao = t.getDataCriacao();
    }

    public static Page<TopicoDto> converter(Page<Topico> topicos) {
        return topicos.map(TopicoDto::new);
    }
}
