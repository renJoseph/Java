package Main;

public class Results {
	int physicsResult;
	int chemistryResult;
	int biologyResult;
	int total;
	double percentage;

	public double Total(double physicsResult, double chemistryResult, double biologyResult) {
		System.out.println("Your Total score is ");
		return (physicsResult + chemistryResult + biologyResult);
	}

	public double Percentage(double physicsResult, double chemistryResult, double biologyResult) {
		System.out.println("Your average percentage is");
		return ((physicsResult + chemistryResult + biologyResult) * 100) / 450;
	}

	public String Result(double physicsResult, double chemistryResult, double biologyResult) {
		if (((physicsResult + chemistryResult + biologyResult) >= (450 * 0.6)) && (physicsResult >= 90)
				&& (chemistryResult >= 90) && biologyResult >= 90) {
			return ("Congratulations, you have passed with flying colours!");
		} else if (physicsResult >= 90 && chemistryResult < 90 && biologyResult < 90) {
			return ("You passed physics, but failed chemistry and biology, so failed overall");
		} else if (physicsResult < 90 && chemistryResult >= 90 && biologyResult < 90) {
			return ("You passed chemistry, but failed physics and biology, so failed overall");
		} else if (physicsResult < 90 && chemistryResult < 90 && biologyResult >= 90) {
			return ("You passed biology, but failed physics and chemistry, so failed overall");
		} else if (physicsResult < 90) {
			return ("You passed biology and chemistry, but failed physics, so failed overall");
		} else if (chemistryResult < 90) {
			return ("You passed physics and biology, but failed chemistry, so failed overall");
		} else
			return ("You passed physics and chemistry, but failed biology, so failed overall");
	}
}