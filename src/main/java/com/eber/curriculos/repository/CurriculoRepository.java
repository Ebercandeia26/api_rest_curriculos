package com.eber.curriculos.repository;

import com.eber.curriculos.model.Curriculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
    
}