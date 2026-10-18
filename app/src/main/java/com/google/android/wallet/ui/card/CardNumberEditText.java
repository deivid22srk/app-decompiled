package com.google.android.wallet.ui.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.wallet.ui.common.FormEditText;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CardNumberEditText extends FormEditText implements View.OnClickListener {
    private static final com.google.b.a.a.a.b.a.bpkg.m u;
    private int[] A;
    private com.google.b.a.a.a.b.a.apkg.bpkg.apkg.h B;
    private final TextWatcher C;

    /* renamed from: a, reason: collision with root package name */
    boolean f7414a;

    /* renamed from: b, reason: collision with root package name */
    p f7415b;
    String c;
    String d;
    com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i[] e;
    com.google.b.a.a.a.b.a.apkg.bpkg.apkg.h[] f;
    public com.google.android.wallet.ui.common.k g;
    public com.google.android.wallet.ui.common.k h;
    private String v;
    private ColorStateList w;
    private int[] x;
    private boolean y;
    private com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i z;

    static {
        com.google.b.a.a.a.b.a.bpkg.m mVar = new com.google.b.a.a.a.b.a.bpkg.m();
        u = mVar;
        mVar.f7680a = new com.google.b.a.a.a.b.a.bpkg.n[]{new com.google.b.a.a.a.b.a.bpkg.n()};
        u.f7680a[0].f7682a = "D";
        u.f7681b = "DDDD DDDD DDDD DDDD";
        u.c = false;
    }

    public CardNumberEditText(Context context) {
        super(context);
        this.v = "";
        this.y = true;
        this.C = new o(this);
        h();
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = "";
        this.y = true;
        this.C = new o(this);
        h();
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = "";
        this.y = true;
        this.C = new o(this);
        h();
    }

    public void setOnPanCategoryChangedListener(p pVar) {
        this.f7415b = pVar;
    }

    public void setAllowedPanCategories(com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i[] iVarArr) {
        this.e = iVarArr;
        this.x = new int[iVarArr.length];
    }

    public void setExcludedPanCategories(com.google.b.a.a.a.b.a.apkg.bpkg.apkg.h[] hVarArr) {
        this.f = hVarArr;
        this.A = new int[hVarArr.length];
    }

    public void setNoMatchPanMessage(String str) {
        this.c = str;
    }

    public void setInvalidPanMessage(String str) {
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.FormEditText
    public String getIncompleteErrorMessage() {
        return this.d;
    }

    public String getCardNumber() {
        return this.v;
    }

    public String getConcealedCardNumber() {
        int i;
        if (this.z != null) {
            i = this.z.e;
        } else {
            i = 4;
        }
        int size = this.s.size() - i;
        StringBuilder sb = new StringBuilder(getText());
        int length = sb.length();
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = this.s.get(i2).intValue();
            if (intValue >= length) {
                break;
            }
            sb.setCharAt(intValue, (char) 8226);
        }
        return sb.toString();
    }

    public com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i getPanCategory() {
        return this.z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.FormEditText, android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (g()) {
            if (z) {
                a();
            } else {
                dismissDropDown();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this) {
            a();
        }
    }

    public final void a() {
        if (getWindowToken() != null && g() && enoughToFilter() && hasFocus()) {
            showDropDown();
            setError(null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // com.google.android.wallet.ui.common.FormEditText, android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return getText().length() == 0;
    }

    @Override // android.widget.AutoCompleteTextView
    protected void replaceText(CharSequence charSequence) {
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        i();
    }

    final void a(com.google.android.wallet.ui.common.k kVar) {
        if (getAdapter() == null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(kVar);
            setAdapter(new com.google.android.wallet.ui.common.j(getContext(), arrayList));
            setOnClickListener(this);
            return;
        }
        ((com.google.android.wallet.ui.common.j) getAdapter()).add(kVar);
    }

    private boolean g() {
        return getAdapter() != null && getAdapter().getCount() > 0;
    }

    private void h() {
        i();
        setInputType(2);
        setTemplateFormattingScheme(u);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextDirection(3);
        }
        a(this.C);
        b(new l(this));
        b(new m(this));
        a(new n(this));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicInvalidCardNumberShakeAnimationEnabled});
        this.f7414a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private void i() {
        this.w = getTextColors();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r19.startsWith(r5) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be A[LOOP:0: B:2:0x0005->B:14:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.google.b.a.a.a.b.a.apkg.bpkg.apkg.j[] r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.card.CardNumberEditText.a(com.google.b.a.a.a.b.a.apkg.bpkg.apkg.j[], java.lang.String):int");
    }

    static /* synthetic */ void e(CardNumberEditText cardNumberEditText) {
        String value = cardNumberEditText.getValue();
        boolean startsWith = value.startsWith(cardNumberEditText.v);
        cardNumberEditText.v = value;
        cardNumberEditText.z = null;
        cardNumberEditText.y = false;
        int length = cardNumberEditText.e.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!startsWith || cardNumberEditText.x[i2] == 0) {
                cardNumberEditText.x[i2] = a(cardNumberEditText.e[i2].f7575a, value);
            }
            if (!cardNumberEditText.y && cardNumberEditText.x[i2] == 0) {
                cardNumberEditText.y = true;
                cardNumberEditText.z = null;
            }
            if (!cardNumberEditText.y && cardNumberEditText.x[i2] > i) {
                cardNumberEditText.z = cardNumberEditText.e[i2];
                i = cardNumberEditText.x[i2];
            }
        }
        cardNumberEditText.B = null;
        int length2 = cardNumberEditText.f.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (!startsWith || cardNumberEditText.A[i3] == 0) {
                cardNumberEditText.A[i3] = a(cardNumberEditText.f[i3].f7573a, value);
            }
            if (cardNumberEditText.B == null && cardNumberEditText.A[i3] > 0) {
                cardNumberEditText.B = cardNumberEditText.f[i3];
            }
        }
    }
}
