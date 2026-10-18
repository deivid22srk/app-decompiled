package com.google.android.wallet.ui.address;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.wallet.ui.common.bj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DynamicAddressFieldsLayout extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    View f7374a;

    /* renamed from: b, reason: collision with root package name */
    RelativeLayout f7375b;
    t c;
    private SparseBooleanArray d;

    public DynamicAddressFieldsLayout(Context context) {
        this(context, null);
    }

    public DynamicAddressFieldsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicAddressFieldsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f7374a = ((ViewStub) findViewById(com.google.android.wallet.e.g.progress_bar)).inflate();
        this.f7375b = (RelativeLayout) findViewById(com.google.android.wallet.e.g.dynamic_address_fields_container);
    }

    public void setFields(ArrayList<View> arrayList) {
        a(arrayList);
    }

    protected final void a(ArrayList<View> arrayList) {
        this.f7375b.removeViews(1, this.f7375b.getChildCount() - 1);
        int size = arrayList.size();
        this.d = new SparseBooleanArray(size);
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (i > 0) {
                layoutParams.addRule(bj.a(3), arrayList.get(i - 1).getId());
            }
            this.d.put(view.getId(), view.getVisibility() != 0);
            this.f7375b.addView(view, layoutParams);
        }
    }

    public void a() {
        this.f7374a.setVisibility(8);
        setAddressFieldsVisibility(0);
    }

    public void b() {
        this.f7374a.setVisibility(0);
        setAddressFieldsVisibility(4);
    }

    protected void setAddressFieldsVisibility(int i) {
        int childCount = this.f7375b.getChildCount();
        for (int i2 = 1; i2 < childCount; i2++) {
            View childAt = this.f7375b.getChildAt(i2);
            if (!this.d.get(childAt.getId())) {
                childAt.setVisibility(i);
            }
        }
    }

    public void a(View view, View view2) {
        int indexOfChild = this.f7375b.indexOfChild(view);
        if (indexOfChild < 0) {
            String valueOf = String.valueOf(view);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("oldView: ").append(valueOf).append(" is not present in the fields container").toString());
        }
        if (this.f7375b.indexOfChild(view2) >= 0) {
            String valueOf2 = String.valueOf(view2);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 52).append("newView: ").append(valueOf2).append(" is already present in the fields container").toString());
        }
        if (indexOfChild > 1) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(bj.a(3), this.f7375b.getChildAt(indexOfChild - 1).getId());
            view2.setLayoutParams(layoutParams);
            if (indexOfChild < this.f7375b.getChildCount() - 1) {
                ((RelativeLayout.LayoutParams) this.f7375b.getChildAt(indexOfChild + 1).getLayoutParams()).addRule(bj.a(3), view2.getId());
            }
        }
        this.f7375b.removeViewAt(indexOfChild);
        this.f7375b.addView(view2, indexOfChild);
    }

    public void setOnHeightOffsetChangedListener(t tVar) {
        this.c = tVar;
    }
}
