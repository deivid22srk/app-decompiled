package com.google.android.gms.internal;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

/* loaded from: classes.dex */
public final class py extends HttpEntityEnclosingRequestBase {
    public py() {
    }

    public py(String str) {
        setURI(URI.create(str));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public final String getMethod() {
        return "PATCH";
    }
}
