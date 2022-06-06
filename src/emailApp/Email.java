package emailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName, lastName, department, password, alternateEmail;
    private int mailboxCap;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName +" "+ this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        this.password = createPassword(8);
        System.out.println("Your Password: " + this.password);
    }

    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n" +
                "Enter your department code: ");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();

        if(depChoice == 1){
            return "sales";
        } else if (depChoice == 2) {
            return"development";
        }else if(depChoice == 3){
            return "accounting";
        }else{
            return "";
        }
    }

    private String createPassword(int passwordLength){
        String charList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&";
        String password1 = "";

        for(int i = 0; i<passwordLength; i++) {
            int rand = (int) (Math.random() * passwordLength);
            password1 += charList.substring(rand, rand+1);
        }
        return password1;
    }

    public String createEmail(){
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + "aeycompany.com";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
