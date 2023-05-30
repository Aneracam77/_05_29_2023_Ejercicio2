package com.hedima.ejercicio2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class Animales {
    private Integer idAnimal;
    private String paisOrigen;
    private Integer sexo;
    private Integer continente;
    private Integer fNacimiento;
}
