package testCombinatoria;
import java.util.List;

import com.ipserc.combinatoric.CombinationNoReps;

public class testCombinatoria {
	
	public static void main(String[] args) {
		int grade = 17;
		int order = 11;
		long itemNbr;
		CombinationNoReps combinat = new CombinationNoReps();
		
		/*********************************/
		/* Test All Combinations Methods */
		/*********************************/
		List<long[][]> allComblist;
		allComblist = combinat.getAll(grade);
		combinat.printlAll(allComblist);
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

		/***************************/
		/* Test Collection Methods */
		/***************************/
		long[][] collection;
		collection = combinat.getCollection(grade, order);
		System.out.println("Grade:" + grade + " - Order:" + order);
		combinat.printlnCollection(collection);
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

		/*********************/
		/* Test Item Methods */
		/*********************/
		long[] item;
		itemNbr = 1023;
		item = combinat.getItem(grade, order, itemNbr);
		System.out.println("Grade:" + grade + " - Order:" + order + " - ItemNbr:" + itemNbr); 
		combinat.printlnItem(item);
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		itemNbr = 2546;
		item = combinat.getItem(grade, order, itemNbr);
		System.out.println("Grade:" + grade + " - Order:" + order + " - ItemNbr:" + itemNbr); 
		combinat.printlnItem(item);
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		
	}
}

