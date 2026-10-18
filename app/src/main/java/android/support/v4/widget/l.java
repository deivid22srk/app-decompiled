package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class l extends BaseAdapter implements p, Filterable {
    public Context d;
    protected o h;
    protected FilterQueryProvider i;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f460b = true;
    public Cursor c = null;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f459a = false;
    protected int e = -1;
    protected m f = new m(this);
    protected DataSetObserver g = new n(this, (byte) 0);

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract void a(View view, Cursor cursor);

    public l(Context context) {
        this.d = context;
    }

    @Override // android.support.v4.widget.p
    public final Cursor a() {
        return this.c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (!this.f459a || this.c == null) {
            return 0;
        }
        return this.c.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        if (!this.f459a || this.c == null) {
            return null;
        }
        this.c.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.f459a && this.c != null && this.c.moveToPosition(i)) {
            return this.c.getLong(this.e);
        }
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f459a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.c.moveToPosition(i)) {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        if (view == null) {
            view = a(this.d, this.c, viewGroup);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f459a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            view = b(this.d, this.c, viewGroup);
        }
        a(view, this.c);
        return view;
    }

    public View b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return a(context, cursor, viewGroup);
    }

    @Override // android.support.v4.widget.p
    public CharSequence b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Override // android.support.v4.widget.p
    public Cursor a(CharSequence charSequence) {
        return this.i != null ? this.i.runQuery(charSequence) : this.c;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.h == null) {
            this.h = new o(this);
        }
        return this.h;
    }

    protected final void b() {
        if (this.f460b && this.c != null && !this.c.isClosed()) {
            this.f459a = this.c.requery();
        }
    }

    @Override // android.support.v4.widget.p
    public void a(Cursor cursor) {
        Cursor cursor2;
        if (cursor == this.c) {
            cursor2 = null;
        } else {
            cursor2 = this.c;
            if (cursor2 != null) {
                if (this.f != null) {
                    cursor2.unregisterContentObserver(this.f);
                }
                if (this.g != null) {
                    cursor2.unregisterDataSetObserver(this.g);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                if (this.f != null) {
                    cursor.registerContentObserver(this.f);
                }
                if (this.g != null) {
                    cursor.registerDataSetObserver(this.g);
                }
                this.e = cursor.getColumnIndexOrThrow("_id");
                this.f459a = true;
                notifyDataSetChanged();
            } else {
                this.e = -1;
                this.f459a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }
}
