package com.gimnasio.gimnasio.repositories;

import com.gimnasio.gimnasio.utileria.Cliente;
import com.gimnasio.gimnasio.utileria.Gimnasio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IGymRepository extends MongoRepository <Gimnasio,String> {

     Gimnasio findByCorreoAndPassword(String correo, String password);
     Gimnasio findGimnasioById(String id);


}
