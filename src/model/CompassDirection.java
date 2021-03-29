package model;

public class CompassDirection extends Direction
{
    public static final CompassDirection NORTH_NAME = new CompassDirection("north");
    public static final CompassDirection SOUTH_NAME = new CompassDirection("south");
    public static final CompassDirection EAST_NAME = new CompassDirection("east");
    public static final CompassDirection WEST_NAME = new CompassDirection("west");

    static
    {
        NORTH_NAME.setOppositeCompassDirection(SOUTH_NAME);
        SOUTH_NAME.setOppositeCompassDirection(NORTH_NAME);
        EAST_NAME.setOppositeCompassDirection(WEST_NAME);
        WEST_NAME.setOppositeCompassDirection(EAST_NAME);
    } /* end static */

    public CompassDirection(String name) {
        super(name);
    } /* end CompassDirection */

    CompassDirection getOppositeCompassDirection() {
        return oppositeCompassDirection;
    } /* end setOppositeCompassDirection */

    private void setOppositeCompassDirection(CompassDirection compassDirection) {
        this.oppositeCompassDirection = compassDirection;
    } /* end setOppositeCompassDirection */

    private CompassDirection oppositeCompassDirection;
} /* end CompassDirection */
