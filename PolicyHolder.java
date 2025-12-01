public class PolicyHolder
{
    // Fields that belong to the person
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Default constructor
    public PolicyHolder()
    {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0.0;
        weight = 0.0;
    }

    // Regular constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus,
                        double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    // BMI calculation
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }
}

public String toString()
{
    return "Policyholder's First Name: " + firstName +
           "\nPolicyholder's Last Name: " + lastName +
           "\nPolicyholder's Age: " + age +
           "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
           "\nPolicyholder's Height: " + height + " inches" +
           "\nPolicyholder's Weight: " + weight + " pounds" +
           "\nPolicyholder's BMI: " + String.format("%.2f", getBMI());
}

public PolicyHolder(PolicyHolder other)
{
    this.firstName = other.firstName;
    this.lastName = other.lastName;
    this.age = other.age;
    this.smokingStatus = other.smokingStatus;
    this.height = other.height;
    this.weight = other.weight;