
package main.pkg4;


public class employee {
    String name ;
    String emailadd;
    String phone;
    String dept;
    String address;
    int yearofbirth;
    public employee(){
        System.out.println("no parameter constractor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailadd() {
        return emailadd;
    }

    public void setEmailadd(String emailadd) {
        this.emailadd = emailadd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public employee(String name, String emailadd, String phone, String dept, String address, int yearofbirth) {
        this.name = name;
        this.emailadd = emailadd;
        this.phone = phone;
        this.dept = dept;
        this.address = address;
        this.yearofbirth = yearofbirth;
    }
    
}
