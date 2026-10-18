package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AddressFieldsLayoutFroyo extends e {
    private boolean d;

    public AddressFieldsLayoutFroyo(Context context) {
        this(context, null);
    }

    public AddressFieldsLayoutFroyo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressFieldsLayoutFroyo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
    }

    @Override // com.google.android.finsky.layout.e
    public final void a() {
        this.c.setVisibility(0);
    }

    @Override // com.google.android.finsky.layout.e
    public final void b() {
        this.c.setVisibility(8);
    }

    @Override // com.google.android.finsky.layout.e
    public final void c() {
        this.f3249a.setVisibility(8);
        setChildrenViewVisibility(0);
    }

    @Override // com.google.android.finsky.layout.e
    public final void d() {
        this.f3249a.setVisibility(0);
        setChildrenViewVisibility(8);
    }

    @Override // com.google.android.finsky.layout.e
    public void setOnHeightOffsetChangedListener(co coVar) {
    }

    private void setChildrenViewVisibility(int i) {
        int childCount = this.f3250b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.f3250b.getChildAt(i2).setVisibility(i);
        }
    }

    @Override // com.google.android.finsky.layout.e
    public void setFields(List<View> list) {
        this.f3250b.removeAllViews();
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            this.f3250b.addView(it.next(), new LinearLayout.LayoutParams(-1, -2));
        }
        if (this.d) {
            this.f3249a.setVisibility(8);
            setChildrenViewVisibility(0);
        } else {
            this.f3249a.setVisibility(0);
            setChildrenViewVisibility(8);
        }
    }
}
