package med.voll.api.medico;



public record DatosListadoMedico(Long id, String nombre, String apellido, String documento, String especialidad, String direccion) {

    
    public DatosListadoMedico(Medico medico){
        this( 
            medico.getId(),
            medico.getNombre(), 
            medico.getApellido(), 
            medico.getDocumento(), 
            medico.getEspecialidad().toString(),
            medico.getDireccion().toString()
            );         

        }
  

}
