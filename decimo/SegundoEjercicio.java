package decimo;

public class SegundoEjercicio {

	public static void main(String[] args) {
		

		
        int[] numbers = {1, 3, 7, 8, 3, 2, 3, 5};
        int numberToFind = 3;
      
        int count = countOccurrences(numbers, numberToFind);
        
       
        System.out.println("El número " + numberToFind + " aparece " + count + " veces en el arreglo.");
    }
    
   
    public static int countOccurrences(int[] arr, int numToFind) {
        int count = 0;
       
        for (int num : arr) {
            if (num == numToFind) {
                count++;
            }
        }
        return count;
    }
}