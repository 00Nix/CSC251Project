import java.util.Scanner;
//caleb nix

/**
 * Policy class represents an insurance policy, which holds information about the policyholder 
 */
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
    /**
    * Policy object with default values
    */
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
    /**
    * Constructs
    * @param policyNumber the policy number
    * @param providerName the name of insurance provider
    * @param firstName the first name of policy holder
    * @param lastName the last name of policy holder
    * @param age the age of policy holder
    * @param smokingStatus the smoking status of policy holder
    * @param height the height of policyholder
    * @param weight the weight of policyholder
    */
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
    /**
    * Rtrieves the poliicy number
    * @return the policy number
    */
    //setters and getters
    public int getPolicyNumber() 
    {
        return policyNumber;
    }
    /** 
    * Sets the policy number
    * @param policyNumber the policy number to set
    */
    public void setPolicyNumber(int policyNumber)
    {
        this.policyNumber = policyNumber;
    }
    /**
    * Retrieves the provider number
    * @return the insurance provider name
    */
    public String getProviderName() 
    {
        return providerName;
    }
    /** 
    * Sets the provider
    * @param providerName the insurance provider name to set
    */
    public void setProviderName(String providerName) 
    {
        this.providerName = providerName;
    }
    /**
    * Retrieves the first name
    * @return the first name
    */
    public String getFirstName() 
    {
        return firstName;
    }
    /** 
    * Sets the first name
    * @param firstName the first name to set
    */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    /**
    * Retrieves the last name
    * @return the last name
    */
    public String getLastName() 
    {
        return lastName;
    }
    /** 
    * Sets the last name
    * @param lastName the last name of policy holder to set
    */

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    /**
    * Retrieves the age 
    * @return the age of policy holder 
    */
    public int getAge() 
    {
        return age;
    }
    /** 
    * Sets the age
    * @param age the age of policy holder to set
    */
    public void setAge(int age) 
    {
        this.age = age;
    }
    /**
    * Retrieves the smoking status
    * @return the smoking status of policy holder
    */
    public String getSmokingStatus() 
    {
        return smokingStatus;
    }
    /** 
    * Sets the smoking status
    * @param smokingStatus the smoking status of policy holder to set
    */
    public void setSmokingStatus(String smokingStatus) 
    {
        this.smokingStatus = smokingStatus;
    }
    /**
    * Retrieves the height
    * @return the height of policy holder
    */
    public double getHeight()
    {
        return height;
    }
    /** 
    * Sets the height
    * @param height the height of policy holder to set 
    */
    public void setHeight(double height) 
    {
        this.height = height;
    }
    /**
    * Retrieves the weight
    * @return the weight of policy holder 
    */
    public double getWeight() 
    {
        return weight;
    }
    /** 
    * Sets the weight
    * @param weight the weight of policy holder to set
    */
    public void setWeight(double weight) 
    {
        this.weight = weight;
    }
    /**
    * Calculates the BMI of the policy holder
    * @return the BMI of policyholder
    */
    //method calculating BMI
    public double calculateBMI() 
    {
        return (weight * 703) / (height * height);
    }
    /**
    * Calculates the price of the policy
    * @return the price of the policy
    */
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

    /**
    * Asks for user input and displays the information
    */
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
