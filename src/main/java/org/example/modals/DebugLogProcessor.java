package org.example.modals;

import org.example.modals.enums.LogProcessorType;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(LogProcessorType logProcessorType, String message) {

        if (logProcessorType == LogProcessorType.DEBUG) {
            System.out.println("DEBUG : " + message);
        } else {
            super.log(logProcessorType, message);
        }
    }
}
