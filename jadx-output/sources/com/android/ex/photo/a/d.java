package com.android.ex.photo.a;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.h.r;
import com.android.ex.photo.f;

/* loaded from: classes.dex */
public final class d extends a {
    protected r<String, Integer> h;
    protected final float i;
    protected boolean j;

    public d(Context context, aa aaVar, float f, boolean z) {
        super(context, aaVar);
        this.h = new r<>(com.android.ex.photo.d.b.f1149a.length);
        this.i = f;
        this.j = z;
    }

    @Override // com.android.ex.photo.a.a
    public final Cursor a(Cursor cursor) {
        this.h.clear();
        if (cursor != null) {
            for (String str : com.android.ex.photo.d.b.f1149a) {
                this.h.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
            }
            for (String str2 : com.android.ex.photo.d.b.f1150b) {
                int columnIndex = cursor.getColumnIndex(str2);
                if (columnIndex != -1) {
                    this.h.put(str2, Integer.valueOf(columnIndex));
                }
            }
        }
        return super.a(cursor);
    }

    public final String b(Cursor cursor) {
        return a(cursor, "contentUri");
    }

    public final String c(Cursor cursor) {
        return a(cursor, "thumbnailUri");
    }

    private String a(Cursor cursor, String str) {
        if (this.h.containsKey(str)) {
            return cursor.getString(this.h.get(str).intValue());
        }
        return null;
    }

    @Override // com.android.ex.photo.a.a
    public final Fragment a(Cursor cursor, int i) {
        String a2 = a(cursor, "contentUri");
        String a3 = a(cursor, "thumbnailUri");
        String a4 = a(cursor, "loadingIndicator");
        boolean z = a2 == null && (a4 == null ? false : Boolean.valueOf(a4).booleanValue());
        f fVar = new f(this.f1138b, com.android.ex.photo.b.a.class, (byte) 0);
        fVar.f1160b = a2;
        fVar.d = a3;
        fVar.f = this.j;
        fVar.a(this.i);
        return com.android.ex.photo.b.a.a(fVar.a(), i, z);
    }
}
