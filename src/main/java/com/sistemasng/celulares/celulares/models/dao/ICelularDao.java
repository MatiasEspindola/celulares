/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.models.dao;

import com.sistemasng.celulares.celulares.models.entities.Celular;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author matia
 */
public interface ICelularDao extends JpaRepository<Celular, Integer>{
    
}