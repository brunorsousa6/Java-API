package br.com.alura.forum.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErroFormDto {
    private String campo;
    private String erro;


}
