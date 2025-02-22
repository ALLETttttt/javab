package abstractions.task11;

class AppleWatchTracker implements FitnessTracker {
    @Override
    public void syncSteps() {
        System.out.println("Apple Watch data synced: 10000 steps");
    }

    @Override
    public void syncHeartRate() {
        System.out.println("Apple Watch data synced: 68 bpm heart rate");
    }

    @Override
    public void syncSleepPatterns() {
        System.out.println("Apple Watch data synced: 6.5 hours sleep");
    }
}
