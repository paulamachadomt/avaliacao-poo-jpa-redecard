package interfaces;

import java.util.List;

import model.SecureCode;

public interface ISecureCodeDAO {
	
	public void salvar(SecureCode securocode);
	
	public SecureCode findById(int id);
	
	public void excluir(SecureCode securocode);
	
	public void atualizar(SecureCode securocode);
	
	public List<SecureCode> listaSecureCode();
	

}
