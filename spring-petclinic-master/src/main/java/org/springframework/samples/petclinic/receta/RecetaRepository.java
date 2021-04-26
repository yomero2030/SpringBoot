/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.samples.petclinic.receta;

import java.util.Collection;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.samples.petclinic.citas.Mascotas;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Faabian
 */
public interface RecetaRepository {
    @Query("SELECT receta FROM Receta receta")
    @Transactional(readOnly = true)
    Collection<Receta> getRecetas();
    
    @Query("SELECT medicamento FROM MedicamentoRecetado medicamento")
    @Transactional(readOnly = true)
    Collection<MedicamentoRecetado> getMedicamentosRecetados();
}
