package BasicOOPConcepts.bai05;

import BasicOOPConcepts.bai04.MyPoint;

import java.util.Scanner;

public class main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào ba điểm trong tọa độ: ");

        MyPoint[] POINTS = new MyPoint[3];
        inputPoint(POINTS);
        System.out.println("Ba điểm nhập vào tạo thành: ");
        checkTamGiac(POINTS);
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

    public static void checkTamGiac(MyPoint[] POINTS) {
        double a = POINTS[0].distance(POINTS[1]);
        double b = POINTS[0].distance(POINTS[2]);
        double c = POINTS[1].distance(POINTS[2]);

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            if ((a == b) & (b == c)) {
                System.out.println("Tam giác đều");
            } else if ((a == b) || (b == c) || (a == c)) {
                if ((Math.abs(a * a + b * b - c * c) == 0) || (Math.abs(a * a - b * b + c * c) == 0) || (Math.abs(-a * a + b * b + c * c) == 0)) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác cân");
                }
            } else if ((Math.abs(a * a + b * b - c * c) == 0) || (Math.abs(a * a - b * b + c * c) == 0) || (Math.abs(-a * a + b * b + c * c) == 0)) {
                System.out.println("Tam giác vuông");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không phải là tam giác");
        }
    }
}
