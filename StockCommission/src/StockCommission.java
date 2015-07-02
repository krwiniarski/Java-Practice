//This program calculates the value of stock and commission for Kathryn

public class StockCommission {

	public static void main(String[] args) {
		
		//Number of stocks purchased
		int numOfStock = 600;
		//The cost per stock
		double costPerStock = 21.77;
		//Commission percentage fee
		double commissionPercentage = 0.02;
		//Cost of stuck multiplied by how many stocks purchased
		double totalCostOfStock;
		//Amount of commission made 
		double commissionCost;
		//Cost of cost of stocks plus commission fee
		double totalAmountPaid;
		
		//Total cost of stocks
		totalCostOfStock = numOfStock * costPerStock;
		//Calculates total commission cost
		commissionCost = totalCostOfStock * commissionPercentage;
		//Total amount paid for stocks plus commission
		totalAmountPaid = totalCostOfStock + commissionCost;
		
		//Formats and prints cost of stocks
		System.out.printf("For stock alone, Kathryn paid" +
					" $%.2f\n", totalCostOfStock);
		//Formats and prints total commission fee
		System.out.printf("The amount of commission made for this" +
								" transaction was $%.2f\n", commissionCost);
		//Formats and prints the total amount paid
		System.out.printf("Kathryn paid a total of $%.2f\n", totalAmountPaid);
		

	}

}
