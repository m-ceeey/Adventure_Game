package exceptions;

import model.Item;

public class InventoryFullException extends Exception {
    public InventoryFullException(String message, Item item) {
        super(message);
        this.item = item;
    } /* end InventoryFullException */

    public Item getItem() {
        return item;
    } /* end getItem */

    private Item item;
} /* end InventoryFullException*/
