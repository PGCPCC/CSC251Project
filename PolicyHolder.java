public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private float height;
    private float weight;

    public PolicyHolder() {
        firstName = "Unknown";
        lastName = "Unknown";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0f;
        weight = 0.0f;
    }

    public PolicyHolder(String firstName, String lastName, int age,
                        String smokingStatus, float height, float weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    public PolicyHolder(PolicyHolder other) {
        this(other.firstName, other.lastName, other.age, other.smokingStatus, other.height, other.weight);
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public float getHeight() { return height; }
    public float getWeight() { return weight; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    public void setHeight(float height) { this.height = height; }
    public void setWeight(float weight) { this.weight = weight; }

    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    public String toString() {
        return "Policyholder’s First Name: " + firstName +
               "\nPolicyholder’s Last Name: " + lastName +
               "\nPolicyholder’s Age: " + age +
               "\nPolicyholder’s Smoking Status: " + smokingStatus +
               "\nPolicyholder’s Height: " + height +
               "\nPolicyholder’s Weight: " + weight;
    }
}