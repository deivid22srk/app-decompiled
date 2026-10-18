package com.google.android.finsky.gpkg;

import android.database.Cursor;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class aw implements Iterator<r> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cursor f2813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ av f2814b;

    aw(av avVar, Cursor cursor) {
        this.f2814b = avVar;
        this.f2813a = cursor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f2813a.isAfterLast() && !this.f2813a.isLast()) {
            return !this.f2813a.isClosed();
        }
        this.f2813a.close();
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final void finalize() {
        if (!this.f2813a.isClosed()) {
            this.f2813a.close();
        }
        super.finalize();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ r next() {
        long j;
        if (!this.f2813a.moveToNext()) {
            return null;
        }
        String intern = this.f2813a.getString(0).intern();
        String string = this.f2813a.getString(1);
        int i = this.f2813a.getInt(2);
        String string2 = this.f2813a.getString(3);
        int i2 = this.f2813a.getInt(4);
        int i3 = this.f2813a.getInt(5);
        long j2 = this.f2813a.getLong(6);
        boolean z = this.f2813a.getInt(16) > 0;
        boolean z2 = this.f2813a.getInt(18) > 0;
        String string3 = this.f2813a.getString(19);
        int i4 = this.f2813a.getInt(20);
        if (!this.f2813a.isNull(7)) {
            j = this.f2813a.getLong(7);
        } else {
            j = Long.MAX_VALUE;
        }
        if (string == null) {
            string = a.a(i);
            FinskyLog.a("Library id for doc id %s is restored from backend %d to value %s", string2, Integer.valueOf(i), string);
        }
        if (!a.b(string)) {
            if (i2 == 1) {
                return new q(intern, string2, i3, j2, jm.d(this.f2813a.getString(8)), this.f2813a.getLong(9), this.f2813a.getLong(10), this.f2813a.getInt(17) > 0, z2, string3, i4);
            }
            if (i2 == 15 || i3 == 13) {
                if (i == 3) {
                    boolean z3 = this.f2813a.getInt(11) > 0;
                    long j3 = this.f2813a.getLong(12);
                    long j4 = this.f2813a.getLong(13);
                    String str = "";
                    if (!this.f2813a.isNull(14)) {
                        str = this.f2813a.getString(14);
                    }
                    String str2 = "";
                    if (!this.f2813a.isNull(15)) {
                        str2 = this.f2813a.getString(15);
                    }
                    return new u(intern, string, i, string2, i3, j2, j, j3, j4, z3, str, str2);
                }
                return new aq(intern, string, i, string2, i2, i3, j2, Long.valueOf(j), this.f2813a.getLong(12), this.f2813a.getLong(13), this.f2813a.getInt(11) > 0, z2, string3, i4);
            }
            if (i2 == 11) {
                String string4 = this.f2813a.getString(14);
                String string5 = this.f2813a.getString(15);
                if (string4 != null && string5 != null) {
                    return new t(intern, string, string2, i3, string4, string5, j2);
                }
            }
        }
        return new r(intern, string, i, string2, i2, i3, j2, j, z, z2, string3, i4);
    }
}
