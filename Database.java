package employeeDatabaseManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    private List<Employee> employees;
    static Scanner scan = new Scanner(System.in);
    static boolean found;

    public Database() {
        this.employees = new ArrayList<>();
    }

    public Employee updateEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No added Employee!!");
            System.out.println("--------------------------------------------");
        } else {
            System.out.print("Enter employee id to update: ");
            int id = scan.nextInt();
            System.out.println("--------------------------------------------");
            scan.nextLine();
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    System.out.print("Enter first name: ");
                    String firstName = scan.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scan.nextLine();
                    System.out.print("Enter job title: ");
                    String jobTitle = scan.nextLine();
                    System.out.print("Enter department name: ");
                    String department = scan.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("Enter address: ");
                    String address = scan.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scan.nextLine();
                    System.out.print("Enter email address: ");
                    String emailAddress = scan.nextLine();
                    Employee updatedEmployee = new Employee(id, firstName, lastName, jobTitle, department, salary,
                            address,
                            phoneNumber, emailAddress);
                    employee.setFirstname(updatedEmployee.getFirstName());
                    employee.setLastName(updatedEmployee.getLastName());
                    employee.setJobTitle(updatedEmployee.getJobTitle());
                    employee.setDepartment(updatedEmployee.getDepartment());
                    employee.setSalary(updatedEmployee.getSalary());
                    employee.setAddress(updatedEmployee.getAddress());
                    employee.setPhoneNumber(updatedEmployee.getPhoneNumber());
                    employee.setEmailAddress(updatedEmployee.getEmailAddress());
                    System.out.println("Successfully updated employee!");
                } else if (employee.getId() != id) {
                    System.out.println("Not found!!");
                    break;
                }
            }
        }
        return null;
    }

    public Employee addEmployee() {
            System.out.print("how many Employee you want to add: ");
        int add = scan.nextInt();
        System.out.println("--------------------------------------------");
        for (int i = 0; i < add; i++) {
            System.out.println("Enter Employee " + (i + 1) + " information:");
            System.out.print("Enter id: ");
            int id = scan.nextInt();
            System.out.print("Enter first name: ");
            String firstName = scan.next();
            System.out.print("Enter last name: ");
            String lastName = scan.next();
            System.out.print("Enter job title: ");
            String jobTitle = scan.next();
            System.out.print("Enter department name: ");
            String department = scan.next();
            System.out.print("Enter salary: ");
            double salary = scan.nextDouble();
            System.out.print("Enter address: ");
            String address = scan.next();
            System.out.print("Enter phone Number: ");
            String phoneNumber = scan.next();
            System.out.print("Enter email address: ");
            String emailAddress = scan.next();
            System.out.println("--------------------------------------------");
            found = true;
            Employee employee = new Employee(id, firstName, lastName, jobTitle, department, salary, address,
                    phoneNumber,
                    emailAddress);
            employees.add(employee);
        }
        if (found) {
            System.out.println("Successfully added employee");
        }
        return null;
    }

    public Database printAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No added Employee!!");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
        }
        return null;
    }

    public Employee removeEmployee() {
        int id = 0;
        if (employees.isEmpty()) {
            System.out.println("No added Employee!!");
            System.out.println("--------------------------------------------");
        } else {
            System.out.print("Enter employee id to remove: ");
            id = scan.nextInt();
            System.out.println("--------------------------------------------");
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    employees.remove(employee);
                    System.out.println("Successfully remove employee!!");
                    System.out.println("--------------------------------------------");
                    break;
                } else if (employee.getId() != id) {
                    System.out.println("Not found!!");
                    break;
                }
            }
        }
        return null;
    }

    public Employee searhEmployee() {
        int id = 0;
        if (employees.isEmpty()) {
            System.out.println("No added Employee!!");
            System.out.println("--------------------------------------------");
        } else {
            System.out.print("Enter employee id to search: ");
            id = scan.nextInt();
            System.out.println("--------------------------------------------");
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    found = true;
                    System.out.println(employee.toString());
                    break;
                } else if (employee.getId() != id) {
                    System.out.println("Not found!!");
                    break;
                }
            }
        }
        return null;
    }
    public Employee payroll(){
        int id = 0;
        if (employees.isEmpty()){
            System.out.println("No added Employee!!");
            System.out.println("--------------------------------------------");
        } else {
            System.out.print("Enter employee id to payroll: ");
            id = scan.nextInt();
            System.out.println("--------------------------------------------");
            for (Employee employee : employees) {
                if (employee.getId() == id){
					double salary = employee.getSalary();
					double Witholdingtax = salary * 0.1;
					double SSS = salary * 0.1;
					double Medicare = salary * 0.05;
					double Pagibig = salary * 0.05;
					double TotalDeductions = Witholdingtax + SSS + Medicare + Pagibig;
					double NetPay = salary - TotalDeductions;
					System.out.println("Employee payroll details:");
					System.out.println("--------------------------------------------");
					System.out.println("IDno: " + employee.getId());
					System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
					System.out.println("Salary: " + salary);
					System.out.println("Witholding Tax: " + Witholdingtax);
					System.out.println("SSS: " + SSS);
					System.out.println("Medicare: " + Medicare);
					System.out.println("Pagibig: " + Pagibig);
					System.out.println("Total Deductions: " + TotalDeductions);
					System.out.println("Net Pay: " + NetPay);
                    break;
                } else if (employee.getId() != id) {
                    System.out.println("Not found!!");
                    break;
                }
            }
        }
        return null;
    }
}
