import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Demo program for the Policy class.
 * Reads policy information from a text file,
 * stores Policy objects in an ArrayList,
 * displays their information, and shows
 * the number of smokers and non-smokers.
 */
public class Project_Brandon_Brock
{
    /**
     * The main method reads data from PolicyInformation.txt,
     * creates Policy objects, displays their information,
     * and counts smokers and non-smokers.
     *
     * @param args command-line arguments (not used)
     * @throws FileNotFoundException if the file cannot be found
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        // ArrayList that will store all Policy objects
        ArrayList<Policy> policies = new ArrayList<Policy>();

        // Open the PolicyInformation.txt file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        // Read until the end of the file
        while (inputFile.hasNextLine())
        {
            // Read the first line for the policy number.
            // Skip any blank lines between records.
            String line = inputFile.nextLine();

            while (line.trim().equals("") && inputFile.hasNextLine())
            {
                line = inputFile.nextLine();
            }

            // If we reached the end and only had blank lines, stop.
            if (line.trim().equals(""))
            {
                break;
            }

            // Now line contains the policy number
            String policyNumber = line;
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            int age = Integer.parseInt(inputFile.nextLine());
            String smokingStatus = inputFile.nextLine();
            double heightInInches = Double.parseDouble(inputFile.nextLine());
            double weightInPounds = Double.parseDouble(inputFile.nextLine());

            // Create a Policy object and add it to the ArrayList
            Policy p = new Policy(policyNumber, providerName, firstName, lastName,
                                  age, smokingStatus, heightInInches, weightInPounds);

            policies.add(p);
        }

        // Close the file
        inputFile.close();

        // Counters
        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Display the information for each Policy object
        for (Policy p : policies)
        {
            System.out.println("Policy Number: " + p.getPolicyNumber());
            System.out.println();
            System.out.println("Provider Name: " + p.getProviderName());
            System.out.println();
            System.out.println("Policyholder's First Name: " + p.getFirstName());
            System.out.println();
            System.out.println("Policyholder's Last Name: " + p.getLastName());
            System.out.println();
            System.out.println("Policyholder's Age: " + p.getAge());
            System.out.println();
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): "
                               + p.getSmokingStatus());
            System.out.println();
            System.out.println("Policyholder's Height: " + p.getHeightInInches() + " inches");
            System.out.println();
            System.out.println("Policyholder's Weight: " + p.getWeightInPounds() + " pounds");
            System.out.println();
            System.out.printf("Policyholder's BMI: %.2f%n", p.calculateBMI());
            System.out.println();
            System.out.printf("Policy Price: $%.2f%n", p.calculatePolicyPrice());
            System.out.println();
            System.out.println();

            // Count smokers and non-smokers
            if (p.getSmokingStatus().equalsIgnoreCase("smoker"))
            {
                smokerCount++;
            }
            else if (p.getSmokingStatus().equalsIgnoreCase("non-smoker"))
            {
                nonSmokerCount++;
            }
        }

        // Display totals
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println();
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}