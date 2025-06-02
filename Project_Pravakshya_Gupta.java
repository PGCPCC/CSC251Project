import java.util.Scanner;
import java.text.DecimalFormat;

public class Project_Pravakshya_Gupta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Prompt user for policy details
        System.out.print("Please enter the Policy Number: ");
        int policyNumber = input.nextInt();
        input.nextLine(); // clear newline

        System.out.print("Please enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = input.nextInt();
        input.nextLine(); // clear newline

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        float height = input.nextFloat();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        float weight = input.nextFloat();

        // Create the Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Output the details
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.println("Policyholder’s BMI: " + df.format(policy.calculateBMI()));
        System.out.println("Policy Price: $" + df.format(policy.calculatePrice()));
    }
}

