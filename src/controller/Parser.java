package controller;

import AdventureObject.AdventureObject;
import model.CompassDirection;
import model.Direction;

public class Parser extends AdventureObject {
    public void parseCommand(String command) {
        String[] commands = command.trim().toLowerCase().split(" ");

        if (commands.length > 0) {
            switch (commands[0]) {
                case "drop" : processDrop(commands); break;

                case "get" : processGet(commands); break;

                case "go" : processGo(commands); break;
                case "north" : processGo(CompassDirection.NORTH_NAME); break;
                case "south" : processGo(CompassDirection.SOUTH_NAME); break;
                case "east" : processGo(CompassDirection.EAST_NAME); break;
                case "west" : processGo(CompassDirection.WEST_NAME); break;

                case "i" : // Fall through to the next entry
                case "inventory" : processInventory(); break;

                case "look" : getController().processLook(); break;

                case "quit" : getController().processQuitCommand(); break;

                default : getController().processUnknownCommand(command); break;
            } /* end switch */
        } /* end if */
    } /* end parseCommand */

    private void processDrop(String[] commands) {
        getController().drop(commands.length > 1 ? commands[1] : "");
    } /* end processDrop */

    private void processGet(String[] commands) {
        getController().get(commands.length > 1 ? commands[1] : "");
    } /* end processGet */

    private void processGo(Direction direction) {
        getController().go(direction);
    } /* end processGo */

    private void processGo(String[] commands) {
        boolean wasCommandsProcessed = false;

        if (commands.length > 1) {
            switch (commands[1]) {
                case "north" : {
                    processGo(CompassDirection.NORTH_NAME);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */

                case "south" : {
                    processGo(CompassDirection.SOUTH_NAME);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */

                case "east" : {
                    processGo(CompassDirection.EAST_NAME);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */

                case "west" : {
                    processGo(CompassDirection.WEST_NAME);
                    wasCommandsProcessed = true;
                    break;
                } /* end case */
            } /* end switch */
        } /* end if */

        if (!wasCommandsProcessed) getController().processUnknownCommand(String.join(" ", commands));
    } /* end processGo */

    private void processInventory() {
        getController().inventory();
    } /* end processInventory */

} /* end Parser */

