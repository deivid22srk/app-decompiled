package com.android.ex.photo.e;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
class c implements f {

    /* renamed from: a, reason: collision with root package name */
    protected final ContentResolver f1153a;

    /* renamed from: b, reason: collision with root package name */
    protected final Uri f1154b;

    public c(ContentResolver contentResolver, Uri uri) {
        this.f1153a = contentResolver;
        this.f1154b = uri;
    }

    @Override // com.android.ex.photo.e.f
    public InputStream a() {
        return this.f1153a.openInputStream(this.f1154b);
    }
}
