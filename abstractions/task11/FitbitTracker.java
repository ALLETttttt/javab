package abstractions.task11;

class FitbitTracker implements FitnessTracker {
    @Override
    public void syncSteps() {
        System.out.println("Fitbit data synced: 8000 steps");
    }

    @Override
    public void syncHeartRate() {
        System.out.println("Fitbit data synced: 72 bpm heart rate");
    }

    @Override
    public void syncSleepPatterns() {
        System.out.println("Fitbit data synced: 7 hours sleep");
    }
}
