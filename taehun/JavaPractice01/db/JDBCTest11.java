package JavaPractice01.db;

import java.io.*;
import java.sql.*;
import java.util.Vector;


public class JDBCTest11 {

    static BufferedReader br;
    static Vector<String> readLines = new Vector<>();


    public static void fileReader() throws IOException {
        try {
            br = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                readLines.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

            fileReader();
            for (String str : readLines) {
                String[] fieldData = str.split("/");
                int ihakbun = fieldData[0] != null ? Integer.parseInt(fieldData[0]) : 0;
                String iname = fieldData[1] != null ? fieldData[1] : Integer.toString(0);
                String idept = fieldData[2] != null ? fieldData[2] : Integer.toString(0);
                int iscore = fieldData[3] != null ? Integer.parseInt(fieldData[3]) : 0;
                int igrade = fieldData[4] != null ? Integer.parseInt(fieldData[4]) : 0;
                String sql="insert into student values(" + ihakbun +",'"+iname+"','"+idept+"',"+iscore+","+igrade+")";
                stmt.executeUpdate(sql);
            }
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
        } catch (IOException e) {
        e.printStackTrace();
        }

    }
}
