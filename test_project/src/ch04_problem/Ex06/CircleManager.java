package ch04_problem.Ex06;

import java.util.Scanner;

public class CircleManager {
	
	void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		Circle c[] = new Circle[3];
				
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0; i<c.length; i++)
			c[i].show();
		
		int max_idx = 0;
		for(int i=0; i<c.length; i++) {
			if(c[max_idx].getArea() < c[i].getArea()) {
				max_idx = 1;
			}
		}
		
		System.out.println("가장 면적인 큰 원은?");
		c[max_idx].show();
		scanner.close();
	}
	
}
