/**
 * The Policy class stores information about an insurance policy
 * and can calculate BMI and policy price for a policyholder.
 */
public class Policy
{
    // Fields
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;     // "smoker" or "non-smoker"
    private double heightInInches;    // in inches
    private double weightInPounds;    // in pounds

    /**
     * No-argument constructor that initializes the fields
     * to default values.
     */
    public Policy()
    {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        heightInInches = 0.0;
        weightInPounds = 0.0;
    }

    /**
     * Constructor that accepts values for all fields.
     *
     * @param policyNumber   the policy number
     * @param providerName   the name of the insurance provider
     * @param firstName      the policyholder's first name
     * @param lastName       the policyholder's last name
     * @param age            the policyholder's age
     * @param smokingStatus  the policyholder's smoking status
     *                       ("smoker" or "non-smoker")
     * @param heightInInches the policyholder's height in inches
     * @param weightInPounds the policyholder's weight in pounds
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double heightInInches, double weightInPounds)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    /**
     * Gets the policy number.
     *
     * @return the policy number
     */
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    /**
     * Gets the provider name.
     *
     * @return the provider name
     */
    public String getProviderName()
    {
        return providerName;
    }

    /**
     * Gets the policyholder's first name.
     *
     * @return the first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Gets the policyholder's last name.
     *
     * @return the last name
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Gets the policyholder's age.
     *
     * @return the age
     */
    public int getAge()
    {
        return age;
    }

    /**
     * Gets the policyholder's smoking status.
     *
     * @return the smoking status ("smoker" or "non-smoker")
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * Gets the policyholder's height in inches.
     *
     * @return the height in inches
     */
    public double getHeightInInches()
    {
        return heightInInches;
    }

    /**
     * Gets the policyholder's weight in pounds.
     *
     * @return the weight in pounds
     */
    public double getWeightInPounds()
    {
        return weightInPounds;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber the policy number
     */
    public void setPolicyNumber(String policyNumber)
    {
        this.policyNumber = policyNumber;
    }

    /**
     * Sets the provider name.
     *
     * @param providerName the provider name
     */
    public void setProviderName(String providerName)
    {
        this.providerName = providerName;
    }

    /**
     * Sets the policyholder's first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Sets the policyholder's last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Sets the policyholder's age.
     *
     * @param age the age
     */
    public void setAge(int age)
    {
        this.age = age;
    }

    /**
     * Sets the policyholder's smoking status.
     *
     * @param smokingStatus the smoking status ("smoker" or "non-smoker")
     */
    public void setSmokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Sets the policyholder's height in inches.
     *
     * @param heightInInches the height in inches
     */
    public void setHeightInInches(double heightInInches)
    {
        this.heightInInches = heightInInches;
    }

    /**
     * Sets the policyholder's weight in pounds.
     *
     * @param weightInPounds the weight in pounds
     */
    public void setWeightInPounds(double weightInPounds)
    {
        this.weightInPounds = weightInPounds;
    }

    /**
     * Calculates the policyholder's Body Mass Index (BMI).
     * Formula: BMI = (weight * 703) / (height^2)
     *
     * @return the BMI value, or 0.0 if height is not valid
     */
    public double calculateBMI()
    {
        if (heightInInches <= 0)
        {
            return 0.0;
        }
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    /**
     * Calculates the price of the policy based on age, smoking
     * status, and BMI.
     * Base fee: 600
     * + 75 if age > 50
     * + 100 if smoker
     * + (BMI - 35) * 20 if BMI > 35
     *
     * @return the calculated policy price
     */
    public double calculatePolicyPrice()
    {
        double price = 600.0;

        if (age > 50)
        {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker"))
        {
            price += 100.0;
        }

        double bmi = calculateBMI();

        if (bmi > 35.0)
        {
            price += (bmi - 35.0) * 20.0;
        }

        return price;
    }
}
