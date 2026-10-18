package com.google.gson.bpkg;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class v {
    public static com.google.gson.y a(com.google.gson.stream.a aVar) {
        boolean z = true;
        try {
            aVar.f();
            z = false;
            return com.google.gson.bpkg.apkg.aa.N.a(aVar);
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException(e);
        } catch (EOFException e2) {
            if (z) {
                return com.google.gson.z.f7873a;
            }
            throw new JsonIOException(e2);
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        } catch (NumberFormatException e4) {
            throw new JsonSyntaxException(e4);
        }
    }

    public static void a(com.google.gson.y yVar, com.google.gson.stream.f fVar) {
        com.google.gson.bpkg.apkg.aa.N.a(fVar, yVar);
    }
}
