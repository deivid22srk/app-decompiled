package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class q {
    public static Bitmap a(Activity activity) {
        FutureTask futureTask = new FutureTask(new r(activity));
        activity.runOnUiThread(futureTask);
        try {
            return (Bitmap) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.w("gH_Utils", "Taking screenshot failed!");
            return null;
        }
    }

    public static String c(Activity activity) {
        ViewGroup viewGroup;
        String charSequence = activity.getTitle().toString();
        int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
        if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= viewGroup.getChildCount()) {
                    return charSequence;
                }
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof TextView) {
                    return ((TextView) childAt).getText().toString();
                }
                i = i2 + 1;
            }
        }
        return charSequence;
    }

    static Bitmap b(Activity activity) {
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            View findViewById = rootView.findViewById(android.R.id.content);
            if (findViewById == null) {
                return null;
            }
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = (identifier != 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0) + findViewById.getTop();
            if (dimensionPixelSize >= rootView.getHeight()) {
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            rootView.draw(new Canvas(createBitmap));
            return Bitmap.createBitmap(createBitmap, 0, dimensionPixelSize, createBitmap.getWidth(), Math.min(createBitmap.getHeight() - dimensionPixelSize, findViewById.getHeight()));
        } catch (Exception e) {
            Log.w("gH_Utils", "Get screenshot failed!", e);
            return null;
        }
    }
}
