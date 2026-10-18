package com.google.android.gms.internal;

import android.net.http.SslError;
import android.webkit.WebChromeClient;

/* loaded from: classes.dex */
public class hq extends ho {
    @Override // com.google.android.gms.internal.ho, com.google.android.gms.internal.hm
    public final WebChromeClient a(im imVar) {
        return new ji(imVar);
    }

    @Override // com.google.android.gms.internal.hm
    public final String a(SslError sslError) {
        return sslError.getUrl();
    }
}
