package simpleinterest;

public class SimpleInterest {

	public static void main(String[] args) {
		FinanceCalculator fc = new FinanceCalculator();
		double si = fc.calculateSimpleInterest(1000.0, 0.05, 2.0);
		System.out.println(si);
	}

}
