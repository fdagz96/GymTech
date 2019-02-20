package com.gimnasio.gimnasio.GimnasioDao;

import com.gimnasio.gimnasio.repositories.IGymRepository;
import com.gimnasio.gimnasio.utileria.Cliente;
import com.gimnasio.gimnasio.utileria.Gimnasio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GymDao {

    @Autowired
    IGymRepository iGimnasioRepository;




    //Get
    public List<Gimnasio> traeGimnasios() {
        return iGimnasioRepository.findAll();
    }

    //Post
    public boolean posteaGimnasio(Gimnasio gimnasio) {
        return iGimnasioRepository.save(gimnasio) != null;
    }


    public void borraGym(String id) {
        iGimnasioRepository.deleteById(id);
    }



    public boolean validaContraseña(Gimnasio gimnasio) {
        Gimnasio gym =iGimnasioRepository.findByCorreoAndPassword(gimnasio.getCorreo(),gimnasio.getPassword());
        if(gym!=null){
            return true;
        }
        else{
            return false;
        }



    }

    public Gimnasio getGimnasio(String id) {
        return iGimnasioRepository.findGimnasioById(id);
    }


    public boolean updateGimnasio(String id,Gimnasio gimnasio) {
        Gimnasio gym= iGimnasioRepository.findGimnasioById(id);
        if(gym!=null) {
            gimnasio.setId(gym.getId());

            iGimnasioRepository.save(gimnasio);
            return true;
        }
        else{
            return false;
        }


    }
}
