package com.gimnasio.gimnasio.GymController;

import com.gimnasio.gimnasio.GimnasioDao.GymDao;
import com.gimnasio.gimnasio.utileria.Gimnasio;
import com.gimnasio.gimnasio.utileria.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GimnasioControler {

    @Autowired
    GymDao gimnasioDao;
    ///Trea toda la lista de gimnasios registrados
    @GetMapping("/gimnasios")
    public List<Gimnasio> getGimnasios(){return gimnasioDao.traeGimnasios();}
    @PutMapping("/gimnasios/{id}")
    public boolean updateGimnasio(@PathVariable("id")String id,@RequestBody Gimnasio gimnasio){
        return gimnasioDao.updateGimnasio(id, gimnasio);
    }
    //Trae un solo gimnasio por id;
    @PostMapping("/gimnasios/{id}")
    public Gimnasio getGimnasio(@PathVariable("id")String id){

        return gimnasioDao.getGimnasio(id);
    }

    //Registra un nuevo gimnasio
    @PostMapping("/gimnasios")
    public boolean  postGimnasio(@RequestBody Gimnasio gimnasio){
        return gimnasioDao.posteaGimnasio(gimnasio);
    }

    //Borra gimnasio
    @DeleteMapping("/gimnasios/{id}")
    public void deleteGimnasio(@PathVariable("id")String id){
        gimnasioDao.borraGym(id);
    }

    //Acceso a Cuenta
    @PostMapping("/gimnasios/acceso")
    public boolean validacion(@RequestBody Gimnasio gimnasio )
    {
        return gimnasioDao.validaContraseña(gimnasio);
    }







}



