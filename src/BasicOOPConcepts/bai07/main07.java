package BasicOOPConcepts.bai07;

public class main07 {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        ps1.nhap();
        PhanSo ps2 = new PhanSo();
        ps2.nhap();

        PhanSo tong = ps1.cong(ps2);
        System.out.print("Tổng của 2 phân số là: ");
        tong.hien();
        System.out.println();
        PhanSo hieu = ps1.tru(ps2);
        System.out.print("Hiệu của 2 phân số là: ");
        hieu.hien();
        System.out.println();
        PhanSo tich = ps1.nhan(ps2);
        System.out.print("Tích của 2 phân số là: ");
        tich.hien();
        System.out.println();
        if (ps2.getTs() == 0) {
            System.out.println("Không thể chia cho phân số có tử số bằng không!");
        } else {
            PhanSo thuong = ps1.chia(ps2);
            System.out.print("Thương của 2 phân số là: ");
            thuong.hien();
            System.out.println();
        }

        PhanSo psToiGian = ps1.toiGian();
        System.out.print("Phân số tối giản của phân số là: ");
        psToiGian.hien();
        System.out.println();

        if (ps1.bangNhau(ps2)) {
            System.out.println("Hai phân số bằng nhau");
        } else if (ps1.lonHon(ps2)) {
            System.out.print("Phân số ");
            ps1.hien();
            System.out.print(" lớn hơn phân số ");
            ps2.hien();
            System.out.println();
        } else {
            System.out.print("Phân số ");
            ps1.hien();
            System.out.print(" nhỏ hơn phân số ");
            ps2.hien();
            System.out.println();
        }


    }
}
