package med.voll.api.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.DatosActualizarMedico;
import med.voll.api.medico.DatosListadoMedico;
import med.voll.api.medico.DatosRegistroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;

//agregamos medicos
@RestController//esto es un controller

@RequestMapping ("/medicos")
//@CrossOrigin(origins="/*")

public class MedicoContoller {

    @Autowired
    private MedicoRepository medicoRepository;
    //@CrossOrigin(origins="/*")
    @PostMapping
    public void registrarMedico( @RequestBody @Valid DatosRegistroMedico datosRegistroMedico){
        
        //transformamos los datos para que persistan en la DB
        medicoRepository.save(new Medico(datosRegistroMedico));
        System.out.println(datosRegistroMedico);
        
    }
 
    @GetMapping
   // @CrossOrigin(origins="/*")
    public List<DatosListadoMedico>listadoMedicos(){
         return medicoRepository.findAll().stream().map(DatosListadoMedico::new).toList();
        
    }
    @PutMapping
    @Transactional  
    //@CrossOrigin(origins="/*")  
    public void actualizarMedico(@RequestBody @Valid DatosActualizarMedico datosActualizarMedico){
        //que medico debo actualizar
        Medico medico=medicoRepository.getReferenceById(datosActualizarMedico.id());
        medico.actualizarDatos(datosActualizarMedico);

        //cerramos 


    }

    @DeleteMapping("/{id}")
    @Transactional   
    //@CrossOrigin(origins="/*")
    public void eliminarMedico(@PathVariable Long id){

        Medico medico=medicoRepository.getReferenceById(id);
        //medicoRepository.delete(medico);---> para que se borre de la base de datos
       medico.desactivarMedico();


    }


        
    
    
}
