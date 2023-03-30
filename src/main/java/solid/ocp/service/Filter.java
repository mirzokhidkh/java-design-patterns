package solid.ocp.service;

import java.util.List;

public interface Filter<T> {
    List<T> filter(List<T> items, Specification<T> specification);
}