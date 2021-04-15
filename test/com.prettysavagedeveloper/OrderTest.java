package com.prettysavagedeveloper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
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

    @Test
    public void Given_BeefRendangInStandardInput_When_MenuIsRun_Then_DisplayCorrectProcess(){
        System.setIn(new ByteArrayInputStream(("1\n".getBytes())));
        order.runMenu();
        String output = outContent.toString().replace("\r\n","\n");
        assertEquals(output.endsWith("You have chosen Menu Beef Rendang\n"), true);
        assertEquals(output.length() > "You have chosen Menu Beef Rendang\n".length(), true );
    }

    @Test
    public void Given_KaripapAndAllKuih_When_DisplayKuihSelected_Then_DisplayKaripapSentence(){
        order.displaySelectedKuih(1, true);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen karipap\n", output);
    }

    @Test
    public void Given_PisangGorengAndAllKuih_When_DisplayKuihSelected_Then_DisplayPisangGorengSentence(){
        order.displaySelectedKuih(2, true);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen pisang goreng\n", output);
    }

    @Test
    public void Given_DonutAndAllKuih_When_DisplayKuihSelected_Then_DisplayDonutSentence(){
        order.displaySelectedKuih(3, true);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen donut\n", output);
    }

    @Test
    public void Given_BadValueAndAllKuih_When_DisplayKuihSelected_Then_DisplayErrorSentence(){
        order.displaySelectedKuih(4, true);
        String output= outContent.toString().replace("\r\n", "\n");
        assertEquals("Unavailable\n", output);
    }

    @Test
    public void Given_DonutAndNotAllKuih_When_DisplayKuihSelected_Then_DisplayDonutSentence(){
        order.displaySelectedKuih(1, false);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen donut\n", output);
    }

    @Test
    public void Given_NoDonutAndNotAllKuih_When_DispalyKuihSelected_Then_DisplayNoDonutSentence(){
        order.displaySelectedKuih(2, false);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("No donut\n", output);
    }

    @Test
    public void Given_BadValueAndNotAllKuih_When_DisplayKuihSelected_Then_DisplayErrorSentence(){
        order.displaySelectedKuih(3, false);
        String output = outContent.toString().replace("\r\n","\n");
        assertEquals("Unavailable\n", output);
    }

    @Test
    public void Given_TehTarikAndAllDrinks_When_DisplaySelectedDrink_Then_DisplayTehTarikSentence(){
        order.displaySelectedDrinks(1);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen teh tarik\n", output);
    }

    @Test
    public void Given_MiloAisAndAllDrinks_When_DisplaySelectedDrink_Then_DisplayMiloAisSentence(){
        order.displaySelectedDrinks(2);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen milo ais\n", output);
    }

    @Test
    public void Given_SoyaCincauAndAllDrinks_When_DisplaySelectedDrink_Then_DisplaySoyaCincauSentence(){
        order.displaySelectedDrinks(3);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("You have chosen soya cincau\n", output);
    }

    @Test
    public void Given_BadValueAndAllDrinks_When_DisplaySelectedDrink_Then_DisplayErrorSentence(){
        order.displaySelectedDrinks(4);
        String output = outContent.toString().replace("\r\n", "\n");
        assertEquals("choice unavailable\n", output);
    }
}
