package JavaPractice01.javapractice;

public class Member {
    public String id;
    public Member(String id){
        this.id = id;
    }
    public boolean equals(Object obj){
        if(obj instanceof Member temp){
            return this.id.equals(temp.id);
        }
        return false;
    }
    @Override
    public int hashCode(){ //문자열인 경우, hashCode를 오버라이딩하여 한번 더 돌려줘야함
        return id.hashCode();
    }
}
