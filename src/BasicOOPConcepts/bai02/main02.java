package BasicOOPConcepts.bai02;

import BasicOOPConcepts.bai01.SinhVien;

import java.util.Scanner;

public class main02 {

    public static void main(String[] args) {
        System.out.print("Nhập vào số sinh viên cần thêm: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        SinhVien[] SINHVIEN = nhapDanhSach(n);
        inDanhSach(SINHVIEN);
        System.out.println("=======================");

        sortByName(SINHVIEN);
        inDanhSach(SINHVIEN);
        System.out.println("=======================");

        inDanhSachTheoLop(SINHVIEN);

    }

    public static SinhVien[] nhapDanhSach(int n) {
        SinhVien[] SINHVIEN = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1));
            SINHVIEN[i] = new SinhVien();
            SINHVIEN[i].nhapThongTin();
        }
        return SINHVIEN;
    }

    public static void inDanhSach(SinhVien[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].inThongTin();
        }
    }

    public static void sortByName(SinhVien[] SINHVIEN) {
        int n = SINHVIEN.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (SINHVIEN[i].getName().compareTo(SINHVIEN[j].getName()) > 0) {
                    SinhVien temp = SINHVIEN[i];
                    SINHVIEN[i] = SINHVIEN[j];
                    SINHVIEN[j] = temp;
                }
            }
        }
    }

    public static void inDanhSachTheoLop(SinhVien[] SINHVIEN) {
        int n = SINHVIEN.length;
        String[] manyOfGRADE = new String[n];
        manyOfGRADE[0] = SINHVIEN[0].getGrade();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (manyOfGRADE[j] == null) {
                    continue;
                }
                if (!SINHVIEN[i].getGrade().equals(manyOfGRADE[j])) {
                    manyOfGRADE[count + 1] = SINHVIEN[i].getGrade();
                    count++;
                }
            }
        }

        for (int i = 0; i < manyOfGRADE.length; i++) {
            if (manyOfGRADE[i] != null) {
                System.out.println("Sinh viên của lớp " + manyOfGRADE[i] + " là: ");
                for (int j = 0; j < SINHVIEN.length; j++) {
                    if (SINHVIEN[j].getGrade().equals(manyOfGRADE[i]))
                        SINHVIEN[j].inThongTin();
                }
            }
        }
    }
}
