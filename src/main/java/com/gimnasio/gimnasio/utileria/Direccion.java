package com.gimnasio.gimnasio.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Direccion {
    private String calle;
    private int numero;
    private String colonia;
    private String municipio;
    private String estado;

}
