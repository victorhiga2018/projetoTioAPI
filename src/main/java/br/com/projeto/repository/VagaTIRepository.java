package br.com.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.VagaTI;

public interface VagaTIRepository extends JpaRepository<VagaTI, Integer> {
	
	//List<VagaTI> findByEmail(String cargo);
	List<VagaTI> findByCargoIgnoreCaseLike(String cargo);
	//List<VagaTI> findByEmailIgnoreCaseLikeOrNomeIgnoreCaseLikeOrderByNome(String cargo, double salario);

}
