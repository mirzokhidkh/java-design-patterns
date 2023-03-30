package solid.ocp.service;

import solid.ocp.enums.Color;
import solid.ocp.model.Thing;

public class ColorSpecification implements Specification<Thing> {
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Thing item) {
        return item.color == color;
    }
}
