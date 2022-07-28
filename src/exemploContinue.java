
public class exemploContinue {

	public static void main(String[] args) {
		// declarando a variavel com valor inicial = 0
		int num = 0;
		//estabelecendo o loop while
		while(num < 10) {
			++num;
			//estrutura de decisao para o uso do continue
			if(num == 5 || num == 6) {
				continue;
			}
		System.out.println("valor de num = " + num);
		}

	}

}
