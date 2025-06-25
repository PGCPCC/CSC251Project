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
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;
                
                int policyNumber = Integer.parseInt(line);
                String providerName = fileScanner.nextLine().trim();
                String firstName = fileScanner.nextLine().trim();
                String lastName = fileScanner.nextLine().trim();
                int age = Integer.parseInt(fileScanner.nextLine().trim());
                String smokingStatus = fileScanner.nextLine().trim();
                float height = Float.parseFloat(fileScanner.nextLine().trim());
                float weight = Float.parseFloat(fileScanner.nextLine().trim());

                PolicyHolder policyholder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, policyholder);
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
            System.out.println(policy.toString());
            System.out.println();
        }

        System.out.println("Policy Count: " + Policy.getPolicyCount());
        System.out.println("Number of policies with a smoker: " + smokerCount);
        System.out.println("Number of policies with a non-smoker: " + nonSmokerCount);
    }
}
