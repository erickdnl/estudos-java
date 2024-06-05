import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measure of triangle x:");
		double xa = sc.nextDouble();
		double xb = sc.nextDouble();
		double xc = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle y:");
		double ya = sc.nextDouble();
		double yb = sc.nextDouble();
		double yc = sc.nextDouble();
		
		double px = (xa + xb + xc)/2;
		double py = (ya + yb + yc)/2;
		
		double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
		double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));
		
		System.out.println("Triangle X area: " + areax);
		System.out.println("Triangle y area: " + areay);
		
		if(areax > areay) {
			System.out.println("Larger area: x");
		}
		else {
			System.out.println("Larger area: y");
		}
		
		sc.close();
	}

}
