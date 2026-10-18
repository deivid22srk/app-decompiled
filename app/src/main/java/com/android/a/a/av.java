package com.android.a.a;

/* loaded from: classes.dex */
final class av {

    /* renamed from: a, reason: collision with root package name */
    String f1087a;

    /* renamed from: b, reason: collision with root package name */
    String f1088b;

    /* synthetic */ av(byte b2) {
        this();
    }

    /* synthetic */ av(av avVar, byte b2) {
        this(avVar);
    }

    private av() {
    }

    private av(av avVar) {
        be.a(avVar);
        this.f1087a = avVar.f1087a;
        this.f1088b = avVar.f1088b;
    }

    public final String a() {
        return this.f1088b != null ? this.f1088b : this.f1087a;
    }

    final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(this.f1087a) || str.equalsIgnoreCase(this.f1088b);
    }
}
