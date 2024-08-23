package decimo;

public class TercerEjercicio {
	
	    public static void main(String[] args) {
	        
	        int[] numbers = {10, 20, 30, 40, 50};	        
	        
	        int sum = calculateSum(numbers);
	        
	        System.out.println("La suma de los elementos del arreglo es: " + sum);
	    }
	    	   
	    public static int calculateSum(int[] arr) {
	        int sum = 0;	       
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	   }
	

}


