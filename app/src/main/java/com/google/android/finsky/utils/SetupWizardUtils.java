package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.layout.SetupWizardIllustration;
import com.google.android.finsky.setup.SetupWizardNavBar;

/* loaded from: classes.dex */
public final class SetupWizardUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4715a = com.google.android.finsky.cpkg.d.dO.b();

    /* renamed from: b, reason: collision with root package name */
    public static final String f4716b = com.google.android.finsky.cpkg.d.dP.b();
    public static final String c = com.google.android.finsky.cpkg.d.dG.b();
    public static final String d = com.google.android.finsky.cpkg.d.dH.b();

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static SetupWizardNavBar a(Activity activity) {
        if (a()) {
            return b(activity);
        }
        return null;
    }

    @TargetApi(11)
    private static SetupWizardNavBar b(Activity activity) {
        return (SetupWizardNavBar) activity.getFragmentManager().findFragmentById(R.id.navigation_bar);
    }

    public static void a(Activity activity, boolean z) {
        if (a()) {
            if (z) {
                activity.overridePendingTransition(R.anim.slide_back_in, R.anim.slide_back_out);
            } else {
                activity.overridePendingTransition(R.anim.slide_next_in, R.anim.slide_next_out);
            }
        }
    }

    @TargetApi(11)
    public static void a(Activity activity, SetupWizardParams setupWizardParams, int i, boolean z, boolean z2, boolean z3) {
        a(activity, setupWizardParams, z);
        if (a()) {
            b(activity, setupWizardParams, z3);
            b(activity).f4643b.setEnabled(z);
            String a2 = a(activity, i);
            SetupWizardIllustration setupWizardIllustration = (SetupWizardIllustration) activity.findViewById(R.id.illustration);
            if (setupWizardIllustration.f3081b != null) {
                if (setupWizardIllustration.f3080a && z2) {
                    setupWizardIllustration.f3081b.setVisibility(8);
                    return;
                }
                setupWizardIllustration.f3081b.setVisibility(0);
                setupWizardIllustration.f3081b.a(a2, true, FinskyApp.a().d);
                setupWizardIllustration.f3081b.setOnLoadedListener(new com.google.android.finsky.layout.dy(setupWizardIllustration));
            }
        }
    }

    @TargetApi(11)
    public static void a(Activity activity, SetupWizardParams setupWizardParams, boolean z) {
        int i;
        View decorView = activity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (!a() && setupWizardParams.f4717a) {
            systemUiVisibility |= 37158912;
            z = false;
        }
        if (z) {
            i = systemUiVisibility & (-4194305);
        } else {
            i = systemUiVisibility | 4194304;
        }
        decorView.setSystemUiVisibility(i);
    }

    public static void b(Activity activity, SetupWizardParams setupWizardParams, boolean z) {
        int i;
        View findViewById = activity.findViewById(android.R.id.content);
        if (setupWizardParams.f4718b) {
            i = 4610;
            activity.getWindow().addFlags(Integer.MIN_VALUE);
        } else {
            i = 0;
            activity.getWindow().clearFlags(Integer.MIN_VALUE);
        }
        findViewById.setSystemUiVisibility(i);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new hu(findViewById, i));
        if (!z || !setupWizardParams.f4718b || !com.google.android.finsky.cpkg.d.dQ.b().booleanValue()) {
            return;
        }
        new hv(activity);
    }

    public static String a(Context context, int i) {
        boolean z = context.getResources().getBoolean(R.bool.setup_wizard_use_tablet_graphic);
        if (i == 0) {
            return z ? f4716b : f4715a;
        }
        if (i == 1) {
            return z ? d : c;
        }
        throw new IllegalStateException("Unknown context: " + context);
    }

    public class SetupWizardParams implements Parcelable {
        public static final Parcelable.Creator<SetupWizardParams> CREATOR = new hx();

        /* renamed from: a, reason: collision with root package name */
        final boolean f4717a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f4718b;
        public final boolean c;

        /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
        
            if (r2.equalsIgnoreCase("material_light") == false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public SetupWizardParams(android.content.Intent r5) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                r4.<init>()
                java.lang.String r2 = "on_initial_setup"
                boolean r2 = r5.getBooleanExtra(r2, r0)
                r4.f4717a = r2
                java.lang.String r2 = "useImmersiveMode"
                boolean r2 = r5.getBooleanExtra(r2, r1)
                r4.f4718b = r2
                boolean r2 = com.google.android.finsky.utils.SetupWizardUtils.a()
                if (r2 == 0) goto L32
                java.lang.String r2 = "theme"
                java.lang.String r2 = r5.getStringExtra(r2)
                boolean r3 = android.text.TextUtils.isEmpty(r2)
                if (r3 != 0) goto L2f
                java.lang.String r3 = "material_light"
                boolean r2 = r2.equalsIgnoreCase(r3)
                if (r2 == 0) goto L32
            L2f:
                r4.c = r0
                return
            L32:
                r0 = r1
                goto L2f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.utils.SetupWizardUtils.SetupWizardParams.<init>(android.content.Intent):void");
        }

        public SetupWizardParams(Parcel parcel) {
            this.f4717a = parcel.readByte() == 1;
            this.f4718b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.f4717a ? 1 : 0));
            parcel.writeByte((byte) (this.f4718b ? 1 : 0));
            parcel.writeByte((byte) (this.c ? 1 : 0));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }
    }
}
