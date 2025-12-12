package ch04_problem.Ex09;

public class ArrayUtil {
	
//	private int[] array1;
//	private int[] array2;
	
	public static int[] concat(int[] array1, int[] array2) {
		
		int array3[] = new int[array1.length + array2.length];
		
		for(int i=0; i<array1.length; i++) {
			array3[i] = array1[i]; 
		}
		for(int i=0; i<array2.length; i++) { 
			array3[array1.length+i] = array2[i];
		}
		return array3;
	}

	//static 멤버변수를 가지거나, 안가지거나
	public static void print(int[] array3) {
		System.out.println("[ ");
		for(int i=0; i<array3.length; i++) { 
			System.out.println(array3[i]+" ");
		}
		System.out.println(" ]");
	}

}
