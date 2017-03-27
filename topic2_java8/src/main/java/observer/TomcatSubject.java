package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement Observer pattern for TomcatSubject.
 * Create several implementations of ServletRequestListener like in real Servlet impl.
 *
 */
public class TomcatSubject {

    private List<ServletRequestListener> observers = new ArrayList<>();

    // Implement it
    public void notifyAllObserversRequestInit(String event) {
        observers.stream().forEach(a -> a.requestInitialized(event));

    }

    // Implement it
    public void notifyAllObserversRequestDestroy(String event) {
        observers.forEach(a -> a.requestDestroyed(event));
    }

    // Implement it
    public void attach(ServletRequestListener observer) {
        observers.add(observer);
    }

}