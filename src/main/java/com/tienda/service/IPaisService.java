/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author kmor5
 */
public interface IPaisService {
    public List<Pais> getAllPais();
    public void savePais(Pais pais); 
    public Persona getPaisbyId(long id); 
    public void delete(long id);

    public List<Pais> listaCountry();
}
