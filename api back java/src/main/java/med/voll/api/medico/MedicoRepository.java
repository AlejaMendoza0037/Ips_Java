package med.voll.api.medico;
//creamos los repositorios--->>>hacemos el gestion de la base de datos el CRUD

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
                                        //tipo objeto guardado,tipo de objeto del id
 @CrossOrigin(origins="http://localhost:5500")
 
public interface MedicoRepository extends JpaRepository<Medico, Long> {
    
}
