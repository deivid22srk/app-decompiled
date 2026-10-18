package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.util.List;

/* loaded from: classes.dex */
final class ao implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ as f1551b;
    final /* synthetic */ List c;
    final /* synthetic */ ab d;

    ao(ab abVar, String str, as asVar, List list) {
        this.d = abVar;
        this.f1550a = str;
        this.f1551b = asVar;
        this.c = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Toast.makeText(this.d, this.f1550a, 1).show();
        this.f1551b.a((as) this.c.get(i));
        new Handler(Looper.getMainLooper()).postDelayed(new ap(this), 3000L);
    }
}
