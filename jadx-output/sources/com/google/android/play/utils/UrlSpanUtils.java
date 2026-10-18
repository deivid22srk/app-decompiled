package com.google.android.play.utils;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class UrlSpanUtils {
    public static void a(CharSequence charSequence, CharSequence charSequence2, k kVar) {
        if (kVar == null) {
            throw new IllegalStateException("listener should not be null");
        }
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (charSequence2 == null || charSequence2.equals(url)) {
                    int spanStart = spannable.getSpanStart(uRLSpan);
                    int spanEnd = spannable.getSpanEnd(uRLSpan);
                    spannable.removeSpan(uRLSpan);
                    spannable.setSpan(new SelfishUrlSpan(url, kVar), spanStart, spanEnd, 0);
                }
            }
        }
    }

    class SelfishUrlSpan extends URLSpan {

        /* renamed from: a, reason: collision with root package name */
        private final k f7066a;

        public SelfishUrlSpan(String str, k kVar) {
            super(str);
            this.f7066a = kVar;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f7066a.a(view, getURL());
        }
    }
}
