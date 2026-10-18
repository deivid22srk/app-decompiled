package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.data.i implements com.google.android.gms.wearable.l {
    private final int c;

    public g(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    @Override // com.google.android.gms.wearable.l
    public final Uri b() {
        return Uri.parse(c("path"));
    }

    @Override // com.google.android.gms.wearable.l
    public final byte[] c() {
        return d("data");
    }

    @Override // com.google.android.gms.wearable.l
    public final Map<String, com.google.android.gms.wearable.m> d() {
        HashMap hashMap = new HashMap(this.c);
        for (int i = 0; i < this.c; i++) {
            d dVar = new d(this.f5624a, this.f5625b + i);
            if (dVar.c("asset_key") != null) {
                hashMap.put(dVar.c("asset_key"), dVar);
            }
        }
        return hashMap;
    }

    public final String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] d = d("data");
        Map<String, com.google.android.gms.wearable.m> d2 = d();
        StringBuilder sb = new StringBuilder("DataItemInternal{ ");
        sb.append("uri=" + b());
        sb.append(", dataSz=" + (d == null ? "null" : Integer.valueOf(d.length)));
        sb.append(", numAssets=" + d2.size());
        if (isLoggable && !d2.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            Iterator<Map.Entry<String, com.google.android.gms.wearable.m>> it = d2.entrySet().iterator();
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

    @Override // com.google.android.gms.common.data.f
    public final /* synthetic */ com.google.android.gms.wearable.l a() {
        return new e(this);
    }
}
