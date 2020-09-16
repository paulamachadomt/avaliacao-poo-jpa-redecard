package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "securecode")
public class SecureCode implements Serializable {
	
		private static final long serialVersionUID = 1L;
		
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY) private int id;
		@Column (name = "tipoRegistro") private String tipoRegistro;
		@Column (name = "numeroPontoVenda") private String numPV;
		@Column (name = "quantidadeConsultasPeriodo") private String qtdConsultasPeriodo;
		@Column (name = "valorTotalConsultasPeriodo") private String valorTotalConsultasPeriodo;
		@Column (name = "inicioPeriodoConsulta") private String inicioPeriodoConsulta;
		@Column (name = "fimPeriodoConsulta") private String fimPeriodoConsulta;
		@Column (name = "valorConsultasPeriodo") private String valorConsultasPeriodo;
		
		public SecureCode() {
			
		}

		public String getTipoRegistro() {
			return tipoRegistro;
		}

		public void setTipoRegistro(String tipoRegistro) {
			this.tipoRegistro = tipoRegistro;
		}

		public String getNumPV() {
			return numPV;
		}

		public void setNumPV(String numPV) {
			this.numPV = numPV;
		}

		public String getQtdConsultasPeriodo() {
			return qtdConsultasPeriodo;
		}

		public void setQtdConsultasPeriodo(String qtdConsultasPeriodo) {
			this.qtdConsultasPeriodo = qtdConsultasPeriodo;
		}

		public String getValorTotalConsultasPeriodo() {
			return valorTotalConsultasPeriodo;
		}

		public void setValorTotalConsultasPeriodo(String valorTotalConsultasPeriodo) {
			this.valorTotalConsultasPeriodo = valorTotalConsultasPeriodo;
		}

		public String getInicioPeriodoConsulta() {
			return inicioPeriodoConsulta;
		}

		public void setInicioPeriodoConsulta(String inicioPeriodoConsulta) {
			this.inicioPeriodoConsulta = inicioPeriodoConsulta;
		}

		public String getFimPeriodoConsulta() {
			return fimPeriodoConsulta;
		}

		public void setFimPeriodoConsulta(String fimPeriodoConsulta) {
			this.fimPeriodoConsulta = fimPeriodoConsulta;
		}

		public String getValorConsultasPeriodo() {
			return valorConsultasPeriodo;
		}

		public void setValorConsultasPeriodo(String valorConsultasPeriodo) {
			this.valorConsultasPeriodo = valorConsultasPeriodo;
		}

		@Override
		public String toString() {
			return "SecureCode [tipoRegistro=" + tipoRegistro + ", numPV=" + numPV + ", qtdConsultasPeriodo="
					+ qtdConsultasPeriodo + ", valorTotalConsultasPeriodo=" + valorTotalConsultasPeriodo
					+ ", inicioPeriodoConsulta=" + inicioPeriodoConsulta + ", fimPeriodoConsulta=" + fimPeriodoConsulta
					+ ", valorConsultasPeriodo=" + valorConsultasPeriodo + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fimPeriodoConsulta == null) ? 0 : fimPeriodoConsulta.hashCode());
			result = prime * result + ((inicioPeriodoConsulta == null) ? 0 : inicioPeriodoConsulta.hashCode());
			result = prime * result + ((numPV == null) ? 0 : numPV.hashCode());
			result = prime * result + ((qtdConsultasPeriodo == null) ? 0 : qtdConsultasPeriodo.hashCode());
			result = prime * result + ((tipoRegistro == null) ? 0 : tipoRegistro.hashCode());
			result = prime * result + ((valorConsultasPeriodo == null) ? 0 : valorConsultasPeriodo.hashCode());
			result = prime * result
					+ ((valorTotalConsultasPeriodo == null) ? 0 : valorTotalConsultasPeriodo.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SecureCode other = (SecureCode) obj;
			if (fimPeriodoConsulta == null) {
				if (other.fimPeriodoConsulta != null)
					return false;
			} else if (!fimPeriodoConsulta.equals(other.fimPeriodoConsulta))
				return false;
			if (inicioPeriodoConsulta == null) {
				if (other.inicioPeriodoConsulta != null)
					return false;
			} else if (!inicioPeriodoConsulta.equals(other.inicioPeriodoConsulta))
				return false;
			if (numPV == null) {
				if (other.numPV != null)
					return false;
			} else if (!numPV.equals(other.numPV))
				return false;
			if (qtdConsultasPeriodo == null) {
				if (other.qtdConsultasPeriodo != null)
					return false;
			} else if (!qtdConsultasPeriodo.equals(other.qtdConsultasPeriodo))
				return false;
			if (tipoRegistro == null) {
				if (other.tipoRegistro != null)
					return false;
			} else if (!tipoRegistro.equals(other.tipoRegistro))
				return false;
			if (valorConsultasPeriodo == null) {
				if (other.valorConsultasPeriodo != null)
					return false;
			} else if (!valorConsultasPeriodo.equals(other.valorConsultasPeriodo))
				return false;
			if (valorTotalConsultasPeriodo == null) {
				if (other.valorTotalConsultasPeriodo != null)
					return false;
			} else if (!valorTotalConsultasPeriodo.equals(other.valorTotalConsultasPeriodo))
				return false;
			return true;
		}
		
}
	
	


