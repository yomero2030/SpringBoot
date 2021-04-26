/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.receta;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.core.style.ToStringCreator;
import org.springframework.samples.petclinic.citas.Frecuencia;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.owner.Owner;


/**
 *
 * @author Faabian
 */
@Entity
@Table(name = "recetas")
public class Receta  extends BaseEntity {
    @Column(name = "id")
    @Id
    public int id;
    
    @Column(name= "nombre")
    public String nombre;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy ="receta")
    private Set<MedicamentoRecetado> medicamentosRecetados;
    
    
    @Override
    public Integer getId() {
        return id;
    }
 
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Set<MedicamentoRecetado> getMedicamentosRecetados() {
        return medicamentosRecetados;
    }

    public void setMedicamentosRecetados(Set<MedicamentoRecetado> medicamentosRecetados) {
        this.medicamentosRecetados = medicamentosRecetados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
