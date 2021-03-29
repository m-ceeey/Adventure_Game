package model;

public class FiniteInventorySystem extends InventorySystem
{
    private int maxNumber;
    public FiniteInventorySystem(int maxNumber)
    {
        super();
        this.maxNumber = maxNumber;
    }

    @Override
    protected boolean canAddItem(Item item)
    {
        if(list.size() >= this.maxNumber)
            return false;
        return true;
    }

    @Override
    protected String getInventoryFullMessage()
    {
        return "Inventory is Full";
    }

}
