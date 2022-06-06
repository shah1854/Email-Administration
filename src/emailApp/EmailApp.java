package emailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        String firstName, lastName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        lastName = input.nextLine();


        Email email = new Email(firstName, lastName);//tester

        System.out.println("Name: " + email.getFirstName() + " " + email.getLastName());
        System.out.println("Email Address: " + email.createEmail());

    }
}
