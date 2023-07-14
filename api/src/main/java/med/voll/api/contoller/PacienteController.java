package med.voll.api.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.paciente.DatosRegistroPaciente;




//agregamos medicos
@RestController//esto es un controller
@RequestMapping ("/pacientes")


public class PacienteController { 

    @PostMapping
    public void registrarPaciente( @RequestBody  DatosRegistroPaciente datosRegistroPaciente){        
        System.out.println(datosRegistroPaciente);

        
    }
    
}
    

