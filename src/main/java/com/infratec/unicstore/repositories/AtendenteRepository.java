package com.infratec.unicstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infratec.unicstore.domain.Atendente;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente, Integer>{

}
