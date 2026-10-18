package a;

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class r extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Socket f26a;

    r(Socket socket) {
        this.f26a = socket;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.a
    public final void a() {
        Logger logger;
        try {
            this.f26a.close();
        } catch (Exception e) {
            logger = o.f21a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.f26a, (Throwable) e);
        }
    }
}
