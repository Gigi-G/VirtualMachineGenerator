package com.gigi_g.virtualmachinegenerator;

import static org.junit.Assert.assertTrue;

import com.gigi_g.virtualmachinegenerator.abstraction.TestSystemGenerateMachine;
import com.gigi_g.virtualmachinegenerator.implementor.TestVirtualMachine;
import com.gigi_g.virtualmachinegenerator.keylistener.TestKeyListener;
import com.gigi_g.virtualmachinegenerator.operating_system.TestOperatingSystem;
import com.gigi_g.virtualmachinegenerator.system.TestGenerate;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testOperatingSystem() {
        printHeader(TestOperatingSystem.class.getName());
        assertTrue(TestOperatingSystem.testGetOS());
        printFooter();
    }

    @Test
    public void testVirtualMachine() {
        printHeader(TestVirtualMachine.class.getName());
        assertTrue(TestVirtualMachine.testVirtualMachine());
        printFooter();
    }

    @Test
    public void testSystemGenerateMachine() {
        printHeader(TestSystemGenerateMachine.class.getName());
        assertTrue(TestSystemGenerateMachine.testSystemCall());
        printFooter();
    }

    @Test
    public void testKeyListener() {
        printHeader(TestKeyListener.class.getName());
        assertTrue(TestKeyListener.testSingleton());
        assertTrue(TestKeyListener.testNullInput());
        printFooter();
    }

    @Test
    public void testGenerate() {
        printHeader(TestGenerate.class.getName());
        assertTrue(TestGenerate.testGenerate());
        System.out.println("Test passed! Open src/test/java/com/gigi_g/virtualmachinegenerator/system/TestGenerate.logs");
        printFooter();
    }

    private void printHeader(String nome) {
        System.out.println();
        printYellow("-------------------------------------------------------".repeat(2));
        printBlue(nome);
        printYellow("-------------------------------------------------------".repeat(2));
    }

    private void printFooter() {
        printYellow("-------------------------------------------------------".repeat(2));
        System.out.println();
        System.out.println();
    }

    private void printYellow(String str) {
        System.out.println("\u001B[33m" + str + "\u001B[0m");
    }

    private void printBlue(String str) {
        System.out.println("\u001B[34m" + str + "\u001B[0m");
    }
}
