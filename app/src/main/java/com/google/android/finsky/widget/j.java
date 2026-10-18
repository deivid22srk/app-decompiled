package com.google.android.finsky.widget;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/* loaded from: classes.dex */
final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5214a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f5215b;

    j(i iVar, int i) {
        this.f5215b = iVar;
        this.f5214a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Activity activity;
        Activity activity2;
        Intent intent = new Intent();
        intent.putExtra("backend", this.f5214a);
        i = this.f5215b.d;
        intent.putExtra("appWidgetId", i);
        activity = this.f5215b.f5212a;
        activity.setResult(-1, intent);
        activity2 = this.f5215b.f5212a;
        activity2.finish();
    }
}
