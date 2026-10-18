package com.google.android.gms.internal;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ni extends com.google.android.gms.common.internal.l<nj> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String d() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final String e() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public static ErrorReport a(FeedbackOptions feedbackOptions, File file) {
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions != null) {
            if (feedbackOptions.c != null && feedbackOptions.c.size() > 0) {
                errorReport.E = feedbackOptions.c;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f5799b)) {
                errorReport.C = feedbackOptions.f5799b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.d)) {
                errorReport.c = feedbackOptions.d;
            }
            if (feedbackOptions.a() != null) {
                errorReport.N = feedbackOptions.a().throwMethodName;
                errorReport.L = feedbackOptions.a().throwLineNumber;
                errorReport.M = feedbackOptions.a().throwClassName;
                errorReport.O = feedbackOptions.a().stackTrace;
                errorReport.J = feedbackOptions.a().exceptionClassName;
                errorReport.P = feedbackOptions.a().exceptionMessage;
                errorReport.K = feedbackOptions.a().throwFileName;
            }
            if (feedbackOptions.k != null) {
                errorReport.Z = feedbackOptions.k;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f)) {
                errorReport.Q = feedbackOptions.f;
            }
            if (!TextUtils.isEmpty(feedbackOptions.h)) {
                errorReport.f5797b.packageName = feedbackOptions.h;
            }
            if (feedbackOptions.g != null && file != null) {
                errorReport.T = feedbackOptions.g;
                BitmapTeleporter bitmapTeleporter = errorReport.T;
                if (file == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bitmapTeleporter.d = file;
            }
            if (feedbackOptions.i != null && feedbackOptions.i.size() != 0 && file != null) {
                Iterator<FileTeleporter> it = feedbackOptions.i.iterator();
                while (it.hasNext()) {
                    FileTeleporter next = it.next();
                    if (file == null) {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    next.e = file;
                }
                errorReport.V = (FileTeleporter[]) feedbackOptions.i.toArray(new FileTeleporter[feedbackOptions.i.size()]);
            }
            if (feedbackOptions.l != null) {
                errorReport.aa = feedbackOptions.l;
            }
            errorReport.X = feedbackOptions.j;
        }
        return errorReport;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.l
    public final /* synthetic */ nj a(IBinder iBinder) {
        return nk.a(iBinder);
    }
}
