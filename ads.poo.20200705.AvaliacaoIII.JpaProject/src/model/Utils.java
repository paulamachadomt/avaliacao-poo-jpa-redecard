package model;

import java.math.BigDecimal;
import java.util.List;

import interfaces.ISomaValorPorConsulta;

public class Utils implements ISomaValorPorConsulta {

	@Override
	public BigDecimal somaValorPorConsultaPeriodo(List<SecureCode> listaSecureCode) {
		BigDecimal somatorio = new BigDecimal("0");
		for(SecureCode securecode : listaSecureCode) {
			somatorio = somatorio.add(new BigDecimal(securecode.getValorConsultasPeriodo()));
		}
		return somatorio;
	}

	public void imprimirListaSecureCodes(List<SecureCode> listaSecureCode) {
		
		for (SecureCode securecode : listaSecureCode) {
			System.out.println(securecode.toString());
		}
		
	}
	
	
	

}
