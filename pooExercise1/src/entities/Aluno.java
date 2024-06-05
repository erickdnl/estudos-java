package entities;

public class Aluno {

	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public String finalGrade() {
		double add = note1 + note2 + note3;
		if (add < 60.0) {
			double missing = 60.0 - add;
			System.out.println("FINAL GRADE = " + add + "\nFAILED");
			System.out.println("MISSING " + missing + " POINTS");
			return "FILED";
		}
		else {
			System.out.println("FINAL GRADE = " + add + "\nPASS");
			return "PASS";
		}
	}
	
}
