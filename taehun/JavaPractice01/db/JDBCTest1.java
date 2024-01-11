package JavaPractice01.db;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn;
        String url="jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
        String id="root";
        String pwd="asdf4528";

        Statement stmt;
        ResultSet result;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("db 연결 성공");

            stmt = conn.createStatement();
//            stmt.executeUpdate("insert into student values(2024121234, '노가을', 'it', 90, 2)");
//            stmt.executeUpdate("insert into student values(2024121235, '강호동', 'it', 80, 3)");
//            stmt.executeUpdate("insert into student values(2024121236, '홍길동', 'design', 90, 2)");
//            stmt.executeUpdate("insert into student values(2024121237, '임꺽정', 'design', 80, 2)");

            System.out.print("학번 : ");
            int ihakbun = Integer.parseInt(sc.nextLine());
            System.out.print("이름 : ");
            String iname = sc.nextLine();
            System.out.print("소속학과 : ");
            String idept = sc.nextLine();
            System.out.print("점수 : ");
            int iscore = Integer.parseInt(sc.nextLine());
            System.out.print("학년 : ");
            int igrade = Integer.parseInt(sc.nextLine());

            String sql="insert into student values(" + ihakbun +",'"+iname+"','"+idept+"',"+iscore+","+igrade+")";
            stmt.executeUpdate(sql);

            result = stmt.executeQuery("select * from student");

            while(result.next()){
                int hakbun = result.getInt(1);
                String name = result.getString("name");
                String dept = result.getString("dept");
                int score = result.getInt(4);
                int grade = result.getInt("grade");
                System.out.println(hakbun+" "+name+" "+dept+" "+score+" "+grade);
            }
            result.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e){
            System.out.println("드라이버 로드중 에러");
        } catch (SQLException e) {
            System.out.println("삽입 실패");
            System.out.println("연결 오류");
        }
        
    }
}
