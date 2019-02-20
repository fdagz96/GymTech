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
public class GimnasioClienteDao {
    List<Cliente> clien=new ArrayList<>();
    @Autowired
    IGymRepository iGimnasioRepository;
    @Autowired
    IClienteRepository iClienteRepository;

    public boolean registroCliente (String id, Cliente cliente) {
        Gimnasio gym =iGimnasioRepository.findGimnasioById(id);

        if(gym!=null){
            cliente.setIdgym(gym.getId());
            clien.add(cliente);
            gym.setClientes(clien);

            iClienteRepository.save(cliente);
            iGimnasioRepository.save(gym);
            return true;

        }
        else{
            return false;
        }
    }



    public List<Cliente> getClientesDeGimnasio(String id) {
        Gimnasio gym = iGimnasioRepository.findGimnasioById(id);
        return gym.getClientes();

    }

    public Cliente getClienteById(String idCliente) {
        return iClienteRepository.findClienteById(idCliente);
    }
}
