package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.wallet.common.util.ParcelableProto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class FormEditText extends android.support.v7.widget.ai implements com.google.android.wallet.b.c, com.google.android.wallet.b.d, b, bf, f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7448a = Pattern.compile("\\d*");
    private CharSequence A;
    private int B;
    private af C;
    private com.google.android.wallet.b.e D;
    private com.google.b.a.a.a.b.a.bpkg.m E;
    private String F;
    private boolean G;
    private com.google.android.wallet.ui.common.bpkg.d H;
    private String I;
    private String J;
    private CharSequence K;
    private boolean L;
    private final TextWatcher M;
    private final TextWatcher N;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.wallet.ui.common.bpkg.c f7449b;
    private final com.google.android.wallet.ui.common.bpkg.c c;
    private t d;
    private f e;
    private t f;
    private boolean g;
    private boolean h;
    public LinkedList<TextWatcher> i;
    LinkedList<TextWatcher> j;
    LinkedList<View.OnFocusChangeListener> k;
    public com.google.android.wallet.ui.common.apkg.a l;
    boolean m;
    public boolean n;
    l o;
    al p;
    i q;
    View r;
    public final ArrayList<Integer> s;
    TextWatcher t;
    private boolean u;
    private String v;
    private int w;
    private boolean x;
    private boolean y;
    private com.google.android.wallet.ui.common.bpkg.g z;

    public FormEditText(Context context) {
        super(context);
        this.i = new LinkedList<>();
        this.g = true;
        this.m = true;
        this.h = true;
        this.u = true;
        this.n = false;
        this.v = null;
        this.w = -1;
        this.s = new ArrayList<>();
        this.t = new ab(this);
        this.M = new ac(this);
        this.N = new ad(this);
        this.f7449b = new com.google.android.wallet.ui.common.bpkg.b(new com.google.android.wallet.ui.common.bpkg.a[0]);
        this.c = new com.google.android.wallet.ui.common.bpkg.b(new com.google.android.wallet.ui.common.bpkg.a[0]);
        this.d = this;
        a(context, (AttributeSet) null);
    }

    public FormEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new LinkedList<>();
        this.g = true;
        this.m = true;
        this.h = true;
        this.u = true;
        this.n = false;
        this.v = null;
        this.w = -1;
        this.s = new ArrayList<>();
        this.t = new ab(this);
        this.M = new ac(this);
        this.N = new ad(this);
        this.f7449b = new com.google.android.wallet.ui.common.bpkg.b(new com.google.android.wallet.ui.common.bpkg.a[0]);
        this.c = new com.google.android.wallet.ui.common.bpkg.b(new com.google.android.wallet.ui.common.bpkg.a[0]);
        this.d = this;
        a(context, attributeSet);
    }

    public FormEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new LinkedList<>();
        this.g = true;
        this.m = true;
        this.h = true;
        this.u = true;
        this.n = false;
        this.v = null;
        this.w = -1;
        this.s = new ArrayList<>();
        this.t = new ab(this);
        this.M = new ac(this);
        this.N = new ad(this);
        this.f7449b = new com.google.android.wallet.ui.common.bpkg.b(new com.google.android.wallet.ui.common.bpkg.a[0]);
        this.c = new com.google.android.wallet.ui.common.bpkg.b(new com.google.android.wallet.ui.common.bpkg.a[0]);
        this.d = this;
        a(context, attributeSet);
    }

    public final void a(f fVar, t tVar, boolean z) {
        if (this.l == null || this.e != fVar || this.f != tVar) {
            this.l = new com.google.android.wallet.ui.common.apkg.a(this, fVar, tVar);
            this.y = z;
            this.e = fVar;
            this.f = tVar;
        }
    }

    @Override // com.google.android.wallet.ui.common.b
    public final void a(ap apVar) {
        if (this.l == null) {
            return;
        }
        this.l.f7469a.add(apVar);
    }

    @Override // com.google.android.wallet.ui.common.b
    public final void b(ap apVar) {
        if (this.l == null) {
            return;
        }
        this.l.f7469a.remove(apVar);
    }

    public void setErrorHandler(l lVar) {
        this.o = lVar;
    }

    public void setHintHandler(al alVar) {
        this.p = alVar;
    }

    public void setDescriptionHandler(i iVar) {
        this.q = iVar;
    }

    public void setVisibilityMatchingView(View view) {
        this.r = view;
    }

    public void setFieldDescription(CharSequence charSequence) {
        if (this.q == null) {
            this.K = charSequence;
        }
    }

    public CharSequence getFieldDescription() {
        return this.q != null ? this.q.a() : this.K;
    }

    public int getMaxFieldLength() {
        return this.w;
    }

    @TargetApi(11)
    private void a(Context context, AttributeSet attributeSet) {
        com.google.android.wallet.ui.common.bpkg.f fVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxLength, com.google.android.wallet.e.c.internalUicAllowFullScreenIme});
        this.w = obtainStyledAttributes.getInt(0, -1);
        this.x = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{com.google.android.wallet.e.c.internalUicValidateFieldsWhenNotVisible});
        boolean z = obtainStyledAttributes2.getBoolean(0, false);
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, com.google.android.wallet.e.k.WalletUicFormEditText);
        this.m = obtainStyledAttributes3.getBoolean(com.google.android.wallet.e.k.WalletUicFormEditText_internalUicRequired, true);
        this.n = obtainStyledAttributes3.getBoolean(com.google.android.wallet.e.k.WalletUicFormEditText_internalUicValidateWhenNotVisible, z);
        String string = obtainStyledAttributes3.getString(com.google.android.wallet.e.k.WalletUicFormEditText_internalUicValidatorErrorString);
        switch (obtainStyledAttributes3.getInt(com.google.android.wallet.e.k.WalletUicFormEditText_internalUicValidatorType, 0)) {
            case 1:
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(com.google.android.wallet.e.j.wallet_uic_error_only_numeric_digits_allowed);
                }
                com.google.android.wallet.ui.common.bpkg.f fVar2 = new com.google.android.wallet.ui.common.bpkg.f(string, f7448a);
                setInputType(2);
                fVar = fVar2;
                break;
            case 2:
                if (TextUtils.isEmpty(string)) {
                    string = context.getString(com.google.android.wallet.e.j.wallet_uic_error_email_address_invalid);
                }
                com.google.android.wallet.ui.common.bpkg.f fVar3 = new com.google.android.wallet.ui.common.bpkg.f(string, Patterns.EMAIL_ADDRESS);
                setInputType(33);
                fVar = fVar3;
                break;
            case 3:
                fVar = new com.google.android.wallet.ui.common.bpkg.f(string, Pattern.compile(obtainStyledAttributes3.getString(com.google.android.wallet.e.k.WalletUicFormEditText_internalUicValidatorRegexp)));
                break;
            default:
                fVar = null;
                break;
        }
        if (this.m) {
            this.v = obtainStyledAttributes3.getString(com.google.android.wallet.e.k.WalletUicFormEditText_internalUicRequiredErrorString);
            if (TextUtils.isEmpty(this.v)) {
                this.v = context.getString(com.google.android.wallet.e.j.wallet_uic_error_field_must_not_be_empty);
            }
            a(false);
        }
        if (fVar != null) {
            a(fVar);
        }
        obtainStyledAttributes3.recycle();
        if (this.x) {
            setImeOptions(getImeOptions());
        } else {
            setImeOptions(getImeOptions() | 33554432 | 268435456);
        }
        super.addTextChangedListener(this.N);
        a(this.M);
        setThreshold(Integer.MAX_VALUE);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        com.google.b.a.a.a.b.a.bpkg.m mVar = (com.google.b.a.a.a.b.a.bpkg.m) ParcelableProto.a(bundle, "templateSpec");
        if (mVar != this.E) {
            setTemplateFormattingScheme(mVar);
        }
        boolean z = this.g;
        this.g = false;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.g = z;
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("templateSpec", ParcelableProto.a(this.E));
        return bundle;
    }

    public void setShouldValidateWhenNotVisible(boolean z) {
        this.n = z;
    }

    public String getTemplate() {
        return this.F;
    }

    public void setTemplateFormattingScheme(com.google.b.a.a.a.b.a.bpkg.m mVar) {
        if (this.E != mVar) {
            if (this.w >= 0) {
                throw new IllegalStateException("Max length cannot be set before a template.");
            }
            String value = getValue();
            int cursorPositionInValue = getCursorPositionInValue();
            if (this.E == null && mVar != null) {
                this.i.addFirst(this.t);
            } else if (this.E != null && mVar == null) {
                this.i.remove(this.t);
            }
            this.E = mVar;
            this.l = null;
            this.y = false;
            this.s.clear();
            if (this.H != null) {
                c(this.H);
            }
            this.I = null;
            this.J = null;
            if (mVar == null) {
                this.F = null;
                a((CharSequence) value, false);
                setSelection(cursorPositionInValue);
                return;
            }
            this.G = mVar.c;
            int length = mVar.f7680a.length;
            char[] cArr = new char[length];
            char[] cArr2 = new char[length];
            for (int i = 0; i < length; i++) {
                cArr[i] = mVar.f7680a[i].f7682a.charAt(0);
                cArr2[i] = this.G ? mVar.f7680a[i].f7683b.charAt(0) : '~';
            }
            char[] charArray = mVar.f7681b.toCharArray();
            int length2 = charArray.length;
            for (int i2 = 0; i2 < length2; i2++) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (charArray[i2] != cArr[i3]) {
                        i3++;
                    } else {
                        charArray[i2] = cArr2[i3];
                        this.s.add(Integer.valueOf(i2));
                        break;
                    }
                }
            }
            if (this.s.isEmpty()) {
                throw new IllegalArgumentException("The template formatting scheme must contain at least one input character");
            }
            this.F = String.valueOf(charArray);
            a((CharSequence) value, false);
            if (hasFocus()) {
                setCursorPositionInValue(cursorPositionInValue);
            }
            a(this, this, false);
            this.H = new z(this, this.s.size());
            a(this.H);
        }
    }

    public void a(int i, int i2) {
        if (this.F != null) {
            if (i2 != this.s.size()) {
                throw new IllegalArgumentException(new StringBuilder(113).append("maxLength (").append(i2).append(") must be equal to the number of input placeholder characters in the template (").append(this.s.size()).append(")").toString());
            }
        } else if (i2 > 0) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
            this.w = i2;
            a(this, this, false);
        }
        if (this.H != null) {
            c(this.H);
        }
        if (i > 0) {
            this.H = new aa(this, i);
            a(this.H);
        }
    }

    public String getValue() {
        String obj = getText().toString();
        if (this.F != null) {
            if (obj.equals(this.I)) {
                return this.J;
            }
            if (this.G && obj.isEmpty()) {
                obj = this.F;
            }
            this.I = obj;
            int size = this.s.size();
            StringBuilder sb = new StringBuilder(size);
            int length = this.I.length();
            for (int i = 0; i < size && this.s.get(i).intValue() < length; i++) {
                sb.append(this.I.charAt(this.s.get(i).intValue()));
            }
            this.J = sb.toString();
            return this.J;
        }
        return obj;
    }

    public final void a(CharSequence charSequence, boolean z) {
        char[] cArr;
        if (this.F == null) {
            if (z) {
                setText(charSequence);
                return;
            } else {
                setTextAndPreventUserInputOnlyTextWatchers(charSequence);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (!TextUtils.isEmpty(getText())) {
                if (z) {
                    setText((CharSequence) null);
                    return;
                } else {
                    setTextAndPreventUserInputOnlyTextWatchers(null);
                    return;
                }
            }
            return;
        }
        char[] charArray = this.F.toCharArray();
        int size = this.s.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= size) {
                break;
            }
            if (i >= charSequence.length()) {
                if (!this.G) {
                    cArr = Arrays.copyOf(charArray, this.s.get(i).intValue());
                }
            } else {
                if (charArray[this.s.get(i).intValue()] != charSequence.charAt(i)) {
                    z2 = true;
                    charArray[this.s.get(i).intValue()] = charSequence.charAt(i);
                }
                i++;
                z2 = z2;
            }
        }
        cArr = charArray;
        String valueOf = z2 ? String.valueOf(cArr) : null;
        if (z) {
            setText(valueOf);
        } else {
            setTextAndPreventUserInputOnlyTextWatchers(valueOf);
        }
    }

    public void setTextAndPreventUserInputOnlyTextWatchers(CharSequence charSequence) {
        boolean z = this.g;
        this.g = false;
        setText(charSequence);
        this.g = z;
    }

    public int getValueLength() {
        Editable text = getText();
        if (this.F == null) {
            return TextUtils.getTrimmedLength(text);
        }
        if (text.length() == 0) {
            return 0;
        }
        int size = this.s.size();
        int length = text.length();
        for (int i = 0; i < size; i++) {
            int intValue = this.s.get(i).intValue();
            if (intValue >= length || text.charAt(intValue) == this.F.charAt(intValue)) {
                return i;
            }
        }
        return size;
    }

    public int getCursorPositionInValue() {
        int selectionStart = getSelectionStart();
        if (this.F != null) {
            int binarySearch = Collections.binarySearch(this.s, Integer.valueOf(selectionStart));
            return binarySearch < 0 ? (-binarySearch) - 1 : binarySearch;
        }
        return selectionStart;
    }

    public final void b(CharSequence charSequence, boolean z) {
        this.L = true;
        if (isFocused()) {
            if (z) {
                replaceText(charSequence);
            } else {
                boolean z2 = this.g;
                this.g = false;
                replaceText(charSequence);
                this.g = z2;
            }
        } else if (z) {
            setText(charSequence);
        } else {
            setTextAndPreventUserInputOnlyTextWatchers(charSequence);
        }
        this.L = false;
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return !this.L && getText().length() >= this.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinkedList<TextWatcher> getTextWatcherList() {
        if (this.j == null) {
            this.j = new LinkedList<>();
        }
        return this.j;
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        getTextWatcherList().addLast(textWatcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        getTextWatcherList().remove(textWatcher);
    }

    public final void a(TextWatcher textWatcher) {
        getTextWatcherList().addFirst(textWatcher);
    }

    @Override // com.google.android.wallet.ui.common.bf
    public final void a(com.google.android.wallet.ui.common.bpkg.a aVar) {
        this.f7449b.a(aVar);
    }

    public final void b(com.google.android.wallet.ui.common.bpkg.a aVar) {
        a(aVar);
        this.c.a(aVar);
    }

    @Override // com.google.android.wallet.ui.common.bf
    public final void c(com.google.android.wallet.ui.common.bpkg.a aVar) {
        this.f7449b.b(aVar);
        this.c.b(aVar);
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean ag_() {
        return !(this.n || getVisibility() == 0) || this.f7449b.a(this);
    }

    @Override // com.google.android.wallet.ui.common.t
    public final boolean af_() {
        boolean ag_ = ag_();
        if (!ag_ && this.f7449b.a() != null) {
            setError(this.f7449b.a());
        } else if (getError() != null) {
            setError(null);
        }
        return ag_;
    }

    String getErrorTextForAccessibility() {
        return getResources().getString(com.google.android.wallet.e.j.wallet_uic_accessibility_event_form_field_error, TextUtils.isEmpty(getHint()) ? getContentDescription() : getHint(), getError());
    }

    @TargetApi(16)
    final void c() {
        if (Build.VERSION.SDK_INT >= 16 && com.google.android.wallet.common.util.a.a(getContext())) {
            announceForAccessibility(getErrorTextForAccessibility());
        }
    }

    public void setRequired(boolean z) {
        this.m = z;
        a(false);
    }

    public void setFieldEnabled(boolean z) {
        if (this.h != z) {
            this.h = z;
            super.setEnabled(this.u && this.h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        if (this.u != z) {
            this.u = z;
            super.setEnabled(this.u && this.h);
        }
    }

    public String getRequiredError() {
        return this.v;
    }

    public void setRequiredError(String str) {
        this.v = str;
        a(true);
    }

    public void setOnOutOfFocusValidatable(t tVar) {
        this.d = tVar;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener != null) {
            getFocusChangeList().add(onFocusChangeListener);
        }
    }

    private LinkedList<View.OnFocusChangeListener> getFocusChangeList() {
        if (this.k == null) {
            this.k = new LinkedList<>();
        }
        return this.k;
    }

    public final boolean f() {
        if (!hasFocus() || !enoughToFilter() || getWindowVisibility() == 8 || getAdapter() == null) {
            return false;
        }
        performFiltering(getText(), 0);
        showDropDown();
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    @TargetApi(16)
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        f();
        if (!z && getError() == null && this.d != null) {
            this.d.af_();
        }
        if (z && getError() != null) {
            c();
        }
        if (this.k != null) {
            Iterator<View.OnFocusChangeListener> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().onFocusChange(this, z);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = !hasFocus() && TextUtils.isEmpty(getText());
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.F != null && z && hasFocus()) {
            setSelection(this.s.get(0).intValue());
        }
        return onTouchEvent;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z = TextUtils.isEmpty(super.getHint()) && this.p != null;
        if (z) {
            setHint(this.p.a());
        }
        super.onMeasure(i, i2);
        if (z) {
            setHint((CharSequence) null);
        }
        setThreshold(this.B);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        int i2 = (int) getResources().getDisplayMetrics().density;
        if (i2 != 0 && rect.height() / i2 > 140) {
            z = true;
        }
        if (z) {
            this.B = i;
        } else {
            this.B = Integer.MAX_VALUE;
            dismissDropDown();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.r != null) {
            this.r.setVisibility(i);
        }
    }

    public void setOnErrorChangeListener(af afVar) {
        this.C = afVar;
    }

    @Override // android.widget.TextView
    public void setError(CharSequence charSequence, Drawable drawable) {
        Spannable spannableString;
        CharSequence charSequence2 = charSequence;
        if (Build.VERSION.SDK_INT < 11) {
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            charSequence2 = charSequence;
            if (!isEmpty) {
                if (charSequence instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence;
                    Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
                    spannableString = spannable;
                    if (spans != null) {
                        spannableString = spannable;
                        if (spans.length != 0) {
                            throw new UnsupportedOperationException("Spans in error text are not supported due to Gingerbread limitations.");
                        }
                    }
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                spannableString.setSpan(new ForegroundColorSpan(-16777216), 0, spannableString.length(), 0);
                charSequence2 = spannableString;
            }
        }
        if (this.o != null) {
            this.o.a(charSequence2);
        } else {
            super.setError(charSequence2, drawable);
        }
    }

    @Override // android.widget.TextView, com.google.android.wallet.ui.common.t
    public CharSequence getError() {
        return this.o != null ? this.o.a() : super.getError();
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        CharSequence hint = super.getHint();
        return (!TextUtils.isEmpty(hint) || this.p == null) ? hint : this.p.a();
    }

    @Override // android.widget.AutoCompleteTextView
    public int getThreshold() {
        return this.B;
    }

    private void a(boolean z) {
        if (z && this.z != null) {
            c(this.z);
            this.z = null;
        }
        if (this.m && this.z == null) {
            this.z = new com.google.android.wallet.ui.common.bpkg.g(this.v);
            a(this.z);
        } else if (!this.m && this.z != null) {
            c(this.z);
            this.z = null;
        }
    }

    @Override // android.widget.TextView
    public void beginBatchEdit() {
        if (getError() != null) {
            setError(getError());
        }
        super.beginBatchEdit();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new ae(this, onCreateInputConnection);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.getFocusedRect(rect);
            return;
        }
        Layout layout = getLayout();
        if (layout == null) {
            super.getFocusedRect(rect);
            return;
        }
        int lineForOffset = layout.getLineForOffset(0);
        rect.top = layout.getLineTop(lineForOffset);
        rect.bottom = layout.getLineBottom(lineForOffset);
        rect.left = (int) layout.getPrimaryHorizontal(0);
        rect.right = rect.left + 1;
        rect.offset(getCompoundPaddingLeft(), getExtendedPaddingTop());
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8 && getError() != null) {
            accessibilityEvent.setContentDescription(getErrorTextForAccessibility());
            return true;
        }
        return true;
    }

    public boolean ah_() {
        return this.F != null ? getValueLength() >= this.s.size() : this.w >= 0 && getValueLength() >= this.w;
    }

    public String getIncompleteErrorMessage() {
        return getContext().getString(com.google.android.wallet.e.j.wallet_uic_error_field_must_be_complete);
    }

    @Override // com.google.android.wallet.b.c
    public final void a(com.google.b.a.a.a.b.a.bpkg.f fVar, com.google.b.a.a.a.b.a.bpkg.i[] iVarArr) {
        switch (fVar.f7670a) {
            case 1:
                throw new IllegalArgumentException("FormEditText doesn't support ResultingActionReference action type SHOW_COMPONENT");
            case 2:
                a((CharSequence) null, true);
                return;
            default:
                throw new IllegalArgumentException(new StringBuilder(56).append("Unknown ResultingActionReference action type ").append(fVar.f7670a).toString());
        }
    }

    @Override // com.google.android.wallet.b.d
    public void setTriggerListener(com.google.android.wallet.b.e eVar) {
        this.D = eVar;
    }

    @Override // com.google.android.wallet.b.d
    public final void a(ArrayList<com.google.b.a.a.a.b.a.bpkg.i> arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.b.a.a.a.b.a.bpkg.i iVar = arrayList.get(i);
            if (iVar.f7676b == 1) {
                this.i.add(new com.google.android.wallet.ui.common.apkg.b(this, iVar, this.D));
            } else {
                throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
            }
        }
    }

    @Override // com.google.android.wallet.b.d
    public final boolean a(com.google.b.a.a.a.b.a.bpkg.i iVar) {
        if (iVar.f7676b == 1) {
            return false;
        }
        throw new IllegalArgumentException(new StringBuilder(37).append("Unsupported trigger type: ").append(iVar.f7676b).toString());
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(getAccessibilityAnnouncingContent());
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo.setError(null);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if ((Build.VERSION.SDK_INT >= 16 && accessibilityEvent.getEventType() == 32768) || (Build.VERSION.SDK_INT < 16 && accessibilityEvent.getEventType() == 8)) {
            List<CharSequence> text = accessibilityEvent.getText();
            if (!text.isEmpty()) {
                text.remove(0);
            }
            text.add(0, getAccessibilityAnnouncingContent());
        }
    }

    String getAccessibilityAnnouncingContent() {
        return getResources().getString(com.google.android.wallet.e.j.wallet_uic_accessibility_event_form_field_description, a(!TextUtils.isEmpty(getHint()) ? getHint() : getContentDescription()), a(getText()), a(getFieldDescription())).trim();
    }

    private static CharSequence a(CharSequence charSequence) {
        return charSequence != null ? charSequence : "";
    }

    public void setCursorPositionInValue(int i) {
        if (this.F != null) {
            if (TextUtils.isEmpty(getText())) {
                i = 0;
            } else if (i < this.s.size()) {
                i = Math.min(this.s.get(i).intValue(), getText().length());
            } else {
                i = Math.min(this.s.get(this.s.size() - 1).intValue() + 1, getText().length());
            }
        }
        setSelection(i);
    }
}
