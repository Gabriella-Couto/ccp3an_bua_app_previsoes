package br.usjt.app_previsoes.repository;
import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import br.usjt.app_previsoes.model.Cidade;
import br.usjt.app_previsoes.repository.JPAUtil;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public interface CidadesRepository extends JpaRepository<Cidade, Long> {
	
	
}