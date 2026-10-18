package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class bn {

    /* renamed from: a, reason: collision with root package name */
    public final DataSetObservable f355a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f356b;

    public abstract int a();

    public abstract boolean a(View view, Object obj);

    public Object a(ViewGroup viewGroup, int i) {
        return a((View) viewGroup, i);
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        a((View) viewGroup, i, obj);
    }

    public void b() {
        c();
    }

    public Object a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void a(Object obj) {
    }

    public void c() {
    }

    public int b(Object obj) {
        return -1;
    }

    public final void d() {
        synchronized (this) {
            if (this.f356b != null) {
                this.f356b.onChanged();
            }
        }
        this.f355a.notifyChanged();
    }

    final void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f356b = dataSetObserver;
        }
    }

    public CharSequence a(int i) {
        return null;
    }

    public float b(int i) {
        return 1.0f;
    }
}
