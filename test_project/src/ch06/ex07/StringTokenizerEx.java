package ch06.ex07;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens(); 					// 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);
		
		String dArray[][] = new String[n][2];
		
		int i = 0;
		//저장
		while(st.hasMoreTokens()) { 
			String token = st.nextToken(); 		// 토큰 얻기
			System.out.println(token); 				// 토큰 출력
			
			String parts[] = token.split("=");
			
			if(parts.length == 2) {
				dArray[i][0] = parts[0]; //key
				dArray[i][1] = parts[1]; //value
			}else {
				//문자가 없는 예외상황
				dArray[i][0] = token;
				dArray[i][1] = "ERROR";
			}
			
			i++;
		} //while
		
		//출력
		for(String r[]: dArray) {
			System.out.println(Arrays.toString(r)); //배열을 문자열로 변환해줌
		}

	} //main

}
