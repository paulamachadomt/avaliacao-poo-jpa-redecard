package interfaces;
import java.math.BigDecimal;
import java.util.List;

import model.SecureCode;

public interface ISomaValorPorConsulta {
	

	BigDecimal somaValorPorConsultaPeriodo(List<SecureCode> listaSecureCode);
		

}


