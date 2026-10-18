package okio2;

/* loaded from: classes.dex */
public final class d extends Thread {
    public d() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a b2;
        while (true) {
            try {
                b2 = okio2.b();
                if (b2 != null) {
                    b2.a();
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
