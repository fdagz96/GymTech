package com.gimnasio.gimnasio.GymController;

import com.gimnasio.gimnasio.GimnasioDao.ClienteDao;
import com.gimnasio.gimnasio.utileria.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    ClienteDao clientedao;

    @GetMapping("/clientes")
    public List<Cliente> getClientes (){
        return clientedao.getClientes();
    }


}
