package com.google.android.wallet.ui.creditcard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.bj;
import com.google.android.wallet.ui.common.j;
import com.google.android.wallet.ui.common.k;
import com.google.b.a.a.a.b.a.a.b.a.l;
import com.google.b.a.a.a.b.a.a.b.a.m;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class CreditCardNumberEditText extends FormEditText implements View.OnClickListener {
    private static final int[] g = {4, 4, 4, 4};

    /* renamed from: a, reason: collision with root package name */
    boolean f7534a;

    /* renamed from: b, reason: collision with root package name */
    public e f7535b;
    public m[] c;
    public l[] d;
    public k e;
    public k f;
    private String h;
    private ColorStateList u;
    private final ArrayList<m> v;
    private Pair<m, l> w;
    private l x;
    private final TextWatcher y;

    public CreditCardNumberEditText(Context context) {
        super(context);
        this.h = "";
        this.v = new ArrayList<>();
        this.y = new d(this);
        a(context);
    }

    public CreditCardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = "";
        this.v = new ArrayList<>();
        this.y = new d(this);
        a(context);
    }

    public CreditCardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = "";
        this.v = new ArrayList<>();
        this.y = new d(this);
        a(context);
    }

    public void setOnCardNumberChangedListener(e eVar) {
        this.f7535b = eVar;
    }

    public void setAllowedCardTypes(m[] mVarArr) {
        this.c = mVarArr;
    }

    public void setInvalidBins(l[] lVarArr) {
        this.d = lVarArr;
    }

    public String getCardNumber() {
        return this.h;
    }

    public String getConcealedCardNumber() {
        int completeCardNumberLength = getCompleteCardNumberLength();
        int min = Math.min(this.h.length(), completeCardNumberLength - 4);
        char[] cArr = new char[min];
        Arrays.fill(cArr, (char) 8226);
        StringBuilder append = new StringBuilder(completeCardNumberLength).append(cArr);
        if (min < this.h.length()) {
            append.append(this.h.substring(min));
        }
        return a(append.toString());
    }

    public String getLastFourDigits() {
        return this.h.substring(Math.max(0, this.h.length() - 4));
    }

    public m getCardType() {
        if (this.w != null) {
            return (m) this.w.first;
        }
        return null;
    }

    public ArrayList<m> getPossibleCardTypeList() {
        return this.v;
    }

    @Override // com.google.android.wallet.ui.common.FormEditText, com.google.android.wallet.ui.common.f
    public final boolean ah_() {
        return this.h.length() == getCompleteCardNumberLength();
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
        h();
    }

    public final void a(k kVar) {
        if (getAdapter() == null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(kVar);
            setAdapter(new j(getContext(), arrayList));
            setOnClickListener(this);
            return;
        }
        ((j) getAdapter()).add(kVar);
    }

    private boolean g() {
        return getAdapter() != null && getAdapter().getCount() > 0;
    }

    private void a(Context context) {
        setKeyListener(DigitsKeyListener.getInstance("1234567890 "));
        setSingleLine();
        h();
        if (Build.VERSION.SDK_INT >= 17) {
            setTextDirection(3);
        }
        a(this.y);
        b(new a(this));
        String string = context.getString(com.google.android.wallet.e.j.wallet_uic_error_creditcard_number_invalid);
        b(new b(this, string));
        a(new c(this, string));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.uicInvalidCardNumberShakeAnimationEnabled});
        this.f7534a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private void h() {
        this.u = getTextColors();
    }

    private static l a(l[] lVarArr, String str) {
        if (lVarArr == null) {
            return null;
        }
        int length = str.length();
        for (l lVar : lVarArr) {
            int length2 = lVar.f7579a.length();
            if (length >= length2) {
                String substring = str.substring(0, length2);
                if (substring.compareTo(lVar.f7579a) >= 0 && substring.compareTo(lVar.f7580b) <= 0) {
                    return lVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        int[] iArr = this.w != null ? ((l) this.w.second).d : g;
        StringBuilder sb = new StringBuilder((getCompleteCardNumberLength() + iArr.length) - 1);
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr[i2] == i) {
                sb.append(' ');
                i2++;
                i = 0;
            }
            i++;
            sb.append(str.charAt(i3));
        }
        return sb.toString();
    }

    private int getCompleteCardNumberLength() {
        if (this.w != null) {
            return ((l) this.w.second).c;
        }
        return 16;
    }

    static /* synthetic */ void a(CreditCardNumberEditText creditCardNumberEditText, String str) {
        boolean z;
        String a2 = i.a(str);
        if ((creditCardNumberEditText.w != null || creditCardNumberEditText.x != null) && !a2.startsWith(creditCardNumberEditText.h)) {
            creditCardNumberEditText.w = null;
            creditCardNumberEditText.x = null;
        }
        if (creditCardNumberEditText.w == null && creditCardNumberEditText.c != null) {
            creditCardNumberEditText.v.clear();
            int length = creditCardNumberEditText.c.length;
            for (int i = 0; i < length; i++) {
                m mVar = creditCardNumberEditText.c[i];
                l[] lVarArr = mVar.f7581a;
                int length2 = lVarArr.length;
                int i2 = 0;
                String str2 = a2;
                while (true) {
                    if (i2 >= length2) {
                        z = false;
                        break;
                    }
                    l lVar = lVarArr[i2];
                    int length3 = lVar.f7579a.length() < str2.length() ? lVar.f7579a.length() : str2.length();
                    str2 = str2.substring(0, length3);
                    String substring = lVar.f7579a.substring(0, length3);
                    String substring2 = lVar.f7580b.substring(0, length3);
                    if (str2.compareTo(substring) >= 0 && str2.compareTo(substring2) <= 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    creditCardNumberEditText.v.add(mVar);
                }
            }
            if (creditCardNumberEditText.v.size() == 1) {
                m mVar2 = creditCardNumberEditText.v.get(0);
                l a3 = a(mVar2.f7581a, a2);
                if (a3 != null) {
                    creditCardNumberEditText.w = Pair.create(mVar2, a3);
                }
            }
        }
        if (creditCardNumberEditText.x == null) {
            creditCardNumberEditText.x = a(creditCardNumberEditText.d, a2);
        }
        int completeCardNumberLength = creditCardNumberEditText.getCompleteCardNumberLength();
        creditCardNumberEditText.h = a2.length() > completeCardNumberLength ? a2.substring(0, completeCardNumberLength) : a2;
        if (creditCardNumberEditText.f7534a && creditCardNumberEditText.ah_() && !creditCardNumberEditText.ag_()) {
            creditCardNumberEditText.setTextColor(creditCardNumberEditText.getResources().getColor(com.google.android.wallet.e.e.wallet_uic_credit_card_invalid_text_color));
            bj.a(creditCardNumberEditText.getContext(), creditCardNumberEditText);
        } else {
            creditCardNumberEditText.setTextColor(creditCardNumberEditText.u);
        }
    }
}
