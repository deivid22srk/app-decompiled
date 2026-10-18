package com.a.a.a;

import a.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1000a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1001b = new String[0];
    public static final Charset c = Charset.forName("US-ASCII");
    public static final Charset d = Charset.forName(Keyczar.DEFAULT_ENCODING);

    public static int a(URI uri) {
        return a(uri.getScheme(), uri.getPort());
    }

    public static int a(URL url) {
        return a(url.getProtocol(), url.getPort());
    }

    private static int a(String str, int i) {
        return i != -1 ? i : a(str);
    }

    public static int a(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : -1;
    }

    public static void a(long j, long j2) {
        if ((0 | j2) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static void a(Closeable closeable, Closeable closeable2) {
        Throwable th = null;
        try {
            closeable.close();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            closeable2.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static boolean a(y yVar, TimeUnit timeUnit) {
        try {
            return a(yVar, 100, timeUnit);
        } catch (IOException e) {
            return false;
        }
    }

    public static boolean a(y yVar, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long f = yVar.a().c ? yVar.a().f() - nanoTime : Long.MAX_VALUE;
        yVar.a().a(Math.min(f, timeUnit.toNanos(i)) + nanoTime);
        try {
            a.f fVar = new a.f();
            while (yVar.a(fVar, 2048L) != -1) {
                fVar.o();
            }
            if (f == Long.MAX_VALUE) {
                yVar.a().c = false;
            } else {
                yVar.a().a(f + nanoTime);
            }
            return true;
        } catch (InterruptedIOException e) {
            if (f == Long.MAX_VALUE) {
                yVar.a().c = false;
            } else {
                yVar.a().a(f + nanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (f == Long.MAX_VALUE) {
                yVar.a().c = false;
            } else {
                yVar.a().a(f + nanoTime);
            }
            throw th;
        }
    }

    public static a.j a(a.j jVar) {
        try {
            return a.j.a(MessageDigest.getInstance("SHA-1").digest(jVar.d()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory b(String str) {
        return new m(str);
    }

    public static <T> List<T> a(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    T t2 = tArr2[i];
                    if (!t.equals(t2)) {
                        i++;
                    } else {
                        arrayList.add(t2);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
