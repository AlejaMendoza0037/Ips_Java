package med.voll.api.medico;
//creamos los repositorios--->>>hacemos el gestion de la base de datos el CRUD

import org.springframework.data.jpa.repository.JpaRepository;
                                        //tipo objeto guardado,tipo de objeto del id

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    
}
