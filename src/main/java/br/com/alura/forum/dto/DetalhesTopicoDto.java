package br.com.alura.forum.dto;

import br.com.alura.forum.enums.StatusTopico;
import br.com.alura.forum.model.Topico;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class DetalhesTopicoDto {

    @JsonProperty("id_topico")
    private Long id;
    private String titulo;
    private String mensagem;
    @JsonProperty("data_criacao")
    private LocalDateTime dataCriacao;
    @JsonProperty("nome_autor")
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;

    public DetalhesTopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
        this.nomeAutor = topico.getAutor().getNome();
        this.status = topico.getStatus();
        this.respostas = new ArrayList<>();
        this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
    }



}
