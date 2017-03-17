package pt.courses.rackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = 1;
	while (sc.hasNext()) {
	    System.out.println((num++) + " " + sc.nextLine());
	}
    }
}
