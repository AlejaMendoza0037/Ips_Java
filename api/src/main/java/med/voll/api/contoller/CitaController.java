package med.voll.api.contoller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//agregamos medicos
@RestController//esto es un controller
@RequestMapping ("/citas")
public class CitaController {

    @PostMapping
    public void registrarCita( @RequestBody  String Parmtro){
        System.out.println("El request llega correctamente");
        System.out.println(Parmtro);

        
    }
    
}
