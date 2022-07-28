
public class IntrucoesRotulades {

	public static void main(String[] args) {
		// primeira instrucao rotulada
		instrucao1:
			for(int i = 1; i < 4; i++) {
				// segunda ionstrucao rotulada
				instrucao2:
					for(int j = 1; j < 4; j++) {
						// instrucao de decisao
						if(j == 2) {
							System.out.println("saindo da instrucao 1");
						break;
						}
						System.out.println("texto instrucao2");
					}
				System.out.println("texto instrucao1");
			}

	}

}
