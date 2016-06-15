import java.util.Scanner;

/**
 * Created by EddyJ on 6/15/16.
 */
public class main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, what is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (!name.equalsIgnoreCase("")){
            System.out.println("Hello " + name);
        }
        else{
            throw new Exception("Error, goodbye");
        }

        System.out.println("What would you like to do?");
        System.out.println("1.Check Balance, 2.Withdraw Funds, 3.Cancel [1/2/3]");

        String option = scanner.nextLine();

        if (option.equalsIgnoreCase("1")){
            System.out.println("Your balance is $100");
        }
        else if (option.equalsIgnoreCase("3")){
            System.out.println("Thank you and please come again.");
        }
        else{
            option.equalsIgnoreCase("3");
            System.out.println("How much money would you like to withdraw?");

            int withdraw = scanner.nextInt();

            if(withdraw < 100 && 0 < withdraw){
            System.out.println("Your new balance is " + (100 - withdraw));
        }
            else{
                throw new Exception("Im sorry, but you do not have that kind of money, sorry.");
            }



    }

}}
