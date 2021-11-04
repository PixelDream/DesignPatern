package fr.morgannehdi.patterns.behavioral.visitor.visitor;

import fr.morgannehdi.patterns.behavioral.visitor.shapes.Circle;
import fr.morgannehdi.patterns.behavioral.visitor.shapes.CompoundShape;
import fr.morgannehdi.patterns.behavioral.visitor.shapes.Dot;
import fr.morgannehdi.patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}