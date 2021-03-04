package isp.lab3;

import isp.lab3.exercise3.FootballPlayer;
import isp.lab3.exercise4.MyPoint;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void TestToString() {
        MyPoint myPoint = new MyPoint(5, 6, 8);
        String result = myPoint.toString();
        assertEquals("toString should return a string descripion of the instance", "(5,6,8)", result);
    }


    @Test
    public void TestSetXYZ() {
        MyPoint myPoint = new MyPoint();
        myPoint.setXYZ(5, 6, 8);
        assertEquals("x should be 5 ", 5, myPoint.getX());
        assertEquals("y should be", 6, myPoint.getY());
        assertEquals("z should be ", 8, myPoint.getZ());

    }

    @Test
    public void TestDistance() {
        MyPoint myPoint = new MyPoint(1, 2, 3);
        double result = myPoint.distance(5, 6, 8);
        assertEquals("distance should be ", 7.54983443527075, result, 0);

    }

    @Test
    public void TestDistance1() {
        MyPoint point1 = new MyPoint(3, 5, 6);
        MyPoint point2 = new MyPoint(9, 5, 10);
        double result = point1.distance(point2);
        assertEquals("Distance should be 7.211102550927978", 7.211102550927978, result, 0);

    }

    @Test
    public void TestGetX() {
        MyPoint myPoint = new MyPoint();
        int result = myPoint.getX();
        assertEquals("x should be 0 ", 0, result);
    }

    @Test
    public void TestGetY() {
        MyPoint myPoint = new MyPoint();
        int result = myPoint.getY();
        assertEquals("y should be 0 ", 0, result);
    }

    @Test
    public void TestGetZ() {
        MyPoint myPoint = new MyPoint();
        int result = myPoint.getZ();
        assertEquals("z should be 0 ", 0, result);
    }

    @Test
    public void TestSetX() {
        MyPoint myPoint = new MyPoint(1, 2, 3);
        myPoint.setX(4);
        assertEquals("x should be 4", 4, myPoint.getX());
    }

    @Test
    public void TestSetY() {
        MyPoint myPoint = new MyPoint(1, 2, 3);
        myPoint.setY(5);
        assertEquals("y should be 5", 5, myPoint.getY());
    }

    @Test
    public void TestSetZ() {
        MyPoint myPoint = new MyPoint(1, 2, 3);
        myPoint.setZ(6);
        assertEquals("z should be 6", 6, myPoint.getZ());
    }


}