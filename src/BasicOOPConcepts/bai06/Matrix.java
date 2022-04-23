package BasicOOPConcepts.bai06;

import java.util.Scanner;

public class Matrix {

    private float[][] a;

    public Matrix() {
        a = new float[3][3];
    }

    public Matrix(int rows, int cols) {
        a = new float[rows][cols];
    }

    public Matrix add(Matrix m) {
        Matrix matrixAdd = new Matrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                matrixAdd.a[i][j] = this.a[i][j] + m.a[i][j];
            }
        }
        return matrixAdd;
    }

    public Matrix sub(Matrix m) {
        Matrix matrixSub = new Matrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                matrixSub.a[i][j] = this.a[i][j] - m.a[i][j];
            }
        }
        return matrixSub;
    }

    public Matrix neg() {
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                this.a[i][j] = -this.a[i][j];
            }
        }
        return this;
    }

    public Matrix transpose() {
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                this.a[i][j] = this.a[j][i];
            }
        }
        return this;
    }

    public Matrix mul(Matrix m) {
        Matrix kq = new Matrix(this.a.length, m.a[0].length);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                for (int k = 0; k < this.a[0].length; k++) {
                    kq.a[i][j] += this.a[i][k] * m.a[k][j];
                }
            }
        }
        return kq;
    }

    public void print() {
        System.out.println("Matrix: ");
        for (int i = 0; i < this.a.length; i++) {

            for (int j = 0; j < this.a[0].length; j++) {

                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                System.out.println("Nhập vào giá trị của ma trận ở vị trí " + (i + 1) + ", " + (j + 1) + ": ");
                this.a[i][j] = scanner.nextFloat();
            }
        }
    }
}
