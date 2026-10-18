package com.google.android.play.dfe.api;

/* loaded from: classes.dex */
public interface DfeResponseVerifier {
    String a();

    void a(byte[] bArr, String str);

    public class DfeResponseVerifierException extends Exception {
        public DfeResponseVerifierException(String str) {
            super(str);
        }
    }
}
