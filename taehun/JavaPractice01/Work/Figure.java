package JavaPractice01.Work;

public class Figure {
    private double x1, x2, y1, y2, width, height, side, area, ference;
    private String figure;

    public Figure(double x1, double x2, double y1, double y2, String figure){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.figure = figure;
    }

    public double setLength(double pointA, double pointB){
        return Math.sqrt(Math.pow(pointB - pointA, 2) + Math.pow(pointB - pointA, 2));
    }

    public double setArea(){
        if(figure.equals("삼각형")){
            this.area = (this.width * this.height)/2;

        } else if(figure.equals("원형")) {
            double r = this.width/2;
            this.area = r * r * Math.PI;

        } else
            this.area = this.width * this.height;

        return this.area;
    }

    public double setFerence(){
        if(figure.equals("삼각형")){
            this.ference = this.width + this.height + this.side;

        } else if(figure.equals("원형")) {
            double r = this.width;
            this.ference = r * Math.PI;

        } else
            this.ference = (this.width + this.height)*2;

        return this.ference;
    }

    public void getArea(){
        System.out.println(figure+"의 넓이는 "+area+"입니다.");
    }

    public void getCirCumference(){
        System.out.println(figure+"의 둘레는 "+ference+"입니다.");
    }
}
