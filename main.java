import java.util.Scanner;

public class main {
    public static void main(String[] args){
        AtmOperationInterface op = new AtmOperationImpl();

        int atmNumber = 12345;
        int atmPin = 123;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine!");
        System.out.print("Enter Atm Number: ");
        int atmNum = input.nextInt();

        System.out.print("Enter Pin: ");
        int pin = input.nextInt();

        if ((atmNumber == atmNum) && (atmPin == pin)){
            while(true){
                System.out.println("1. Check Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit!");

                System.out.println("Select one: ");
                int select = input.nextInt();
                if (select == 1) {
                    op.wiewBalance();
                }
                else if (select == 2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount = input.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                    
                }
                else if (select == 3){
                    System.out.println("Enter ammount to deposit");
                    double depositAmount = input.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if (select == 4){
                    op.viewMiniStatement();
                }
                else if (select == 5){
                    System.out.println("Collect your ATM Card \n Thank you for using ATM Machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please Select from 1 to 5.");
                }
            }
        }

        else{
            System.out.println("Invalid Credentials");
            System.exit(0);
        }


    }
}
