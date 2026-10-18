package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public abstract class aq implements ap {
    protected static com.google.android.gms.common.api.m d;
    private static aw e;

    /* renamed from: a, reason: collision with root package name */
    protected MotionEvent f5880a;

    /* renamed from: b, reason: collision with root package name */
    protected DisplayMetrics f5881b;
    protected av c;

    protected aq(Context context, av avVar, aw awVar) {
        this.c = avVar;
        e = awVar;
        try {
            this.f5881b = context.getResources().getDisplayMetrics();
        } catch (UnsupportedOperationException e2) {
            this.f5881b = new DisplayMetrics();
            this.f5881b.density = 1.0f;
        }
    }

    private static void a() {
        e.a();
    }

    protected static void a(int i, long j) {
        e.a(i, j);
    }

    protected static void a(int i, String str) {
        e.a(i, str);
    }

    private static byte[] b() {
        return e.b();
    }

    @Override // com.google.android.gms.internal.ap
    public final String a(Context context) {
        return a(context, (String) null, false);
    }

    @Override // com.google.android.gms.internal.ap
    public final String a(Context context, String str) {
        return a(context, str, true);
    }

    protected final String a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        UUID fromString = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return this.c.a(bArr);
    }

    @Override // com.google.android.gms.internal.ap
    public final void a(int i, int i2, int i3) {
        if (this.f5880a != null) {
            this.f5880a.recycle();
        }
        this.f5880a = MotionEvent.obtain(0L, i3, 1, i * this.f5881b.density, i2 * this.f5881b.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
    }

    @Override // com.google.android.gms.internal.ap
    public final void a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f5880a != null) {
                this.f5880a.recycle();
            }
            this.f5880a = MotionEvent.obtain(motionEvent);
        }
    }

    protected abstract void b(Context context);

    protected abstract void c(Context context);

    final String a(Context context, String str, boolean z) {
        byte[] b2;
        byte[] array;
        try {
            synchronized (this) {
                a();
                if (z) {
                    c(context);
                } else {
                    b(context);
                }
                b2 = b();
            }
            if (b2.length == 0) {
                return Integer.toString(5);
            }
            if (b2.length > 239) {
                a();
                a(20, 1L);
                b2 = b();
            }
            if (b2.length < 239) {
                byte[] bArr = new byte[239 - b2.length];
                new SecureRandom().nextBytes(bArr);
                array = ByteBuffer.allocate(240).put((byte) b2.length).put(b2).put(bArr).array();
            } else {
                array = ByteBuffer.allocate(240).put((byte) b2.length).put(b2).array();
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(array);
            byte[] array2 = ByteBuffer.allocate(256).put(messageDigest.digest()).put(array).array();
            byte[] bArr2 = new byte[256];
            new k().a(array2, bArr2);
            if (str != null && str.length() > 0) {
                if (str.length() > 32) {
                    str = str.substring(0, 32);
                }
                new y(str.getBytes(Keyczar.DEFAULT_ENCODING)).a(bArr2);
            }
            return this.c.a(bArr2);
        } catch (UnsupportedEncodingException e2) {
            return Integer.toString(7);
        } catch (IOException e3) {
            return Integer.toString(3);
        } catch (NoSuchAlgorithmException e4) {
            return Integer.toString(7);
        }
    }
}
