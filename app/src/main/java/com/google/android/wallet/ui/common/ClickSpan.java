package com.google.android.wallet.ui.common;

import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ClickSpan extends URLSpan {

    /* renamed from: a, reason: collision with root package name */
    private final e f7437a;

    private ClickSpan(String str, e eVar) {
        super(str);
        if (eVar == null) {
            throw new IllegalStateException("listener should not be null");
        }
        this.f7437a = eVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f7437a.a(view, getURL());
    }

    public static void a(TextView textView, String str, e eVar) {
        SpannableString spannableString = new SpannableString(Html.fromHtml(str));
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            int spanFlags = spannableString.getSpanFlags(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new ClickSpan(url, eVar), spanStart, spanEnd, spanFlags);
        }
        textView.setText(spannableString);
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod)) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
