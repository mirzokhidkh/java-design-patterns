package solid.ocp;

import solid.ocp.enums.Color;
import solid.ocp.enums.Size;
import solid.ocp.model.Thing;
import solid.ocp.service.ColorSpecification;
import solid.ocp.service.OCPFilter;
import solid.ocp.service.SizeSpecification;
import solid.ocp.service.TwoSpecification;

import java.util.List;

public class OCPMain {
    public static void main(String[] args) {
        Thing white_glasses = new Thing("White Glasses", Color.WHITE, Size.LARGE);
        Thing black_pen = new Thing("Black Pen", Color.BLACK, Size.SMALL);
        Thing car = new Thing("Car", Color.BLACK, Size.MEDIUM);
        List<Thing> things = List.of(white_glasses, black_pen, car);

        OCPFilter ocpFilter = new OCPFilter();
        System.out.println(ocpFilter.filter(things, new ColorSpecification(Color.WHITE)));
        System.out.println(ocpFilter.filter(things, new SizeSpecification(Size.SMALL)));
        System.out.println(ocpFilter.filter(things, new TwoSpecification(
                new ColorSpecification(Color.BLACK),
                new SizeSpecification(Size.MEDIUM)
        )));
    }
}
