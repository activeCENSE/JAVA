package JavaPractice01.Work;

public class Figure {
    private double length, width, height, side, area, cf;
    private final String figure;

    public Figure(String figure){
        this.figure = figure;
    }

    public void setLength(double x1, double x2, double y1, double y2){
        this.length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public double getLength(){
        return this.length;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    public void setArea(){
        if(figure.equals("삼각형")){
            double s = getCircumference()/2;
            this.area = Math.sqrt(s * (s-width) * (s-height) * (s-side));

        } else if(figure.equals("원형")) {
            double r = this.length/2;
            this.area = r * r * Math.PI;

        } else
            this.area = this.width * this.height;
    }

    public double getArea(){
        return this.area;
    }

    public void setCircumference(){
        if(figure.equals("삼각형")){
            this.cf = this.width + this.height + this.side;

        } else if(figure.equals("원형")) {
            double r = this.length;
            this.cf = r * Math.PI;

        } else
            this.cf = (this.width + this.height)*2;
    }

    public double getCircumference(){
        return this.cf;
    }
}
