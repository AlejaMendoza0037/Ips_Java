package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre, String apellido, String email, String documento, Especialidad especialidad, DatosDireccion direccion,  String id_especialidad, String consultorio   ) {


} 

	

