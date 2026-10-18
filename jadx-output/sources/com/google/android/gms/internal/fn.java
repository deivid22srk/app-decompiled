package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* loaded from: classes.dex */
final class fn implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fm f5978a;

    fn(fm fmVar) {
        this.f5978a = fmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fm fmVar = this.f5978a;
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", fmVar.f5977b);
        data.putExtra("eventLocation", fmVar.f);
        data.putExtra("description", fmVar.e);
        if (fmVar.c > -1) {
            data.putExtra("beginTime", fmVar.c);
        }
        if (fmVar.d > -1) {
            data.putExtra("endTime", fmVar.d);
        }
        data.setFlags(268435456);
        com.google.android.gms.ads.internal.d.c();
        hk.a(this.f5978a.f5976a, data);
    }
}
