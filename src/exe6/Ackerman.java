package exe6;

import java.lang.System;
import java.util.Scanner;


class Ackerman {
	public static void main(String[] args) {
		long ackValue = 1;
		long exp = 0;
		boolean sai = false;
		
		Scanner scan = new Scanner(System.in);

		
		while(sai){
			System.out.print("Type a number: ");
			try {
				exp = scan.nextInt();
				if(exp > 0 && exp <= 3){
					sai = true;
				}
				else System.out.println("valor ruim, digite outro");
			} catch (Exception e) {
				System.out.println("nao era inteiro");
			}
		}


		
		if (exp > 1) {
			ackValue = exp;
			int numLoops = (int) exp;
			for (int i = 1; i < numLoops; i++) {
				exp = ackValue;
				for (int j = 1; j < numLoops; j++) {
					ackValue = ackValue * exp;
					System.out.println("current value is " + ackValue);
				}
			}
			System.out.println("Ackerman vlue: " + ackValue);
		}
	}
}