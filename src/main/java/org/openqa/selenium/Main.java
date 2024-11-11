package org.openqa.selenium;

import javax.xml.transform.TransformerException;

import org.openqa.selenium.controllers.Scraper;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws TransformerException, IOException, InterruptedException, ExecutionException {
        Scraper scraper = new Scraper();
        //scraper.getCardStats("Kaito Shizuki");
        //scraper.getCardStats("Kaito, Bane of Nightmares");
        //scraper.getCardStats("Kaito, Dancing Shadow"); 
        scraper.getCardStats("Command Beacon");
            }
        }