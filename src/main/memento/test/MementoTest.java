package main.memento.test;

import main.memento.Caretaker;
import main.memento.Memento;
import main.memento.Player;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class MementoTest {
    @Test
    public void Test(){
        // create player
        Player player = new Player();
        Memento memento = player.createMemento();
        Caretaker caretaker = new Caretaker();
        player.showStatus();

        //save memento
        Date date = new Date();
        date.setTime(1);
        caretaker.saveMemento(date, memento);

        // change status
        player.setImportant_data_isAlive(false);
        player.showStatus();

        // recover memento
        player.recoverMemento(caretaker.getMemento(date));
        player.showStatus();
    }
}
