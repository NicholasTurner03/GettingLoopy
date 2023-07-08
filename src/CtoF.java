import java.util.Scanner;

public class CtoF {

    public static <Int> void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double F;
        double C;
        double temp;
        boolean done= false;
        String trash;
        System.out.println("Please enter the temperature in celsius:");

        do
        {
            if (in.hasNextDouble()) {
                done = true;
            }else{
                trash=in.nextLine();
                System.out.println("You said your temperature was: " +trash);
                System.out.println("Invalid entry, try again");}
        }while(!done);
        C=in.nextDouble();
        F = (C*9/5)+32;
        System.out.println("The temperature in fahrenheit is "+F);
        if (F<=32){
            System.out.println("This is Below Freezing");
        }
        if (F>= 212){
            System.out.println("The temperature is boiling");
        }


    }
}

