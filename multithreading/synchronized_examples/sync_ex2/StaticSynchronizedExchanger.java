package multithreading.synchronized_examples.sync_ex2;

public class StaticSynchronizedExchanger {
    private static Object staticObject = null;

    public static synchronized Object getStaticObject() {
        return staticObject;
    }

    public static synchronized void setStaticObject(Object obj) {
        staticObject = obj;
    }

    public static Object getStaticObj() {
        synchronized (StaticSynchronizedExchanger.class) {
            return staticObject;
        }
    }

    public static void setStaticObj(Object obj) {
        synchronized (StaticSynchronizedExchanger.class) {
            staticObject = obj;
        }
    }
}
