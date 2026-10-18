package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
final class bh implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppCompatSpinner f696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bg f697b;

    bh(bg bgVar, AppCompatSpinner appCompatSpinner) {
        this.f697b = bgVar;
        this.f696a = appCompatSpinner;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter;
        this.f697b.f695b.setSelection(i);
        if (this.f697b.f695b.getOnItemClickListener() != null) {
            AppCompatSpinner appCompatSpinner = this.f697b.f695b;
            listAdapter = this.f697b.n;
            appCompatSpinner.performItemClick(view, i, listAdapter.getItemId(i));
        }
        this.f697b.d();
    }
}
