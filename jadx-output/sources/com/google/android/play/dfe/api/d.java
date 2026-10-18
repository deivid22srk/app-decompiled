package com.google.android.play.dfe.api;

import android.net.Uri;
import com.android.volley.l;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.protos.lj;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f6837a = Uri.parse("https://android.clients.google.com/fdfe/");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f6838b = Uri.parse("api/plusProfile");
    public static final Uri c = Uri.parse("api/experiments");

    l<?> a(t<lj> tVar, s sVar, boolean z);

    void a();
}
