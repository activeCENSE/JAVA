package JavaPractice01.arrayList.PhoneManager;

public class ClosestFriend extends Friend {
    private String birthday;
    public ClosestFriend(String name, String phoneNum, String added, String birthday){
        super(name, phoneNum, added);
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}

