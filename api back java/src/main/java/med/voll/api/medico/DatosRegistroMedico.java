package med.voll.api.medico;

//import org.hibernate.annotations.Parent;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(
    @NotBlank
    String nombre, 

    @NotBlank
    String apellido,

    @NotBlank 
    @Email
    String email, 

    @NotBlank
    String documento, 

    @NotNull
    Especialidad especialidad, 

    @NotNull
    @Valid
    DatosDireccion direccion,    
      
    
    String id_especialidad, 

    @NotBlank
    String consultorio   ) {


} 

	

