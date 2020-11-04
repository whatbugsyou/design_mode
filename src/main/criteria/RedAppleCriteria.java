package main.criteria;

import java.util.ArrayList;
import java.util.List;

public class RedAppleCriteria implements AppleCriteria {
    @Override
    public List<Apple> meetCriteria(List<Apple> originAppleList) {
        List<Apple> redAppleList = new ArrayList<>();
        originAppleList.forEach(apple -> {
            if ("red".equalsIgnoreCase(apple.getColor())) {
                redAppleList.add(apple);
            }
        });
        return redAppleList;
    }
}
