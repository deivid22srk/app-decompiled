package com.google.android.finsky.adapters;

import android.support.design.widget.Snackbar;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.ff;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.layout.dl;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
final class ar implements dl {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny f1897a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ av f1898b;
    final /* synthetic */ aq c;

    ar(aq aqVar, ny nyVar, av avVar) {
        this.c = aqVar;
        this.f1897a = nyVar;
        this.f1898b = avVar;
    }

    @Override // com.google.android.finsky.layout.dl
    public final void a(ReviewItemLayout reviewItemLayout) {
        aq aqVar = this.c;
        aqVar.a(reviewItemLayout, ff.HELPFUL, this.f1897a);
        Toast.makeText(aqVar.t, R.string.review_feedback_posted, 0).show();
    }

    @Override // com.google.android.finsky.layout.dl
    public final void b(ReviewItemLayout reviewItemLayout) {
        aq aqVar = this.c;
        av avVar = this.f1898b;
        ny c = aqVar.d.c(avVar.f1904b);
        int indexOf = aqVar.g.indexOf(avVar);
        aqVar.a(reviewItemLayout, ff.SPAM, c);
        aqVar.g.remove(indexOf);
        Snackbar.a(reviewItemLayout).a(new at(aqVar, c, indexOf, avVar)).a();
        aqVar.e(indexOf);
    }
}
