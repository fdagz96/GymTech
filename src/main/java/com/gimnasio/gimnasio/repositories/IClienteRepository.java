package com.gimnasio.gimnasio.repositories;

import com.gimnasio.gimnasio.utileria.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IClienteRepository extends MongoRepository<Cliente,String> {
    Cliente findByCorreoAndContrasena(String correo,String contrasena);
    Cliente findClienteById(String id);
}
