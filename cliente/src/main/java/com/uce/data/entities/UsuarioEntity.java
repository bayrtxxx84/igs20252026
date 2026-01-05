package com.uce.data.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioEntity {

    private String nombre;
    private String apellido;
    private Integer edad;
    private String userId;

}
