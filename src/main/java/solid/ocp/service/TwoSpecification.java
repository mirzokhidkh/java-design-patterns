package solid.ocp.service;

import solid.ocp.model.Thing;

public class TwoSpecification implements Specification<Thing> {
    private Specification<Thing> first, second;

    public TwoSpecification(Specification<Thing> first, Specification<Thing> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(Thing item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
