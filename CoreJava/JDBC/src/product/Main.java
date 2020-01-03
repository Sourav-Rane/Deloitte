package product;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		boolean f = true;
		while (f) {
			System.out.println("\n\n");
			System.out.println("1.CREATE");
			System.out.println("2.INSERT");
			System.out.println("3.DISPLAY");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("6.EXIT");
			System.out.println("\n\n");

			System.out.println("choose");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				new CreateTable().create();
				break;

			case 2:
				new InsertProduct().insert();
				break;

			case 3:
				new DisplayProduct().display();
				break;

			case 4:
				new DeleteProd().delete();
				break;

			case 5:
				new UpdateProduct().update();
				break;

			case 6:
				f = false;
				System.out.println("Bye...!");
				break;

			default:
				System.out.println("Invalid option");
			}
		}
	}
}
