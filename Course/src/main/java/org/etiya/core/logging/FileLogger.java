package org.etiya.core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Data logged to file " + data);
    }
}
