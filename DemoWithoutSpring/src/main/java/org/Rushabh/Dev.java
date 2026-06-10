package org.Rushabh;



public class Dev {
 private int age;
 private Laptop laptop;

    public Dev(){
        System.out.println("LOLOLOLO");
    }
    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Constructor-lap Args");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        laptop.build();
        //System.out.print("Hellew Backend Development");
    }
}
