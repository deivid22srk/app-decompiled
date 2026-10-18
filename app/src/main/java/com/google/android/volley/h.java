package com.google.android.volley;

import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;

/* loaded from: classes.dex */
final class h<T> implements ResponseHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ GoogleHttpClient f7203a;

    /* renamed from: b, reason: collision with root package name */
    private final ResponseHandler<T> f7204b;
    private final HttpUriRequest c;
    private final com.google.android.d.a d;

    /* synthetic */ h(GoogleHttpClient googleHttpClient, ResponseHandler responseHandler, HttpUriRequest httpUriRequest, com.google.android.d.a aVar, byte b2) {
        this(googleHttpClient, responseHandler, httpUriRequest, aVar);
    }

    private h(GoogleHttpClient googleHttpClient, ResponseHandler<T> responseHandler, HttpUriRequest httpUriRequest, com.google.android.d.a aVar) {
        this.f7203a = googleHttpClient;
        this.f7204b = responseHandler;
        this.c = httpUriRequest;
        this.d = aVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) {
        return this.f7204b.handleResponse(com.google.android.d.b.a(this.c, httpResponse, this.d));
    }
}
