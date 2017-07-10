/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zahangir.service;

import com.zahangir.dao.OutDoorDao;
import com.zahangir.model.Outdoor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Zahangir Alam
 */
@Service
public class OutdoorServiceImpl implements OutdoorService{
    
    private OutDoorDao outDoorDao;

    @Override
    @Transactional
    public void addOutdoor(Outdoor outdoor) {
        outDoorDao.addOutdoor(outdoor);
    }

    @Override
    @Transactional
    public void removeOutoorById(int id) {
        outDoorDao.removeOutoorById(id);
    }
    
}
