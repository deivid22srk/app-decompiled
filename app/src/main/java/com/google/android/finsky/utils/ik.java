package com.google.android.finsky.utils;

import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ke;
import com.google.android.finsky.protos.oo;

/* loaded from: classes.dex */
public final class ik {

    /* renamed from: a, reason: collision with root package name */
    private static Rect f4993a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f4994b = null;

    public static Pair<Integer, Integer> a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new Pair<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public static Pair<Integer, Integer> b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new Pair<>(Integer.valueOf(Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)), Integer.valueOf(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels)));
    }

    public static int a(Resources resources) {
        return Math.max(resources.getDimensionPixelSize(R.dimen.play_collection_edge_padding_minus_card_half_spacing), (resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(R.dimen.play_collection_max_width)) / 2);
    }

    public static int b(Resources resources) {
        return resources.getDisplayMetrics().widthPixels - (a(resources) * 2);
    }

    public static int c(Resources resources) {
        if (!resources.getBoolean(R.bool.play_dynamic_column_count)) {
            return resources.getInteger(R.integer.play_featured_grid_width);
        }
        return Math.min(((int) (b(resources) * 1.0d)) / resources.getDimensionPixelSize(R.dimen.play_column_min_size), 5);
    }

    public static int d(Resources resources) {
        return resources.getBoolean(R.bool.play_dynamic_column_count) ? Math.min(b(resources) / resources.getDimensionPixelSize(R.dimen.play_column_min_size), 5) : resources.getInteger(R.integer.play_regular_grid_width);
    }

    public static int a(Resources resources, int i) {
        int c = c(resources);
        if (i <= c) {
            int i2 = i + 0;
            return (i2 == 1 && c == 2) ? c : Math.min(c, Math.max((int) Math.ceil(c / 2.0f), i2));
        }
        while (true) {
            int i3 = i % c;
            if (i3 != 0 && c - i3 > 1 && c > 2) {
                c--;
            } else {
                return c;
            }
        }
    }

    private static int a(String str, int i) {
        if (str.length() > 0) {
            try {
                return Color.parseColor(str.trim());
            } catch (IllegalArgumentException e) {
                if (com.google.android.finsky.api.d.L.b().booleanValue()) {
                    FinskyLog.e("Bad color: " + str, e);
                    throw e;
                }
                return i;
            }
        }
        return i;
    }

    public static int a(com.google.android.finsky.protos.ds dsVar, int i) {
        return a(dsVar.r, i);
    }

    public static int a(oo ooVar, int i) {
        return a(ooVar.i, i);
    }

    public static int a(com.google.android.finsky.protos.hc hcVar, int i) {
        return a(hcVar.i, i);
    }

    public static int a(ke keVar, int i) {
        return a(keVar.e, i);
    }

    public static boolean a(int i) {
        return ((Color.red(i) * 21) + (Color.green(i) * 72)) + (Color.blue(i) * 7) >= 12800;
    }

    public static void a(Activity activity, EditText editText) {
        editText.requestFocus();
        editText.postDelayed(new il((InputMethodManager) activity.getSystemService("input_method"), editText), 300L);
    }

    public static void a(Activity activity, View view) {
        ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @TargetApi(11)
    public static void a(Context context, TextView textView) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationX", 0.0f, 1.0f);
            ofFloat.setInterpolator(new im(context.getResources().getDimension(R.dimen.shake_animation_delta)));
            ofFloat.start();
        }
    }

    @TargetApi(14)
    public static boolean c(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return Build.VERSION.SDK_INT >= 14 ? accessibilityManager.isTouchExplorationEnabled() : accessibilityManager.isEnabled();
    }

    @TargetApi(16)
    public static void a(Context context, CharSequence charSequence, View view) {
        a(context, charSequence, view, false);
    }

    @TargetApi(16)
    public static void a(Context context, CharSequence charSequence, View view, boolean z) {
        if (c(context)) {
            if (z && Build.VERSION.SDK_INT >= 19) {
                view.setAccessibilityLiveRegion(1);
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(Build.VERSION.SDK_INT >= 16 ? 16384 : 8);
            obtain.getText().add(charSequence);
            obtain.setEnabled(true);
            if (view != null) {
                android.support.v4.view.apkg.a.a(obtain).a(view);
            }
            ((AccessibilityManager) context.getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }

    public static void a(TextView textView, String str, String str2) {
        textView.setError(str2);
        a(textView.getContext(), (CharSequence) textView.getResources().getString(R.string.accessibility_event_form_field_error, str, str2), (View) textView, false);
    }

    public static boolean a(View view) {
        return view.getGlobalVisibleRect(f4993a);
    }

    public static void a(View view, ip ipVar, long j) {
        new Handler(Looper.myLooper()).postDelayed(new in(view, ipVar), j);
    }

    public static void a(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (viewGroup.getChildAt(i2).getVisibility() == 0) {
                viewGroup.setVisibility(0);
                return;
            }
        }
        viewGroup.setVisibility(i);
    }

    public static int b(int i) {
        return (((int) ((((i >> 24) & 255) * 0.15f) + 216.75f)) << 24) | (((int) ((((i >> 16) & 255) * 0.15f) + 216.75f)) << 16) | (((int) ((((i >> 8) & 255) * 0.15f) + 216.75f)) << 8) | ((int) (((i & 255) * 0.15f) + 216.75f));
    }

    public static int e(Resources resources) {
        int c = c(resources);
        if (resources.getBoolean(R.bool.play_can_use_mini_cards)) {
            return resources.getInteger(R.integer.related_items_per_row);
        }
        return c;
    }

    public static String a(Context context, Document document, int i, View.OnClickListener onClickListener, String str, boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (onClickListener == null) {
            return null;
        }
        String string = context.getString(R.string.more_results_no_count);
        com.google.android.finsky.protos.et etVar = document.f1963a.y;
        if (etVar != null) {
            if (etVar.k) {
                int i2 = (int) etVar.g;
                if (i2 > 0) {
                    string = context.getString(R.string.more_results, Integer.valueOf(i2));
                }
            } else {
                int a2 = document.a();
                int min = Math.min(a2, i);
                if (str == null) {
                    str = etVar.f3798a;
                }
                String str2 = etVar.c;
                if (!TextUtils.isEmpty(str) && (a2 > min || !z || !TextUtils.isEmpty(str2))) {
                    z3 = true;
                }
                z2 = z3;
            }
        } else if (!document.ai()) {
            z2 = false;
        }
        if (z2) {
            return string;
        }
        return null;
    }

    public static synchronized boolean a() {
        boolean booleanValue;
        boolean z;
        UiModeManager uiModeManager;
        synchronized (ik.class) {
            if (f4994b == null) {
                FinskyApp a2 = FinskyApp.a();
                if (!a2.getPackageManager().hasSystemFeature("android.software.leanback") || (uiModeManager = (UiModeManager) a2.getSystemService("uimode")) == null || uiModeManager.getCurrentModeType() != 4) {
                    z = false;
                } else {
                    z = true;
                }
                f4994b = Boolean.valueOf(z);
            }
            booleanValue = f4994b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean b() {
        return FinskyApp.a().e().a(12603159L);
    }

    public static int d(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? resources.getDimensionPixelSize(identifier) : resources.getDimensionPixelSize(R.dimen.status_bar_height);
    }

    public static void a(View view, Rect rect, int i, int i2) {
        int height = (i - view.getHeight()) / 2;
        int width = (i2 - view.getWidth()) / 2;
        view.getHitRect(rect);
        rect.inset(width > 0 ? -width : 0, height > 0 ? -height : 0);
    }

    public static void a(View view, Rect rect, Rect rect2, int i) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            if (view.getVisibility() != 0 || (view.getWidth() >= i && view.getHeight() >= i)) {
                rect.setEmpty();
                view2.setTouchDelegate(null);
                return;
            }
            a(view, rect, i, i);
            if (!rect.equals(rect2)) {
                rect2.set(rect);
                view2.setTouchDelegate(new com.google.android.play.utils.i(rect, view));
            }
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }
}
