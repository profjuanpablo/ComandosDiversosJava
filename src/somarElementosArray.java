
public class somarElementosArray {

	public static void main(String[] args) {
		int[] array = { 1,1,1,1,1,1,1,1,1,1};
		int total= 0;
		for(int i=0;i<array.length;i++) {
			//total = total + array[i];
			total +=array[i];
		}
		
		System.out.println("A soma dos elementos foi: "+ total);

	}

}
