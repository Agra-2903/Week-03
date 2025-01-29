package SinglyLinkedList.inventorymanagementsystem;

public class ItemNode {
    private String itemId;
    private String itemName;
    private int quantity;
    private double price;
    ItemNode next;

    public ItemNode(String itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public ItemNode getNext() {
        return next;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
