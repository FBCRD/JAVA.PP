package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Losango extends Pecas{
    private double lat;

    @Override
    public void AreaTotal() {
        super.AreaTotal();
        this.area= (lat*lat)/2;
    }
}
