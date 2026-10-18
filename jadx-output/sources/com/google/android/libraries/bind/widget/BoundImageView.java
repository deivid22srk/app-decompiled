package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.f;
import com.google.android.libraries.bind.data.g;
import com.google.android.libraries.bind.e;

/* loaded from: classes.dex */
public class BoundImageView extends ImageView implements f {

    /* renamed from: a, reason: collision with root package name */
    private final g f6717a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6718b;
    private Integer c;
    private Integer d;

    public BoundImageView(Context context) {
        this(context, null);
    }

    public BoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6717a = new g(context, attributeSet, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.BoundImageView, i, 0);
        this.f6718b = g.a(obtainStyledAttributes, e.BoundImageView_bindImageUri);
        this.c = g.a(obtainStyledAttributes, e.BoundImageView_bindDrawable);
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.libraries.bind.data.f
    public final void a_(Data data) {
        this.f6717a.a(data);
        if (this.f6718b != null) {
            Object b2 = data.b(this.f6718b.intValue());
            if (b2 instanceof Uri) {
                setImageURI((Uri) b2);
            } else {
                setImageURI(null);
            }
        }
        if (this.c != null) {
            Integer c = data == null ? null : data.c(this.c.intValue());
            if (!com.google.android.libraries.bind.d.a.a(this.d, c)) {
                this.d = c;
                setImageDrawable(c != null ? getContext().getResources().getDrawable(c.intValue()) : null);
            }
        }
    }
}
