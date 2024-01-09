package JavaPractice01.StreamTests.ObjectStream;

import java.io.Serializable;

class Box implements Serializable {
    public int width;
    public int height;
    public int depth;
    public Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
}
