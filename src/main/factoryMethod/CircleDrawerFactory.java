package main.factoryMethod;

public class CircleDrawerFactory extends DrawerFactory {
    @Override
    public Drawer createDrawer() {
        return new GreenHandCircleDrawer();
    }

//    @Override
//    public Drawer createDrawer() {
//        return new MasterCircleDrawer();
//    }
}
