System.out.print("Please enter the Policy Number: ");
String policyNumber = input.nextLine();
System.out.println();


System.out.print("Please enter the Provider Name: ");
String providerName = input.nextLine();
System.out.println();


System.out.print("Please enter the Policyholder’s First Name: ");
String firstName = input.nextLine();
System.out.println();


System.out.print("Please enter the Policyholder’s Last Name: ");
String lastName = input.nextLine();
System.out.println();


System.out.print("Please enter the Policyholder’s Age: ");
int age = Integer.parseInt(input.nextLine());
System.out.println();


System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
String smokingStatus = input.nextLine();
System.out.println();


System.out.print("Please enter the Policyholder’s Height (in inches): ");
double height = Double.parseDouble(input.nextLine());
System.out.println();


System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
double weight = Double.parseDouble(input.nextLine());
System.out.println();
/
Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);


double bmi = policy.calculateBMI();
double price = policy.calculatePolicyPrice();


System.out.println("Policy Number: " + policy.getPolicyNumber());
System.out.println();
System.out.println("Provider Name: " + policy.getProviderName());
System.out.println();
System.out.println("Policyholder’s First Name: " + policy.getFirstName());
System.out.println();
System.out.println("Policyholder’s Last Name: " + policy.getLastName());
System.out.println();
System.out.println("Policyholder’s Age: " + policy.getAge());
System.out.println();
System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
System.out.println();
System.out.printf("Policyholder’s Height: %.1f inches%n", policy.getHeightInInches());
System.out.println();
System.out.printf("Policyholder’s Weight: %.1f pounds%n", policy.getWeightInPounds());
System.out.println();
System.out.printf("Policyholder’s BMI: %.2f%n", bmi);
System.out.println();
System.out.printf("Policy Price: $%.2f%n", price);


input.close();
}