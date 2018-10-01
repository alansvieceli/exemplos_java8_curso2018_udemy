package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	private Date data_postagem;
	private String titulo;
	private String conteudo;
	private Integer curtidas;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Postagem() {
		
	}
	
	public Postagem(Date data_postagem, String titulo, String conteudo, Integer curtidas) {
		super();
		this.data_postagem = data_postagem;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
	}
	
	public void Postar() {
		
	}
	

	public Date getData_postagem() {
		return data_postagem;
	}

	public void setData_postagem(Date data_postagem) {
		this.data_postagem = data_postagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getCurtidas() {
		return this.curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void AdicionarComentario(Comentario comentario) {
		comentarios.add(comentario);		
	}
	
	public void RemoverComentario(Comentario comentario) {
		comentarios.remove(comentario);		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(curtidas);
		sb.append("curtidas - " + sdf.format(data_postagem)+ "\n");
		sb.append(conteudo+ "\n");
		sb.append("Comentários: " + "\n");
		for (Comentario comentario : comentarios) {
			sb.append(comentario.getTexto() + "\n");
		}
		return sb.toString();
	}
	
	
}
