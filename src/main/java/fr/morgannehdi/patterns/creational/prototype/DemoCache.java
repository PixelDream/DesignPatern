package fr.morgannehdi.patterns.creational.prototype;

import fr.morgannehdi.patterns.creational.prototype.cache.BundledShapeCache;
import fr.morgannehdi.patterns.creational.prototype.shapes.Shape;

/**
 * Vous pouvez implémenter un registre de prototypes centralisé (ou fabrique)
 * qui contiendrait un ensemble d’objets prototype prédéfinis. Ainsi vous
 * pouvez récupérer de nouveaux objets de la fabrique en passant leur nom ou
 * d’autres paramètres. La fabrique chercherait le prototype approprié, le
 * clonerait et vous enverrait une copie.
 */

public class DemoCache {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }
}
