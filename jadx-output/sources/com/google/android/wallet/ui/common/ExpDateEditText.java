package com.google.android.wallet.ui.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ExpDateEditText extends FormEditText implements InputFilter, TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    private static final InputFilter[] f7440a = new InputFilter[0];

    /* renamed from: b, reason: collision with root package name */
    private Pattern f7441b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private InputFilter[] g;
    private final TextWatcher h;

    public ExpDateEditText(Context context) {
        super(context);
        this.d = "";
        this.e = "";
        this.g = new InputFilter[]{this};
        this.h = new m(this);
        g();
    }

    public ExpDateEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "";
        this.e = "";
        this.g = new InputFilter[]{this};
        this.h = new m(this);
        g();
    }

    public ExpDateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "";
        this.e = "";
        this.g = new InputFilter[]{this};
        this.h = new m(this);
        g();
    }

    public final void a(String str, String str2) {
        setExpMonth(str);
        setExpYear(str2);
        setText(getFormattedDate());
    }

    public int getExpMonth() {
        try {
            return Integer.parseInt(this.d);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void setExpMonth(String str) {
        String a2 = com.google.android.wallet.common.util.i.a(str);
        if (a2.length() > 2) {
            a2 = a2.substring(0, 2);
        }
        this.d = a2;
    }

    public int getExpYear() {
        try {
            return Integer.parseInt(this.e) + 2000;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void setExpYear(String str) {
        String a2 = com.google.android.wallet.common.util.i.a(str);
        if (a2.length() > 2) {
            a2 = a2.substring(a2.length() - 2);
        }
        this.e = a2;
    }

    private void g() {
        this.c = getResources().getString(com.google.android.wallet.e.j.wallet_uic_exp_date_separator);
        this.f7441b = Pattern.compile(this.c);
        String valueOf = String.valueOf(this.c);
        setKeyListener(new av(valueOf.length() != 0 ? "0123456789".concat(valueOf) : new String("0123456789")));
        setSingleLine();
        setOnEditorActionListener(this);
        a(this.h);
        setFilters(this.g);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextDirection(3);
        }
    }

    @Override // com.google.android.wallet.ui.common.FormEditText, android.view.View
    @TargetApi(14)
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int length;
        if (Build.VERSION.SDK_INT >= 14 && accessibilityEvent.getEventType() == 8192 && accessibilityEvent.getFromIndex() == (length = getText().length()) && accessibilityEvent.getToIndex() == length) {
            return false;
        }
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    private boolean a(int i) {
        return i <= this.d.length();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFormattedDate() {
        if (this.d.length() <= 0 && TextUtils.isEmpty(this.e)) {
            return this.d;
        }
        String str = this.d;
        String str2 = this.c;
        String str3 = this.e;
        return new StringBuilder(String.valueOf(str).length() + 0 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (i) {
            case 5:
                int selectionStart = textView.getSelectionStart();
                int selectionEnd = textView.getSelectionEnd();
                if (this.d.length() > 0 && selectionStart == selectionEnd && a(selectionStart)) {
                    setSelection(textView.getText().length());
                    return true;
                }
            default:
                return false;
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (i == i2) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(spanned.subSequence(0, i3)).append(charSequence.subSequence(i, i2)).append(spanned.subSequence(i4, spanned.length()));
        int a2 = a(append, this.c);
        if (a2 > 1 || (a2 == 1 && append.length() == this.c.length())) {
            return "";
        }
        String[] split = this.f7441b.split(append.toString(), 2);
        String[] split2 = this.f7441b.split(spanned.toString(), 2);
        int indexOf = split[0].indexOf(split2[0]);
        if (split2[0].length() == 2 && indexOf != 0) {
            return "";
        }
        if (split.length <= 1 || split[1].length() <= 2) {
            return null;
        }
        return "";
    }

    private static int a(StringBuilder sb, String str) {
        int indexOf = sb.indexOf(str);
        int i = 0;
        while (indexOf != -1) {
            i++;
            indexOf = sb.indexOf(str, indexOf + str.length());
        }
        return i;
    }

    @Override // com.google.android.wallet.ui.common.FormEditText, com.google.android.wallet.ui.common.f
    public final boolean ah_() {
        if (this.e.length() == 2) {
            if (com.google.android.wallet.common.util.i.d(this.d)) {
                return true;
            }
            if (this.d.equals("1")) {
                int selectionStart = getSelectionStart();
                int indexOf = getText().toString().indexOf(this.c);
                if (indexOf != -1 && selectionStart > indexOf) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.wallet.ui.common.FormEditText
    public void setTemplateFormattingScheme(com.google.b.a.a.a.b.a.b.m mVar) {
        throw new UnsupportedOperationException("Template formatting schemes are not supported for ExpDateEditText");
    }

    @Override // com.google.android.wallet.ui.common.FormEditText
    public final void a(int i, int i2) {
        throw new UnsupportedOperationException("Setting minimum/maximum length is not supported for ExpDateEditText");
    }

    @Override // android.widget.TextView, android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 16 && this.f) {
            this.f = false;
        } else {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    static /* synthetic */ int a(ExpDateEditText expDateEditText, StringBuilder sb) {
        int i = 0;
        String[] split = expDateEditText.f7441b.split(sb, 2);
        String a2 = com.google.android.wallet.common.util.i.a(split[0]);
        String a3 = split.length > 1 ? com.google.android.wallet.common.util.i.a(split[1]) : "";
        if (!a2.isEmpty() && (Integer.parseInt(a2) > 12 || a2.length() > 2)) {
            if (a3.length() < 2) {
                int length = a2.length() - 1;
                a3 = new StringBuilder(String.valueOf(a3).length() + 1).append(a2.charAt(length)).append(a3).toString();
                a2 = a2.substring(0, length);
                i = 1;
            } else {
                a2 = expDateEditText.d;
            }
        }
        expDateEditText.setExpMonth(a2);
        expDateEditText.setExpYear(a3);
        return i;
    }

    static /* synthetic */ void a(ExpDateEditText expDateEditText, int i, boolean z) {
        if (!z && expDateEditText.a(i) && com.google.android.wallet.common.util.i.d(expDateEditText.d)) {
            i = expDateEditText.d.length() + expDateEditText.c.length();
        } else if (z && expDateEditText.d.length() + expDateEditText.c.length() == i) {
            i = expDateEditText.d.length();
        }
        expDateEditText.setSelection(Math.min(i, expDateEditText.getText().length()));
    }
}
