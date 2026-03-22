package personal_practice;
import java.util.Scanner;
import  java.util.Map;
import java.util.HashMap;
public class Map_example {
    public static void main (String[] args)
    {
    Scanner read = new Scanner(System.in);
    Map<String, Double> inventory = new HashMap<>();
    int option;
        System.out.println("===WELCOME TO THE INVENTORY SYSTEM===");
        do {
            System.out.println("\nWhat would you like to do");
            System.out.println("1. Add or update product");
            System.out.println("2. Search for a  product price");
            System.out.println("3. Remove a product");
            System.out.println("4. Show full inventory");
            System.out.println("5. Exit");
            System.out.println("Please choose an option: ");
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter product name: ");
                    String name = read.nextLine().toLowerCase();
                    System.out.println("Enter price: ");
                    double price = read.nextDouble();
                    inventory.put(name, price);
                    System.out.println("Product save successfully");
                    break;

                case 2:
                    System.out.println("Which product are you looking for?: ");
                    String search = read.nextLine().toLowerCase();
                    if (inventory.containsKey(search))
                    {
                        System.out.println("The price of " + search + " is: $" + inventory.get(search));
                    } else {
                        System.out.println("ERROR: Product doesn't exist in the inventory");
                    }
                    break;

                case 3:
                    System.out.println("Which product do you want to remove: ");
                    String tRemove = read.nextLine().toLowerCase();
                    if (inventory.remove(tRemove)!= null)
                    {
                        System.out.println("Product are removed with exited");
                    }
                    else
                    {
                        System.out.println("ERROR: Product not found");
                    }
                    break;
                case 4:
                    System.out.println("===CURRENT PRODUCT LIST===");
                    if(inventory.isEmpty())
                    {
                        System.out.println("ERROR: The current product list is empty");
                    }
                    else
                    {
                        for(var entry : inventory.entrySet())
                        {
                            System.out.println("* Product: " + entry.getKey() + "| Price: $" + entry.getValue());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thanks for using this program. Have a nice day!");
                    break;
                default:
                    System.out.println("ERROR: Option invalid, try again");
            }
        }while(option != 5);
        read.close();
    }
}
