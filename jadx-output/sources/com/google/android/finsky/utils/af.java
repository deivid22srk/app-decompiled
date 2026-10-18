package com.google.android.finsky.utils;

import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.lj;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class af implements com.android.volley.t<lj> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f4729a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f4730b;

    af(ae aeVar, Collection collection) {
        this.f4730b = aeVar;
        this.f4729a = collection;
    }

    @Override // com.android.volley.t
    public final /* synthetic */ void a_(lj ljVar) {
        Document document;
        Map map;
        String str;
        lj ljVar2 = ljVar;
        if (ljVar2.f4082a == null) {
            if (FinskyApp.a().g.f1961a.D) {
                str = this.f4730b.f4728a.h;
                FinskyLog.d("Error getting user's g+ profile: %s", FinskyLog.a(str));
                return;
            }
            document = null;
        } else {
            document = new Document(ljVar2.f4082a);
        }
        Iterator it = this.f4729a.iterator();
        while (it.hasNext()) {
            ah a2 = ah.a((Map) it.next(), document);
            if (a2 != null) {
                map = this.f4730b.f4728a.f4726b;
                map.put(a2.f4733b, a2);
            }
        }
    }
}
