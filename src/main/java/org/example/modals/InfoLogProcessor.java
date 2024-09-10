package org.example.modals;

import org.example.modals.enums.LogProcessorType;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(LogProcessorType logProcessorType, String message) {
        if (logProcessorType == LogProcessorType.INFO) {
            System.out.println("INFO : " + message);
        } else {
            super.log(logProcessorType, message);
        }
    }
}
