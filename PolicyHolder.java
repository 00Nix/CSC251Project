import java.util.Scanner;

public class PolicyHolder 
{
    
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
   
    public PolicyHolder() 
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
    
    public PolicyHolder(int policyNumber, String providerName, String firstName, String lastName,
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
    
    public double calculateBMI() 
    {
        return (weight * 703) / (height * height);
    }
    
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

     public String toString() 
     {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Policyholder's Smoking Status: " + smokingStatus + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               "Policyholder's BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
               "Policy Price: $" + String.format("%.2f", calculatePolicyPrice());
     }
    
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        PolicyHolder policyHolder = new PolicyHolder();
        
        //user input
        System.out.print("Please enter the Policy Number: ");
        policyHolder.setPolicyNumber(keyboard.nextInt());
        keyboard.nextLine(); 

        System.out.print("Please enter the Provider Name: ");
        policyHolder.setProviderName(keyboard.nextLine());

        System.out.print("Please enter the Policyholders First Name: ");
        policyHolder.setFirstName(keyboard.nextLine());

        System.out.print("Please enter the Policyholders Last Name: ");
        policyHolder.setLastName(keyboard.nextLine());

        System.out.print("Please enter the Policyholders Age: ");
        policyHolder.setAge(keyboard.nextInt());
        keyboard.nextLine(); 

        System.out.print("Please enter the Policyholders Smoking Status (smoker/non-smoker): ");
        policyHolder.setSmokingStatus(keyboard.nextLine());

        System.out.print("Please enter the Policyholders Height (in inches): ");
        policyHolder.setHeight(keyboard.nextDouble());

        System.out.print("Please enter the Policyholders Weight (in pounds): ");
        policyHolder.setWeight(keyboard.nextDouble());

        //output for user
        System.out.println("\nPolicy Number: " + policyHolder.getPolicyNumber());
        System.out.println("Provider Name: " + policyHolder.getProviderName());
        System.out.println("Policyholders First Name: " + policyHolder.getFirstName());
        System.out.println("Policyholders Last Name: " + policyHolder.getLastName());
        System.out.println("Policyholders Age: " + policyHolder.getAge());
        System.out.println("Policyholders Smoking Status: " + policyHolder.getSmokingStatus());
        System.out.println("Policyholders Height: " + policyHolder.getHeight() + " inches");
        System.out.println("Policyholders Weight: " + policyHolder.getWeight() + " pounds");
        System.out.println("Policyholders BMI: " + String.format("%.2f", policyHolder.calculateBMI()));
        System.out.println("Policy Price: $" + String.format("%.2f", policyHolder.calculatePolicyPrice()));

        keyboard.close();
    }
}