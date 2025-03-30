package bai2.company;

import bai2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person ps1 = new Person("Thu", 26, "Nữ", "Thủ Đức", "0123456788");
        System.out.println("Name = " + ps1.name);
        System.out.println("Age = "+ ps1.age);
        System.out.println("Gender = " + ps1.gender);
       // System.out.println("Address = "+ ps1.addess); => can not call address, phone var as req
        System.out.println("===================================");
        ps1.getInfoPerson1();
    }
}
