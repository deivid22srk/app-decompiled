package com.google.android.wallet.ui.common;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class bj {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f7510a;

    public static void a(View view, TypedValue typedValue) {
        if (typedValue == null || typedValue.type == 0) {
            view.setVisibility(8);
        } else if (typedValue.type >= 28 && typedValue.type <= 31) {
            view.setBackgroundColor(typedValue.data);
        } else {
            view.setBackgroundResource(typedValue.resourceId);
        }
    }

    public static void a(View view, boolean z) {
        if (view.getVisibility() != 0) {
            if (z) {
                a(view, 0);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public static void b(View view, boolean z) {
        if (view.getVisibility() != 8) {
            if (z) {
                a(view, 0, 0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    public static void a(View view, int i) {
        a(view, i, -1L, (Runnable) null);
    }

    public static void a(View view, int i, Runnable runnable) {
        a(view, i, -1L, runnable);
    }

    @TargetApi(14)
    public static void a(View view, int i, long j, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 14) {
            view.animate().cancel();
            view.setVisibility(0);
            view.setTranslationY(i);
            view.setAlpha(0.0f);
            if (i < 0) {
                view.setTag(com.google.android.wallet.e.g.view_is_animating_downwards, Boolean.TRUE);
            }
            ViewPropertyAnimator translationY = view.animate().alpha(1.0f).translationY(0.0f);
            long duration = view.animate().getDuration();
            if (j >= 0) {
                translationY.setDuration(j);
            }
            translationY.setListener(new bk(runnable, view, j, duration));
            translationY.start();
            return;
        }
        view.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), com.google.android.wallet.e.b.wallet_uic_fade_in);
        if (runnable != null) {
            loadAnimation.setAnimationListener(new bl(runnable));
        }
        view.startAnimation(loadAnimation);
    }

    public static void a(View view, int i, int i2) {
        a(view, i, i2, 8);
    }

    public static void b(View view, int i) {
        a(view, i, 0, 4);
    }

    @TargetApi(14)
    private static void a(View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 14) {
            c(view, false);
            view.setTranslationY(i);
            view.animate().translationY(i2).alpha(0.0f).setListener(new bm(view, i3)).start();
        } else {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), com.google.android.wallet.e.b.wallet_uic_fade_out));
            view.setVisibility(i3);
        }
    }

    static void c(View view, boolean z) {
        if ((view instanceof EditText) && !view.hasFocus()) {
            view.setFocusable(z);
            view.setFocusableInTouchMode(z);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                c(viewGroup.getChildAt(i), z);
            }
        }
    }

    @TargetApi(11)
    public static void a(Context context, View view) {
        if (Build.VERSION.SDK_INT >= 11) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, 1.0f);
            ofFloat.setInterpolator(new bn(context.getResources().getDimension(com.google.android.wallet.e.f.wallet_uic_shake_animation_delta)));
            ofFloat.start();
        }
    }

    public static int a(View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        }
        return i + view.getHeight();
    }

    public static void b(View view) {
        if (view.hasFocus() || !view.requestFocus()) {
            if (view instanceof FormEditText) {
                ((FormEditText) view).c();
            } else if (view instanceof FormSpinner) {
                ((FormSpinner) view).b();
            } else if (view instanceof FormCheckBox) {
                ((FormCheckBox) view).a();
            }
        }
    }

    public static EditText c(View view) {
        boolean z;
        boolean z2;
        EditText editText;
        ArrayList<View> focusables = view.getFocusables(130);
        int size = focusables.size();
        int i = 0;
        EditText editText2 = null;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            View view2 = focusables.get(i);
            if (!(view2 instanceof EditText)) {
                editText = editText2;
            } else {
                if (editText2 != null) {
                    z = true;
                    break;
                }
                editText = (EditText) view2;
            }
            i++;
            editText2 = editText;
        }
        if (editText2 != null) {
            if (editText2.requestFocus()) {
                if (z && (editText2.getImeOptions() & 255) == 0) {
                    editText2.setImeOptions(editText2.getImeOptions() | 5);
                }
                InputMethodManager inputMethodManager = (InputMethodManager) editText2.getContext().getSystemService("input_method");
                if (!inputMethodManager.showSoftInput(editText2, 1)) {
                    editText2.postDelayed(new bo(inputMethodManager, editText2), 300L);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return editText2;
            }
        }
        return null;
    }

    public static boolean a(Rect rect, View view, DisplayMetrics displayMetrics) {
        view.getWindowVisibleDisplayFrame(rect);
        return rect.bottom < displayMetrics.heightPixels;
    }

    public static boolean b(Context context, View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null) {
            return false;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }

    public static boolean a(Context context) {
        return !context.getResources().getBoolean(com.google.android.wallet.e.d.wallet_uic_is_tablet) && context.getResources().getConfiguration().orientation == 2;
    }

    @TargetApi(16)
    public static void a(View view, CharSequence charSequence) {
        if (com.google.android.wallet.common.util.a.a(view.getContext())) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.announceForAccessibility(charSequence);
                return;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(8);
            obtain.setEnabled(true);
            obtain.getText().add(charSequence);
            ((AccessibilityManager) view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(obtain);
        }
    }

    public static void d(View view, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                d(viewGroup.getChildAt(i), z);
            }
            return;
        }
        view.setEnabled(z);
    }

    public static View a(LayoutInflater layoutInflater, int i, com.google.b.a.a.a.b.a.a.c.b bVar, com.google.android.wallet.analytics.e eVar, e eVar2) {
        InfoMessageTextView infoMessageTextView;
        if (bVar.f7606a != null) {
            InfoMessageTextView infoMessageTextView2 = (InfoMessageTextView) layoutInflater.inflate(i, (ViewGroup) null);
            infoMessageTextView2.setUrlClickListener(eVar2);
            infoMessageTextView2.setInfoMessage(bVar.f7606a);
            infoMessageTextView = infoMessageTextView2;
        } else {
            infoMessageTextView = null;
        }
        if (!TextUtils.isEmpty(bVar.f7607b)) {
            WebViewLayout webViewLayout = (WebViewLayout) layoutInflater.inflate(com.google.android.wallet.e.h.view_web_view_layout, (ViewGroup) null);
            webViewLayout.a(bVar.f7607b, (String) null);
            webViewLayout.setParentUiNode(eVar);
            if (infoMessageTextView != null) {
                infoMessageTextView.setParentUiNode(webViewLayout);
                webViewLayout.setHeaderView(infoMessageTextView);
                return webViewLayout;
            }
            return webViewLayout;
        }
        if (infoMessageTextView != null) {
            infoMessageTextView.setParentUiNode(eVar);
            return infoMessageTextView;
        }
        throw new IllegalArgumentException("Unsupported legal message configuration.");
    }

    public static void a(com.google.b.a.a.a.b.a.b.x xVar, FormEditText formEditText) {
        a(xVar, formEditText, (Activity) null);
    }

    public static void a(com.google.b.a.a.a.b.a.b.x xVar, FormEditText formEditText, Activity activity) {
        int i;
        boolean a2;
        formEditText.setHint(xVar.f);
        formEditText.setRequired(!xVar.d);
        formEditText.setFieldEnabled(!xVar.e);
        if (xVar.n != null) {
            ExpDateEditText expDateEditText = (ExpDateEditText) formEditText;
            expDateEditText.a(new n(expDateEditText, xVar.n.f7697b, xVar.n.c));
            expDateEditText.a((f) expDateEditText, (t) expDateEditText, true);
            return;
        }
        if (xVar.k != null) {
            com.google.b.a.a.a.b.a.b.ac acVar = xVar.k;
            formEditText.setTemplateFormattingScheme(acVar.i);
            formEditText.a(acVar.g, false);
            formEditText.a(acVar.f7656a, acVar.f7657b);
            formEditText.setFieldDescription(acVar.c);
            if (xVar.e) {
                if (TextUtils.isEmpty(acVar.g)) {
                    throw new IllegalArgumentException("Disabled field must have an initial value.");
                }
                return;
            }
            switch (acVar.d) {
                case 1:
                    i = 1;
                    if (acVar.h) {
                        i = 129;
                        break;
                    }
                    break;
                case 2:
                    i = 2;
                    if (acVar.h) {
                        throw new IllegalArgumentException("Number passwords are not supported");
                    }
                    if (acVar.i != null) {
                        if ((formEditText.getImeOptions() & 301989888) != 0) {
                            a2 = false;
                        } else {
                            a2 = a(formEditText.getContext());
                        }
                        if (a2) {
                            i = 1;
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        formEditText.setTextDirection(3);
                        break;
                    }
                    break;
                case 3:
                    i = 33;
                    break;
                case 4:
                    i = 3;
                    if (TextUtils.isEmpty(acVar.g) && a(activity, (TextView) formEditText)) {
                        acVar.g = formEditText.getValue();
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        formEditText.setTextDirection(3);
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException(new StringBuilder(53).append("TextField.keyboardLayout ").append(acVar.d).append(" is not supported").toString());
            }
            for (int i2 : acVar.e) {
                switch (i2) {
                    case 1:
                        i |= 8192;
                        break;
                    case 2:
                        i |= 4096;
                        break;
                    case 3:
                        i |= 4096;
                        break;
                    case 4:
                        i |= 16384;
                        break;
                    case 5:
                        i |= 8192;
                        break;
                    case 6:
                        i |= 32;
                        break;
                    case 7:
                        i |= 96;
                        break;
                    case 8:
                        i |= 112;
                        break;
                    case 9:
                        i |= 16;
                        break;
                    case 10:
                        i |= 524288;
                        break;
                }
            }
            Typeface typeface = formEditText.getTypeface();
            formEditText.setInputType(i);
            formEditText.setTypeface(typeface);
            if (acVar.f.length > 0) {
                com.google.android.wallet.ui.common.b.b bVar = new com.google.android.wallet.ui.common.b.b(new com.google.android.wallet.ui.common.b.a[0]);
                com.google.android.wallet.ui.common.b.e eVar = null;
                com.google.android.wallet.ui.common.b.e eVar2 = null;
                for (com.google.b.a.a.a.b.a.b.ad adVar : acVar.f) {
                    if (!TextUtils.isEmpty(adVar.f7658a)) {
                        bVar.a(new com.google.android.wallet.ui.common.b.f(adVar.d, Pattern.compile(adVar.f7658a)));
                    } else if (adVar.c != -1.7976931348623157E308d) {
                        if (eVar == null) {
                            eVar = new com.google.android.wallet.ui.common.b.e();
                            bVar.a(eVar);
                        }
                        if (adVar.c < eVar.c) {
                            eVar.c = adVar.c;
                            eVar.f7497b = adVar.d;
                        }
                    } else if (adVar.f7659b != Double.MAX_VALUE) {
                        if (eVar2 == null) {
                            eVar2 = new com.google.android.wallet.ui.common.b.e();
                            bVar.a(eVar2);
                        }
                        if (adVar.f7659b > eVar2.f7500a) {
                            eVar2.f7500a = adVar.f7659b;
                            eVar2.f7497b = adVar.d;
                        }
                    }
                }
                if (eVar != null && eVar2 != null && eVar2.f7500a > eVar.c) {
                    throw new IllegalArgumentException(String.format("Minimum %f is greater than maximum %f.", Double.valueOf(eVar2.f7500a), Double.valueOf(eVar.c)));
                }
                formEditText.a(bVar);
            }
        }
    }

    public static boolean a(Activity activity, TextView textView) {
        TelephonyManager telephonyManager;
        if (activity == null || !com.google.android.wallet.common.util.l.a(activity, "android.permission.READ_PHONE_STATE") || (telephonyManager = (TelephonyManager) activity.getSystemService("phone")) == null) {
            return false;
        }
        a(textView, telephonyManager.getLine1Number());
        return true;
    }

    public static void a(TextView textView, String str) {
        if (!TextUtils.isEmpty(str)) {
            str = PhoneNumberUtils.formatNumber(str);
        }
        if (textView instanceof FormEditText) {
            ((FormEditText) textView).a((CharSequence) str, false);
        } else {
            textView.setText(str);
        }
    }

    public static boolean e(View view, boolean z) {
        KeyEvent.Callback e = e(view);
        if (e instanceof t) {
            return z ? ((t) e).af_() : ((t) e).ag_();
        }
        if ((e instanceof TextView) || (e instanceof RegionCodeView)) {
            return true;
        }
        String valueOf = String.valueOf(e);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
    }

    public static void a(View view, String str) {
        KeyEvent.Callback e = e(view);
        if (e instanceof t) {
            ((t) e).setError(str);
        } else if ((e instanceof TextView) || (e instanceof RegionCodeView)) {
            if (!TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("TextViews should never have an error message");
            }
        } else {
            String valueOf = String.valueOf(e);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
        }
    }

    public static CharSequence d(View view) {
        KeyEvent.Callback e = e(view);
        if (e instanceof TextView) {
            return ((TextView) e).getError();
        }
        if (e instanceof t) {
            return ((t) e).getError();
        }
        if (e instanceof RegionCodeView) {
            return null;
        }
        String valueOf = String.valueOf(e);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
    }

    public static com.google.b.a.a.a.b.a.b.ae a(View view, com.google.b.a.a.a.b.a.b.x xVar) {
        String value;
        View e = e(view);
        com.google.b.a.a.a.b.a.b.ae aeVar = new com.google.b.a.a.a.b.a.b.ae();
        aeVar.f7660a = xVar.f7692a;
        aeVar.f = xVar.h;
        if (e instanceof ExpDateEditText) {
            ExpDateEditText expDateEditText = (ExpDateEditText) e;
            if (xVar.n.f7696a != 2) {
                throw new IllegalArgumentException(new StringBuilder(38).append("Unsupported DateField type=").append(xVar.n.f7696a).toString());
            }
            if (xVar.c) {
                aeVar.e = String.format(Locale.US, "%02d/%04d", Integer.valueOf(expDateEditText.getExpMonth()), Integer.valueOf(expDateEditText.getExpYear()));
            } else {
                aeVar.d = new com.google.b.a.a.a.a.d();
                aeVar.d.f7554b = expDateEditText.getExpMonth();
                aeVar.d.f7553a = expDateEditText.getExpYear();
            }
        } else if (e instanceof FormCheckBox) {
            int state = ((FormCheckBox) e).getState();
            if (xVar.c) {
                aeVar.e = Integer.toString(state);
            } else {
                aeVar.c = state;
            }
        } else {
            if (e instanceof FormEditText) {
                value = ((FormEditText) e).getValue();
            } else if (e instanceof TextView) {
                value = ((TextView) e).getText().toString();
            } else if (e instanceof SelectFieldView) {
                value = ((SelectFieldView) e).getValue();
            } else {
                String valueOf = String.valueOf(e);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Invalid uiField view: ").append(valueOf).toString());
            }
            if (xVar.c) {
                aeVar.e = value;
            } else {
                aeVar.f7661b = value;
            }
        }
        return aeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static View e(View view) {
        View view2 = view;
        while (view2 instanceof s) {
            view2 = ((s) view2).getInnerFieldView();
        }
        return view2;
    }

    public static Object a(com.google.b.a.a.a.b.a.b.x xVar) {
        if (xVar.k != null) {
            return xVar.k.g;
        }
        if (xVar.n != null) {
            if (xVar.n.f7696a != 2) {
                throw new IllegalArgumentException(new StringBuilder(57).append("Date fields only support month and year. type=").append(xVar.n.f7696a).toString());
            }
            return new com.google.b.a.a.a.a.d();
        }
        if (xVar.l != null) {
            return xVar.l.f7653b;
        }
        if (xVar.m != null) {
            return Integer.valueOf(xVar.m.f7694a);
        }
        String valueOf = String.valueOf(xVar);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 26).append("UiField is not supported: ").append(valueOf).toString());
    }

    public static String a(String str, int i, int i2, boolean z) {
        return String.format(Locale.US, "%s=w%d-h%d-e365%s", str, Integer.valueOf(i), Integer.valueOf(i2), z && Build.VERSION.SDK_INT >= 18 ? "-rw" : "");
    }

    public static int[] a(Context context, List<View> list, com.google.b.a.a.a.b.a.b.v[] vVarArr, ViewGroup viewGroup) {
        View view;
        int i;
        ViewGroup viewGroup2;
        int i2;
        int i3;
        int size = list.size();
        int[] iArr = new int[size];
        int i4 = 0;
        View view2 = null;
        int i5 = 0;
        while (i5 < size) {
            iArr[i5] = -1;
            View view3 = list.get(i5);
            View e = e(view3);
            if (vVarArr == null || i4 >= vVarArr.length || i5 < vVarArr[i4].f7690a) {
                viewGroup.addView(view3);
                if (i(e)) {
                    iArr[i5] = viewGroup.getChildCount() - 1;
                    view = view2;
                    i = i4;
                } else {
                    view = view2;
                    i = i4;
                }
            } else {
                com.google.b.a.a.a.b.a.b.v vVar = vVarArr[i4];
                if (!(e instanceof TextView)) {
                    throw new IllegalArgumentException(String.format("Field groupings are only supported for text and date ui fields. index %d view type: %s field grouping: %d-%d", Integer.valueOf(i5), view3.getClass().getName(), Integer.valueOf(vVar.f7690a), Integer.valueOf(vVar.f7691b)));
                }
                if (i5 == vVar.f7690a) {
                    if (vVar.f7691b != vVar.f7690a + 1) {
                        throw new IllegalArgumentException(String.format("Field groupings must contain exactly 2 fields (%d, %d)", Integer.valueOf(vVar.f7690a), Integer.valueOf(vVar.f7691b)));
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(context);
                    viewGroup.addView(relativeLayout);
                    viewGroup2 = relativeLayout;
                    i2 = i4;
                    i3 = a(20);
                } else {
                    viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                    int a2 = a(21);
                    if (view3 instanceof ba) {
                        ((ba) view3).a();
                    }
                    if (i(e)) {
                        iArr[i5] = viewGroup.getChildCount() - 1;
                    }
                    i2 = i4 + 1;
                    i3 = a2;
                }
                viewGroup2.addView(view3);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view3.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.addRule(i3);
                if (view3 instanceof ba) {
                    ((ba) view3).setIconHiddenWhenUnfocused(true);
                }
                e.setMinimumWidth(context.getResources().getDimensionPixelSize(com.google.android.wallet.e.f.wallet_uic_field_grouping_text_view_min_width));
                if (Build.VERSION.SDK_INT < 14) {
                    if (i5 == vVar.f7690a) {
                        view = e;
                        i = i2;
                    } else if (view2.isFocusable() && e.isFocusable()) {
                        view2.setNextFocusDownId(e.getId());
                        e.setNextFocusUpId(view2.getId());
                        view = null;
                        i = i2;
                    }
                }
                view = view2;
                i = i2;
            }
            i5++;
            view2 = view;
            i4 = i;
        }
        return iArr;
    }

    private static boolean i(View view) {
        if (view instanceof b) {
            return true;
        }
        Integer num = (Integer) view.getTag(com.google.android.wallet.e.g.field_type);
        return num != null && num.intValue() == 2;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(15);
        f7510a = sparseIntArray;
        sparseIntArray.put(1, com.google.android.wallet.e.c.internalUicCreditCardAmexLogoDrawable);
        f7510a.put(2, com.google.android.wallet.e.c.internalUicCreditCardDiscoverLogoDrawable);
        f7510a.put(3, com.google.android.wallet.e.c.internalUicCreditCardJcbLogoDrawable);
        f7510a.put(4, com.google.android.wallet.e.c.internalUicCreditCardMastercardLogoDrawable);
        f7510a.put(5, com.google.android.wallet.e.c.internalUicCreditCardVisaLogoDrawable);
        f7510a.put(6, com.google.android.wallet.e.c.internalUicCreditCardDinersClubLogoDrawable);
        f7510a.put(15, com.google.android.wallet.e.c.internalUicCreditCardEloLogoDrawable);
        f7510a.put(25, com.google.android.wallet.e.c.internalUicCreditCardCartesBancairesLogoDrawable);
        f7510a.put(21, com.google.android.wallet.e.c.internalUicCreditCardUnknownLogoDrawable);
        f7510a.put(13, com.google.android.wallet.e.c.internalUicCreditCardCvcFrontDrawable);
        f7510a.put(14, com.google.android.wallet.e.c.internalUicCreditCardCvcBackDrawable);
        f7510a.put(34, com.google.android.wallet.e.c.internalUicCreditCardCvcFrontLargeDrawable);
        f7510a.put(35, com.google.android.wallet.e.c.internalUicCreditCardCvcBackLargeDrawable);
        f7510a.put(45, com.google.android.wallet.e.c.internalUicCarrierBillingDrawable);
        f7510a.put(26, com.google.android.wallet.e.c.internalUicPaypalLightDrawable);
    }

    public static int a(Context context, String str) {
        if (!com.google.android.wallet.common.util.i.b(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid embedded image URI: ".concat(valueOf) : new String("Invalid embedded image URI: "));
        }
        int c = com.google.android.wallet.common.util.i.c(str);
        int i = f7510a.get(c, -1);
        if (i == -1) {
            throw new IllegalArgumentException(new StringBuilder(38).append("Invalid embedded image ID: ").append(c).toString());
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Theme does not contain the requested embedded image: ").append(c).toString());
        }
        return resourceId;
    }

    public static void a(Object obj, int i, com.google.android.wallet.b.a aVar, com.google.android.wallet.b.e eVar) {
        if (aVar != null) {
            Object e = obj instanceof View ? e((View) obj) : obj;
            ArrayList<com.google.b.a.a.a.b.a.b.i> arrayList = aVar.f7243b.get(i);
            if (arrayList != null && (e instanceof com.google.android.wallet.b.d)) {
                com.google.android.wallet.b.d dVar = (com.google.android.wallet.b.d) e;
                aVar.f7242a.put(i, dVar);
                dVar.setTriggerListener(eVar);
                dVar.a(arrayList);
            }
            if ((e instanceof com.google.android.wallet.b.c) && aVar.d.get(i)) {
                aVar.c.put(i, (com.google.android.wallet.b.c) e);
            }
        }
    }

    public static int a(int i) {
        if (Build.VERSION.SDK_INT < 17) {
            return a(i, true);
        }
        return i;
    }

    public static void a(RelativeLayout.LayoutParams layoutParams, int i, int i2) {
        boolean z;
        layoutParams.addRule(i, 0);
        if (Build.VERSION.SDK_INT >= 17) {
            switch (i) {
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                layoutParams.addRule(a(i, i2 == 0), 0);
            }
        }
    }

    @TargetApi(17)
    private static int a(int i, boolean z) {
        switch (i) {
            case 16:
                return z ? 0 : 1;
            case 17:
                return z ? 1 : 0;
            case 18:
                return z ? 5 : 7;
            case 19:
                return z ? 7 : 5;
            case 20:
                return z ? 9 : 11;
            case 21:
                return z ? 11 : 9;
            default:
                return i;
        }
    }

    public static void f(View view) {
        View findViewById = view.findViewById(com.google.android.wallet.e.g.focus_stealer);
        if (findViewById != null) {
            findViewById.requestFocus();
        } else {
            view.clearFocus();
        }
    }

    public static void a(Fragment fragment) {
        f(fragment.f().findViewById(R.id.content));
    }

    public static void g(View view) {
        View focusSearch;
        if (!view.isFocusable()) {
            Log.d("WalletUiUtils", "viewToSearchFrom in advanceFocusForForm is not focusable.");
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            focusSearch = view.focusSearch(2);
        } else {
            focusSearch = view.focusSearch(130);
        }
        if (focusSearch != null) {
            if (com.google.android.wallet.common.util.a.a(view.getContext())) {
                focusSearch.postDelayed(new bp(focusSearch), 750L);
            } else {
                focusSearch.requestFocus();
            }
        }
    }

    public static void a(Rect rect, View view, int i, int i2) {
        int height = (i - view.getHeight()) / 2;
        int width = (i2 - view.getWidth()) / 2;
        view.getHitRect(rect);
        rect.inset(width > 0 ? -width : 0, height > 0 ? -height : 0);
    }

    public static void a(int[] iArr, View view, View view2) {
        Arrays.fill(iArr, 0);
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        Object parent = view.getParent();
        while ((parent instanceof View) && parent != view2) {
            View view3 = (View) parent;
            iArr[0] = iArr[0] - view3.getScrollX();
            iArr[1] = iArr[1] - view3.getScrollY();
            iArr[0] = iArr[0] + view3.getLeft();
            iArr[1] = iArr[1] + view3.getTop();
            parent = view3.getParent();
        }
        if (parent != view2) {
            throw new IllegalArgumentException("ancestorView not an ancestor of view");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(View view, boolean z) {
        ViewParent parent;
        if (view instanceof ViewParent) {
            parent = (ViewParent) view;
        } else {
            parent = view.getParent();
        }
        while (true) {
            if (parent != null) {
                if (ScrollView.class.isInstance(parent)) {
                    break;
                }
                parent = parent.getParent();
            } else {
                parent = null;
                break;
            }
        }
        ScrollView scrollView = (ScrollView) parent;
        if (scrollView == null) {
            return false;
        }
        boolean isFillViewport = scrollView.isFillViewport();
        scrollView.setFillViewport(z);
        return isFillViewport;
    }

    public static boolean h(View view) {
        if ((view instanceof TextView) && !(view instanceof Button)) {
            if (!((view instanceof EditText) || ((view instanceof TextView) && ((TextView) view).isInputMethodTarget()))) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(11)
    public static ColorStateList b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.textColorSecondary, com.google.android.wallet.e.c.colorAccent});
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        obtainStyledAttributes.recycle();
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_activated}, new int[]{R.attr.state_focused}, new int[]{R.attr.state_checked}, new int[0]}, new int[]{colorStateList.getColorForState(new int[]{-16842910}, -16777216), color, color, color, colorStateList.getDefaultColor()});
    }

    public static com.google.android.wallet.ui.address.b a(com.google.b.a.a.a.b.a.a.b bVar, int i) {
        return (!bVar.q || Build.VERSION.SDK_INT < 14) ? com.google.android.wallet.ui.address.b.b(bVar, i) : com.google.android.wallet.ui.address.a.a(bVar, i);
    }

    public static int b(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
            case 10007:
                return 3;
            case 10001:
            case 10004:
                return 2;
            case 10003:
            case 10005:
            case 10006:
            case 10009:
                return 4;
            default:
                return 0;
        }
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        return intent;
    }
}
