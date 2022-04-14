package com.tienda.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//Clase para las entidades donde se va a guardar la informacion

@Entity //para definir la entidad pais
@Table(name="paises") // para nombrar la tabla paises
public class Pais implements Serializable {
    @Id //para indicar que nuestro id es nuestra llave primaria 
    @GeneratedValue(strategy=GenerationType.IDENTITY)//se va a ingresando los datos incrementando uno+
    
    
    private long id;
    private String pais; 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
