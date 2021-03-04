package isp.lab3;

import isp.lab3.exercise2.Rectangle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRectangle {
    @Test
    public void TestGetLength() {
        //when
        Rectangle rectangle = new Rectangle();
        int result = rectangle.getLength();

        //then
        assertEquals("Default length should be 2", 2, result);
    }

    @Test
    public void TestGetWidth() {
        //when
        Rectangle rectangle = new Rectangle();
        int result = rectangle.getWidth();

        //then
        assertEquals("Default width should be 1", 1, result);
    }

    @Test
    public void TestGetColor() {
        //when
        Rectangle rectangle = new Rectangle();
        String result = rectangle.getColor();

        //then
        assertEquals("Default colors should be red", "red", result);
    }

    @Test
    public void TestGetPerimeter() {
        //when
        Rectangle rectangle = new Rectangle();
        int result = rectangle.getPerimeter();

        //then
        assertEquals("Default perimeter should be 6", 6, result);
    }

    @Test
    public void TestGetArea() {
        //when
        Rectangle rectangle = new Rectangle();

        int result = rectangle.getArea();

        //then
        assertEquals("Default area should be 2", 2, result);
    }

    @Test
    public void TestOverloadedConstructor1() {
        Rectangle rectangle = new Rectangle(6, 3);

        int length = rectangle.getLength();
        int width = rectangle.getWidth();

        assertEquals("Default length should be 6", 6, length);
        assertEquals("Default width should be 3", 3, width);

    }

    @Test
    public void TestOverloadedConstructor2() {
        Rectangle rectangle = new Rectangle(8, 5, "orange");

        int length = rectangle.getLength();
        int width = rectangle.getWidth();
        String color = rectangle.getColor();

        assertEquals("Default length should be 8", 8, length);
        assertEquals("Default width should be 5", 5, width);
        assertEquals("Default color should be 'orange'", "orange", color);

    }

    @Test
    public void TestDefaultConstructor() {
        Rectangle rectangle = new Rectangle();

        int length = rectangle.getLength();
        int width = rectangle.getWidth();
        String color = rectangle.getColor();

        assertEquals("Default length should be 2", 2, length);
        assertEquals("Default width should be 1", 1, width);
        assertEquals("Default color should be 'red'", "red", color);
    }


}
