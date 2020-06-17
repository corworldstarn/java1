
public class AccountingApp {

	public static void main(String[] args) {
		
		double valueOfSupply = 12345.0;
		System.out.println("Value of supply: "+valueOfSupply);
		double vatRate = 0.1;
		System.out.println("VAT: "+ (valueOfSupply*vatRate));
		System.out.println("Total: "+(valueOfSupply + valueOfSupply*vatRate));
		double expenseRate = 0.3;
		double[] dividendRate = {0.5, 0.3, 0.2};
		System.out.println("Expense: "+(valueOfSupply - valueOfSupply*expenseRate));
		System.out.println("Dividend 1: "+ (valueOfSupply - valueOfSupply*expenseRate)*dividendRate[0]);
		System.out.println("Dividend 2: "+ (valueOfSupply - valueOfSupply*expenseRate)*dividendRate[1]);
		System.out.println("Dividend 3: "+ (valueOfSupply - valueOfSupply*expenseRate)*dividendRate[2]);
	}

}
