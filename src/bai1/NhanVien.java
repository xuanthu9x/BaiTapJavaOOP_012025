package bai1;

public class NhanVien {
    private String name = "Trieu";
    private int age = 26;
    private String manv = "152250236";

    public NhanVien() {
    }


    public NhanVien(String name, int age, String manv) {
        this.name = name;
        this.age = age;
        this.manv = manv;
    }

    public void getThongTin() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ma nhan vien: " + manv);
    }

    public static void main(String[] args) {
         NhanVien nv = new NhanVien("Thư", 26,"152250236");
         nv.getThongTin();
         NhanVien nv1 = new NhanVien();
        System.out.println("===========================");
        nv1.getThongTin();
    }
}
