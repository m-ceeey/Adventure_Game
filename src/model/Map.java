package model;

public class Map {
    public Map() {
        thomas101 =
                new Room("You are seated in 101 Thomas Building.  It is brightly lit and is the site of your favourite class OF ALL TIME.  Evaaaar.",
                        "101Thomas");
        thomasHallway = new Room("You are in the main hallway on the first floor of Thomas Building.", "ThomasFirstHallway");
        thomasEastExit = new Room("You are standing outside Thomas Builindg along Pollock Road", "thomasEastExit");
        mcElwainCourtyard = new Room("You are in McElwain's courtyard, a peaceful beautiful setting reminiscent of earlier times.", "(mcElwain");

        thomas101.addCompassExit(CompassDirection.SOUTH_NAME, thomasHallway);
        thomasHallway.addCompassExit(CompassDirection.EAST_NAME, thomasEastExit);
        thomasEastExit.addCompassExit(CompassDirection.EAST_NAME, mcElwainCourtyard);
    } /* end Map */

    public Room getInitialPlayerRoom() {
        return thomas101;
    } /* end getInitialPlayerRoom */

    private Room thomas101;
    private Room thomasHallway;
    private Room thomasEastExit;
    private Room mcElwainCourtyard;
} /* end Map */
