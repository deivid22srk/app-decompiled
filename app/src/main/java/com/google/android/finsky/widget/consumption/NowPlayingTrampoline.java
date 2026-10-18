package com.google.android.finsky.widget.consumption;

import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pt;

/* loaded from: classes.dex */
public class NowPlayingTrampoline extends com.google.android.finsky.widget.q {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.q
    public final Class<? extends com.google.android.finsky.widget.a> g() {
        return NowPlayingWidgetProvider.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final boolean c(int i) {
        return i != 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final String b(int i) {
        pt a2;
        DfeToc dfeToc = FinskyApp.a().g;
        return (dfeToc == null || (a2 = dfeToc.a(i)) == null) ? getString(R.string.widget_now_playing) : a2.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.widget.f
    public final int i() {
        return R.string.widget_now_playing_family;
    }
}
