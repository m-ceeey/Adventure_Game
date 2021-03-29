package model;

import AdventureObject.AdventureObject;

public class ModelObject extends AdventureObject {
    protected Model getModel() {
        return Model.getInstance();
    } /* end getModel */
} /* end ModelObject */
