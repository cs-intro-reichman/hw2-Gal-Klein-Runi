// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int times = Integer.parseInt(args[0]);
		double calcPI = 1;
		int sign = -1;
		int currentNum = 3;
		for (int i = 0; i < times; i++) {
			calcPI = calcPI + (sign * (1.0 / currentNum));
			currentNum = currentNum+2;
			sign *= -1;
		}

		calcPI *= 4;

		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated:     " + calcPI);
	}
}
