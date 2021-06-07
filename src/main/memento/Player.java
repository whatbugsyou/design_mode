package main.memento;

//originator
public class Player {
    String important_data_isAlive = "alive"; //save to memento
    String unimportant_data_name = "lion"; //not save to memento

    // kernel code
    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setIsAlive(important_data_isAlive);
        return memento;
    }

    public void recoverMemento(Memento memento){
        this.important_data_isAlive = memento.getIsAlive();
    }


    //some specific method of Player
    public void play(){
        System.out.println("AWOOOOO~~");
    }

    //getter and setter
    public String getImportant_data_isAlive() {
        return important_data_isAlive;
    }

    public void setImportant_data_isAlive(String important_data_isAlive) {
        this.important_data_isAlive = important_data_isAlive;
    }

    public String getUnimportant_data_name() {
        return unimportant_data_name;
    }

    public void setUnimportant_data_name(String unimportant_data_name) {
        this.unimportant_data_name = unimportant_data_name;
    }
}
