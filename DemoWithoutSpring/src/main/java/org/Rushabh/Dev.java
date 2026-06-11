package org.Rushabh;



public class Dev {
 //private int age;
 private Computer comp;

    public Dev(){
        System.out.println("LOLOLOLO");
    }
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Constructor-lap Args");
//    }
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }





    public void build(){
        comp.compile();
        //System.out.print("Hellew Backend Development");
    }
}
