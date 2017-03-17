package observer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TomcatSubjectTest {
    private TomcatSubject tomcat;

    @Before
    public void init() {
        tomcat = new TomcatSubject();
//        tomcat.attach();
    }

    @Test
    public void emulate() {
        tomcat.notifyAllObserversRequestInit("TH1 The Request is Creating");
        tomcat.notifyAllObserversRequestInit("TH2 The Request is passed to servlet");
        tomcat.notifyAllObserversRequestInit("TH3 The Request is destroyed");

        tomcat.notifyAllObserversRequestDestroy("TH3 The Request is destroyed");
        tomcat.notifyAllObserversRequestDestroy("TH2 The Request is destroyed");
        tomcat.notifyAllObserversRequestDestroy("TH1 The Request is destroyed");
    }

}