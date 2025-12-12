
public class Ex04_TypeConversion {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i);
		System.out.println(10/4); //정수로 표현됨 
		System.out.println(10.0/4); // 실수/정수 
		System.out.println((char)0x12340041);
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 +  1.8);
		System.out.println((int)(2.9 +  1.8));
		System.out.println((int)2.9 + (int)1.8);
		
		
		int a = 3;
		
		System.out.println(a++); //3
		System.out.println(++a); //5
		
		
		int z = 1;
		z++; //1
		System.out.println("z = " + z); //2
		++z; //3
		System.out.println("z = " + z); //3
		
	}

}
