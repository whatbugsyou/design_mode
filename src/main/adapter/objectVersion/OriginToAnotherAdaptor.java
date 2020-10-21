package main.adapter.objectVersion;

import main.adapter.Another;
import main.adapter.Origin;
import main.adapter.OriginImpl;

public class OriginToAnotherAdaptor implements Another {
    private Origin origin;
    public OriginToAnotherAdaptor(Origin origin) {
        this.origin=origin;
    }
    @Override
    public void anotherFunction() {
        origin.originFunction();
    }
}
