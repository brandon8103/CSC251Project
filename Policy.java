public class Policy
{
    private int policyNumber;
    private String providerName;
    private PolicyHolder holder;  // HAS-A relationship

    // Constructor
    public Policy(int policyNumber, String providerName, PolicyHolder holder)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.holder = holder;
    }

    // Getters
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public PolicyHolder getPolicyHolder() { return holder; }

    // PRICE CALCULATION
    public double calculatePolicyPrice()
    {
        final double BASE_PRICE = 600.0;
        final double ADDITIONAL_FEE_AGE = 75.0;
        final double ADDITIONAL_FEE_SMOKER = 100.0;
        final double ADDITIONAL_FEE_BMI = 20.0;

        double price = BASE_PRICE;

        if (holder.getAge() > 50)
            price += ADDITIONAL_FEE_AGE;

        if (holder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += ADDITIONAL_FEE_SMOKER;

        if (holder.getBMI() > 35)
            price += ADDITIONAL_FEE_BMI;

        return price;
    }
}

public String toString()
{
    return "Policy Number: " + policyNumber +
           "\nProvider Name: " + providerName +
           "\n" + holder.toString() +
           "\nPolicy Price: $" + String.format("%.2f", calculatePolicyPrice());
}