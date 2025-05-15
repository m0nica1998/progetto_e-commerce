package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entita.Ordine;

import org.springframework.stereotype.Repository;
@Repository
public interface OrdineRepository extends JpaRepository <Ordine, Integer> {

}
