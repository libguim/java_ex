package ch02_problem;

import java.util.Arrays;
import java.util.Scanner;

public class pr04_ttttt {

	 public static void main(String[] args) {
	        Scanner a = new Scanner(System.in);
	        
	        System.out.print("정수 3개 입력 >>");
	        
	        // 1. 배열에 입력값 저장
	        int[] nums = new int[3];
	        nums[0] = a.nextInt();
	        nums[1] = a.nextInt();
	        nums[2] = a.nextInt();
	        
	        // 2. 배열을 오름차순으로 정렬
	        Arrays.sort(nums); // 예: {7, 3, 5} -> {3, 5, 7}
	        
	        // 3. 중간값(인덱스 1) 출력
	        int mid = nums[1]; 
	        
	        System.out.println("중간 값은 "+ mid +"입니다.");
	        
	        a.close();
	    }

}
