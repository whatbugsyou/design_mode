package main.adapter.interfaceVersion;

import main.adapter.Another;
import main.adapter.Origin;

public class OriginToAnotherAdaptor extends absAnother {
    private Origin origin;
    public OriginToAnotherAdaptor(Origin origin) {
        this.origin=origin;
    }
    @Override
    public void anotherFunction() {
        origin.originFunction();
    }
}
