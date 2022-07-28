package exemplo1;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// declarar uma variavel com um valor inicial para operar o loop
		int num = 15;
		// construcao de loop do/while
		do {
			//operacao execultada ao menos uma vez
			System.out.println("valor de num é : " + num);
			num++;
		}while(num < 10);
	}

}
