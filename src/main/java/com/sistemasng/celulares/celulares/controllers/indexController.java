/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author matia
 */

@Controller
public class indexController {
    
    @GetMapping({"/","/index"})
    public String index(Map m){
        
        return "/index";
    }
    
}
