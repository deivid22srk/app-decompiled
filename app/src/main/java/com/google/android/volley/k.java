package com.google.android.volley;

import android.content.Context;
import com.android.volley.w;

/* loaded from: classes.dex */
public final class k extends com.android.volley.apkg.j {

    /* renamed from: b, reason: collision with root package name */
    private final GoogleHttpClient f7208b;

    public k(Context context, boolean z) {
        this(new GoogleHttpClient(context, "unused/0"), z);
    }

    private k(GoogleHttpClient googleHttpClient, boolean z) {
        super(googleHttpClient);
        this.f7208b = googleHttpClient;
        if (z) {
            String str = w.f1257a;
            a aVar = googleHttpClient.f7177a;
            if (str == null) {
                throw new NullPointerException("name");
            }
            aVar.f7180b = new f(str, (byte) 0);
        }
    }
}
