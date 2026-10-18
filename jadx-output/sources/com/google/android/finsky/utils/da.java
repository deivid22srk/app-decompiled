package com.google.android.finsky.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.caverock.androidsvg.SVGParseException;

/* loaded from: classes.dex */
public final class da extends AsyncTask<Integer, Integer, Drawable> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4817a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f4818b;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Drawable drawable) {
        this.f4818b.setImageDrawable(drawable);
    }

    public da(Context context, ImageView imageView) {
        this.f4817a = context;
        this.f4818b = imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Drawable doInBackground(Integer... numArr) {
        try {
            return com.caverock.androidsvg.q.a(this.f4817a.getResources(), numArr[0].intValue(), (com.caverock.androidsvg.at) null);
        } catch (SVGParseException e) {
            FinskyLog.d("Error loading SVG resource 0x%x: %s", numArr[0], e.getMessage());
            return null;
        }
    }
}
