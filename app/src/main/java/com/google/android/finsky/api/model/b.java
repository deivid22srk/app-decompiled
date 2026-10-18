package com.google.android.finsky.api.model;

import android.os.AsyncTask;
import com.android.volley.VolleyError;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class b<T> extends AsyncTask<VolleyError, Void, T> {

    /* renamed from: a, reason: collision with root package name */
    VolleyError f1967a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1968b;

    b(a aVar) {
        this.f1968b = aVar;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(VolleyError[] volleyErrorArr) {
        this.f1967a = volleyErrorArr[0];
        return this.f1968b.b();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        com.google.protobuf.nano.c cVar = (com.google.protobuf.nano.c) obj;
        if (cVar == null) {
            super/*com.google.android.finsky.api.model.j*/.a(this.f1967a);
        } else {
            this.f1968b.b((a) cVar);
        }
    }
}
