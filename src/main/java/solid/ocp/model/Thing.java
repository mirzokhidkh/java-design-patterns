package solid.ocp.model;

import solid.ocp.enums.Color;
import solid.ocp.enums.Size;

public class Thing {
    public String name;
    public Color color;
    public Size size;

    public Thing(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}
