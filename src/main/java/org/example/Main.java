package org.example;

import org.example.modals.DebugLogProcessor;
import org.example.modals.ErrorLogProcessor;
import org.example.modals.InfoLogProcessor;
import org.example.modals.LogProcessor;
import org.example.modals.enums.LogProcessorType;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to Logger Design!");

        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessorType.ERROR, "This is the Error message");
        logProcessor.log(LogProcessorType.DEBUG, "This message is to DEBUG code");
        logProcessor.log(LogProcessorType.INFO, "This is log INFO");

    }
}