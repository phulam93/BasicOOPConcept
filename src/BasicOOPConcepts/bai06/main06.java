package BasicOOPConcepts.bai06;

import java.util.Scanner;

public class main06 {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int functionChoice = functionChoice();

            switch (functionChoice) {
                case 1:
                    tinhTongvaHieuMatrix();
                    break;
                case 2:
                    tinhTich2Matrix();
                    break;
                case 3:
                    timMatrixChuyenVi();
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    return;
            }
        }
    }

    public static int functionChoice() {
        int i = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chương trình tính toán với Matrix");
            System.out.println("+++++++++++++++++++++++++++++++++");
            System.out.println("1. Tính tổng và hiệu hai ma trận.");
            System.out.println("2. Tính tích hai ma trận.");
            System.out.println("3. Tìm chuyển vị của ma trận.");
            System.out.println("4. Kết thúc chương trình");
            System.out.println("Mời bạn chọn chức năng: ");
            i = scanner.nextInt();
            if (i < 1 || i > 4) {
                System.out.println("Xin mời chọn lại!");
            }
        }
        while (i < 1 || i > 4);
        return i;
    }

    public static void tinhTongvaHieuMatrix() {
        System.out.println("Mời bạn nhập vào số hàng của ma trận thứ nhất: ");
        int rows1 = new Scanner(System.in).nextInt();
        System.out.println("Mời bạn nhập vào số cột của ma trận thứ nhất: ");
        int cols1 = new Scanner(System.in).nextInt();
        Matrix matrix1 = new Matrix(rows1, cols1);
        matrix1.input();
        boolean flag = true;
        int rows2, cols2;
        do {
            System.out.println("Mời bạn nhập vào số hàng của ma trận thứ hai: ");
            rows2 = new Scanner(System.in).nextInt();
            System.out.println("Mời bạn nhập vào số cột của ma trận thứ hai: ");
            cols2 = new Scanner(System.in).nextInt();
            if (rows1 == rows2 && cols1 == cols2) {
                flag = false;
            }
        }
        while (flag);
        Matrix matrix2 = new Matrix(rows2, cols2);
        matrix2.input();
        Matrix matrixAdd = matrix1.add(matrix2);
        System.out.println("Ma trận tổng là: ");
        matrixAdd.print();
        Matrix matrixSub = matrix1.sub(matrix2);
        System.out.println("Ma trận hiệu là: ");
        matrixSub.print();
    }

    public static void tinhTich2Matrix() {
        System.out.println("Mời bạn nhập vào số hàng của ma trận thứ nhất: ");
        int rows1 = new Scanner(System.in).nextInt();
        System.out.println("Mời bạn nhập vào số cột của ma trận thứ nhất: ");
        int cols1 = new Scanner(System.in).nextInt();
        Matrix matrix1 = new Matrix(rows1, cols1);
        matrix1.input();
        boolean flag = true;
        int rows2, cols2;
        do {
            System.out.println("Mời bạn nhập vào số hàng của ma trận thứ hai: ");
            rows2 = new Scanner(System.in).nextInt();
            System.out.println("Mời bạn nhập vào số cột của ma trận thứ hai: ");
            cols2 = new Scanner(System.in).nextInt();
            if (cols1 == rows2) {
                flag = false;
            }
        }
        while (flag);
        Matrix matrix2 = new Matrix(rows2, cols2);
        matrix2.input();
        Matrix matrixMul = matrix1.mul(matrix2);
        System.out.println("Ma trận tích là: ");
        matrixMul.print();
    }

    public static void timMatrixChuyenVi() {
        System.out.println("Mời bạn nhập vào số hàng của ma trận thứ nhất: ");
        int rows1 = new Scanner(System.in).nextInt();
        System.out.println("Mời bạn nhập vào số cột của ma trận thứ nhất: ");
        int cols1 = new Scanner(System.in).nextInt();
        Matrix matrix1 = new Matrix(rows1, cols1);
        matrix1.input();
        Matrix matrixTranspose = matrix1.transpose();
        System.out.println("Ma trận có ma trận chuyển vị là: ");
        matrixTranspose.print();
    }
}
