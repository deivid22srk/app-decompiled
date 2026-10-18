package android.support.v7.a;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class y implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f549a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f550b;

    y(v vVar, p pVar) {
        this.f550b = vVar;
        this.f549a = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f550b.u.onClick(this.f549a.f533b, i);
        if (!this.f550b.E) {
            this.f549a.f533b.dismiss();
        }
    }
}
