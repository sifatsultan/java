package inheritance;

/**
 * Created by Sifat on 1/29/2016.
 */
abstract class TwoDShape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    String showDim(){
        return "width and height are: "+width+" and "+height;
    }

    abstract double area();

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Rectangle r1 = new Rectangle();

        t1.setWidth(3);
        t1.setHeight(5);
        t1.style = "Outlined";

        t2.setWidth(4);
        t2.setHeight(8);
        t2.style="Filled";

        r1.setHeight(4);
        r1.setWidth(4);

        System.out.println("Traingle 1 dimension: "+t1.showDim()+" area: "+t1.area()+" style: "+t1.showStyle());
        System.out.println("Traingle 2 dimension: "+t2.showDim()+" area: "+t2.area()+" style: "+t2.showStyle());
        System.out.println("r1 dimension: "+r1.showDim()+" area "+r1.area()+" isSquare: "+r1.isSquare());
    }
}


class Triangle extends TwoDShape{
    String style;

    String showStyle(){
        return style;
    }

    @Override
    double area() {
        return getHeight()*getWidth()*0.5;
    }
}

class Rectangle extends TwoDShape{
    boolean isSquare(){
        if(getWidth() == getHeight()) return true;
        return false;
    }

    @Override
    double area() {
        return getHeight()*getWidth();
    }
}

