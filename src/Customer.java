public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer() {
        this.member = false;
    }

    public Customer(String name) {
        this.member = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void display(){
        System.out.println("__________________________");
        System.out.println("\tCustomer");
        System.out.println("Name : " + getName());
        System.out.println("Is a Member : " + isMember());
        System.out.println("Member Type : " + getMemberType());
        System.out.println("__________________________");
    }

    /*public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }*/

    /*public String getName() {
        return name;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public boolean getMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }*/







  /*  @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    } */
}
