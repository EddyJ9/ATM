import java.util.Scanner;

/**
 * Created by EddyJ on 6/15/16.
 */
public class atm {
    private String name;
    private String option;
    private int withdraw;
    private Scanner scanner = new Scanner(System.in);

    public String getName(){
        return this.name;
    }

    public String getOption(){
        return this.option;
    }
    public int getWithdraw(){
        return this.withdraw;
    }
    public void chooseName() throws Exception {
        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();

        if (!name.equalsIgnoreCase("")){
            System.out.println("Hello " + name);
        }
        else{
            throw new Exception("Error, goodbye");
        }

    }



}
