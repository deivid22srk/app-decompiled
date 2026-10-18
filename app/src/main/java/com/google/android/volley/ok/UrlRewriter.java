package com.google.android.volley.ok;

import java.io.IOException;

/* loaded from: classes.dex */
public interface UrlRewriter {
    String a(String str);

    public class BlockedRequestException extends IOException {
        BlockedRequestException(String str) {
            super("Blocked by rule: " + str);
        }
    }
}
