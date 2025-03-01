package enum_class.task6;

public enum MenuOption {
    START {
        @Override
        void perform() {
            System.out.println("Starting the application...");
        }
    }, STOP {
        @Override
        void perform() {
            System.out.println("Stopping the application...");
        }
    }, SETTINGS {
        @Override
        void perform() {
            System.out.println("Opening settings...");
        }
    }, HELP {
        @Override
        void perform() {
            System.out.println("Displaying helping menu...");
        }
    };

    abstract void perform();

}
