package inheritance;

/**
 * Created by Sifat on 1/29/2016.
 */
public class TwoDShape {
    double width;
    double height;

    String showDim(){
        return "width and height are: "+width+" and "+height;
    }
}

class Triangle extends TwoDShape{
    String style;

    double area(){
        return width*height/2;
    }
    String showStyle(){
        return style;
    }
}

class Shapes{
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 3;
        t1.height = 5;
        t1.style = "Outlined";

        t2.width = 4;
        t2.height = 8;
        t2.style="Filled";

        System.out.println("Traingle 1 dimension: "+t1.showDim()+" area: "+t1.area()+" style: "+t1.showStyle());
        System.out.println("Traingle 2 dimension: "+t2.showDim()+" area: "+t2.area()+" style: "+t2.showStyle());

    }
}
