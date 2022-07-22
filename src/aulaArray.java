
public class aulaArray {

	public static void main(String[] args) {
		//registrar 4 alunos e 3 notas calcular a média final e situação (aprovado reprovado)
		
		int[] array = new int[5];  //inicializa o array do tipo int com 10 posições
		
		array[0] = 12;
		array[1] = 8;
		array[2] = 4;
		array[3] = 7;
		array[4] = 10;
		
		System.out.printf("%s%8s%n", "Indice", "Valor");
		
		for (int i=0; i < array.length; i++) {
			System.out.printf("%5d%8d%n",i, array[i]);
			//System.out.println(i+"\t"+array[i]);
			
		}
		
		}
		
		



}
