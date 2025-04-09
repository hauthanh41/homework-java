package Bai2_5;

public class Customer {
    public int id;
    public String name;
    public char gender;
    public Customer(int id,String name){
        this.id=id;
        this.name = name;

    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name +"("+id+")";
    }
}
