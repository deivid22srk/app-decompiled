package com.google.android.play.image;

import android.graphics.Bitmap;
import com.google.android.play.utils.PlayCommonLog;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f6944a;

    /* renamed from: b, reason: collision with root package name */
    k f6945b;
    final String c;
    final int d;
    final int e;
    final /* synthetic */ e f;
    private final String g;

    public j(e eVar, Bitmap bitmap, String str, String str2, int i, int i2, k kVar) {
        this.f = eVar;
        this.f6944a = bitmap;
        this.c = str;
        this.g = str2;
        this.d = i;
        this.e = i2;
        this.f6945b = kVar;
    }

    public final void a() {
        boolean z;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        if (this.f6945b != null) {
            z = this.f.k;
            if (!z) {
                hashMap = this.f.f6937a;
                n nVar = (n) hashMap.get(this.g);
                if (nVar == null) {
                    hashMap2 = this.f.g;
                    n nVar2 = (n) hashMap2.get(this.g);
                    if (nVar2 != null && nVar2.a(this)) {
                        hashMap3 = this.f.g;
                        hashMap3.remove(this.g);
                        return;
                    }
                    return;
                }
                if (nVar.a(this)) {
                    hashMap4 = this.f.f6937a;
                    hashMap4.remove(this.g);
                    return;
                }
                return;
            }
            PlayCommonLog.d("Attempt to cancel a bitmap request from BitmapLoadedHandler.onResponse", new Object[0]);
        }
    }
}
