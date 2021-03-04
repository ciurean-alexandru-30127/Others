package isp.lab3;

import isp.lab3.exercise5.VendingMachine;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    @Test
    public void testDisplayProducts() {

        VendingMachine vendingMachine = new VendingMachine();


        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        vendingMachine.displayProducts();
        assertEquals("Id: 0 Product: Ciocolata\n" +
                "Id: 1 Product: Prajitura\n" +
                "Id: 2 Product: Cola\n" +
                "Id: 3 Product: Fanta\n" +
                "Id: 4 Product: Sprite\n", outContent.toString());

    }

    @Test
    public void testInsertCoin() {
        VendingMachine vendingMachine = new VendingMachine();


        vendingMachine.insertCoin(12);

        assertEquals(12, vendingMachine.getCoin());
    }

    @Test
    public void testSelectProduct() {
        VendingMachine vendingMachine = new VendingMachine();
        String product = vendingMachine.selectProduct(2);
        assertEquals("Cola", product);

    }


}


