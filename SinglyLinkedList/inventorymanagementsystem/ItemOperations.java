package SinglyLinkedList.inventorymanagementsystem;

import SinglyLinkedList.studentrecordmanagement.StudentNode;

public class ItemOperations {
    private static ItemNode head;

    public static void addAtBeginning(String itemName, String itemId, int quantity, double price) {
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        item.next = head;
        head = item;
        System.out.println("Item added at the beginning");
    }

    public static void addAtEnd(String itemName, String itemId, int quantity, double price) {
        ItemNode item = new ItemNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = item;
            System.out.println("Item added at the end.");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = item;
        System.out.println("Item added at the end");
    }

    public static void addAtSpecific(String itemName, String itemId, int quantity, double price, int index) {
        if (index == 1) {
            addAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        ItemNode item = new ItemNode(itemName, itemId, quantity, price);

        int counter = 1;
        ItemNode temp = head;
        ItemNode prev = null;

        while (counter != index) {
            if (temp != null) {
                prev = temp;
                temp = temp.next;
                counter++;
            } else {
                System.out.println("Invalid index");
                return;
            }
        }
        prev.next = item;
        item.next = temp;
    }

    public static void deleteByItemId(String itemId){
        if(head == null){
            System.out.println("Inventory is empty");
            return;
        }

        if(head.getItemId().equals(itemId)){
            head = head.next;
            System.out.println(itemId + " item is deleted");
            return;
        }

        ItemNode prev = null;
        ItemNode temp = head;

        while (temp.getItemId().equals(itemId)){
            if(temp.next == null){
                System.out.println(itemId + " item not present");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        if(temp.next == null){
            prev.next = null;
            System.out.println(itemId + " item is deleted");
        }
        else{
            temp = temp.next;
            prev.next = temp;
            System.out.println(itemId + " item is deleted");
        }
    }

    public static void searchByItemId(String itemId){
        if(head == null){
            System.out.println("Inventory is empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            if(temp.getItemId().equals(itemId)){
                System.out.printf("%-8s%-25s%-8s%-10s%n", "Item Id", "Item Name", "Quantity", "Price");
                System.out.printf("%-8s%-25s%-8d%-6.2f%n", temp.getItemId(), temp.getItemName(), temp.getQuantity(), temp.getPrice());
                return;
            }
            temp = temp.next;
        }

        System.out.println(itemId + " item not found");
    }

    public static void updateQuantityByItemId(String itemId, int quantity){
        if(head == null){
            System.out.println("Inventory is empty");
            return;
        }

        ItemNode temp = head;
        while (temp != null) {
            if(temp.getItemId().equals(itemId)){
                temp.setQuantity(quantity);
                System.out.println("Quantity updated");
                System.out.printf("%-8s%-25s%-8s%-10s%n", "Item Id", "Item Name", "Quantity", "Price");
                System.out.printf("%-8s%-25s%-8d%-6.2f%n", temp.getItemId(), temp.getItemName(), temp.getQuantity(), temp.getPrice());
                return;
            }
            temp = temp.next;
        }

        System.out.println(itemId + " item not found");
    }

    public static void calculateAndDisplayTotal(){
        ItemNode temp = head;
        double total = 0;
        System.out.printf("%-8s%-25s%-8s%-10s%n", "Item Id", "Item Name", "Quantity", "Price");
        while (temp != null) {
            System.out.printf("%-8s%-25s%-8d%-6.2f%n", temp.getItemId(), temp.getItemName(), temp.getQuantity(), temp.getPrice());
            total = total + (temp.getQuantity() * temp.getPrice());
            temp = temp.next;
        }
        System.out.printf("%21s%-6.2f%n", "Total: ", total);
    }

    public static int getLengthOfLinkedList(){
        int count = 0;
        ItemNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        return count;
    }

    public static void sortingInventoryByPrice(){
        int len = getLengthOfLinkedList();
        int itr = 0;
        boolean swapped;

        while(itr < len){
            ItemNode temp = head;
            ItemNode prev = head;
            swapped = false;

            while (temp.next != null){
                ItemNode ptr = temp.next;

                if(temp.getPrice() > ptr.getPrice()) {
                    swapped = true;
                    if (temp == head) {
                        temp.next = ptr.next;
                        ptr.next = temp;
                        prev = ptr;
                        head = prev;
                    } else {
                        temp.next = ptr.next;
                        ptr.next = temp;
                        prev.next = ptr;
                        prev = ptr;
                    }
                    continue;
                }
                prev = temp;
                temp = temp.next;
            }

            if(!swapped){
                break;
            }

            itr++;
        }
    }

}
