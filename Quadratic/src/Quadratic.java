
public class Quadratic {

	private double a;
	private double b;
	private double c;

	Quadratic(double a, double b, double c) {
		if (a == 0)
			throw new IllegalArgumentException("a = 0");
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public  double[] findRoots() {
		if(discriminant()<0.0)
			return null;
		double[] roots = {
				(-1*b+Math.sqrt(discriminant()))/(2*a),
				(-1*b-Math.sqrt(discriminant()))/(2*a)
		}
		return roots;
			
}

	public static double discriminant() {
		return b * b - 4 * a * c;
	}
}
