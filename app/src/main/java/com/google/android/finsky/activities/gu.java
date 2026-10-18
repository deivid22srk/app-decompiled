package com.google.android.finsky.activities;

import android.os.Handler;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class gu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    boolean f1782a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f1783b;
    private List<ed> c;
    private int d;

    private gu() {
        this.f1783b = new Handler();
        this.c = new ArrayList();
        this.d = 0;
    }

    /* synthetic */ gu(byte b2) {
        this();
    }

    private void a() {
        jm.a();
        for (ed edVar : this.c) {
            edVar.e = false;
            edVar.d();
        }
        this.c.clear();
        this.f1782a = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            a();
        }
    }

    static /* synthetic */ void a(gu guVar) {
        guVar.f1782a = true;
        guVar.f1783b.postDelayed(guVar, 500L);
    }

    static /* synthetic */ void a(gu guVar, int i) {
        jm.a();
        guVar.d = i;
        if (i == 2) {
            guVar.f1783b.removeCallbacks(guVar);
            guVar.f1782a = true;
        }
        if (i != 0) {
            return;
        }
        guVar.a();
    }
}
