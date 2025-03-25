package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Circulo extends Pecas{
    private int raio;
    Circulo(int raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }
    @Override
    public void AreaTotal() {
        super.AreaTotal();
        this.area = 0.5 * (3.16*(raio*raio));
    }

    @Override
    public void VolumeTotal() {
        super.VolumeTotal();
        this.volume = 3.16*(raio*raio)*altura;
    }
}
