package main.memento;

import org.junit.jupiter.api.Test;

import java.util.Date;


public class MementoTest {
    @Test
    public void Test(){
        Player player = new Player();
        Memento memento = player.createMemento();
        Caretaker caretaker = new Caretaker();
        Date date = new Date();
        date.setTime(1);
        caretaker.saveMemento(date, memento);
        System.out.println(player.getImportant_data_isAlive());

        player.paly();
        player.setImportant_data_isAlive("dead");
        System.out.println(player.getImportant_data_isAlive());

        System.out.println("recovering ...");
        player.recoverMemento(memento);
        System.out.println(player.getImportant_data_isAlive());
    }
}
