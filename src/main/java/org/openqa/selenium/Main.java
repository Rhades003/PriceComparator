package org.openqa.selenium;

import javax.xml.transform.TransformerException;

import org.openqa.selenium.controllers.Scraper;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws TransformerException, IOException, InterruptedException, ExecutionException {
        Scraper scraper = new Scraper();
        scraper.getCardStats("Wrath of God");
            }
        }