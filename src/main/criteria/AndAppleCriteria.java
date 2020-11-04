package main.criteria;

import java.util.List;

public class AndAppleCriteria implements AppleCriteria{
    private AppleCriteria first;
    private AppleCriteria second;

    public AndAppleCriteria(AppleCriteria first, AppleCriteria second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public List<Apple> meetCriteria(List<Apple> originAppleList) {
        return second.meetCriteria(first.meetCriteria(originAppleList));
    }
}
