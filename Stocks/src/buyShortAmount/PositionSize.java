/**
 * 
 */
package buyShortAmount;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Adric
 *
 */
public class PositionSize {
Scanner inputScan = new Scanner(System.in);
	/**
	 * @param args
	 */

	
	
	private double getRisk() {
		/* This method gets the percentage user is willing to risk */
		
		double riskAmount = Double.parseDouble(Frame.riskBox.getText());
		
		return riskAmount;
		/* @return returns the percentage willing to risk
		*/
	}
	private double getCapital(){
		/*This method gets the amount of capital in users account*/

		double capitalAmount = Double.parseDouble(Frame.capitalBox.getText());
		
		return capitalAmount;
		/*@return capitalAmount is the amount of capital in the account that can possibly be risked.
		 * */
	}
	private double getStockPrice(){
		/*This method gets the price of the stock*/

		
		double priceAmount = Double.parseDouble(Frame.stockBox.getText());
		
		return priceAmount;
		/*@return stockAmount is the amount the stock costs.
		 * */
	}
	private double getStopLoss(){
		/*This method gets the price of the stop loss to be placed*/

		
		double stopAmount = Double.parseDouble(Frame.stopBox.getText());
		
		return stopAmount;
		/*@return stopAmount is the stop loss order at which the stocks will sell if reached.
		 * */
	}
	public void getPositionSize(){
		/*This method gets the position size based on the parameters entered. It will output an amount of shares you should buy without losing
		 *  more than the user specifies they are willing to risk.*/
		NumberFormat intFormatter = new DecimalFormat("#0");
		NumberFormat doubFormatter = new DecimalFormat("#0.00");
		double risk = getRisk();
		double capital = getCapital();
		double stockPrice = getStockPrice();
		double stopLoss = getStopLoss();
		double positionSize = (capital*(risk/100))/(stockPrice-stopLoss);
		
		if (positionSize > (capital/stockPrice)){
			Frame.messege.setText("You can buy as many shares as you can afford with that stop price");
		}else
		System.out.println("You should buy at most " + intFormatter.format(positionSize +.5) + " shares for a cost of $" + doubFormatter.format(positionSize*stockPrice + .005)); 
		//Rounds the share, if 1.5 it will show 2, if 1.4 it will show 1
		Frame.messege.setText("You should buy at most " + intFormatter.format(positionSize + .5) + " shares");
		
	}
	
	
}
