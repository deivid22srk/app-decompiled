package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.zzaij;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f6634a;

    /* renamed from: b, reason: collision with root package name */
    public final o f6635b;

    public p(l lVar) {
        this.f6634a = lVar.b();
        this.f6635b = a(lVar.a());
    }

    private static o a(l lVar) {
        if (lVar.c() == null && lVar.d().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (lVar.c() == null) {
            return new o();
        }
        try {
            ArrayList arrayList = new ArrayList();
            int size = lVar.d().size();
            for (int i = 0; i < size; i++) {
                m mVar = lVar.d().get(Integer.toString(i));
                if (mVar == null) {
                    throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i + " for " + lVar);
                }
                arrayList.add(Asset.a(mVar.b()));
            }
            return com.google.android.gms.internal.e.a(new com.google.android.gms.internal.f(com.google.android.gms.internal.g.a(lVar.c()), arrayList));
        } catch (zzaij | NullPointerException e) {
            Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + lVar.b() + ", data=" + Base64.encodeToString(lVar.c(), 0));
            throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=" + lVar.b(), e);
        }
    }
}
