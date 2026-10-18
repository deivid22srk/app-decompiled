package com.google.android.play.search;

import android.support.v7.widget.dt;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends dt<u> {
    l c;
    com.google.android.play.image.e d;
    private final List<v> e = new ArrayList();

    @Override // android.support.v7.widget.dt
    public final /* synthetic */ void a(u uVar, int i) {
        PlaySearchOneSuggestion playSearchOneSuggestion = uVar.l;
        v vVar = this.e.get(i);
        playSearchOneSuggestion.a(vVar, this.d, this.c.d);
        playSearchOneSuggestion.setOnClickListener(new s(this, vVar));
        playSearchOneSuggestion.setOnLongClickListener(new t(this, vVar));
    }

    @Override // android.support.v7.widget.dt
    public final int a() {
        return this.e.size();
    }

    public final void a(List<? extends v> list) {
        this.e.clear();
        this.e.addAll(list);
        this.f774a.a();
    }

    @Override // android.support.v7.widget.dt
    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        return new u((PlaySearchOneSuggestion) LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.play.l.play_search_one_suggestion, viewGroup, false));
    }
}
