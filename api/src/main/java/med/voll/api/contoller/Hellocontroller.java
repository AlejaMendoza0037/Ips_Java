package med.voll.api.contoller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hellocontroller {

    @GetMapping
    public String helloWord(){
        return "hello word from Colombia :)";
    }

    
}
