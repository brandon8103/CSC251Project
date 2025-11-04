// No-argument constructor
public Policy() {
policyNumber = "";
providerName = "";
firstName = "";
lastName = "";
age = 0;
smokingStatus = "non-smoker";
heightInInches = 0.0;
weightInPounds = 0.0;
}


// Constructor with arguments
public Policy(String policyNumber, String providerName, String firstName, String lastName,
int age, String smokingStatus, double heightInInches, double weightInPounds) {
this.policyNumber = policyNumber;
this.providerName = providerName;
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
this.smokingStatus = smokingStatus;
this.heightInInches = heightInInches;
this.weightInPounds = weightInPounds;
}


// Getters
public String getPolicyNumber() { return policyNumber; }
public String getProviderName() { return providerName; }
public String getFirstName() { return firstName; }
public String getLastName() { return lastName; }
public int getAge() { return age; }
public String getSmokingStatus() { return smokingStatus; }
public double getHeightInInches() { return heightInInches; }
public double getWeightInPounds() { return weightInPounds; }


// Setters
public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
public void setProviderName(String providerName) { this.providerName = providerName; }
public void setFirstName(String firstName) { this.firstName = firstName; }
public void setLastName(String lastName) { this.lastName = lastName; }
public void setAge(int age) { this.age = age; }
public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }
public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }


// Calculate BMI
public double calculateBMI() {
if (heightInInches <= 0) return 0.0;
return (weightInPounds * 703) / (heightInInches * heightInInches);
}


// Calculate policy price
public double calculatePolicyPrice() {
double price = 600.0;


if (age > 50) {
price += 75.0;
}
if (smokingStatus.equalsIgnoreCase("smoker")) {
price += 100.0;
}


double bmi = calculateBMI();
if (bmi > 35.0) {
price += (bmi - 35.0) * 20.0;
}


return price;
}