// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String mode = args[1];
		int N = Integer.parseInt(args[0]);
		String summeryLine = "Every one of the first "+N+" hailstone sequences reached 1.";
		if (mode.equals("v")) {
		for (int i=1; i<N+1; i++) {
			int counter = 1;
			int num = i;
			String printLine = ""+num;
			if (num%2==0) {
				num = num/2;
				printLine = printLine+" "+num;
			} else {
				num = num*3 +1;
				printLine = printLine+" "+num;
			}
			counter ++;
			while (num!=1) {
				if (num%2==0) {
					num = num/2;
					printLine = printLine+" "+num;
				} else {
					num = num*3 +1;
					printLine = printLine+" "+num;
				}
				counter ++;
			}
			printLine = printLine+" "+"("+counter+")";
			System.out.println(printLine);
			}}
			System.out.println(summeryLine);
		}
	}

