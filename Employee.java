package employeeDatabaseManagement;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String department;
    private double salary;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Employee(int id, String firstName, String lastName, String jobTitle, String department, double salary,
            String address, String phoneNumber, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.department = department;
        this.salary = salary;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public String toString(){
        String name = "Name: "+firstName+" "+lastName;
        return "Id: "+id+"\n"+name+"\n"+"Job Title: "+jobTitle+"\n"+"Department: "+department+"\n"+"Salary: "+salary+"\n"+"Address: "+address+"\n"+"Phone number: "+phoneNumber+"\n"+"Email address: "+emailAddress;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
}
