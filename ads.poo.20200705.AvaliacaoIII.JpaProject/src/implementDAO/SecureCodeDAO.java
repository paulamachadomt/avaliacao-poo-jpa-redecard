package implementDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.ISecureCodeDAO;
import model.SecureCode;

public class SecureCodeDAO implements ISecureCodeDAO{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ads.poo.20200705.AvaliacaoIII.JpaProject");
	EntityManager em = emf.createEntityManager();
	
	public SecureCodeDAO() {
		
	}

	public void gravarListaSecureCode(List<SecureCode> listaSecureCode) {
		for(SecureCode securecode : listaSecureCode) {
			salvar(securecode);
		}
		
	}

	@Override
	public void salvar(SecureCode securecode) {
		em.getTransaction().begin();
		em.persist(securecode);
		em.getTransaction().commit();
		
	}

	@Override
	public SecureCode findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(SecureCode securocode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(SecureCode securocode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SecureCode> listaSecureCode() {
		return em.createQuery("Select a from securecode a").getResultList();
	
	}


	
}
