package repository;

import org.springframework.data.jpa.repository.JpaRepository;


import entita.Utente;

import org.springframework.stereotype.Repository;
@Repository
public interface UtenteRepository extends JpaRepository <Utente, Integer> {

}
