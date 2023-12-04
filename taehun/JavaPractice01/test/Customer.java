package JavaPractice01.test;

public class Customer {
    private final String name;
    private final String id;
    private final String addr;
    static int male;
    static int female;
    static int young;
    public Customer(String name, String id, String addr) {
        super();
        this.name = name;
        this.id = id;
        this.addr = addr;
    }
    public void setGender(){
        char genderNum = this.id.charAt(7);
        if(genderNum == '1' || genderNum == '3'){
            male++;
        }
        else {
            female++;
        }
    }
    public void setYoung(){
        char genderNum = this.id.charAt(7);
        if(genderNum == '3' || genderNum == '4'){
            young++;
        }
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getAddress(){
        return this.addr;
    }
    public void getFullInfo(){
        System.out.println(getName()+"/"+getId()+"/"+getAddress());
    }


}
