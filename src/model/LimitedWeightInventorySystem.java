package model;

public class LimitedWeightInventorySystem  extends InventorySystem
{
    private int weightLimit;

    public LimitedWeightInventorySystem(int weightLimit)
    {
        super();
        this.weightLimit = weightLimit;
    }
    @Override
    protected boolean canAddItem(Item item)
    {
        int currentWeight = 0;
        for(Item i:list)
            currentWeight += i.getWeight();

        if(currentWeight+item.getWeight() > this.weightLimit)
            return false;
        return true;
    }
    @Override
    protected String getInventoryFullMessage()
    {
        return "Inventory is Full, maximum allowed weight breached";
    }
}