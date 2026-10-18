package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.f;
import com.google.android.libraries.bind.data.g;

/* loaded from: classes.dex */
public class b extends FrameLayout implements f {

    /* renamed from: a, reason: collision with root package name */
    private final g f6721a;

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6721a = new g(context, attributeSet, this);
    }

    @Override // com.google.android.libraries.bind.data.f
    public final void a_(Data data) {
        this.f6721a.a(data);
    }
}
