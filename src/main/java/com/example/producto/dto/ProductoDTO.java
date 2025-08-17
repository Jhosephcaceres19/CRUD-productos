package com.example.producto.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {
    private Long id;

    @NotBlank(message= "El nombre no puede estar vacio")
    @Size(min =3, max = 50, message= "El nombre debe tener entre 3 y 50 caracterres")
    private String nombre;

    @NotBlank(message = "La descripcion no puede estar vacia")
    @Size(min = 10, max=200, message = "La descripcion no debe tener entre 10 y 200 caracteres")
    private String descripcion;

    @NotNull(message = "El precio no puede ser nulo")
    @Positive(message = "El precio debe ser mayor que cero")
    private double precio;

    @NotNull(message = "El stock no debe ser nulo")
    @PositiveOrZero(message = "EL stock no puede ser negativo")
    private Integer stock;
}
