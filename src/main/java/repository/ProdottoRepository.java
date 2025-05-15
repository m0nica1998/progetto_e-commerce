package repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import entita.Prodotto;
@Repository
public interface ProdottoRepository extends JpaRepository <Prodotto, Integer> {

}
