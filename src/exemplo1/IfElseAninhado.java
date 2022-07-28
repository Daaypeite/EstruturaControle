package exemplo1;

public class IfElseAninhado {

	public static void main(String[] args) {
		//criando uma nova variavel
		int hora = 17;
		
		//aninhamento de ifs e else
	if(hora < 12) {
		System.out.println("Bom dia! como voces estão?");
	}else if(hora < 18) {
		System.out.println("Boa tarde! tudobem?");
	}else {
		System.out.println("Entendi! é noite, então, boa noite!");
		
	}

}
}