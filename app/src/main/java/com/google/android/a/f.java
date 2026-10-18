package com.google.android.a;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.os.Handler;
import java.util.HashMap;

/* loaded from: classes.dex */
final class f extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f1411a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, Handler handler) {
        super(handler);
        this.f1411a = eVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        HashMap hashMap;
        String[] strArr;
        String[] strArr2;
        synchronized (d.class) {
            hashMap = d.e;
            hashMap.clear();
            Object unused = d.f = new Object();
            strArr = d.g;
            if (strArr.length > 0) {
                ContentResolver contentResolver = this.f1411a.f1410a;
                strArr2 = d.g;
                d.b(contentResolver, strArr2);
            }
        }
    }
}
