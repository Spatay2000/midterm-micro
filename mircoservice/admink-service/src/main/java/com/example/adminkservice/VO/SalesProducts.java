package com.example.adminkservice.VO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesProducts {
    private int id;
    private String SalesProduct;
    private double value;
}
