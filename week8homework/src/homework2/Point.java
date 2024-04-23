package homework2;

public class Point {
    int x;
    int y;
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
    public Point(){

    }
     Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        double square=(x*x)+(y*y);
        double dist=Math.sqrt(square);
        return dist;
    }
    public double distance(int x1,int y1){
        double square=((x1-x)*(x1-x))+((y1-y)*(y1-y));
        double dist=Math.sqrt(square);
        return dist;
    }
    public double distance(Point p){
        double square=((p.x-x)*(p.x-x)+(p.y-y)*(p.y*y));
        double dist=Math.sqrt(square);
        return dist;

    }


}
