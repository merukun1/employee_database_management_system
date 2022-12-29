package employeeDatabaseManagement;

import java.util.Scanner;

public class Main {

    public static void employeeDatabaseManagement(Scanner scan){
        Database database = new Database();
        int choice = -1;
        int con = 0;
        do {
            System.out.println("--------------------------------------------");
            System.out.println("    Employee and payroll Management");
            System.out.println("--------------------------------------------");
            System.out.println("1. Add Employee");
            System.out.println("2. View all Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Update Employee");
            System.out.println("6. Payroll");
            System.out.print("Select 1 to 6 : ");
            choice = scan.nextInt();
            System.out.println("--------------------------------------------");
            switch (choice) {
                case 1:
                    database.addEmployee();
                    break;
                case 2:
                    database.printAllEmployees();
                    break;
                case 3:
                    database.searhEmployee();
                    break;
                case 4:
                    database.removeEmployee();
                    break;
                case 5:
                    database.updateEmployee();
                    break;
                case 6:
                    database.payroll();
                    break;
                default:
                    System.out.println("Incorecct input!!");
                    break;
            }
            try {
                System.out.println("--------------------------------------------");
            System.out.print("Press 1 to continue, 2 to exit: ");
            con = scan.nextInt();
            if (con == 2){
                System.out.println("--------------------------------------------");
                System.out.println("Thank you for using the program :)");
                System.exit(0);
            } else {
                System.out.println("\u000C");
            }
            } catch (Exception e) {
                System.out.println("Invalid input!!");
                
            }
        } while (con == 1);
        scan.close();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int con = 0;
        System.out.print("Enter your username: ");
		String username = scan.next();
		System.out.print("Enter your password: ");
		String password = scan.next();
		if (username.equals("admin")&&password.equals("admin")) {
			System.out.println("--------------------------------------------");
			System.out.println("Welcome, admin. You have successfully logged in.");
            try {
                System.out.println("--------------------------------------------");
            System.out.print("Press 1 to continue, 2 to exit: ");
            con = scan.nextInt();
            if (con == 2){
                System.out.println("--------------------------------------------");
                System.out.println("Thank you for using the program :)");
                System.exit(0);
            } else {
                System.out.println("\u000C");
            }
            } catch (Exception e) {
                System.out.println("Invalid input!!");
            }
			employeeDatabaseManagement(scan);
		} else {
			System.out.println("Invalid username or password!");
			System.out.println("--------------------------------------------");
			main(null);
		}
    }
    
}
