package main.adapter.classVersion;

import main.adapter.Another;
import main.adapter.OriginImpl;

public class OriginToAnotherAdaptor extends OriginImpl implements Another {
    @Override
    public void anotherFunction() {
        super.originFunction();
    }
}
