package com.Entrevista.repository;

import com.Entrevista.models.Moedas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoedasRepository extends JpaRepository<Moedas, String> {

    @Query(value = "SELECT * FROM moedas m WHERE m.rank < 100 ORDER BY :rank",
            nativeQuery = true)
    List<Moedas> findTopRankMoedas(int rank);
}
