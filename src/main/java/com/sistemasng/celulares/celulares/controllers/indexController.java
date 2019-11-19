/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.controllers;

import com.sistemasng.celulares.celulares.models.entities.Celular;
import com.sistemasng.celulares.celulares.models.entities.Marca;
import com.sistemasng.celulares.celulares.models.services.CelularServiceImpl;
import com.sistemasng.celulares.celulares.models.services.MarcaServiceImpl;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author matia
 */
//
@Controller
@SessionAttributes("celular")
public class indexController {

    // VOY A USAR EL SERVICIO 'CelularServiceImpl' PARA EXTRAER DATOS
    @Autowired
    private CelularServiceImpl celularServ;

    @Autowired
    private MarcaServiceImpl marcaServ;

    // INDEX
    @GetMapping({"/", "/index"})
    public String index(Map m) {

        List<Celular> celulares = celularServ.findAll();

        m.put("titulo", "Celulares - Inicio");
        m.put("celulares", celulares);

        return "/index";
    }

    @GetMapping("/registrar")
    public String registrar(Map m) {

        Celular celular = new Celular();
        List<Marca> marcas = marcaServ.findAll();
        
        m.put("marcas", marcas);

        m.put("titulo", "Celulares - Registrar");
        m.put("celular", celular);

        return "/registrar";
    }

    @PostMapping("/registrar")
    public String guardar(@Valid Celular celular, @RequestParam("marca") int id) {

        Marca marca = marcaServ.findById(id);

        celular.setMarca(marca);

        celularServ.save(celular);

        return "redirect:/";
    }

}
