package ch05.ex03;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person) {
			System.out.print("Person ");
		}
		if(p instanceof Person) {
			System.out.print("Person ");
		}
		if(p instanceof Person) {
			System.out.print("Person ");
		}
		if(p instanceof Person) {
			System.out.print("Person ");
		}
		System.out.println();
	}
}
