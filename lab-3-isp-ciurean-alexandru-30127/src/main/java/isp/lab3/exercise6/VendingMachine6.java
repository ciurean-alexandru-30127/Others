package isp.lab3.exercise6;


import java.util.Scanner;

public class VendingMachine6 {

    private static VendingMachine6 vendingMachine6;


    private VendingMachine6() {

    }


    public static VendingMachine6 getInstance() {
        if (null == vendingMachine6) {
            vendingMachine6 = new VendingMachine6();
        }
        return vendingMachine6;
    }
    private String[] products = new String[]{"Ciocolata", "Prajitura", "Cola", "Fanta", "Sprite"};
    private int coin;

    /**
     * This is a method for display the products
     */

    public void displayProducts() {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Id: " + i + " Product: " + products[i]);
        }
    }

    /**
     * This method should add 1 to value when you insert a coin
     *
     * @param value represent ypur credit
     */

    public void insertCoin(int value) {
        this.coin += value;
    }

    /**
     * This method should get the coin
     *
     * @return coin
     */

    public int getCoin() {
        return coin;
    }

    /**
     * @param id represent the id of product
     * @return a string representing name of the selected orduct
     */
    public String selectProduct(int id) {

        String product = null;
        if (id > products.length) {
            product = "error";
        } else {
            product = products[id];
        }
        return product;

    }

    /**
     * This method should display the credit
     */

    public void displayCredit() {
        System.out.println(coin);
    }

    /**
     * This method should provide a text based meu for interacting with vending machine
     */
    public void userMenu() {
        System.out.println("1: Display Products ");
        System.out.println("2: Insert Coin");
        System.out.println("3: Select Product");
        System.out.println("4: Display Credit");

        Scanner scanner = new Scanner(System.in);

        int key = scanner.nextInt();

        switch (key) {
            case 1:
                System.out.println(" Display Products");
                displayProducts();
                break;
            case 2:
                System.out.println("Insert Coin: ");
                int coin = scanner.nextInt();
                insertCoin(coin);
                break;
            case 3:
                System.out.println("Select Product:");
                int id = scanner.nextInt();
                selectProduct(id);
                break;
            case 4:
                System.out.println("Display Credit: ");
                displayCredit();

                break;

            default:
                break;
        }

    }
    public static void main(String[] args) {
        VendingMachine6 vendingMachineVersion2 = VendingMachine6.getInstance();

        Scanner scanner = new Scanner(System.in);
        char key;
        do {
            vendingMachine6.userMenu();
            System.out.println("Doriti sa continuati: Y or y");
            key = scanner.next().charAt(0);
        } while (key == 'Y' || key == 'y');
    }
}
