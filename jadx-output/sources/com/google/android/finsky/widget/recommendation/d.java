package com.google.android.finsky.widget.recommendation;

import android.content.Context;
import com.android.volley.t;
import com.google.android.finsky.g.p;
import com.google.android.finsky.protos.je;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class d implements t<je> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RecommendationList f5232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f5233b;
    final /* synthetic */ Context c;
    final /* synthetic */ int d;

    d(RecommendationList recommendationList, p pVar, Context context, int i) {
        this.f5232a = recommendationList;
        this.f5233b = pVar;
        this.c = context;
        this.d = i;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(je jeVar) {
        RecommendationList b2;
        ExecutorService executorService;
        b2 = c.b(jeVar, this.f5232a.f5229b, this.f5233b);
        RecommendationList recommendationList = this.f5232a;
        recommendationList.size();
        recommendationList.c = b2.c;
        recommendationList.addAll(b2);
        recommendationList.size();
        executorService = c.f5231a;
        executorService.execute(new e(this));
    }
}
