package internal_class.task3;

public class LocalOuter {

    void localInnerDemo() {
        class LocalInner {
            void showMessage() {
                System.out.println("Message from local inner class.");
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.showMessage();
    }
}
