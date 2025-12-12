package ch04_problem.Ex09;

public class Ex09 {

	//실행하는 곳
	public static void main(String[] args) {
		
		//배열
		int [] array1 = {1,5,7,9};
		int [] array2 = {3,6,-1,100,77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
		
	}

}
