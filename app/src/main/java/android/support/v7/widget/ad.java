package android.support.v7.widget;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
final class ad extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f645a;

    /* renamed from: b, reason: collision with root package name */
    boolean f646b;
    final /* synthetic */ ActivityChooserView c;
    private int d;
    private boolean e;
    private boolean f;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return (this.f && i == getCount() + (-1)) ? 1 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int a2 = this.f645a.a();
        if (!this.f646b && this.f645a.b() != null) {
            a2--;
        }
        int min = Math.min(a2, this.d);
        if (this.f) {
            return min + 1;
        }
        return min;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        switch (getItemViewType(i)) {
            case 0:
                if (!this.f646b && this.f645a.b() != null) {
                    i++;
                }
                return this.f645a.a(i);
            case 1:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                if (view == null || view.getId() != android.support.v7.b.g.list_item) {
                    view = LayoutInflater.from(this.c.getContext()).inflate(android.support.v7.b.i.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = this.c.getContext().getPackageManager();
                ImageView imageView = (ImageView) view.findViewById(android.support.v7.b.g.icon);
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(android.support.v7.b.g.title)).setText(resolveInfo.loadLabel(packageManager));
                if (this.f646b && i == 0 && this.e) {
                    android.support.v4.view.by.a(view, true);
                    return view;
                }
                android.support.v4.view.by.a(view, false);
                return view;
            case 1:
                if (view == null || view.getId() != 1) {
                    View inflate = LayoutInflater.from(this.c.getContext()).inflate(android.support.v7.b.i.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((TextView) inflate.findViewById(android.support.v7.b.g.title)).setText(this.c.getContext().getString(android.support.v7.b.j.abc_activity_chooser_view_see_all));
                    return inflate;
                }
                return view;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int a() {
        int i = this.d;
        this.d = Integer.MAX_VALUE;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = getCount();
        View view = null;
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            view = getView(i3, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        this.d = i;
        return i2;
    }

    public final void a(int i) {
        if (this.d != i) {
            this.d = i;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.f646b != z || this.e != z2) {
            this.f646b = z;
            this.e = z2;
            notifyDataSetChanged();
        }
    }
}
