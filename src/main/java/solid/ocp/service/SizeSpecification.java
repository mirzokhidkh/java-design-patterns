package solid.ocp.service;

import solid.ocp.enums.Size;
import solid.ocp.model.Thing;

public class SizeSpecification implements Specification<Thing> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Thing item) {
        return item.size == size;
    }
}
