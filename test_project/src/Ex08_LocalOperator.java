
public class Ex08_LocalOperator {

	public static void main(String[] args) {
		System.out.println('a'>'b'); //false
		System.out.println(3>=2); //true
		System.out.println(-1 < 0); //true
		System.out.println(3.45 <= 2); //false
		System.out.println(3 == 2); //false
		System.out.println(3 != 2); //true
		System.out.println(!(3 != 2)); //false
		System.out.println((3>2)&&(2>4)); // t && f => false
		System.out.println((3!=2) || (-1>0)); // t || f = > true
		System.out.println((3!=2) ^ (-1>0)); // t ^ f => true
	}

}
