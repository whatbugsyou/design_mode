package main.memento;

//originator
public class Player {
    Boolean important_data_isAlive; //save to memento
    String unimportant_data_name; //not save to memento

    public Player() {
        this.important_data_isAlive = true;
        this.unimportant_data_name = "lion";
    }

    // kernel code
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setIsAlive(important_data_isAlive);
        return memento;
    }

    public void recoverMemento(Memento memento) {
        System.out.println("recovering ...");
        this.important_data_isAlive = memento.getIsAlive();
    }


    //some specific method of Player
    public void showStatus() {
        System.out.println(getImportant_data_isAlive() ? "alive" : "dead");
    }

    //getter and setter
    public Boolean getImportant_data_isAlive() {
        return important_data_isAlive;
    }

    public void setImportant_data_isAlive(Boolean important_data_isAlive) {
        this.important_data_isAlive = important_data_isAlive;
    }

    public String getUnimportant_data_name() {
        return unimportant_data_name;
    }

    public void setUnimportant_data_name(String unimportant_data_name) {
        this.unimportant_data_name = unimportant_data_name;
    }
}
