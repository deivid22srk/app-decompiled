package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class is implements ea {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ in f6068a;

    private is(in inVar) {
        this.f6068a = inVar;
    }

    /* synthetic */ is(in inVar, byte b2) {
        this(inVar);
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        if (map.keySet().contains("start")) {
            in.a(this.f6068a);
        } else if (map.keySet().contains("stop")) {
            in.b(this.f6068a);
        } else if (map.keySet().contains("cancel")) {
            in.c(this.f6068a);
        }
    }
}
