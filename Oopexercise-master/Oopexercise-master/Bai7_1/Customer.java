package Bai7_1;
public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;
    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public boolean isMember(){
        return  member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
        this.member = true;
    }
    public String toString(){
        return "Customer["+name+","+member+","+memberType+"]";
    }
}

