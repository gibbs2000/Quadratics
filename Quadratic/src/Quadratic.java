
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
		};
		return roots;
			
}

	private  double discriminant() {
		return Math.pow(this.b, 2) - (4 * this.a * this.c);
	}
	
	
	//Creates a String of the equation, ensuring the appropriate signage is used
	public String toString() {
	String result = "";
	
	if(Math.signum(a)==-1)
		result = "-";
	result = result + a + "x^2"; 
	
	if(Math.signum(b)==1)
		result = result + " + ";
	result = result + b  + "x ";
	
	if(Math.signum(c)==1)
		result = result + "+ ";
	result = result + c;
	
	return result;
	}
}
