package model;

import model.InventorySystem;
import model.MobileCharacter;
public class Model {
    private static Model instance;

    static {
        instance = new Model();
        // The model, itself, as well as both the map and the player must exist
        // before they can be properly initialized.
        instance.initialize();
    } /* end static */

    protected Model() {
        map = new Map();
        player = new Player();
    } /* end Model */

    public String getCurrentRoomLookDescription() {
        return getPlayer().getCurrentRoomLookDescription();
    } /* end getCurrentRoomLookDescription */

    public String getCurrentRoomLookExits() {
        return getPlayer().getCurrentRoomLookExits();
    } /* end getCurrentRoomLookExits */

    public static Model getInstance() {
        return instance;
    } /* end getInstance */

    public Room getInitialPlayerRoom() {
        return getMap().getInitialPlayerRoom();
    } /* end getInitialPlayerRoom */

    Map getMap() {
        return map;
    } /* end getMap */

    Player getPlayer() {
        return player;
    } /* end getPlayer */

    public void go(Direction direction) {
        getPlayer().go(direction);
    } /* end go */

    private void initialize() {
        getPlayer().initialize();
    } /* end initialize */

    private Map map;
    private Player player;

    // FIXME implement correctly
    public void addToCurrentRoomInventory(Item item) {
    }
    //FIXME implement correctly
    public String getCurrentRoomLookItems() { return "Testing";
    }

    public String getInventoryString() { return getInventoryString();
    }
} /* end Model */