package com.google.android.finsky.layout.actionbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.ik;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.ag;

/* loaded from: classes.dex */
public final class l extends ag {
    public l(Context context) {
        super(context);
    }

    @Override // com.google.android.play.search.ag
    public final com.google.android.play.image.e a() {
        return FinskyApp.a().d;
    }

    @Override // com.google.android.play.search.ag
    public final int b() {
        return R.layout.finsky_search;
    }

    @Override // com.google.android.play.search.ag
    public final int c() {
        return ik.a(this.f7030a.getResources());
    }

    @Override // com.google.android.play.search.ag
    public final PlaySearch a(ViewGroup viewGroup) {
        return (PlaySearch) LayoutInflater.from(this.f7030a).inflate(R.layout.finsky_search, viewGroup, false);
    }
}
