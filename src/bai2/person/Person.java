package bai2.person;

public class Person {
    //+ Tạo class "Person" với các thông tin: name, age, gender, address, phone
    public String name = "Linh";
    public int age = 15;
    public String gender = "Nữ";
    String address = "Phú Nhuận";
    String phone = "0123456787";
    //+ Hàm xây dựng và hàm get tương ứng để giải quyết bài toán theo yêu cầu

    public Person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    void getInfoPerson(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Gender: "+ this.gender);
        System.out.println("Address: "+ this.address);
        System.out.println("Phone: "+ this.phone);
    }
    public void getInfoPerson1(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Gender: "+ this.gender);
        System.out.println("Address: "+ this.address);
        System.out.println("Phone: "+ this.phone);
    }
}
