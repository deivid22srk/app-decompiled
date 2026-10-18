package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzaij;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, Object> f6633a = new HashMap<>();

    public static o a(byte[] bArr) {
        try {
            return com.google.android.gms.internal.e.a(new com.google.android.gms.internal.f(com.google.android.gms.internal.g.a(bArr), new ArrayList()));
        } catch (zzaij e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    public static ArrayList<o> a(ArrayList<Bundle> arrayList) {
        ArrayList<o> arrayList2 = new ArrayList<>();
        Iterator<Bundle> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(it.next()));
        }
        return arrayList2;
    }

    private static void a(String str, Object obj, String str2, ClassCastException classCastException) {
        a(str, obj, str2, "<null>", classCastException);
    }

    private static void a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w("DataMap", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    public final void a(String str, byte b2) {
        this.f6633a.put(str, Byte.valueOf(b2));
    }

    public final void a(String str, double d) {
        this.f6633a.put(str, Double.valueOf(d));
    }

    public final void a(String str, float f) {
        this.f6633a.put(str, Float.valueOf(f));
    }

    public final void a(String str, int i) {
        this.f6633a.put(str, Integer.valueOf(i));
    }

    public final void a(String str, long j) {
        this.f6633a.put(str, Long.valueOf(j));
    }

    public final void a(String str, Asset asset) {
        this.f6633a.put(str, asset);
    }

    public final void a(String str, o oVar) {
        this.f6633a.put(str, oVar);
    }

    public final void a(String str, String str2) {
        this.f6633a.put(str, str2);
    }

    public final void a(String str, ArrayList<o> arrayList) {
        this.f6633a.put(str, arrayList);
    }

    public final void a(String str, boolean z) {
        this.f6633a.put(str, Boolean.valueOf(z));
    }

    public final void a(String str, byte[] bArr) {
        this.f6633a.put(str, bArr);
    }

    public final void a(String str, float[] fArr) {
        this.f6633a.put(str, fArr);
    }

    public final void a(String str, long[] jArr) {
        this.f6633a.put(str, jArr);
    }

    public final void a(String str, String[] strArr) {
        this.f6633a.put(str, strArr);
    }

    public final boolean a(String str) {
        return this.f6633a.containsKey(str);
    }

    public final <T> T b(String str) {
        return (T) this.f6633a.get(str);
    }

    public final void b(String str, ArrayList<Integer> arrayList) {
        this.f6633a.put(str, arrayList);
    }

    public final void c(String str, ArrayList<String> arrayList) {
        this.f6633a.put(str, arrayList);
    }

    public final boolean c(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            a(str, obj, "Boolean", false, e);
            return false;
        }
    }

    public final int d(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            a(str, obj, "Integer", e);
            return 0;
        }
    }

    public final long e(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return 0L;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            a(str, obj, "long", e);
            return 0L;
        }
    }

    public final String f(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            a(str, obj, "String", e);
            return null;
        }
    }

    public final ArrayList<String> g(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            a(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public final ArrayList<o> h(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            a(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    public final int hashCode() {
        return this.f6633a.hashCode() * 29;
    }

    public final byte[] i(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            a(str, obj, "byte[]", e);
            return null;
        }
    }

    public final String[] j(String str) {
        Object obj = this.f6633a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            a(str, obj, "String[]", e);
            return null;
        }
    }

    public final String toString() {
        return this.f6633a.toString();
    }

    private static o a(Bundle bundle) {
        char c;
        bundle.setClassLoader(Asset.class.getClassLoader());
        o oVar = new o();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                oVar.a(str, (String) obj);
            } else if (obj instanceof Integer) {
                oVar.a(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                oVar.a(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                oVar.a(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                oVar.a(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                oVar.a(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                oVar.a(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                oVar.a(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                oVar.a(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                oVar.a(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                oVar.a(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                oVar.a(str, (Asset) obj);
            } else if (obj instanceof Bundle) {
                oVar.a(str, a((Bundle) obj));
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    c = 0;
                } else {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (next != null) {
                                if (next instanceof Integer) {
                                    c = 2;
                                } else if (next instanceof String) {
                                    c = 3;
                                } else if (next instanceof o) {
                                    c = 4;
                                } else if (next instanceof Bundle) {
                                    c = 5;
                                }
                            }
                        } else {
                            c = 1;
                        }
                    }
                }
                switch (c) {
                    case 0:
                        oVar.c(str, (ArrayList) obj);
                        break;
                    case 1:
                        oVar.c(str, (ArrayList) obj);
                        break;
                    case 2:
                        oVar.b(str, (ArrayList) obj);
                        break;
                    case 3:
                        oVar.c(str, (ArrayList) obj);
                        break;
                    case 5:
                        oVar.a(str, a((ArrayList<Bundle>) obj));
                        break;
                }
            }
        }
        return oVar;
    }

    public final void a(o oVar) {
        for (String str : oVar.f6633a.keySet()) {
            this.f6633a.put(str, oVar.b(str));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f6633a.size() != oVar.f6633a.size()) {
            return false;
        }
        for (String str : this.f6633a.keySet()) {
            Object b2 = b(str);
            Object b3 = oVar.b(str);
            if (b2 instanceof Asset) {
                if (!(b3 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) b2;
                Asset asset2 = (Asset) b3;
                if (!((asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.c) ? asset.c.equals(asset2.c) : Arrays.equals(asset.f6457b, asset2.f6457b))) {
                    return false;
                }
            } else {
                if (b2 instanceof String[]) {
                    if ((b3 instanceof String[]) && Arrays.equals((String[]) b2, (String[]) b3)) {
                    }
                    return false;
                }
                if (b2 instanceof long[]) {
                    if ((b3 instanceof long[]) && Arrays.equals((long[]) b2, (long[]) b3)) {
                    }
                    return false;
                }
                if (b2 instanceof float[]) {
                    if ((b3 instanceof float[]) && Arrays.equals((float[]) b2, (float[]) b3)) {
                    }
                    return false;
                }
                if (b2 instanceof byte[]) {
                    if ((b3 instanceof byte[]) && Arrays.equals((byte[]) b2, (byte[]) b3)) {
                    }
                    return false;
                }
                if (b2 == null || b3 == null) {
                    if (b2 != b3) {
                        return false;
                    }
                    return true;
                }
                if (!b2.equals(b3)) {
                    return false;
                }
            }
        }
        return true;
    }
}
