package med.voll.api.paciente;

import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroPaciente(String nombre, String apellido, String email, String fecha_nacimiento,String documento, DatosDireccion direccion) {
    
}
