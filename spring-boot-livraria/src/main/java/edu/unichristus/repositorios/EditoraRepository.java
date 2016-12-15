package edu.unichristus.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.unichristus.dominio.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {



}
