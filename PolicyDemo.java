import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //declare variables
        String policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus;
        double height;
        double weight;
        int numSmokers = 0;

        //store policy objects
        ArrayList<Policy> policyList = new ArrayList<Policy>();
      
        //create and open the file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);
      
        //process all information 
        while(inputFile.hasNext())
        {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         //create a Policy object and add it to our ArrayList
         policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
      
      }
      
      //print out information about each Policy object
      for(Policy policy : policyList)
      {
           System.out.println(policy); 
      { 


        System.out.print("Please enter the Policy Number: ");
        int policyNumber = keyboard.nextInt();
        keyboard.nextLine();  

        System.out.print("Please enter the Provider Name: ");
        String providerName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = keyboard.nextInt();
        keyboard.nextLine(); 

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = keyboard.nextDouble();
        keyboard.nextLine();  

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = keyboard.nextDouble();
        keyboard.nextLine();  

        //create a Policy object using the constructor with arguments
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        //display the policy information
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePrice());
        
        keyboard.close();
    }
}