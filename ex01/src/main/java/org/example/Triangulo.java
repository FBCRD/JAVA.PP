package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Triangulo extends Pecas{
    private double base;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void AreaTotal() {
        super.AreaTotal();
        area = (base*this.altura)/2;
    }

    @Override
    public void VolumeTotal() {
        super.VolumeTotal();
        volume = 1/3*(base*altura);
    }
}
