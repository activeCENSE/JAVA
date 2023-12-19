package JavaPractice01.arrayList.PhoneManager;

public class GirlFriend extends Friend{
    private String firstDay;
    private String birthday;
    public GirlFriend(String name, String phoneNum, String added, String birthday, String firstDay){
        super(name, phoneNum, added);
        this.birthday = birthday;
        this.firstDay = firstDay;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay){
        this.firstDay = firstDay;
    }
}
