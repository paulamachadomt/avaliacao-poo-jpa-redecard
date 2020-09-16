package model;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import implementDAO.SecureCodeDAO;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Leitura do arquivo Redecard linha 042:");
		System.out.println("");
		LeituraArquivo leituraRedecard = new LeituraArquivo();
		List<SecureCode> listaSecureCode = leituraRedecard.leitura("D:\\NEFI_TESTE_1908.txt");
		
		Utils utils = new Utils();
		
		
		System.out.println("Resultado soma das informa��es de Valor por Consulta: " + utils.somaValorPorConsultaPeriodo(listaSecureCode));
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("");
		System.out.println("Conectando com o banco de dados...");
		SecureCodeDAO secureCodeDAO = new SecureCodeDAO();
		secureCodeDAO.gravarListaSecureCode(listaSecureCode);
		System.out.println("");
		System.out.println("Gravando dados na tabela do banco de dados com as informa��es da linha 042...");
				
		System.out.println("");
		System.out.println("Lendo as informa��es da tabela...");
		System.out.println("");
		List<SecureCode> listaSecureCodeDoBancoDeDados = secureCodeDAO.listaSecureCode();
		utils.imprimirListaSecureCodes(listaSecureCodeDoBancoDeDados);
		System.out.println("");
		
		System.out.println("Acessando m�todo de interface para soma das informa��es do campo valorConsultasPeriodo...");
		System.out.println("");
		BigDecimal valorTotalPorConsulta = utils.somaValorPorConsultaPeriodo(listaSecureCodeDoBancoDeDados);
		System.out.println("Soma das informa��es de Valor por Consulta da tabela securecode do banco de dados: " + valorTotalPorConsulta);
		
		
	}

}
