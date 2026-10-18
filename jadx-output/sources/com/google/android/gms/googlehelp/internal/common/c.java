package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class c implements com.google.android.gms.googlehelp.f {

    /* renamed from: a, reason: collision with root package name */
    private static final Status f5831a = new Status(13);

    @Override // com.google.android.gms.googlehelp.f
    public final com.google.android.gms.common.api.u<Status> a(com.google.android.gms.common.api.m mVar) {
        return mVar.a((com.google.android.gms.common.api.m) new j(this, mVar));
    }

    @Override // com.google.android.gms.googlehelp.f
    public final com.google.android.gms.common.api.u<Status> b(com.google.android.gms.common.api.m mVar) {
        return mVar.a((com.google.android.gms.common.api.m) new l(this, mVar));
    }

    @Override // com.google.android.gms.googlehelp.f
    public final com.google.android.gms.common.api.u<Status> b(com.google.android.gms.common.api.m mVar, Activity activity) {
        return mVar.a((com.google.android.gms.common.api.m) new h(this, mVar, activity));
    }

    @Override // com.google.android.gms.googlehelp.f
    public final com.google.android.gms.common.api.u<Status> a(com.google.android.gms.common.api.m mVar, Activity activity, Intent intent) {
        return mVar.a((com.google.android.gms.common.api.m) new d(this, mVar, intent, com.google.android.gms.googlehelp.e.f5818a ? q.a(activity) : null, activity));
    }

    @Override // com.google.android.gms.googlehelp.f
    public final com.google.android.gms.common.api.u<Status> a(com.google.android.gms.common.api.m mVar, Activity activity) {
        return mVar.a((com.google.android.gms.common.api.m) new f(this, mVar, com.google.android.gms.googlehelp.e.f5818a ? q.a(activity) : null, activity));
    }
}
