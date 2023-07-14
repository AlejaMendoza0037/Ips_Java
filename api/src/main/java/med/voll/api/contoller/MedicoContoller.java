package med.voll.api.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DatosRegistroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;

//agregamos medicos
@RestController//esto es un controller
@RequestMapping ("/medicos")

public class MedicoContoller {

    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public void registrarMedico( @RequestBody DatosRegistroMedico datosRegistroMedico){
        
        //transformamos los datos para que persistan en la DB
        medicoRepository.save(new Medico(datosRegistroMedico));
        System.out.println(datosRegistroMedico);

        
    }
    
}
