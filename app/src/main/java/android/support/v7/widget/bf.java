package android.support.v7.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* loaded from: classes.dex */
final class bf implements ListAdapter, SpinnerAdapter {

    /* renamed from: a, reason: collision with root package name */
    private SpinnerAdapter f692a;

    /* renamed from: b, reason: collision with root package name */
    private ListAdapter f693b;

    public bf(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        boolean z;
        this.f692a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f693b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            z = AppCompatSpinner.f615a;
            if (z && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        if (this.f692a == null) {
            return 0;
        }
        return this.f692a.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (this.f692a == null) {
            return null;
        }
        return this.f692a.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (this.f692a == null) {
            return -1L;
        }
        return this.f692a.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f692a == null) {
            return null;
        }
        return this.f692a.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.f692a != null && this.f692a.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f692a != null) {
            this.f692a.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f692a != null) {
            this.f692a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f693b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f693b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
