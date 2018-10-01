package entidades;

import java.util.Date;

public class EntradaDeLog {
	
	private String usuario;
	private Date dataentrada;
	
	public EntradaDeLog(String usuario, Date dataentrada) {
		this.usuario = usuario;
		this.dataentrada = dataentrada;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getDataEntrada() {
		return dataentrada;
	}

	public void setDataEntrada(Date dataentrada) {
		this.dataentrada = dataentrada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		EntradaDeLog other = (EntradaDeLog) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}
