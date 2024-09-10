package org.example.modals;

import org.example.modals.enums.LogProcessorType;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }

    public void log(LogProcessorType logProcessorType, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logProcessorType, message);
        }
    }
}
