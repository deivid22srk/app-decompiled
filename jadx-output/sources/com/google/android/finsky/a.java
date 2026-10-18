package com.google.android.finsky;

import android.content.Context;
import android.util.Log;
import com.google.android.finsky.b.z;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.jn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Thread;
import java.util.Locale;

/* loaded from: classes.dex */
final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    int f1436a;

    /* renamed from: b, reason: collision with root package name */
    Thread.UncaughtExceptionHandler f1437b;
    Throwable c;
    private final Context d;
    private final File e;
    private long f;
    private volatile boolean g;

    public a(Context context) {
        this.d = context;
        this.e = new File(context.getCacheDir(), String.format(Locale.US, "crash%d", 806202));
        try {
            if (!this.e.exists()) {
                a();
            } else {
                FileInputStream fileInputStream = new FileInputStream(this.e);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                    try {
                        this.f1436a = objectInputStream.readInt();
                        this.f = objectInputStream.readLong();
                        boolean readBoolean = objectInputStream.readBoolean();
                        try {
                            this.c = (Throwable) objectInputStream.readObject();
                        } catch (IOException | ClassNotFoundException e) {
                            a("Cannot read exception object");
                        }
                        fileInputStream.close();
                        a("Read crash info");
                        boolean z = this.f1436a > com.google.android.finsky.c.d.fg.b().intValue();
                        if ((this.f > 0 && System.currentTimeMillis() - this.f > com.google.android.finsky.c.d.ff.b().longValue()) || readBoolean || z) {
                            a("Crash info expired");
                            a();
                            a(this.e);
                        }
                    } finally {
                        objectInputStream.close();
                    }
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        } catch (Exception e2) {
            a("Failed to read crash file", e2);
            a();
            a(this.e);
        }
        if (this.f1436a <= 0) {
            return;
        }
        if (a(com.google.android.finsky.c.d.fh.b().intValue())) {
            a("Cleanup cache");
            try {
                a(new File(this.d.getCacheDir(), "main"));
                a(new File(this.d.getCacheDir(), "images"));
            } catch (Exception e3) {
                a("Failed to cleanup Volley cache", e3);
            }
        }
        if (a(com.google.android.finsky.c.d.fi.b().intValue())) {
            a("Cleanup data stores");
            a("Cleanup restore data store");
            try {
                RestoreService.b(this.d);
            } catch (Exception e4) {
                a("Failed to cleanup restore data store", e4);
            }
            a("Cleanup installer data store");
            try {
                z.a(this.d, (String) null);
            } catch (Exception e5) {
                a("Failed to cleanup installer data store", e5);
            }
        }
        if (a(com.google.android.finsky.c.d.fj.b().intValue())) {
            a("Cleanup user preferences");
            try {
                bg.b();
                jn.b();
            } catch (Exception e6) {
                a("Failed to cleanup user prefs", e6);
            }
        }
        a(this.f1436a, this.f, true, null);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.g) {
            this.g = true;
            a(this.f1436a + 1, System.currentTimeMillis(), false, th);
        }
        if (this.f1437b != null) {
            this.f1437b.uncaughtException(thread, th);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "cnt=%d ts=%d cause=%s", Integer.valueOf(this.f1436a), Long.valueOf(this.f), this.c);
    }

    private void a() {
        this.f1436a = 0;
        this.f = 0L;
    }

    private void a(int i, long j, boolean z, Throwable th) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.e);
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeInt(i);
                    objectOutputStream.writeLong(j);
                    objectOutputStream.writeBoolean(z);
                    try {
                        objectOutputStream.writeObject(th);
                    } catch (IOException e) {
                        a("Cannot write exception object");
                    }
                    objectOutputStream.flush();
                    fileOutputStream.getFD().sync();
                } finally {
                    objectOutputStream.close();
                }
            } finally {
                fileOutputStream.close();
            }
        } catch (Exception e2) {
            a("Failed to write crash file", e2);
        }
    }

    private void a(String str) {
        try {
            Log.w("Finsky.CrashDetector", String.format(Locale.US, "%s %s.", str, this));
        } catch (Exception e) {
        }
    }

    private void a(String str, Throwable th) {
        try {
            Log.w("Finsky.CrashDetector", String.format(Locale.US, "%s %s.", str, this), th);
        } catch (Exception e) {
        }
    }

    private boolean a(int i) {
        return i > 0 && this.f1436a >= i;
    }

    private void a(File file) {
        File[] listFiles;
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    a(file2);
                }
            }
            if (!file.delete()) {
                a("Failed to delete file: " + file);
            }
        } catch (Exception e) {
            a("Failed to delete file: " + file, e);
        }
    }
}
