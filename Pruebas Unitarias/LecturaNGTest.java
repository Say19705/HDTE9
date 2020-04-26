/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mai;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Diego Alvarez
 */
public class LecturaNGTest {
    
    public LecturaNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of keys method, of class Lectura.
     */
    @Test
    public void testKeys() {
        System.out.println("keys");
        ArrayList<String> Strings = null;
        Lectura instance = new Lectura();
        List expResult = null;
        List result = instance.keys(Strings);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of value method, of class Lectura.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        ArrayList<String> Strings = null;
        Lectura instance = new Lectura();
        List expResult = null;
        List result = instance.value(Strings);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dicc method, of class Lectura.
     */
    @Test
    public void testDicc() {
        System.out.println("dicc");
        List<String> lista3 = null;
        List<String> lista4 = null;
        int ref = 0;
        Lectura instance = new Lectura();
        Map expResult = null;
        Map result = instance.dicc(lista3, lista4, ref);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        for(int i =0; i<ref;i++){
            if((lista3.get(i)+lista4.get(i)).equals(result.get(i))){
                System.out.println("La palabra se ha agredado correctamente");
            }else{
                fail("The test case is a prototype.");
            }
        }
        
       
    }

    /**
     * Test of answer method, of class Lectura.
     */
    @Test
    public void testAnswer() {
        System.out.println("answer");
        String[] values = null;
        Map<String, String> theMap = null;
        Lectura instance = new Lectura();
        String expResult = "";
        String result = instance.answer(values, theMap);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        int cont = values.length;
        for(int i = 0; i<cont;i++){
            if(expResult == theMap.get(values[i])){
                System.out.println("La palabra existe");
            }else if(expResult == ("*")+values[i]+("*")){
                System.out.println("La palabra no existe pero se regresa en asteriscos");
            }else{
                fail("The test case is a prototype.");
            }
        }
        
    }
    
}
