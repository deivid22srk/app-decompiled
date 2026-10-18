package com.google.android.play.layout;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
final class e implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f6986a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f6987b;

    e(d dVar, h hVar) {
        this.f6987b = dVar;
        this.f6986a = hVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i >= 0) {
            this.f6987b.b();
            g gVar = this.f6986a.f6991b.get(i);
            if (gVar.d == null) {
                return;
            }
            gVar.d.a(gVar.f6988a);
        }
    }
}
