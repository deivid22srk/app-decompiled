package com.google.android.finsky.api.a;

import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import org.keyczar.KeyMetadata;
import org.keyczar.Keyczar;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyczarReader;

/* loaded from: classes.dex */
public final class a implements KeyczarReader {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f1949a = Charset.forName(Keyczar.DEFAULT_ENCODING);

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f1950b;
    private final String c;

    public a(Resources resources, String str) {
        this.f1950b = resources.getAssets();
        this.c = str;
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public final String getKey() {
        return a(String.valueOf(KeyMetadata.read(getMetadata()).getPrimaryVersion().getVersionNumber()));
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public final String getKey(int i) {
        return a(String.valueOf(i));
    }

    @Override // org.keyczar.interfaces.KeyczarReader
    public final String getMetadata() {
        return a("meta");
    }

    private String a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[1024];
            AssetManager assetManager = this.f1950b;
            if (this.c != null) {
                str = this.c + File.separator + str;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(assetManager.open(str), f1949a);
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read > 0) {
                    sb.append(cArr, 0, read);
                } else {
                    return sb.toString();
                }
            }
        } catch (IOException e) {
            throw new KeyczarException("Couldn't read Keyczar 'meta' file from assets/", e);
        }
    }
}
