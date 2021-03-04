package isp.lab3.exercise2;

public class Rectangle {
    private int length, width;
    private String color;

    public Rectangle() {
        this.length = 2;
        this.width = 1;
        this.color = "red";
    }

    /**
     * Overloaded constructor which sets the length and the width;
     *
     * @param length is the length of rectangle
     * @param width  is the width of rectangle
     */


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * This is a overloaded constructor which sets the length, the width and the colors;
     *
     * @param length is the length of rectangle
     * @param width  is the width of rectangle
     * @param color  is the color of rectangle
     */

    public Rectangle(int length, int width, String color) {
        this(length, width);
        this.color = color;
    }

    /**
     * should get the length of rectangle and return.
     * @return the length.
     */
    public int getLength() {
        return this.length;

    }

    /**
     * Should get the width of rectangle and return.
     * @return the width of rectangle.
     */


    public int getWidth() {
        return this.width;

    }

    /**
     * This method should get the color of rectangle and return.
     * @return the color of rectangle.
     */


    public String getColor() {
        return this.color;

    }

    /**
     * This method should calculate perimeter and return.
     * @return the perimeter of rectangle
     */


    public int getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    /**
     * @return the area of rectangle.
     */


    public int getArea() {
        return this.length * this.width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 5, "blue");

        int length = rectangle.getLength();
        int width = rectangle.getWidth();
        String color = rectangle.getColor();
        int perimeter = rectangle.getPerimeter();
        int area = rectangle.getArea();

        System.out.println("The length of rectangle is: " + length);
        System.out.println("The width of rectangle is: " + width);
        System.out.println("The color of rectangle is: " + color);
        System.out.println("The perimeter of rectangle is: " + perimeter);
        System.out.println("The area of rectangle is: " + area);

    }

}
