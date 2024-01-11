package JavaPractice01.db;

import java.io.*;
import java.sql.*;
import java.util.Vector;

public class JDBCTest12 {
    static BufferedWriter bwr;
    static Vector<String> lines = new Vector<>();
    static public void fileWrite() throws IOException {
        bwr = new BufferedWriter(new FileWriter("studentdb.txt"));
        for(String str : lines){
            bwr.write(str);
            bwr.newLine();
        }
        bwr.close();
    }
    public static void main(String[] args) throws IOException {
        Connection conn;
        String url="jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
        String id="root";
        String pwd="asdf4528";

        Statement stmt;
        ResultSet result;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("db 연결 성공");
            stmt = conn.createStatement();
            result = stmt.executeQuery("select * from student");

            while(result.next()){
                String hakbun = result.getInt(1) + "/";
                String name = result.getString("name") + "/";
                String dept = result.getString("dept") + "/";
                String score = result.getInt(4) + "/";
                String grade = result.getInt("grade") + "/";
                System.out.println(hakbun+name+dept+score+grade);
                lines.add(hakbun+name+dept+score+grade);
            }

            fileWrite();

            result.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e){
            System.out.println("드라이버 로드중 에러");
        } catch (SQLException e) {
            System.out.println("삽입 실패");
            System.out.println("연결 오류");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
