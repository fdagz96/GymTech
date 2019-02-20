package com.gimnasio.gimnasio.GymController;

import com.gimnasio.gimnasio.GimnasioDao.GimnasioClienteDao;
import com.gimnasio.gimnasio.GimnasioDao.GymDao;
import com.gimnasio.gimnasio.utileria.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GimnasioClienteController {
    @Autowired
    GimnasioClienteDao gimnasioClienteDao;

    //Registro de usuario
    @PostMapping("/gimnasios/{id}/clientes")
    public boolean registroClient(@PathVariable("id") String id, @RequestBody Cliente cliente) {
        return gimnasioClienteDao.registroCliente(id, cliente);
    }

    //Trae Clientes de un gimnasio
    @GetMapping("/gimnasios/{id}/clientes")
    public List<Cliente> getClientes(@PathVariable("id") String id) {
        return gimnasioClienteDao.getClientesDeGimnasio(id);
    }
    
    @GetMapping("/gimnasios/id/clientes{idCliente}")
    public Cliente getClientesById(@PathVariable("idCliente") String idCliente) {
        return gimnasioClienteDao.getClienteById(idCliente);
    }


}

