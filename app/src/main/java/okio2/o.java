package okio2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f21a = Logger.getLogger(o.class.getName());

    private o() {
    }

    public static i a(y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        return new t(yVar);
    }

    public static h a(x xVar) {
        if (xVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        return new s(xVar);
    }

    public static x a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c = c(socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        return new b(c, new p(c, outputStream));
    }

    public static y b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        a c = c(socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        return new c(c, new q(c, inputStream));
    }

    private static a c(Socket socket) {
        return new r(socket);
    }
}
