package com.google.android.play.image;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class d extends android.support.v4.h.g<String, ArrayList<c>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f6936a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.h.g
    public final /* synthetic */ int c(ArrayList<c> arrayList) {
        ArrayList<c> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Bitmap bitmap = arrayList2.get(i2).f6934a;
            i += bitmap.getHeight() * bitmap.getRowBytes();
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, int i) {
        super(i);
        this.f6936a = bVar;
    }
}
