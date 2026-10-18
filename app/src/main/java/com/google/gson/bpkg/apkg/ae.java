package com.google.gson.bpkg.apkg;

import com.google.gson.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class ae extends com.google.gson.aj<Character> {
    ae() {
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ void a(com.google.gson.stream.f fVar, Character ch) {
        Character ch2 = ch;
        fVar.b(ch2 == null ? null : String.valueOf(ch2));
    }

    @Override // com.google.gson.aj
    public final /* synthetic */ Character a(com.google.gson.stream.a aVar) {
        if (aVar.f() == com.google.gson.stream.e.NULL) {
            aVar.k();
            return null;
        }
        String i = aVar.i();
        if (i.length() != 1) {
            throw new JsonSyntaxException("Expecting character, got: " + i);
        }
        return Character.valueOf(i.charAt(0));
    }
}
