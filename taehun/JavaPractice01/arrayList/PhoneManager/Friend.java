package JavaPractice01.arrayList.PhoneManager;

public class Friend {
    private String name;
    private String phoneNum;

    private String addedDay;
    public Friend(String name, String phoneNum, String addedDay){
        this.name = name;
        this.phoneNum = phoneNum;
        this.addedDay = addedDay;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddedDay() {
        return addedDay;
    }

    public void setAddedDay(String addedDay){
        this.addedDay = addedDay;
    }
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
