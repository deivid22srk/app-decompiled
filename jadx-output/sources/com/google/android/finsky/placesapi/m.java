package com.google.android.finsky.placesapi;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f3572a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3573b;
    private final String c;

    public m(String str, String str2, a aVar) {
        this.c = str;
        this.f3572a = str2;
        this.f3573b = aVar;
    }

    public final String a(StringBuilder sb) {
        sb.append("&key=").append(this.c).append("&sensor=true");
        return "https://maps.googleapis.com".concat(sb.toString());
    }
}
