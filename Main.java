import java.util.Scanner;

public class Main extends deliveryInfo {
    protected Main() {
        super("A", "B", "C","D");
    }
    public static void main(String[] args) {

        deliveryInfo info = new deliveryInfo("Clarence Louise V. Portuguez","SCMCI Compound, San Carlos City","09062268593","15-30 Minutes");
        User user = new User();
        user.setBalance(150);
        user.setUser("Clarence277");

        System.out.println("\nWelcome, " + user.getUser() + ", What would you like to order today?");

        System.out.println("Your Available Balance is: " + user.getBalance());
        System.out.println("----------------------------------------------------------");

        Scanner cInput = new Scanner(System.in);

        int RemainingBal;
        int[][] order = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int Onum;
        int Total;

        Menu();

        for (int x = 0; x < order.length; x++) {
            System.out.print("Select Number to Order: ");
            Onum = Integer.parseInt(cInput.next());
            System.out.println(" ");
            if (Onum == order[0][0]) {
                System.out.println("Chicken wt Rice");
                int price = 99;
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[0][1]) {
                int price = 85;
                System.out.println("Steak wt rice");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[0][2]) {
                int price = 105;
                System.out.println("Bacon wt rice");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[1][0]) {
                int price = 65;
                System.out.println("Cheeseburger");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[1][1]) {
                int price = 90;
                System.out.println("Mac and Cheese");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[1][2]) {
                int price = 55;
                System.out.println("Hot dog");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[2][0]) {
                int price = 75;
                System.out.println("French Fries");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[2][1]) {
                int price = 40;
                System.out.println("Mashed Potato");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total(with delivery fee): " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            } else if (Onum == order[2][2]) {
                int price = 40;
                System.out.println("Buttered Corn");
                Total = price + 30;
                RemainingBal = user.getBalance() - Total;
                System.out.println("Total: " + Total);
                System.out.println("\nYour Remaining Balance is: " + RemainingBal);
                break;
            }
            else{
                System.out.println("Order Number is not in the List!\n");
            }
        }
        info.print();
        System.out.println("\nFull Name: " + info.getName());
        System.out.println("Address: " + info.getAddress());
        System.out.println("Contact Number: " + info.getPhoneNum());
        System.out.println("ETA: " + info.getETA());

        confirm();
    }
}
