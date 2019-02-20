package com.gimnasio.gimnasio.GimnasioDao;

import com.gimnasio.gimnasio.repositories.IClienteRepository;
import com.gimnasio.gimnasio.repositories.IGymRepository;
import com.gimnasio.gimnasio.utileria.Cliente;
import com.gimnasio.gimnasio.utileria.Gimnasio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteDao {

    @Autowired
    IClienteRepository iClienteRepository;


    public List<Cliente> getClientes() {
        return iClienteRepository.findAll();
    }
}
