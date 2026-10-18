package com.google.android.finsky.adapters;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static CharSequence f1945a;

    /* renamed from: b, reason: collision with root package name */
    private static CharSequence f1946b;

    public static void a(Context context, com.google.android.finsky.receivers.g gVar, TextView textView, TextView textView2, ProgressBar progressBar) {
        int i;
        if (f1945a == null) {
            f1945a = Html.fromHtml(context.getString(R.string.download_progress_percentage));
        }
        if (f1946b == null) {
            f1946b = Html.fromHtml(context.getString(R.string.download_progress_bytes));
        }
        textView2.setText(" ");
        textView.setText(" ");
        if (gVar.f4476a != 2) {
            if (gVar.f4476a == 1) {
                progressBar.setProgress(0);
            } else {
                progressBar.setIndeterminate(true);
            }
            if (gVar.f4476a == 3) {
                textView.setText(R.string.installing);
                return;
            } else {
                if (ik.a()) {
                    textView.setText(R.string.tv_install_pending);
                    return;
                }
                return;
            }
        }
        boolean z = gVar.f4477b > 0 && gVar.c > 0 && gVar.f4477b <= gVar.c;
        if (z) {
            i = (int) ((gVar.f4477b * 100) / gVar.c);
            progressBar.setIndeterminate(false);
            progressBar.setProgress(i);
        } else {
            progressBar.setIndeterminate(true);
            i = 0;
        }
        int i2 = gVar.d;
        if (i2 == 195) {
            textView.setText(R.string.download_paused_network);
            return;
        }
        if (i2 == 196) {
            textView.setText(R.string.download_paused_wifi);
        } else if (z) {
            textView2.setText(TextUtils.expandTemplate(f1945a, Integer.toString(i)));
            textView.setText(TextUtils.expandTemplate(f1946b, Formatter.formatFileSize(context, gVar.f4477b), Formatter.formatFileSize(context, gVar.c)));
        } else {
            textView.setText(R.string.download_in_progress);
        }
    }
}
