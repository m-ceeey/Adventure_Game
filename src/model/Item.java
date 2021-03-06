package model;

public class Item {
    public Item(String name, String lookDescription, int weight, int bulkiness) {
        this.lookDescription = lookDescription;
        this.name = name;
        this.weight = weight;
        this.bulkiness = bulkiness;
    } /* end Item */

    public String getLookDescription() { return lookDescription; } /* end getLookDescription */

    public String getName() {return name; } /* end getName */

    public int getBulkiness() {return bulkiness; } /* end getBulkiness */

    public int  getWeight() {return weight; } /* end getWeight */

    private String lookDescription;
    private String name;
    private int weight;
    private int bulkiness;
} /* end Item */
