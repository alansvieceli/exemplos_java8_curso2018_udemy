package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Postagem;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("comentario 1");
		Comentario c2 = new Comentario("comentario 2");
		
		Postagem post = new Postagem(sdf.parse("21/06/2018 19:22:02"), "Titulo do post", "Estou postando alguma coisa", 12); 
		post.AdicionarComentario(c1);
		post.AdicionarComentario(c2);
		
		System.out.println(post);
	}

}
