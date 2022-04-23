package BasicOOPConcepts.bai03;

import java.util.Scanner;

public class main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin của hình chữ nhật:");
        System.out.print("Mời bạn nhập vào chiều rộng của hcn: ");
        double width = scanner.nextDouble();
        System.out.print("Mời bạn nhập vào chiều cao của hcn: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Mời bạn nhập vào màu của hcn: ");
        String color = scanner.nextLine();

        Rectangle hcn = new Rectangle(width, height, color);
        System.out.println(hcn);
    }


}
