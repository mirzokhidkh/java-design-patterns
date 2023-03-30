package solid.ocp.service;

public interface Specification<T> {
    boolean isSatisfied(T item);

}
