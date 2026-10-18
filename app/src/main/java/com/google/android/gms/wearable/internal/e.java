package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements com.google.android.gms.wearable.l {

    /* renamed from: a, reason: collision with root package name */
    private Uri f6628a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f6629b;
    private Map<String, com.google.android.gms.wearable.m> c;

    public e(com.google.android.gms.wearable.l lVar) {
        this.f6628a = lVar.b();
        this.f6629b = lVar.c();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, com.google.android.gms.wearable.m> entry : lVar.d().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put(entry.getKey(), entry.getValue().a());
            }
        }
        this.c = Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.l a() {
        return this;
    }

    @Override // com.google.android.gms.wearable.l
    public final Uri b() {
        return this.f6628a;
    }

    @Override // com.google.android.gms.wearable.l
    public final byte[] c() {
        return this.f6629b;
    }

    @Override // com.google.android.gms.wearable.l
    public final Map<String, com.google.android.gms.wearable.m> d() {
        return this.c;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        sb.append("uri=" + this.f6628a);
        sb.append(", dataSz=" + (this.f6629b == null ? "null" : Integer.valueOf(this.f6629b.length)));
        sb.append(", numAssets=" + this.c.size());
        if (isLoggable && !this.c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            Iterator<Map.Entry<String, com.google.android.gms.wearable.m>> it = this.c.entrySet().iterator();
            while (true) {
                String str2 = str;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, com.google.android.gms.wearable.m> next = it.next();
                sb.append(str2 + next.getKey() + ": " + next.getValue().b());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
