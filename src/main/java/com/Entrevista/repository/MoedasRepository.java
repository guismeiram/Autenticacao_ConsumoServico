package com.Entrevista.repository;

import com.Entrevista.models.Moedas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface MoedasRepository extends JpaRepository<Moedas, Long> {

    @Query(value = "SELECT * FROM MOEDAS LIMIT 50",
            nativeQuery = true)
    List<Moedas> findTopRankMoedas(@RequestParam(value = "rank") Long rank);
}
