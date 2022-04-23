package BasicOOPConcepts.bai01;

import java.util.Scanner;

public class SinhVien {

    private int maSV;
    private String name;
    private String grade;
    private int course;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public SinhVien() {

    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", course=" + course +
                '}';
    }

    public void inThongTin() {
        System.out.println("Sinh viên có thông tin:\n" +
                "Mã sinh viên: " + this.maSV + "\n" +
                "Họ và tên: " + this.name + "\n" +
                "Lớp: " + this.grade + "\n" +
                "Khóa: " + this.course);
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        int maSV = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập lớp sinh viên: ");
        String grade = sc.nextLine();
        System.out.print("Nhập khóa sinh viên: ");
        int course = sc.nextInt();
        setMaSV(maSV);
        setName(name);
        setGrade(grade);
        setCourse(course);
    }
}
