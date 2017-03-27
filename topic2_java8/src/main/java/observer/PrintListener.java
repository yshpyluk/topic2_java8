package observer;

/**
 * Created by yshpyluk on 3/24/17.
 */
public class PrintListener implements ServletRequestListener {
	@Override
	public void requestDestroyed(String event) {
		System.out.println("Destroy" + event);
	}

	@Override
	public void requestInitialized(String event) {
		System.out.println("init" + event);
	}
}
