import java.text.DecimalFormat;
public class Policy {
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount = 0;
   
    public Policy() {
        policyNumber = 0;
        providerName = "Unknown";
        policyHolder = new PolicyHolder();
        policyCount++;
    }

   public Policy(int policyNumber, String providerName, PolicyHolder holder) {
    this.policyNumber = policyNumber;
    this.providerName = providerName;
    this.policyHolder = new PolicyHolder(holder); // copy for safety!
    policyCount++;
}     
    public String toString() {
       DecimalFormat df = new DecimalFormat("0.00");
   
       return "Policy Number: " + policyNumber +
              "\nProvider Name: " + providerName +
              "\n" + policyHolder.toString() +
              "\nPolicyholder’s BMI: " + df.format(policyHolder.calculateBMI()) +
              "\nPolicy Price: $" + df.format(calculatePrice());
     }
   public int getPolicyNumber() { return policyNumber; }
   public void setPolicyNumber(int number) { policyNumber = number; }
   
   public String getProviderName() { return providerName; }
   public void setProviderName(String name) { providerName = name; }
   
   public PolicyHolder getPolicyHolder() { return new PolicyHolder(policyHolder); }
   public void setPolicyHolder(PolicyHolder holder) { this.policyHolder = new PolicyHolder(holder); }
   public static int getPolicyCount() {
    return policyCount;
}
public double calculatePrice() {
    double price = 600.0;

    if (policyHolder.getAge() > 50)
        price += 75.0;

    if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
        price += 100.0;

    double bmi = policyHolder.calculateBMI();
    if (bmi > 35)
        price += (bmi - 35) * 20;

    return price;
}        
    
}
