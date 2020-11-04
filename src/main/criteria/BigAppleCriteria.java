package main.criteria;

import java.util.ArrayList;
import java.util.List;

public class BigAppleCriteria implements AppleCriteria{
    @Override
    public List<Apple> meetCriteria(List<Apple> originAppleList) {
        List<Apple> bigAppleList = new ArrayList<>();
        originAppleList.forEach(apple -> {
            if (apple.getBig()) {
                bigAppleList.add(apple);
            }
        });
        return bigAppleList;
    }
}
