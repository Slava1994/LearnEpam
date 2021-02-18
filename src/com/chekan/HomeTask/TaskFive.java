package com.chekan.HomeTask;

import utilities.ScannerUtils;

public class TaskFive {
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTES = 60;

    public static void main(String[] args) {

        int inputTimeInSeconds = ( int ) ScannerUtils.scan ( );

        int hours = inputTimeInSeconds / SECONDS_IN_HOUR;
        int minutes = ((inputTimeInSeconds - (hours * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTES);
        int sec = inputTimeInSeconds - (hours * SECONDS_IN_HOUR) - (minutes * SECONDS_IN_MINUTES);

        System.out.println ( " HH " + hours + " MM " + minutes + " SS " + sec );
    }
}
