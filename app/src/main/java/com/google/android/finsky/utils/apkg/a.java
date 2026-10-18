package com.google.android.finsky.utils.apkg;

import android.view.ViewGroup;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.play.image.FifeImageView;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public static ds a(Document document, int i, int i2, int[] iArr) {
        for (int i3 : iArr) {
            ds a2 = a(document.b(i3), i, i2);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static ds a(List<ds> list, int i, int i2) {
        int i3;
        int i4;
        int i5 = Integer.MAX_VALUE;
        if (list == null) {
            return null;
        }
        int size = list.size();
        int i6 = 0;
        ds dsVar = null;
        int i7 = Integer.MAX_VALUE;
        while (i6 < size) {
            ds dsVar2 = list.get(i6);
            if (!dsVar2.l) {
                if (dsVar2.e != null) {
                    int i8 = dsVar2.e.f3750a;
                    int i9 = dsVar2.e.c;
                    if (i8 >= i && i9 >= i2 && i7 >= i8 && i5 >= i9) {
                        i4 = i9;
                        i3 = i8;
                        i6++;
                        i7 = i3;
                        i5 = i4;
                        dsVar = dsVar2;
                    }
                }
                dsVar2 = dsVar;
                i3 = i7;
                i4 = i5;
                i6++;
                i7 = i3;
                i5 = i4;
                dsVar = dsVar2;
            } else {
                return dsVar2;
            }
        }
        if (dsVar != null) {
            return dsVar;
        }
        if (list.size() > 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    public static void a(FifeImageView fifeImageView, ds dsVar) {
        if (dsVar.e != null && dsVar.e.f3751b && dsVar.e.d && dsVar.e.f3750a > dsVar.e.c) {
            ViewGroup.LayoutParams layoutParams = fifeImageView.getLayoutParams();
            layoutParams.width = (int) ((dsVar.e.f3750a / dsVar.e.c) * layoutParams.height);
            fifeImageView.requestLayout();
        }
    }
}
