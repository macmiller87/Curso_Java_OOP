package exemplo.array.objeto;

public class ChamandoUsuario {

	public static void main(String[] args) {
		
		Usuario userInfo = new Usuario("Chapolim");
		
		Usuario composicaoObjetos[] = { userInfo, new Usuario("Kiko"), new Usuario("Seu madruga") };
		
		
		for(Usuario u: composicaoObjetos) {
			System.out.println(u.getNome());
		}

	}

}
