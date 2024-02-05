package aulaEbac01;

public class ExercicioCalculoNota {

	public static void main(String args[]) {
		
		double[] nota ={95.60, 17, 64.59, 40};

		double total = 0;
		double media = 0;
		
		for(int i=0; i<4; i++) {
			total = total + nota[i];
		}
		
		media = total / 4;
		System.out.println(" Media igual a: " + media);
	
	}
	
}
