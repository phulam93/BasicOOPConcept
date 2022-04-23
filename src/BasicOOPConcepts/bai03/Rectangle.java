package BasicOOPConcepts.bai03;

public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double width, double height, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.height * this.width;
    }

    public double findPerimeter() {
        return 2 * (this.height + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", Area="+this.findArea()+
                ", Perimeter="+this.findPerimeter()+
                '}';
    }
}
