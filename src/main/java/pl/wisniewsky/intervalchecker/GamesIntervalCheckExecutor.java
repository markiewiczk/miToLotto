package pl.wisniewsky.intervalchecker;

import java.util.Timer;

public class GamesIntervalCheckExecutor extends Timer {
    public void checkInInterval(GamesIntervalCheckTask taks, TimePeriod timePeriod) {
        schedule(taks, 0, timePeriod.getTimeInMillis());
    }

    public void stopChecking() {
        cancel();
    }
}
