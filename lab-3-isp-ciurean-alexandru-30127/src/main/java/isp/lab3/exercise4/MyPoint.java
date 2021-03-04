package isp.lab3.exercise4;

public class MyPoint {
    private int x;
    private int y;
    private int z;

    /**
     * This is a "no-argument" constructor that construct a point
     */
    public MyPoint() {
        this(0, 0, 0);
    }

    /**
     * This is a constructor that constructs a point with the given x,y and z coordinates
     *
     * @param x is the first coordinate
     * @param y is the second coordinate
     * @param z is the third coordinate
     */

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * This method should set the value of x
     *
     * @param x
     */

    public void setX(int x) {
        this.x = x;
    }

    /**
     * This method should get the value of x
     *
     * @return x
     */

    public int getX() {
        return x;
    }

    /**
     * This methot should set the value of y.
     *
     * @param y
     */

    public void setY(int y) {
        this.y = y;
    }

    /**
     * This method should get the value of y
     *
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * This method should set the value of z.
     *
     * @param z
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * This method should get the value of z
     *
     * @return z
     */
    public int getZ() {
        return z;
    }

    /**
     * This method should set the value of XYZ
     *
     * @param x
     * @param y
     * @param z
     */
    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * This is a toString method
     *
     * @return a string description of the instance
     */

    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

    /**
     * @param x
     * @param y
     * @param z
     * @return the distance from this point to another point at the given (x,y,z) coordinates
     */
    public double distance(int x, int y, int z) {
        int x1 = this.x;
        int y1 = this.y;
        int z1 = this.z;
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1) + (z - z1) * (z - z1));

    }

    /**
     * This is a overloaded distance method
     *
     * @param point
     * @return the distance from this point to the given MyPoint instance
     */

    public double distance(MyPoint point) {
        int x2 = this.x;
        int y2 = this.y;
        int z2 = this.z;
        int x1 = point.getX();
        int y1 = point.getY();
        int z1 = point.getZ();
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 5, 6);
        MyPoint point2 = new MyPoint(9, 5, 10);
        double distance = point1.distance(point2);
        System.out.println("Distance between point 1" + point1.toString() + "and point 2" + point2.toString() + "=" + distance);
    }

}
