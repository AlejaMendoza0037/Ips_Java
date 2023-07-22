package med.voll.api.direccion;

import jakarta.validation.constraints.NotBlank;

//record =crea una clase normal pero cuando se compila el codigo
public record DatosDireccion(
    @NotBlank
    String calle, 
    
    @NotBlank
    String ciudad ) {


}