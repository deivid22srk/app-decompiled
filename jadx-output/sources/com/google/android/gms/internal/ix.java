package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@gw
/* loaded from: classes.dex */
public final class ix extends MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    Activity f6074a;

    /* renamed from: b, reason: collision with root package name */
    Context f6075b;
    private Context c;

    public ix(Context context) {
        super(context);
        setBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f6075b.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        this.c = context.getApplicationContext();
        this.f6074a = context instanceof Activity ? (Activity) context : null;
        this.f6075b = context;
        super.setBaseContext(this.c);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        if (this.f6074a != null && !com.google.android.gms.common.c.g.a(21)) {
            this.f6074a.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            this.c.startActivity(intent);
        }
    }
}
