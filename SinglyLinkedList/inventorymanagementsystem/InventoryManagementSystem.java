package SinglyLinkedList.inventorymanagementsystem;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (true) {
            System.out.println("1. Add item at the beginning");
            System.out.println("2. Add item at the end");
            System.out.println("3. Add item at the position");
            System.out.println("4. Delete item by Roll Number");
            System.out.println("5. Search item by Roll Number");
            System.out.println("6. Dislpay items details");
            System.out.println("7. Update grade of the item by Roll Number");
            System.out.println("8. Sorting items by price");
            System.out.println("9. Exit");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Item Id, Item Name, Quantity and Price: ");
                    ItemOperations.addAtBeginning(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Item Id, Item Name, Quantity and Price: ");
                    ItemOperations.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Item Id, Item Name, Quantity and Price, Enter Position: ");
                    ItemOperations.addAtSpecific(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Item Id to delete: ");
                    ItemOperations.deleteByItemId(sc.next());
                    break;
                case 5:
                    System.out.print("Enter Item Id to search: ");
                    ItemOperations.searchByItemId(sc.next());
                    break;
                case 6:
                    ItemOperations.calculateAndDisplayTotal();
                    break;
                case 7:
                    System.out.print("Enter Item Id and new quantity: ");
                    ItemOperations.updateQuantityByItemId(sc.next(), sc.nextInt());
                    break;
                case 8:
                    ItemOperations.sortingInventoryByPrice();
                    break;
                case 9:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
