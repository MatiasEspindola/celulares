/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.controllers;

import com.sistemasng.celulares.celulares.models.entities.Celular;
import com.sistemasng.celulares.celulares.models.services.CelularServiceImpl;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author matia
 */
//
@Controller
public class indexController {

    // VOY A USAR EL SERVICIO 'CelularServiceImpl' PARA EXTRAER DATOS
    @Autowired
    private CelularServiceImpl celularServ;

    // INDEX
    @GetMapping({"/", "/index"})
    public String index(Map m) {

        List<Celular> celulares = celularServ.findAll();

        m.put("titulo", "Celulares - Inicio");
        m.put("celulares", celulares);

        return "/index";
    }

}
