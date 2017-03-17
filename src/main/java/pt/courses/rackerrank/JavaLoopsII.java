package pt.courses.rackerrank;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
	int a;
	int b;
	int n;
	StringBuilder sb = new StringBuilder();
	Scanner in = new Scanner(System.in);
	int q = in.nextInt();
	for (int i = 0; i < q; i++) {
	    a = in.nextInt();
	    b = in.nextInt();
	    n = in.nextInt();
	    sb.setLength(0);
	    for (int s = 0; s < n; s++) {
		sb.append(calc(a, b, s));
		if (s + 1 < n) {
		    sb.append(" ");
		}
	    }
	    System.out.println(sb.toString());
	}
	in.close();
    }

    public static int calc(int a, int b, int s) {
	int result = (int) (a + Math.pow(2, 0) * b);
	for (int i = 1; i <= s; i++) {
	    result += ((int) Math.pow(2, i) * b);
	}
	return result;
    }
}
