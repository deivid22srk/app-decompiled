package com.google.android.finsky.installer;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* loaded from: classes.dex */
public interface s {
    int a();

    OutputStream a(String str, String str2, long j);

    void a(OutputStream outputStream);

    void a(String str, long j, long j2);

    void a(String str, long j, String str2, int i);

    void a(String str, Bitmap bitmap);

    void a(String str, Uri uri);

    void a(String str, boolean z);

    void a(String str, boolean z, t tVar);

    void a(List<String> list);

    boolean a(String str);

    boolean a(boolean z);

    void b(String str);
}
