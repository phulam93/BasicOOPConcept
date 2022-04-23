package BasicOOPConcepts.bai07;

import java.util.Scanner;

public class PhanSo {
    private int ts;
    private int ms;

    public int getTs() {
        return ts;
    }

    public PhanSo() {
        this.ts = 0;
        this.ms = 1;
    }

    public PhanSo(int ts, int ms) {
        this.ts = ts;
        this.ms = ms;
    }

    public PhanSo cong(PhanSo ps2) {
        PhanSo kq = new PhanSo();
        kq.ts = this.ts * ps2.ms + this.ms * ps2.ts;
        kq.ms = this.ms * ps2.ms;
        return kq;
    }

    public PhanSo tru(PhanSo ps2) {
        PhanSo kq = new PhanSo();
        kq.ts = this.ts * ps2.ms - this.ms * ps2.ts;
        kq.ms = this.ms * ps2.ms;
        return kq;
    }

    public PhanSo nhan(PhanSo ps2) {
        PhanSo kq = new PhanSo();
        kq.ts = this.ts * ps2.ts;
        kq.ms = this.ms * ps2.ms;
        return kq;
    }

    public PhanSo chia(PhanSo ps2) {
        PhanSo kq = new PhanSo();
        kq.ts = this.ts * ps2.ms;
        if (ps2.ts == 0) {

        }
        kq.ms = this.ms * ps2.ts;
        return kq;
    }

    public PhanSo nghichDao() {
        PhanSo kq = new PhanSo();
        kq.ts = this.ms;
        kq.ms = this.ts;
        return kq;
    }

    public PhanSo doiDau() {
        PhanSo kq = new PhanSo();
        kq.ts = -this.ts;
        kq.ms = this.ms;
        return kq;
    }

    public PhanSo toiGian() {
        int a = Math.abs(this.ms);
        int b = Math.abs(this.ts);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        this.ts = this.ts / a;
        this.ms = this.ms / a;
        return this;
    }

    public boolean bangNhau(PhanSo ps2) {
        return this.ts * ps2.ms == this.ms * ps2.ts;
    }

    public boolean lonHon(PhanSo ps2) {
        return this.ts * ps2.ms > this.ms * ps2.ts;
    }

    public boolean nhoHon(PhanSo ps2) {
        return this.ts * ps2.ms < this.ms * ps2.ts;
    }

    public void hien() {
        if (this.ts * this.ms >= 0) {
            System.out.print(Math.abs(this.ts) + " / " + Math.abs(this.ms));
        } else {
            System.out.print("-" + Math.abs(this.ts) + " / " + Math.abs(this.ms));
        }
    }

    public void nhap() {
        System.out.print("Mời bạn nhập vào tử số của phân số: ");
        this.ts = new Scanner(System.in).nextInt();
        do {
            System.out.print("Mời bạn nhập vào mẫu số của phân số: ");
            this.ms = new Scanner(System.in).nextInt();
            if (this.ms == 0) {
                System.out.println("Mẫu số của một phân số phải khác không, mời nhập lại.");
            }
        }
        while (this.ms == 0);
    }
}
