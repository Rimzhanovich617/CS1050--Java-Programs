import java.util.Scanner; //import Scanner class to receive user input

public class salesCommissions { //Create class salesCommissions
    public static void main(String[] args) {
Scanner input = new Scanner(System.in); //Set scanner class for user input
int totals[]={0,0,0,0,0,0,0,0,0}; // Create an array of 9 items        
int numberOfSalesPeople,sales,salesPersonNumber,index; //Set variables for the usages in the calculations
double salary; //Set variable salary as a double

System.out.println("We are going to figure out a list of weekly salaries for our sales team.");
System.out.println("Each sales person takes home 9% of their weekly sales, plus a base of $200.");//Introduction to the user
System.out.print("How many sales people do you have? on your team? ");// Ask user how many sales people on team                          
numberOfSalesPeople = input.nextInt(); //Set user input to variable numberOfSalesPeople
    for(salesPersonNumber = 1;salesPersonNumber <= numberOfSalesPeople; salesPersonNumber++)//create a for loop to keep asking individual weekly sales per sales person
        {System.out.print("Sales person " + salesPersonNumber + " total dollar amount sold this week: ");//Show the total dollar amount per sales person
        sales = input.nextInt();
        salary = 200 + (int)(0.09 * sales);//Calculation for the salary for the sales person (Base $200 + 9% commission of total sales)
        System.out.printf("Salary=$%.2f\n",salary);//Display format of the salary
        index = (int)salary/100-2;
        if (index>8)
            index=8;
            totals[index]++;//Set total indexing for the For Loop
}
System.out.println("WEEKLY SALARY PAYOUT SHEET:\nPAYOUT RANGE\tCOUNT");//Create Table Header
    for(salesPersonNumber = 0; salesPersonNumber < 8;salesPersonNumber++)//Establish count for the sales people from above
    System.out.println("$"+(salesPersonNumber * 100 + 200) + "-" + (salesPersonNumber * 100 + 299) + "\t"+totals[salesPersonNumber]);//Set the total sales commission to the right cateory
    System.out.println("$1000 and over\t"+totals[salesPersonNumber]);//Added cateogry for any payout above $1000
}                                
}