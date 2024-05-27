package JavaPractice01.middle.study.telManager;

import JavaPractice01.middle.study.Library.WrongRegExpException;

import java.util.Objects;

public class Contact implements ContactForm{
    private String name, tel;

    public Contact(String name, String tel) throws WrongRegExpException {
        this.name = name;
        if(isNumberic(tel))
            this.tel = tel;
        else {
            throw new WrongRegExpException("형식에 맞지않습니다." + tel);
        }
    }

    public static boolean isNumberic(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getTel() {
        return this.tel;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTel(String tel) {
        this.tel=tel;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tel);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Contact newContact)
            return this.toString().equals(newContact.toString()) && this.tel.equals(newContact.tel);
        else
            return false;
    }
}
