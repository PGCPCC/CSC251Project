/**
 * This class represents an insurance policy.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private float height;
    private float weight;

    /**
     * Default constructor.
     */
    public Policy() {
        policyNumber = 0;
        providerName = "Unknown";
        firstName = "Unknown";
        lastName = "Unknown";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0f;
        weight = 0.0f;
    }

    /**
     * Parameterized constructor.
     *
     * @param policyNumber the policy number
     * @param providerName the provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status
     * @param height the policyholder's height (in inches)
     * @param weight the policyholder's weight (in pounds)
     */
    public Policy(int policyNumber, String providerName, String firstName,
                  String lastName, int age, String smokingStatus,
                  float height, float weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters with javadoc for each

    /**
     * @return the policy number
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * @param policyNumber the policy number to set
     */
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * @return the provider name
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * @param providerName the provider name to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * @return the policyholder's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the policyholder's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the policyholder's age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the smoking status
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * @param smokingStatus the smoking status to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * @return the height in inches
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the weight in pounds
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Calculates and returns the BMI.
     *
     * @return the BMI value
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates and returns the insurance price.
     *
     * @return the insurance price
     */
    public double calculatePrice() {
        double price = 600.0;

        if (age > 50) {
            price += 75.0;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }
}
