package com.google.android.finsky.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class ParcelUtils {
    private ParcelUtils() {
    }

    public static synchronized void a(File file, Parcelable parcelable) {
        DataOutputStream dataOutputStream;
        synchronized (ParcelUtils.class) {
            jm.b();
            file.getParentFile().mkdirs();
            try {
                dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            } catch (Throwable th) {
                th = th;
                dataOutputStream = null;
            }
            try {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.setDataPosition(0);
                    obtain.writeParcelable(parcelable, 0);
                    byte[] marshall = obtain.marshall();
                    dataOutputStream.writeInt(marshall.length);
                    dataOutputStream.write(marshall);
                    jm.a(dataOutputStream);
                } finally {
                    obtain.recycle();
                }
            } catch (Throwable th2) {
                th = th2;
                jm.a(dataOutputStream);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.os.Parcelable] */
    public static synchronized <T extends Parcelable> T a(File file) {
        DataInputStream dataInputStream;
        Throwable th;
        synchronized (ParcelUtils.class) {
            try {
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(file));
                    try {
                        ?? a2 = a(dataInputStream);
                        r0 = a2 != 0 ? a2 : null;
                        jm.a((Closeable) dataInputStream);
                    } catch (CacheVersionException e) {
                        e = e;
                        file.delete();
                        FinskyLog.d("Version mismatch in %s: %s", file.getName(), e.getMessage());
                        jm.a((Closeable) dataInputStream);
                        return r0;
                    } catch (Throwable th2) {
                        th = th2;
                        file.delete();
                        FinskyLog.a(th, "Unable to read %s from cache: %s", file.getName(), th.getMessage());
                        jm.a((Closeable) dataInputStream);
                        return r0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jm.a((Closeable) dataInputStream);
                    throw th;
                }
            } catch (CacheVersionException e2) {
                e = e2;
                dataInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                dataInputStream = null;
            }
        }
        return r0;
    }

    private static <T extends Parcelable> T a(DataInputStream dataInputStream) {
        jm.b();
        ClassLoader classLoader = ParcelUtils.class.getClassLoader();
        int readInt = dataInputStream.readInt();
        byte[] bArr = new byte[readInt];
        dataInputStream.read(bArr);
        Parcel obtain = Parcel.obtain();
        obtain.setDataPosition(0);
        obtain.unmarshall(bArr, 0, readInt);
        obtain.setDataPosition(0);
        try {
            return (T) obtain.readParcelable(classLoader);
        } finally {
            obtain.recycle();
        }
    }

    public final class CacheVersionException extends RuntimeException {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Parcelable> f4709a;

        /* renamed from: b, reason: collision with root package name */
        private final long f4710b;
        private final long c;

        public CacheVersionException(Class<? extends Parcelable> cls, long j, long j2) {
            this.f4709a = cls;
            this.f4710b = j;
            this.c = j2;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return String.format("Failed parsing %s (wanted %d, got %d)", this.f4709a.getSimpleName(), Long.valueOf(this.f4710b), Long.valueOf(this.c));
        }
    }
}
