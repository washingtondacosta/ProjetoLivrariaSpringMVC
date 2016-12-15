package edu.unichristus.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unichristus.dominio.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
