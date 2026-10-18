package com.google.android.finsky.detailspage;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class ar implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EpisodeListModuleLayout f2547a;

    ar(EpisodeListModuleLayout episodeListModuleLayout) {
        this.f2547a = episodeListModuleLayout;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.Adapter] */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        at atVar;
        atVar = this.f2547a.j;
        atVar.b((Document) adapterView.getAdapter().getItem(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
