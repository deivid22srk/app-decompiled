package com.google.android.gms.measurement.internal;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.internal.om;
import com.google.android.gms.internal.on;
import com.google.android.gms.internal.op;
import com.google.android.gms.internal.zzaic;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public final class g extends az {
    g(ap apVar) {
        super(apVar);
    }

    static Object a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Float)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Double) {
            return Float.valueOf((float) ((Double) obj).doubleValue());
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return null;
        }
        String valueOf = String.valueOf(obj);
        if (valueOf.length() <= i) {
            return valueOf;
        }
        if (z) {
            return valueOf.substring(0, i);
        }
        return null;
    }

    public static boolean a(Context context, Class<? extends BroadcastReceiver> cls) {
        try {
            ActivityInfo receiverInfo = context.getPackageManager().getReceiverInfo(new ComponentName(context, cls), 2);
            if (receiverInfo != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    public static Object b(String str, Object obj) {
        return "_ldl".equals(str) ? a(c(str), obj, true) : a(c(str), obj, false);
    }

    public static boolean b(Context context, Class<? extends Service> cls) {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 4);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        return false;
    }

    private static int c(String str) {
        return "_ldl".equals(str) ? i.r() : i.q();
    }

    public final void a(String str, Object obj) {
        if ("_ldl".equals(str)) {
            a("user attribute referrer", str, c(str), obj);
        } else {
            a("user attribute", str, c(str), obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ x f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ bg g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.c.a h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ Context i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ g j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ al k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ z l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ ai m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.az
    public final /* bridge */ /* synthetic */ i n() {
        return super.n();
    }

    public static void a(String str) {
        i.b();
        if (str == null) {
            throw new IllegalArgumentException("user attribute name is required and can't be null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("user attribute name is required and can't be empty");
        }
        char charAt = str.charAt(0);
        if (!Character.isLetter(charAt) && charAt != '_') {
            throw new IllegalArgumentException("user attribute name must start with a letter or _");
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt2 != '_' && !Character.isLetterOrDigit(charAt2)) {
                throw new IllegalArgumentException("user attribute name must consist of letters, digits or _ (underscores)");
            }
        }
        if (str.length() > 24) {
            throw new IllegalArgumentException("user attribute name is too long. The maximum supported length is 24");
        }
    }

    private void a(String str, String str2, int i, Object obj) {
        if (obj == null) {
            super.l().d.a(str + " value can't be null. Ignoring " + str, str2);
            return;
        }
        if ((obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.length() > i) {
                super.l().d.a("Ignoring " + str + ". Value is too long. name, value length", str2, Integer.valueOf(valueOf.length()));
            }
        }
    }

    public final void a(op opVar, Object obj) {
        com.google.android.gms.common.internal.av.a(obj);
        opVar.c = null;
        opVar.d = null;
        opVar.e = null;
        if (obj instanceof String) {
            opVar.c = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            opVar.d = (Long) obj;
        } else if (obj instanceof Float) {
            opVar.e = (Float) obj;
        } else {
            super.l().f6388a.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void a(om omVar, Object obj) {
        com.google.android.gms.common.internal.av.a(obj);
        omVar.f6209b = null;
        omVar.c = null;
        omVar.d = null;
        if (obj instanceof String) {
            omVar.f6209b = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            omVar.c = (Long) obj;
        } else if (obj instanceof Float) {
            omVar.d = (Float) obj;
        } else {
            super.l().f6388a.a("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void a(Bundle bundle, String str, Object obj) {
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (str != null) {
            super.l().d.a("Not putting event parameter. Invalid value type. name, type", str, obj.getClass().getSimpleName());
        }
    }

    public final byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            super.l().f6388a.a("Failed to gzip content", e);
            throw e;
        }
    }

    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            super.l().f6388a.a("Failed to ungzip content", e);
            throw e;
        }
    }

    public final byte[] a(on onVar) {
        try {
            byte[] bArr = new byte[onVar.d()];
            zzaic a2 = zzaic.a(bArr, bArr.length);
            onVar.a(a2);
            a2.a();
            return bArr;
        } catch (IOException e) {
            super.l().f6388a.a("Data loss. Failed to serialize batch", e);
            return null;
        }
    }

    public final boolean a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(super.h().a() - j) > j2;
    }

    public final boolean b(String str) {
        super.e();
        return super.i().checkCallingOrSelfPermission(str) == 0;
    }
}
