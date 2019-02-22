/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import konversi.FungsiBiner;

/**
 *
 * @author Firsta
 */
public class ConversionTest {
    
    public ConversionTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void  binerTest() 
    {
        String exp ="10100";
        String act =FungsiBiner.Biner(20);
        assertEquals(exp, act);
    }
    
    public void  binerTest() 
    {
        String exp ="10100";
        String act =FungsiBiner.Biner(20);
        assertEquals(exp, act);
    }
    
    @Test
    public void oktalTest()
    {
        String exp ="346";
        String act =FungsiBiner.Oktal(230);
        assertEquals(exp, act);
    }
    
    @Test
    public void hexaTest()
    {
        String exp ="1E";
        String act =FungsiBiner.Hexa(30);
        assertEquals(exp, act);
    }
    
    @Test
    public void  binToDec ()
    {
        int exp = 20;
        int act = FungsiBiner.binToDec("10100");
        assertEquals(exp, act);
    }
    
    @Test 
    public void oktalToDec ()
    {
        int exp =230;
        int act = FungsiBiner.oktalToDec("346");
        assertEquals(exp, act);
    }
    
    @Test
    public void hexaToDec ()
    {
        int exp =30;
        int act = FungsiBiner.hexToDec("1E");
        assertEquals(exp, act);
    }
}
