package com.google.android.play.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class ag {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7030a;

    public abstract com.google.android.play.image.e a();

    public ag(Context context) {
        this.f7030a = context;
    }

    public int b() {
        return com.google.android.play.l.play_search;
    }

    public int c() {
        return this.f7030a.getResources().getDimensionPixelSize(com.google.android.play.i.play_collection_edge_padding_minus_card_half_spacing);
    }

    public PlaySearch a(ViewGroup viewGroup) {
        return (PlaySearch) LayoutInflater.from(this.f7030a).inflate(com.google.android.play.l.play_search, viewGroup, false);
    }
}
