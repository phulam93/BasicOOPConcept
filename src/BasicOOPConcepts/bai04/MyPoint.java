package BasicOOPConcepts.bai04;

public class MyPoint {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public double distance(MyPoint secondPoint) {
        double temp = Math.pow(secondPoint.getX() - this.x, 2) + Math.pow(secondPoint.getY() - this.y, 2);
        return Math.sqrt(temp);
    }

    public double distance(MyPoint p1, MyPoint p2) {
        double temp = Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2);
        return Math.sqrt(temp);
    }
}
