package com.android.ex.photo.a;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: b, reason: collision with root package name */
    protected Context f1138b;
    protected Cursor c;
    protected int d;
    protected SparseIntArray e;
    protected final HashMap<Object, Integer> f;

    public abstract Fragment a(Cursor cursor, int i);

    public a(Context context, aa aaVar) {
        super(aaVar);
        this.f = new HashMap<>();
        this.c = null;
        this.f1138b = context;
        this.d = -1;
    }

    @Override // com.android.ex.photo.a.b
    public final Fragment c(int i) {
        if (this.c == null || !d(i)) {
            return null;
        }
        return a(this.c, i);
    }

    @Override // android.support.v4.view.bn
    public final int a() {
        if (this.c != null) {
            return this.c.getCount();
        }
        return 0;
    }

    @Override // com.android.ex.photo.a.b, android.support.v4.view.bn
    public final Object a(View view, int i) {
        Integer num;
        if (this.c == null) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (d(i)) {
            num = Integer.valueOf(this.c.getString(this.d).hashCode());
        } else {
            num = null;
        }
        Object a2 = super.a(view, i);
        if (a2 != null) {
            this.f.put(a2, num);
        }
        return a2;
    }

    @Override // com.android.ex.photo.a.b, android.support.v4.view.bn
    public final void a(View view, int i, Object obj) {
        this.f.remove(obj);
        super.a(view, i, obj);
    }

    @Override // android.support.v4.view.bn
    public final int b(Object obj) {
        Integer num = this.f.get(obj);
        if (num == null || this.e == null) {
            return -2;
        }
        return this.e.get(num.intValue(), -2);
    }

    public final Cursor e() {
        return this.c;
    }

    public Cursor a(Cursor cursor) {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2)) {
            Log.v("BaseCursorPagerAdapter", "swapCursor old=" + (this.c == null ? -1 : this.c.getCount()) + "; new=" + (cursor == null ? -1 : cursor.getCount()));
        }
        if (cursor == this.c) {
            return null;
        }
        Cursor cursor2 = this.c;
        this.c = cursor;
        if (cursor != null) {
            this.d = cursor.getColumnIndex("uri");
        } else {
            this.d = -1;
        }
        f();
        d();
        return cursor2;
    }

    @Override // com.android.ex.photo.a.b
    protected final String a(int i, int i2) {
        return d(i2) ? "android:pager:" + i + ":" + this.c.getString(this.d).hashCode() : super.a(i, i2);
    }

    private boolean d(int i) {
        if (this.c == null || this.c.isClosed()) {
            return false;
        }
        return this.c.moveToPosition(i);
    }

    private void f() {
        if (this.c == null || this.c.isClosed()) {
            this.e = null;
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(this.c.getCount());
        this.c.moveToPosition(-1);
        while (this.c.moveToNext()) {
            sparseIntArray.append(this.c.getString(this.d).hashCode(), this.c.getPosition());
        }
        this.e = sparseIntArray;
    }
}
