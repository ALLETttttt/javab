package abstractions.task11;

class GarminTracker implements FitnessTracker {
    @Override
    public void syncSteps() {
        System.out.println("Garmin data synced: 7500 steps");
    }

    @Override
    public void syncHeartRate() {
        System.out.println("Garmin data synced: 70 bpm heart rate");
    }

    @Override
    public void syncSleepPatterns() {
        System.out.println("Garmin data synced: 6.8 hours sleep");
    }
}