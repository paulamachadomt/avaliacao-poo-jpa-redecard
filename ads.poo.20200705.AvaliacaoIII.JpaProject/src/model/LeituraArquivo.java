package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LeituraArquivo {

	public List<SecureCode> leitura(String localArquivo) throws IOException {

		List<SecureCode> listaSecureCode = new ArrayList<>();

		File arquivo = new File(localArquivo);
		FileReader leitorArquivo = new FileReader(arquivo);
		BufferedReader bufferLeitor = new BufferedReader(leitorArquivo);

		while (bufferLeitor.ready()) {

			String linha = bufferLeitor.readLine();
			int tamanho = linha.length();

			if (linha.substring(0, 3).equals("042")) {
				String tipo = "Securecode";
				String numPV = linha.substring(3, 12);
				String qtdConsultasPeriodo = linha.substring(12, 17);
				String valorTotalConsultasPeriodo = linha.substring(17, 32);
				String inicioPeriodoConsulta = this.retornaData(linha.substring(32, 40));
				String fimPeriodoConsulta = this.retornaData(linha.substring(40, 49));
				String valorPorConsultaPeriodo = this.retornaValorBigDecimal(linha.substring(49, tamanho));

				SecureCode secureCode = new SecureCode();
				secureCode.setTipoRegistro(tipo);
				secureCode.setNumPV(numPV);
				secureCode.setQtdConsultasPeriodo(qtdConsultasPeriodo);
				secureCode.setValorTotalConsultasPeriodo(valorTotalConsultasPeriodo);
				secureCode.setInicioPeriodoConsulta(inicioPeriodoConsulta);
				secureCode.setFimPeriodoConsulta(fimPeriodoConsulta);
				secureCode.setValorConsultasPeriodo(valorPorConsultaPeriodo);

				listaSecureCode.add(secureCode);
			}
		}
		leitorArquivo.close();
		bufferLeitor.close();

		return listaSecureCode;
	}

	public String retornaData(String data) {
		String dia = data.substring(0, 2);
		String mes = data.substring(2, 4);
		String ano = data.substring(4, 8);
		String mdata = dia + "/" + mes + "/" + ano;
		return mdata;
	}

	public String retornaValorBigDecimal(String valor) {
		Locale brazil = new Locale("pt", "br");
		DecimalFormat df = new DecimalFormat("#,##", new DecimalFormatSymbols(brazil));
		BigDecimal decimal = new BigDecimal(valor);
		return df.format(decimal);
	}

}
