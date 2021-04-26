/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.citas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.samples.petclinic.model.BaseEntity;

/**
 *
 * @author Faabian
 */
@Entity
@Table(name = "frecuencias")
public class Frecuencia  extends BaseEntity{
    @Column(name = "id")
    @Id
    public int id;
    
    @Column(name = "frecuencia")
    public String nombre;

    public String getFrecuencia() {
        return nombre;
    }
    
    @Override
    public Integer getId(){
        return id;
    }
    
    @Override
    public void setId(Integer id){
        this.id = id;
    }

    public void setFrecuencia(String frecuencia) {
        this.nombre = frecuencia;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + ", Nombre: " + nombre;
    }
}
