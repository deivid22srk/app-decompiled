package com.android.ex.photo.epkg;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d extends c {
    public byte[] c;

    public d(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.android.ex.photo.epkg.c, com.android.ex.photo.epkg.f
    public final InputStream a() {
        if (this.c == null) {
            this.c = a(this.f1154b);
            if (this.c == null) {
                return super.a();
            }
        }
        return new ByteArrayInputStream(this.c);
    }

    public static byte[] a(Uri uri) {
        Pattern pattern;
        byte[] bArr = null;
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        try {
            if (!schemeSpecificPart.startsWith("base64,")) {
                pattern = b.f1152b;
                if (pattern.matcher(schemeSpecificPart).matches()) {
                    bArr = Base64.decode(schemeSpecificPart.substring(schemeSpecificPart.indexOf("base64,") + 7), 0);
                }
            } else {
                bArr = Base64.decode(schemeSpecificPart.substring(7), 8);
            }
        } catch (IllegalArgumentException e) {
            Log.e("ImageUtils", "Mailformed data URI: " + e);
        }
        return bArr;
    }
}
