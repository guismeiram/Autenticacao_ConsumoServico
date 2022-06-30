package com.Entrevista.repository;

import com.Entrevista.models.Moedas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoedasRepository extends JpaRepository<Moedas, String> {

}
