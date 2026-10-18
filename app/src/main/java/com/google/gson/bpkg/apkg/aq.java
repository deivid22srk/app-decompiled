package com.google.gson.bpkg.apkg;

import java.util.Locale;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class aq extends com.google.gson.aj<Locale> {
    aq() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Locale locale) {
        Locale locale2 = locale;
        fVar.b(locale2 == null ? null : locale2.toString());
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Locale a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.i(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (nextToken2 == null && nextToken3 == null) {
            return new Locale(nextToken);
        }
        if (nextToken3 == null) {
            return new Locale(nextToken, nextToken2);
        }
        return new Locale(nextToken, nextToken2, nextToken3);
    }
}
