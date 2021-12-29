package banking;

public class salary {

	public boolean check1(int amount, int sal) {
		if ((amount >= 100000) && (amount <= 500000) && (sal > 25000))
			return true;
		// System.out.println("you are a eligible");

		else if ((amount >= 500000) && (amount <= 1000000) && (sal > 50000))
			return true;
		// System.out.println("you are a eligible");
		else if ((amount >= 1000000) && (sal >= 100000))
			return true;
		// System.out.println("you are a eligible");
		else
			return false;
		// System.out.println("you are a not eligible");

	}
}