package exemplo1;

public class ExemploSwitchCaseDefault {

	public static void main(String[] args) {
		// criar a variavel de avaliacão com seu respectivo valor
		String pais = "Argentina";

		//estrutura do bloco switch
		switch(pais) {
		//estabelecendo os cases
		case "brasil" :
		case "portugal" :
			System.out.println("Bom dia!");
			break;
			
		case "franca" :
			System.out.println("Bon jour!");
			
		case "mexico" :
		case "chile" :
		case "argentina" :
			System.out.println("Buenos dias!");
			break;
			default:
				System.out.println("Goog Morning");
			
		}
	
	}
}
		


