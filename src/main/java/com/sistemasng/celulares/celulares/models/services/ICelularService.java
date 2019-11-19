/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.models.services;

import com.sistemasng.celulares.celulares.models.entities.Celular;
import java.util.List;

/**
 *
 * @author matia
 */
public interface ICelularService {
    
    public List<Celular> findAll();
    
}
