package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.api.model.Document;
import com.google.android.play.image.FifeImageView;
import java.util.Arrays;

/* loaded from: classes.dex */
public class DocImageView extends FifeImageView {
    private Document e;
    private int[] f;

    public DocImageView(Context context) {
        this(context, null);
    }

    public DocImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(Document document, com.google.android.play.image.e eVar, int... iArr) {
        if (!(this.e != null && this.e == document && Arrays.equals(this.f, iArr))) {
            this.e = document;
            this.f = iArr;
            int width = getWidth();
            int height = getHeight();
            com.google.android.finsky.protos.ds a2 = height > 0 ? com.google.android.finsky.utils.a.a.a(this.e, 0, height, this.f) : com.google.android.finsky.utils.a.a.a(this.e, width, 0, this.f);
            if (a2 != null) {
                a(a2.f, a2.l, eVar);
            } else {
                a();
            }
        }
    }

    @Override // com.google.android.play.image.FifeImageView
    public final void a() {
        super.a();
        this.e = null;
        this.f = null;
    }
}
