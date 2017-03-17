package observer;

/**
 * This is emulated interface of servlets.
 * We are using String as event not javax.servlet.ServletRequestListener for study purposes.
 */
public interface ServletRequestListener {

    void requestDestroyed(String event);

    void requestInitialized(String event);
}