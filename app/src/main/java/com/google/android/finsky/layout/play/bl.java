package com.google.android.finsky.layout.play;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.fe;

/* loaded from: classes.dex */
final class bl implements ch {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardRateAndSuggestClusterView f3442b;

    bl(PlayCardRateAndSuggestClusterView playCardRateAndSuggestClusterView, PlayCardViewRate playCardViewRate) {
        this.f3442b = playCardRateAndSuggestClusterView;
        this.f3441a = playCardViewRate;
    }

    @Override // com.google.android.finsky.layout.play.ch
    public final void a() {
        fe.a(this.f3441a, (Document) this.f3441a.getData(), FinskyApp.a().b((String) null), this.f3442b, (cy) this.f3441a.getLoggingData());
    }
}
