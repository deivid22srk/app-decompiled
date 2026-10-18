package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class DataHolder implements SafeParcelable {
    public static final e CREATOR = new e();
    private static final d l = new c(new String[0]);

    /* renamed from: a, reason: collision with root package name */
    final int f5617a;

    /* renamed from: b, reason: collision with root package name */
    final String[] f5618b;
    Bundle c;
    final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    int[] g;
    public int h;
    boolean i;
    Object j;
    private boolean k;

    public static class zzb extends RuntimeException {
        public zzb(String str) {
            super(str);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.i = false;
        this.k = true;
        this.f5617a = i;
        this.f5618b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    private DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i) {
        this.i = false;
        this.k = true;
        this.f5617a = 1;
        this.f5618b = (String[]) av.a(strArr);
        this.d = (CursorWindow[]) av.a(cursorWindowArr);
        this.e = i;
        this.f = null;
        a();
    }

    public final int a(int i) {
        int i2 = 0;
        av.a(i >= 0 && i < this.h);
        while (true) {
            if (i2 >= this.g.length) {
                break;
            }
            if (i < this.g[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == this.g.length ? i2 - 1 : i2;
    }

    public final long a(String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getLong(i, this.c.getInt(str));
    }

    public final void a() {
        this.c = new Bundle();
        for (int i = 0; i < this.f5618b.length; i++) {
            this.c.putInt(this.f5618b[i], i);
        }
        this.g = new int[this.d.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.d.length; i3++) {
            this.g[i3] = i2;
            i2 += this.d[i3].getNumRows() - (i2 - this.d[i3].getStartPosition());
        }
        this.h = i2;
    }

    final void a(String str, int i) {
        if (this.c == null || !this.c.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        }
        if (b()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    public final String b(String str, int i, int i2) {
        a(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    public final void c() {
        synchronized (this) {
            if (!this.i) {
                this.i = true;
                for (int i = 0; i < this.d.length; i++) {
                    this.d[i].close();
                }
            }
        }
    }

    public final boolean c(String str, int i, int i2) {
        a(str, i);
        return Long.valueOf(this.d[i2].getLong(i, this.c.getInt(str))).longValue() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    protected final void finalize() {
        try {
            if (this.k && this.d.length > 0 && !b()) {
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (" + (this.j == null ? "internal object: " + toString() : this.j.toString()) + ")");
                c();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.common.data.e.a(this, parcel, i);
    }

    private DataHolder(d dVar, int i) {
        this(dVar.f5620a, a(dVar), i);
    }

    private static CursorWindow[] a(d dVar) {
        int i;
        boolean z;
        CursorWindow cursorWindow;
        if (dVar.f5620a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList<HashMap<String, Object>> arrayList = dVar.f5621b;
        int size = arrayList.size();
        CursorWindow cursorWindow2 = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow2);
        cursorWindow2.setNumColumns(dVar.f5620a.length);
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i2 + ")");
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i2);
                    cursorWindow2.setNumColumns(dVar.f5620a.length);
                    arrayList2.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                HashMap<String, Object> hashMap = arrayList.get(i2);
                boolean z3 = true;
                for (int i3 = 0; i3 < dVar.f5620a.length && z3; i3++) {
                    String str = dVar.f5620a[i3];
                    Object obj = hashMap.get(str);
                    if (obj == null) {
                        z3 = cursorWindow2.putNull(i2, i3);
                    } else if (obj instanceof String) {
                        z3 = cursorWindow2.putString((String) obj, i2, i3);
                    } else if (obj instanceof Long) {
                        z3 = cursorWindow2.putLong(((Long) obj).longValue(), i2, i3);
                    } else if (obj instanceof Integer) {
                        z3 = cursorWindow2.putLong(((Integer) obj).intValue(), i2, i3);
                    } else if (obj instanceof Boolean) {
                        z3 = cursorWindow2.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i2, i3);
                    } else if (obj instanceof byte[]) {
                        z3 = cursorWindow2.putBlob((byte[]) obj, i2, i3);
                    } else if (obj instanceof Double) {
                        z3 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i2, i3);
                    } else {
                        if (!(obj instanceof Float)) {
                            throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj);
                        }
                        z3 = cursorWindow2.putDouble(((Float) obj).floatValue(), i2, i3);
                    }
                }
                if (z3) {
                    i = i2;
                    z = false;
                    cursorWindow = cursorWindow2;
                } else {
                    if (z2) {
                        throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    Log.d("DataHolder", "Couldn't populate window data for row " + i2 + " - allocating new window.");
                    cursorWindow2.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i2);
                    cursorWindow3.setNumColumns(dVar.f5620a.length);
                    arrayList2.add(cursorWindow3);
                    i = i2 - 1;
                    cursorWindow = cursorWindow3;
                    z = true;
                }
                z2 = z;
                cursorWindow2 = cursorWindow;
                i2 = i + 1;
            } catch (RuntimeException e) {
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList2.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    public static DataHolder b(int i) {
        return new DataHolder(l, i);
    }
}
