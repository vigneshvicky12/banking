package banking;

//import java.util.Scanner;

public class climit {

	// climit cl = new climit();
	// salary sala = new salary();
	// Scanner sc = new Scanner(System.in);

	public boolean check(int amount, int creditlimit) {

		if ((amount >= 100000) && (amount <= 500000) && (creditlimit > 25000))
			return true;
		// System.out.println("you are eligible");
		else if ((amount >= 500000) && (amount <= 1000000) && (creditlimit > 50000))
			return true;
		// System.out.println("you are eligible");
		else if ((amount >= 1000000) && (creditlimit >= 100000))
			return true;
		// System.out.println("you are eligible");

		else
			return false;
		// System.out.println("Enter the salary amount: ");
		// int sal = sc.nextInt();

		// salary sala = new salary();
		// sala.check(amount, sal);
		// sal.check1(amount, sal);

	}

}
