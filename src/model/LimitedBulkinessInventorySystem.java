package model;

public class LimitedBulkinessInventorySystem extends InventorySystem {
    private int bulkLimit;

    public LimitedBulkinessInventorySystem(int bulkLimit) {
        super();
        this.bulkLimit = bulkLimit;
    }

    @Override
    protected boolean canAddItem(Item item) {
        // TODO Auto-generated method stub
        int currentBulk = 0;
        for(Item i:list) {
            currentBulk += i.getBulkiness();
        }
        if(currentBulk+item.getBulkiness() >this.bulkLimit)
            return false;

        return true;
    }

    @Override
    protected String getInventoryFullMessage() {
        // TODO Auto-generated method stub
        return "Inventory is Full, maximum allowed bulk breached";
    }

}