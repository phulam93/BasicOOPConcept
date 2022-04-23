package BasicOOPConcepts.bai04;

import java.util.Scanner;

public class main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số điểm trong tọa độ: ");
        int n = sc.nextInt();
        MyPoint[] POINTS = new MyPoint[n];

        inputPoint(POINTS);
        timKCMax(POINTS);
    }

    public static void inputPoint(MyPoint[] POINTS) {
        Scanner sc = new Scanner(System.in);
        int n = POINTS.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Mời nhập vào tạo độ x của điểm " + (i + 1) + " : ");
            double x = sc.nextDouble();
            System.out.print("Mời nhập vào tạo độ y của điểm " + (i + 1) + " : ");
            double y = sc.nextDouble();
            POINTS[i] = new MyPoint(x, y);
        }
    }

    public static void timKCMax(MyPoint[] POINTS) {
        int n = POINTS.length;
        ;
        double tempKC = 0;
        double x1max = POINTS[0].getX();
        double y1max = POINTS[0].getY();
        double x2max = POINTS[0].getX();
        double y2max = POINTS[0].getY();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                double temp = POINTS[i].distance(POINTS[j]);
                if (temp > tempKC) {
                    tempKC = temp;
                    x1max = POINTS[i].getX();
                    y1max = POINTS[i].getY();
                    x2max = POINTS[j].getX();
                    y2max = POINTS[j].getY();
                }
            }
        }
        System.out.println("Hai điểm có khoảng cách lớn nhất là: {" + x1max + ", " + y1max + "} và {" +
                x2max + ", " + y2max + "}, và khoảng cách đó là: " + tempKC);
    }
}
