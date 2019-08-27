package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_return_IE_ON_MAC_input_MAC_IE() {

        //Given
        BannerRender bannerRender = new BannerRender();
        String platform = "MAC";
        String browser = "IE";
        //When
        String result = bannerRender.renderBanner(platform, browser);

        //Then
        assertEquals("IE on Mac?",result);

    }

    @Test
    public void should_return_banner_input_WINDOWS_IE() {

        //Given
        BannerRender bannerRender = new BannerRender();
        String platform = "WINDOWS";
        String browser = "IE";
        //When
        String result = bannerRender.renderBanner(platform, browser);

        //Then
        assertEquals("banner",result);

    }
}