package com.prettysavagedeveloper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams(){
        System.setOut(System.out);
    }

    Order order = new Order();

    /*@Test
    public void Given_Nothing_When_DisplayMenuSelection_Then_ShouldDisplayText(){
        order.displayAvailableMenu();
        assertEquals(false, outContent.toString().isEmpty());
    }*/

    @Test
    public void Given_BeefRendang_When_DisplayMenuSelected_Then_DisplayBeefRendangSentence(){
        order.displaySelectedMenu(1);
        assertEquals("You have chosen Menu Beef Rendang\n", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_NasiLemak_When_DisplayMenuSelected_Then_DisplayNasiLemakSentence(){
        order.displaySelectedMenu(2);
        assertEquals("You have chosen Menu Nasi Lemak\n", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_MeeGoreng_When_DisplayMenuSelected_Then_DisplayMeeGorengSentence(){
        order.displaySelectedMenu(3);
        assertEquals("You have chosen Menu Mee Goreng\n", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_TooBigValue_When_DisplayMenuSelected_Then_DisplayErrorSentence(){
        order.displaySelectedMenu(4);
        assertEquals("Your request is unavailable. Please choose your menu\n", outContent.toString().replace("\r\n", "\n"));
    }

    @Test
    public void Given_NegativeValue_When_DisplaySelectedMenu_Then_DisplayErrorSentence(){
        order.displaySelectedMenu(-5);
        assertEquals("Your request is unavailable. Please choose your menu\n", outContent.toString().replace("\r\n", "\n"));
    }
}