package abstractions.task11;

public class Main {
    public static void main(String[] args) {
        FitnessTracker fitbit = new FitbitTracker();
        FitnessTracker appleWatch = new AppleWatchTracker();

        System.out.println("Sample Input 1:");
        fitbit.syncSteps();
        fitbit.syncHeartRate();
        fitbit.syncSleepPatterns();

        System.out.println("Sample Input 2:");
        appleWatch.syncSteps();
        appleWatch.syncHeartRate();
        appleWatch.syncSleepPatterns();
    }
}
