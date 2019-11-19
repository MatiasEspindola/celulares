/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemasng.celulares.celulares.models.services;

import com.sistemasng.celulares.celulares.models.dao.IMarcaDao;
import com.sistemasng.celulares.celulares.models.entities.Marca;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author matia
 */
@Service
public class MarcaServiceImpl implements IMarcaService {

    @Autowired
    private IMarcaDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Marca> findAll() {
        return (List<Marca>) dao.findAll();
    }

    @Override
    public Marca findById(int id) {
        return dao.findById(id).orElse(null);
    }

}
