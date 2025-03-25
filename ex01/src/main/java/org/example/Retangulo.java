package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Retangulo extends Pecas{
    private double largura;
    private double comprimento;

    Retangulo(double altura, double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.altura = altura;
    }
    @Override
    public void AreaTotal() {
        super.AreaTotal();
         this.area = largura *this.altura;
    }

    @Override
    public void VolumeTotal() {
        super.VolumeTotal();
        this.volume = largura *this.altura*comprimento;
    }
}
