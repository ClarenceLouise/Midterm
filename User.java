import java.util.Scanner;
public class User {
    String user;
    String Name;
    public User() {

    }
    public String getName(){
        return Name;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    private int balance;


    public int getBalance() {
        return balance;
    }


    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    static void Menu() {
        System.out.println("\n[1]Chicken wt rice 99php \t [2]Steak wt rice 85php \t [3]Bacon wt rice 105php");
        System.out.println("[4]Cheeseburger 65php \t     [5]Mac and Cheese 90php \t [6]Hot dog 55php");
        System.out.println("[7]French Fries 75php \t     [8]Mashed Potato 40php \t [9]Buttered Corn 40php");
    }

    static void confirm() {
        Scanner sc = new Scanner(System.in);
        String choice;
        System.out.println("\nConfirm Order(Y/N): ");
        choice = sc.next();
        if (choice.equals("Y")) {
            System.out.println("\nPreparing your Order...");
            System.out.println("Thank You For Ordering!");
        } else {
            System.out.println("\nOrder Cancelled");
        }
    }
}



