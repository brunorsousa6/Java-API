package br.com.alura.forum.dto;

import br.com.alura.forum.model.Resposta;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.checkerframework.checker.units.qual.A;

import java.time.LocalDateTime;

@Getter
public class RespostaDto {

    private Long id;
    private String mensagem;
    @JsonProperty("data_criacao")
    private LocalDateTime dataCriacao;
    @JsonProperty("nome_autor")
    private String nomeAutor;

    public RespostaDto(Resposta resposta){
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagem();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
    }
}
