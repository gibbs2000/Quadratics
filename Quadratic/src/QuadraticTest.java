
/**
 * @author gibbonss
 *
 */
public class QuadraticTest {

	/**
	 * Tests the Quadratic class and some of its main methods
	 */
	public static void test() {
		// tests the Quadratic.function method

		// Test1, the roots should be -2.0 and -2.0
		Quadratic q1 = new Quadratic(1, 4, 4);
		double[] q1Roots = q1.findRoots();
		System.out.println("The roots of equation " + q1 + " are: ");
		for (double x : q1Roots)
			System.out.printf("%.2f, ", x);
		System.out.println("\nThe expected result is -2.0, -2.0\n");

		// Test2 the roots should be 0.33 and -6.0
		Quadratic q2 = new Quadratic(3, 17, -6);
		double[] q2Roots = q2.findRoots();
		System.out.println("The roots of equation " + q2 + " are: ");
		for (double x : q2Roots)
			System.out.printf("%.2f, ", x);
		System.out.println("\nThe expected result is 0.33, -6.0\n");

		// Test3 the roots should be 0.71 and -1.5
		Quadratic q3 = new Quadratic(14, 11, -15);
		double[] q3Roots = q3.findRoots();
		System.out.println("The roots of equation " + q3 + " are: ");
		for (double x : q3Roots)
			System.out.printf("%.2f, ", x);
		System.out.println("\nThe expected result is 0.71, -1.5\n");

	}

	public static void main(String[] args) {
		test();

	}
}
