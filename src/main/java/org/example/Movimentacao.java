package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movimentacao {
    private String descricao;
    private double valor;
    private String tipoTransacao;
}
