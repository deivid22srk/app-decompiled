package com.android.volley.apkg;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* loaded from: classes.dex */
public final class k extends HttpEntityEnclosingRequestBase {
    public k() {
    }

    public k(String str) {
        setURI(URI.create(str));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public final String getMethod() {
        return "PATCH";
    }
}
