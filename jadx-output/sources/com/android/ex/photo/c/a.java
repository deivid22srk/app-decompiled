package com.android.ex.photo.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.android.ex.photo.k;

/* loaded from: classes.dex */
public class a extends android.support.v4.b.a<c> implements b {
    private String f;
    private Bitmap g;

    @Override // android.support.v4.b.a
    public final /* bridge */ /* synthetic */ void a(c cVar) {
        c cVar2 = cVar;
        super.a((a) cVar2);
        if (cVar2 == null) {
            return;
        }
        a(cVar2.f1146b);
    }

    public a(Context context, String str) {
        super(context);
        this.f = str;
    }

    @Override // com.android.ex.photo.c.b
    public final void a(String str) {
        this.f = str;
    }

    @Override // android.support.v4.b.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c d() {
        c cVar = new c();
        Context context = this.q;
        if (context != null && this.f != null) {
            try {
                cVar = com.android.ex.photo.e.b.a(context.getContentResolver(), Uri.parse(this.f), k.f1162b);
                if (cVar.f1146b != null) {
                    cVar.f1146b.setDensity(160);
                }
            } catch (UnsupportedOperationException e) {
                cVar.c = 1;
            }
        }
        return cVar;
    }

    @Override // android.support.v4.b.n
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final void b(c cVar) {
        Bitmap bitmap = cVar != null ? cVar.f1146b : null;
        if (this.t) {
            if (bitmap != null) {
                a(bitmap);
                return;
            }
            return;
        }
        Bitmap bitmap2 = this.g;
        this.g = bitmap;
        if (this.r) {
            super.b(cVar);
        }
        if (bitmap2 != null && bitmap2 != bitmap && !bitmap2.isRecycled()) {
            a(bitmap2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.b.n
    public final void g() {
        if (this.g != null) {
            c cVar = new c();
            cVar.c = 0;
            cVar.f1146b = this.g;
            b(cVar);
        }
        if (l() || this.g == null) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.b.n
    public final void h() {
        j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.b.n
    public final void i() {
        super.i();
        j();
        if (this.g != null) {
            a(this.g);
            this.g = null;
        }
    }

    public void a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }
}
