package homework;

class CircleIntersector {
    private int x1;
    private int y1;
    private int r1;
    private int x2;
    private int y2;
    private int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    private double getDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    @Override
    public String toString() {
        double sumRadius = r1 + r2;
        double distance = getDistance(x1, y1, x2, y2);
        if(distance <= sumRadius){
            return "intersects";
        }else {
            return "not intersects";
        }
    }

}

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}
