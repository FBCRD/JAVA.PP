package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Quadrado extends Pecas{
    public double lado;



    @Override
    public void AreaTotal() {
        super.AreaTotal();
        this.area = lado * lado;
    }

    @Override
    public void VolumeTotal() {
        super.VolumeTotal();
        this.volume = lado * lado* lado;
    }
}
