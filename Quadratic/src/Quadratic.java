
/**
 * @author gibbonss
 * @version 1.2 @
 */
public class Quadratic {

	private double a;
	private double b;
	private double c;

	/**
	 * @param a
	 *            the first coefficient of the Quadratic equation
	 * @param b
	 *            the second coefficient of the Quadratic equation
	 * @param c
	 *            the third coefficient of the Quadratic equation
	 */
	Quadratic(double a, double b, double c) {
		if (a == 0)
			throw new IllegalArgumentException("a = 0");
		this.a = a;
		this.b = b;
		this.c = c;

	}

	/**
	 * @return the roots of the quadratic equation using discriminant
	 */
	public double[] findRoots() {
		if (discriminant() < 0.0)
			return null;
		double[] roots = { (-1 * b + Math.sqrt(discriminant())) / (2 * a),
				(-1 * b - Math.sqrt(discriminant())) / (2 * a) };
		return roots;

	}

	/**
	 * @return the discriminant of the quadratic equation
	 */
	private double discriminant() {
		return Math.pow(this.b, 2) - (4 * this.a * this.c);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String result = "";

		if (Math.signum(a) == -1)
			result = "-";
		result = result + a + "x^2";

		if (Math.signum(b) == 1)
			result = result + " + ";
		result = result + b + "x ";

		if (Math.signum(c) == 1)
			result = result + "+ ";
		result = result + c;

		return result;
	}
}
