package main.criteria.test;

import main.criteria.AndAppleCriteria;
import main.criteria.Apple;
import main.criteria.BigAppleCriteria;
import main.criteria.RedAppleCriteria;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CriteriaTest {
    @Test
    void test() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", true));
        apples.add(new Apple("red", false));
        apples.add(new Apple("green", true));
        apples.add(new Apple("green", false));
        BigAppleCriteria bigAppleCriteria = new BigAppleCriteria();
        RedAppleCriteria redAppleCriteria = new RedAppleCriteria();
        AndAppleCriteria andAppleCriteria = new AndAppleCriteria(bigAppleCriteria, redAppleCriteria);
        System.out.println("big");
        print(bigAppleCriteria.meetCriteria(apples));
        System.out.println("red");
        print(redAppleCriteria.meetCriteria(apples));
        System.out.println("and");
        print(andAppleCriteria.meetCriteria(apples));

    }
    void print(List<Apple> appleList){
        appleList.forEach(apple -> System.out.println((apple.toString())));
    }
}
