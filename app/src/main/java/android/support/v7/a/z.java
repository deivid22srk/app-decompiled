package android.support.v7.a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes.dex */
final class z implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListView f551a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f552b;
    final /* synthetic */ v c;

    z(v vVar, ListView listView, p pVar) {
        this.c = vVar;
        this.f551a = listView;
        this.f552b = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.c.C != null) {
            this.c.C[i] = this.f551a.isItemChecked(i);
        }
        this.c.G.onClick(this.f552b.f533b, i, this.f551a.isItemChecked(i));
    }
}
