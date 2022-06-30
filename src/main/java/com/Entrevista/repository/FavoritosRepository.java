package com.Entrevista.repository;

import com.Entrevista.models.Favoritas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritosRepository extends JpaRepository<Favoritas, Long> {

}
