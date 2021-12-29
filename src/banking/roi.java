package banking;

public class roi {

	public void check2(int amount) {
		if ((amount >= 100000) && (amount <= 500000))
			// return true;
			System.out.println("your roi is 10%");
		else if ((amount <= 1000000) && (amount >= 500001))
			// return true;
			System.out.println("your roi is 9%");
		else if ((amount >= 1000001))
			// return true;
			System.out.println("your roi is 8%");
		/*
		 * else //return false; System.out.println("you are a not eligible");
		 */

	}

}
