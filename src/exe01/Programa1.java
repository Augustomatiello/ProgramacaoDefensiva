package exe01;

import java.util.Scanner;

public class Programa1 {

	static final int INPUT_SIZE = 10;

	public static void main(String[] args) {
		char[] vals = new char[INPUT_SIZE];

		Scanner scan = new Scanner(System.in);
		String s1 = getString(scan);

		copyVals(s1, vals);

		String sub = getSubstring(scan, vals);
		System.out.println("sub string: " + sub);
	}

	public static String getString(Scanner scan) {
		System.out.print("Please type a string: ");
		String s = scan.nextLine();
		while(s.length()>10){
			System.out.println("string muito grande, digite de novo");
			s = scan.nextLine();
		}
		return s;
	}

	public static void copyVals(String s, char[] vals) {
		for (int i = 0; i < s.length(); i++) {
			vals[i] = s.charAt(i);
		}
	}

	public static String getSubstring(Scanner scan, char[] vals) {
		boolean sai = false;
		int start = 0;
		while(sai){
			System.out.print("Starting point: ");
			try {
				start = scan.nextInt();
				if(start >= 0 && start <= 10){
					sai = true;
				}
				else System.out.println("valor ruim, digite outro");
			} catch (Exception e) {
				System.out.println("nao era inteiro");
			}
		}
		sai = false;
		int end = 0;
		
		while(sai){
			System.out.print("Ending point: ");
			try {
				end = scan.nextInt();
				if(end > start && end <= 10){
					sai = true;
				}
				else System.out.println("valor ruim, digite outro");
			} catch (Exception e) {
				System.out.println("nao era inteiro");
			}
		}
		
		char[] newChars = getChars(start, end, vals);
		return new String(newChars);
	}

	public static char[] getChars(int start, int end, char[] vals) {

		int sz = end - start;
		char[] result = new char[sz];
		for (int i = 0; i < sz; i++) {
			result[i] = vals[start + i];
		}
		return result;
	}

}
