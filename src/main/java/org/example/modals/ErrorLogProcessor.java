package org.example.modals;

import org.example.modals.enums.LogProcessorType;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(LogProcessorType logProcessorType, String message) {
        if (logProcessorType == LogProcessorType.ERROR) {
            System.out.println("ERROR : " + message);
        } else {
            super.log(logProcessorType, message);
        }
    }
}
