package com.Entrevista.repository;

import com.Entrevista.models.Moedas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoedasRepository extends JpaRepository<Moedas, Long> {

    @Query(value = "SELECT * FROM moedas m  WHERE m.rank < :rank  ORDER BY m.rank ASC Limit 50",
            nativeQuery = true)
    List<Moedas> findTopRankMoedas(Long rank);
}
