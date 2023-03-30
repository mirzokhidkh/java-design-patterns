package solid.ocp.service;

import solid.ocp.model.Thing;

import java.util.List;
import java.util.stream.Collectors;

public class OCPFilter implements Filter<Thing> {

    @Override
    public List<Thing> filter(List<Thing> items, Specification<Thing> specification) {
        return items.stream().filter(specification::isSatisfied).collect(Collectors.toList());
    }
}