package exe2;

import java.util.Scanner;

public class Overflow2 {
	public static void main(String[] args) {
		int[] tests = new int[10];
		int test;
		int count = 0;
		boolean sai = false;
		Scanner scan = new Scanner(System.in);

		while(sai){
			System.out.print("Ending point: ");
			try {
				count = scan.nextInt();
				if(count > 0 && count <= 10){
					sai = true;
				}
				else System.out.println("valor ruim, digite outro");
			} catch (Exception e) {
				System.out.println("nao era inteiro");
			}
		}
		
		
		for (int i = 0; i < count; i++) {
			sai = false;
			while(sai){
				System.out.print("Please type a number: ");
				try {
					test = scan.nextInt();
					tests[i] = test;
					sai = true;
				} catch (Exception e) {
					System.out.println("nao era inteiro");
				}
			}	
		}
	}
}