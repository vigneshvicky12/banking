package banking;

import java.util.*;

public class lnamount {

	// public lnamount la = new lnamount();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		int amount = sc.nextInt();
		//climit b = new climit();
		System.out.println("Enter you credit limit: ");
		int creditlimit = sc.nextInt();

		climit cl = new climit();
		if (true == cl.check(amount, creditlimit)) {
			System.out.println("you are eligible");
			roi ROI = new roi();
			ROI.check2(amount);
		}

		else if (false == cl.check(amount, creditlimit)) {
			// System.out.println("you are a not eligible");

			System.out.println("Enter the salary amount: ");
			int sal = sc.nextInt();

			salary s1 = new salary();

			if (true == s1.check1(amount, sal)) {
				System.out.println("you are eligible");
				roi ROI = new roi();
				ROI.check2(amount);

			} else if (false == cl.check(amount, creditlimit))
				System.out.println("you are a not eligible");
			// salary sala = new salary();

			// cl.check(int amount, int creditlimit);

		}
	}

}