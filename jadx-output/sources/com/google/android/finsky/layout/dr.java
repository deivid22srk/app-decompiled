package com.google.android.finsky.layout;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
public final class dr implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ny f3236a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RottenTomatoesReviewItem f3237b;

    public dr(RottenTomatoesReviewItem rottenTomatoesReviewItem, ny nyVar) {
        this.f3237b = rottenTomatoesReviewItem;
        this.f3236a = nyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(this.f3236a.k));
        this.f3237b.getContext().startActivity(intent);
    }
}
