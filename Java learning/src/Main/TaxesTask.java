package Main;

public class TaxesTask {
	public double PercentageTaxed(int a) {
		if (a < 15000)
			return 0.0;
		else if (a >= 15000 && a < 20000)
			return 0.10;
		else if (a >= 20000 && a < 30000)
			return 0.15;
		else if (a >= 30000 && a < 44999)
			return 0.20;
		else
			return 0.25;
	}
	public double AmountTaxed(int a) {
		if (a < 15000)
			return 0.0;
		else if (a >= 15000 && a < 20000)
			return (a * 0.10);
		else if (a >= 20000 && a < 30000)
			return (a * 0.15);
		else if (a >= 30000 && a < 44999)
			return (a * 0.20);
		else
			return (a * 0.25);
	}
	public double ATSecond(int a) {
		return (PercentageTaxed(a) * a);
	}

}
