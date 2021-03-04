package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    @Test
    public void testGrow() {
        //having
        Tree tree = new Tree();

        //when
        tree.grow(2);

        //then
        assertEquals("Height should be ", 17, tree.getHeight());

    }

    @Test
    public void testToString() {
        //given
        Tree tree = new Tree();

        //when
        String result = tree.toString();

        //then
        assertEquals("toString should return '15'", "15", result);
    }

    @Test
    public void testDefaultConstructor() {
        //when
        Tree tree = new Tree();
        int result = tree.getHeight();

        //then
        assertEquals("Default height should be 15", 15, result);

    }


}
