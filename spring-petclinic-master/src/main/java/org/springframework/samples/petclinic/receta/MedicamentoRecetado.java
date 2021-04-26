/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.receta;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.citas.Frecuencia;
import org.springframework.samples.petclinic.medicamento.Medicamento;
import org.springframework.samples.petclinic.model.BaseEntity;

/**
 *
 * @author Faabian
 */


@Entity
@Table (name = "medicamentos_recetados")
public class MedicamentoRecetado extends BaseEntity {
    @ManyToOne()
    @JoinColumn(name = "id_receta")
    public Receta receta;
    
    @ManyToOne
    @JoinColumn(name = "id_medicamento")
    public Medicamento medicamento;
    
    @ManyToOne
    @JoinColumn(name = "id_frecuencia")
    public Frecuencia frecuencia;
    
    @Column(name = "fecha")
    @NotNull
    @NotEmpty 
    public String fecha;
    
    @Column(name = "observaciones")
    public String observaciones;
    
    @Column(name = "dosis")
    public String dosis;

    public String auxFrecuencia;

    public String getAuxFrecuencia() {
        return auxFrecuencia;
    }

    public void setAuxFrecuencia(String auxFrecuencia) {
        this.auxFrecuencia = auxFrecuencia;
    }
    
    
    
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
