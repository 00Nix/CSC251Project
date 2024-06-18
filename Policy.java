import java.util.Scanner;
//caleb nix

public class Policy 
{
    
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    private static int numberOfPolicies = 0; 
   
    //no-arg constructor 
    public Policy() 
    {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0.0;
        this.weight = 0.0;
    }
   
    //constructor with arguments
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                           int age, String smokingStatus, double height, double weight)
                            {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }
    
    public static int getNumberOfPolicies() 
    {
        return numberOfPolicies;
        }
    
    //setters and getters
    public int getPolicyNumber() 
    {
        return policyNumber;
    }  
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }
    public String getProviderName() 
    {
        return providerName;
    }
     public void setProviderName(String providerName) 
    {
        this.providerName = providerName;
    }
    public String getFirstName() 
    {
       return firstName;
    }
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getSmokingStatus() 
    {
        return smokingStatus;
    }
    public void setSmokingStatus(String smokingStatus) 
    {
        this.smokingStatus = smokingStatus;
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height) 
    {
        this.height = height;
    }
    public double getWeight() 
    {
        return weight;
    }
    public void setWeight(double weight) 
    {
        this.weight = weight;
    }
    //method calculating BMI
    public double calculateBMI() 
    {
        return (weight * 703) / (height * height);
    }
    //method calculating policy price
    public double calculatePolicyPrice() 
    {
        double basePrice = 600;
        if (age > 50) {
            basePrice += 75;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) 
        {
            basePrice += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            basePrice += (bmi - 35) * 20;
        }
        return basePrice;
    }
    
     public String toString() {
        return "Policy Information: \n" +
                "Policy Number: " + policyNumber + "\n" +
                "Provider Name: " + providerName + "\n" +
                "Policyholder's Name: " + firstName + " " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Smoking Status: " + smokingStatus + "\n" +
                "Height: " + height + " inches\n" +
                "Weight: " + weight + " pounds\n" +
                "BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
                "Policy Price: $" + String.format("%.2f", calculatePolicyPrice());
    }

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        Policy policy = new Policy();
        //user input
        System.out.print("Please enter the Policy Number: ");
        policy.setPolicyNumber(keyboard.nextInt());
        keyboard.nextLine(); 

        System.out.print("Please enter the Provider Name: ");
        policy.setProviderName(keyboard.nextLine());

        System.out.print("Please enter the Policyholders First Name: ");
        policy.setFirstName(keyboard.nextLine());

        System.out.print("Please enter the Policyholders Last Name: ");
        policy.setLastName(keyboard.nextLine());

        System.out.print("Please enter the Policyholders Age: ");
        policy.setAge(keyboard.nextInt());
        keyboard.nextLine(); 

        System.out.print("Please enter the Policyholders Smoking Status (smoker/non-smoker): ");
        policy.setSmokingStatus(keyboard.nextLine());

        System.out.print("Please enter the Policyholders Height (in inches): ");
        policy.setHeight(keyboard.nextDouble());

        System.out.print("Please enter the Policyholders Weight (in pounds): ");
        policy.setWeight(keyboard.nextDouble());

        //output for user
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholders First Name: " + policy.getFirstName());
        System.out.println("Policyholders Last Name: " + policy.getLastName());
        System.out.println("Policyholders Age: " + policy.getAge());
        System.out.println("Policyholders Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholders Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholders Weight: " + policy.getWeight() + " pounds");
        System.out.println("Policyholders BMI: " + String.format("%.2f", policy.calculateBMI()));
        System.out.println("Policy Price: $" + String.format("%.2f", policy.calculatePolicyPrice()));

        keyboard.close();
    }
}
