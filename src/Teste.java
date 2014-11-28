
public class Teste {

	public static void main(String[] args) {
	
		// Ataque com uma única linha!
		Ataque ataque = () -> System.out.println("Ataque!!!");
			
		// Mesmo ataque escrito com as chaves
		Ataque ataque2 = () -> { 
			String s = "Ataque!!! - Tipo 2";
			System.out.println(s); 
		};
		
		
		Arqueiro a = new Arqueiro(ataque);
		a.getAtaque().atacar();
		
		Arqueiro b = new Arqueiro(ataque2);
		b.getAtaque().atacar();
	}
}
