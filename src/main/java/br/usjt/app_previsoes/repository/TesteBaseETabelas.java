package br.usjt.app_previsoes.repository;
import javax.persistence.Persistence;
public class TesteBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("usjtPU");
	}
}



