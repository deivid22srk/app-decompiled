package com.google.android.wallet.ui.address;

import android.os.AsyncTask;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class o extends AsyncTask<com.google.android.wallet.common.apkg.d, Void, com.google.c.a.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7395a;

    /* renamed from: b, reason: collision with root package name */
    private final View f7396b;
    private final String c;
    private final ArrayList<com.google.android.wallet.common.apkg.c> d;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ com.google.c.a.b doInBackground(com.google.android.wallet.common.apkg.d[] dVarArr) {
        com.google.android.wallet.common.apkg.d dVar = dVarArr[0];
        if (dVar == null || dVar.g == null) {
            return null;
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            com.google.android.wallet.common.apkg.c cVar = this.d.get(i);
            if (dVar.g.equals(cVar.a())) {
                return cVar.a(dVar.h, this.c);
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(com.google.c.a.b bVar) {
        com.google.c.a.b bVar2 = bVar;
        if (this.f7395a.f() == null) {
            return;
        }
        super.onPostExecute(bVar2);
        if (bVar2 == null) {
            return;
        }
        b.a(this.f7395a, this.f7396b, bVar2);
    }

    public o(b bVar, View view) {
        String U;
        ArrayList<com.google.android.wallet.common.apkg.c> arrayList;
        this.f7395a = bVar;
        this.f7396b = view;
        U = bVar.U();
        this.c = U;
        if (bVar.aq != null) {
            arrayList = new ArrayList<>(bVar.aq);
        } else {
            arrayList = new ArrayList<>();
        }
        this.d = arrayList;
    }
}
