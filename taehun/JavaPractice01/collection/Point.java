package JavaPractice01.collection;

public class Point {
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Point t = (Point)obj;
        return x == t.x && y == t.y;
    }
}
