import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Pravakshya_Gupta {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"));

            while (fileScanner.hasNextLine()) {
                int policyNumber = Integer.parseInt(fileScanner.nextLine().trim());
                String providerName = fileScanner.nextLine().trim();
                String firstName = fileScanner.nextLine().trim();
                String lastName = fileScanner.nextLine().trim();
                int age = Integer.parseInt(fileScanner.nextLine().trim());
                String smokingStatus = fileScanner.nextLine().trim();
                float height = Float.parseFloat(fileScanner.nextLine().trim());
                float weight = Float.parseFloat(fileScanner.nextLine().trim());

                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            return;
        }

        for (Policy policy : policies) {
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

        System.out.println("\nNumber of policies with a smoker: " + smokerCount);
        System.out.println("Number of policies with a non-smoker: " + nonSmokerCount);
    }
}
