package patterns.prototype;

import patterns.prototype.models.F16Engine;

public interface  IAircraftPrototype {
    void fly();

    IAircraftPrototype clone();

    void setEngine(F16Engine f16Engine);
}
