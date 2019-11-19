/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.models.services;

import com.sistemasng.celulares.celulares.models.dao.ICelularDao;
import com.sistemasng.celulares.celulares.models.entities.Celular;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author matia
 */

@Service
public class CelularServiceImpl implements ICelularService{
    
    @Autowired
    private ICelularDao dao;
    
    // SELECT * FROM nivel Objeto
    @Override
    public List<Celular> findAll(){
        return dao.findAll();
    }
    
}
