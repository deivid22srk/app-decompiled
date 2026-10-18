package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ao {

    /* renamed from: b, reason: collision with root package name */
    private static ao f665b;
    private WeakHashMap<Context, SparseArray<ColorStateList>> j;
    private android.support.v4.h.a<String, aq> k;
    private SparseArray<String> l;
    private final Object m = new Object();
    private final WeakHashMap<Context, android.support.v4.h.f<WeakReference<Drawable.ConstantState>>> n = new WeakHashMap<>(0);
    private TypedValue o;

    /* renamed from: a, reason: collision with root package name */
    private static final PorterDuff.Mode f664a = PorterDuff.Mode.SRC_IN;
    private static final ap c = new ap();
    private static final int[] d = {android.support.v7.b.f.abc_textfield_search_default_mtrl_alpha, android.support.v7.b.f.abc_textfield_default_mtrl_alpha, android.support.v7.b.f.abc_ab_share_pack_mtrl_alpha};
    private static final int[] e = {android.support.v7.b.f.abc_ic_search_api_mtrl_alpha, android.support.v7.b.f.abc_ic_commit_search_api_mtrl_alpha};
    private static final int[] f = {android.support.v7.b.f.abc_textfield_activated_mtrl_alpha, android.support.v7.b.f.abc_textfield_search_activated_mtrl_alpha, android.support.v7.b.f.abc_cab_background_top_mtrl_alpha, android.support.v7.b.f.abc_text_cursor_material};
    private static final int[] g = {android.support.v7.b.f.abc_popup_background_mtrl_mult, android.support.v7.b.f.abc_cab_background_internal_bg, android.support.v7.b.f.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] h = {android.support.v7.b.f.abc_tab_indicator_material, android.support.v7.b.f.abc_textfield_search_material, android.support.v7.b.f.abc_ratingbar_full_material};
    private static final int[] i = {android.support.v7.b.f.abc_btn_check_material, android.support.v7.b.f.abc_btn_radio_material};

    public static ao a() {
        if (f665b == null) {
            f665b = new ao();
            if (Build.VERSION.SDK_INT < 21) {
                ao aoVar = f665b;
                ar arVar = new ar((byte) 0);
                if (aoVar.k == null) {
                    aoVar.k = new android.support.v4.h.a<>();
                }
                aoVar.k.put("vector", arVar);
            }
        }
        return f665b;
    }

    public final Drawable a(Context context, int i2, boolean z) {
        Drawable a2 = a(context, i2);
        if (a2 == null) {
            a2 = android.support.v4.b.g.a(context, i2);
        }
        if (a2 != null) {
            a2 = a(context, i2, z, a2);
        }
        if (a2 != null) {
            cf.b(a2);
        }
        return a2;
    }

    final Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        int i3;
        int i4;
        PorterDuff.Mode mode;
        boolean z2;
        boolean z3 = false;
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (cf.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable c2 = android.support.v4.c.a.a.c(drawable);
            android.support.v4.c.a.a.a(c2, b2);
            PorterDuff.Mode mode2 = null;
            if (i2 == android.support.v7.b.f.abc_switch_thumb_material) {
                mode2 = PorterDuff.Mode.MULTIPLY;
            }
            if (mode2 != null) {
                android.support.v4.c.a.a.a(c2, mode2);
                return c2;
            }
            return c2;
        }
        if (i2 == android.support.v7.b.f.abc_cab_background_top_material) {
            return new LayerDrawable(new Drawable[]{a(context, android.support.v7.b.f.abc_cab_background_internal_bg, false), a(context, android.support.v7.b.f.abc_cab_background_top_mtrl_alpha, false)});
        }
        if (i2 == android.support.v7.b.f.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(R.id.background), ft.a(context, android.support.v7.b.b.colorControlNormal), f664a);
            a(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ft.a(context, android.support.v7.b.b.colorControlNormal), f664a);
            a(layerDrawable.findDrawableByLayerId(R.id.progress), ft.a(context, android.support.v7.b.b.colorControlActivated), f664a);
            return drawable;
        }
        if (i2 == android.support.v7.b.f.abc_ratingbar_indicator_material || i2 == android.support.v7.b.f.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(R.id.background), ft.c(context, android.support.v7.b.b.colorControlNormal), f664a);
            a(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), ft.a(context, android.support.v7.b.b.colorControlActivated), f664a);
            a(layerDrawable2.findDrawableByLayerId(R.id.progress), ft.a(context, android.support.v7.b.b.colorControlActivated), f664a);
            return drawable;
        }
        PorterDuff.Mode mode3 = f664a;
        if (a(d, i2)) {
            i4 = android.support.v7.b.b.colorControlNormal;
            mode = mode3;
            z2 = true;
            i3 = -1;
        } else if (a(f, i2)) {
            i4 = android.support.v7.b.b.colorControlActivated;
            mode = mode3;
            z2 = true;
            i3 = -1;
        } else if (a(g, i2)) {
            z2 = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i4 = 16842801;
            i3 = -1;
        } else if (i2 == android.support.v7.b.f.abc_list_divider_mtrl_alpha) {
            i4 = R.attr.colorForeground;
            i3 = Math.round(40.8f);
            mode = mode3;
            z2 = true;
        } else {
            i3 = -1;
            i4 = 0;
            mode = mode3;
            z2 = false;
        }
        if (z2) {
            Drawable mutate = cf.c(drawable) ? drawable.mutate() : drawable;
            mutate.setColorFilter(a(ft.a(context, i4), mode));
            if (i3 != -1) {
                mutate.setAlpha(i3);
            }
            z3 = true;
        }
        if (!z3 && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.graphics.drawable.Drawable a(android.content.Context r11, int r12) {
        /*
            r10 = this;
            r1 = 0
            r9 = 2
            r8 = 1
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.aq> r0 = r10.k
            if (r0 == 0) goto Lc2
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.aq> r0 = r10.k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc2
            android.util.SparseArray<java.lang.String> r0 = r10.l
            if (r0 == 0) goto L2f
            android.util.SparseArray<java.lang.String> r0 = r10.l
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2d
            if (r0 == 0) goto L36
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.aq> r2 = r10.k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L36
        L2d:
            r0 = r1
        L2e:
            return r0
        L2f:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r10.l = r0
        L36:
            android.util.TypedValue r0 = r10.o
            if (r0 != 0) goto L41
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.o = r0
        L41:
            android.util.TypedValue r2 = r10.o
            android.content.res.Resources r3 = r11.getResources()
            r3.getValue(r12, r2, r8)
            int r0 = r2.assetCookie
            long r0 = (long) r0
            r4 = 32
            long r0 = r0 << r4
            int r4 = r2.data
            long r4 = (long) r4
            long r4 = r4 | r0
            android.graphics.drawable.Drawable r1 = r10.a(r11, r4)
            if (r1 == 0) goto L5c
            r0 = r1
            goto L2e
        L5c:
            java.lang.CharSequence r0 = r2.string
            if (r0 == 0) goto L90
            java.lang.CharSequence r0 = r2.string
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = ".xml"
            boolean r0 = r0.endsWith(r6)
            if (r0 == 0) goto L90
            android.content.res.XmlResourceParser r6 = r3.getXml(r12)     // Catch: java.lang.Exception -> L88
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r6)     // Catch: java.lang.Exception -> L88
        L76:
            int r0 = r6.next()     // Catch: java.lang.Exception -> L88
            if (r0 == r9) goto L7e
            if (r0 != r8) goto L76
        L7e:
            if (r0 == r9) goto L9b
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> L88
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)     // Catch: java.lang.Exception -> L88
            throw r0     // Catch: java.lang.Exception -> L88
        L88:
            r0 = move-exception
            java.lang.String r2 = "AppCompatDrawableManager"
            java.lang.String r3 = "Exception while inflating drawable"
            android.util.Log.e(r2, r3, r0)
        L90:
            r0 = r1
        L91:
            if (r0 != 0) goto L2e
            android.util.SparseArray<java.lang.String> r1 = r10.l
            java.lang.String r2 = "appcompat_skip_skip"
            r1.append(r12, r2)
            goto L2e
        L9b:
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Exception -> L88
            android.util.SparseArray<java.lang.String> r8 = r10.l     // Catch: java.lang.Exception -> L88
            r8.append(r12, r0)     // Catch: java.lang.Exception -> L88
            android.support.v4.h.a<java.lang.String, android.support.v7.widget.aq> r8 = r10.k     // Catch: java.lang.Exception -> L88
            java.lang.Object r0 = r8.get(r0)     // Catch: java.lang.Exception -> L88
            android.support.v7.widget.aq r0 = (android.support.v7.widget.aq) r0     // Catch: java.lang.Exception -> L88
            if (r0 == 0) goto Lb6
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch: java.lang.Exception -> L88
            android.graphics.drawable.Drawable r1 = r0.a(r3, r6, r7, r8)     // Catch: java.lang.Exception -> L88
        Lb6:
            if (r1 == 0) goto Lc0
            int r0 = r2.changingConfigurations     // Catch: java.lang.Exception -> L88
            r1.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> L88
            r10.a(r11, r4, r1)     // Catch: java.lang.Exception -> L88
        Lc0:
            r0 = r1
            goto L91
        Lc2:
            r0 = r1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ao.a(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable a(Context context, long j) {
        synchronized (this.m) {
            android.support.v4.h.f<WeakReference<Drawable.ConstantState>> fVar = this.n.get(context);
            if (fVar == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> a2 = fVar.a(j);
            if (a2 != null) {
                Drawable.ConstantState constantState = a2.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                fVar.b(j);
            }
            return null;
        }
    }

    private boolean a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.m) {
                android.support.v4.h.f<WeakReference<Drawable.ConstantState>> fVar = this.n.get(context);
                if (fVar == null) {
                    fVar = new android.support.v4.h.f<>();
                    this.n.put(context, fVar);
                }
                fVar.a(j, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private static ColorStateList c(Context context, int i2) {
        int a2 = ft.a(context, i2);
        int a3 = ft.a(context, android.support.v7.b.b.colorControlHighlight);
        return new ColorStateList(new int[][]{ft.f829a, ft.d, ft.f830b, ft.h}, new int[]{ft.c(context, android.support.v7.b.b.colorButtonNormal), android.support.v4.c.a.a(a3, a2), android.support.v4.c.a.a(a3, a2), a2});
    }

    public static void a(Drawable drawable, fv fvVar, int[] iArr) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (cf.c(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (fvVar.d || fvVar.c) {
            ColorStateList colorStateList = fvVar.d ? fvVar.f833a : null;
            PorterDuff.Mode mode = fvVar.c ? fvVar.f834b : f664a;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    private static PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2 = c.a((ap) Integer.valueOf(ap.a(i2, mode)));
        if (a2 == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            c.a((ap) Integer.valueOf(ap.a(i2, mode)), (Integer) porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return a2;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (cf.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f664a;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    public final ColorStateList b(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList c2;
        if (this.j != null) {
            SparseArray<ColorStateList> sparseArray = this.j.get(context);
            colorStateList = sparseArray != null ? sparseArray.get(i2) : null;
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            if (i2 != android.support.v7.b.f.abc_edit_text_material) {
                if (i2 != android.support.v7.b.f.abc_switch_track_mtrl_alpha) {
                    if (i2 != android.support.v7.b.f.abc_switch_thumb_material) {
                        if (i2 != android.support.v7.b.f.abc_btn_default_mtrl_shape && i2 != android.support.v7.b.f.abc_btn_borderless_material) {
                            if (i2 != android.support.v7.b.f.abc_btn_colored_material) {
                                if (i2 != android.support.v7.b.f.abc_spinner_mtrl_am_alpha && i2 != android.support.v7.b.f.abc_spinner_textfield_background_material) {
                                    if (a(e, i2)) {
                                        c2 = ft.b(context, android.support.v7.b.b.colorControlNormal);
                                    } else if (!a(h, i2)) {
                                        if (a(i, i2)) {
                                            c2 = new ColorStateList(new int[][]{ft.f829a, ft.e, ft.h}, new int[]{ft.c(context, android.support.v7.b.b.colorControlNormal), ft.a(context, android.support.v7.b.b.colorControlActivated), ft.a(context, android.support.v7.b.b.colorControlNormal)});
                                        } else {
                                            c2 = i2 == android.support.v7.b.f.abc_seekbar_thumb_material ? new ColorStateList(new int[][]{ft.f829a, ft.h}, new int[]{ft.c(context, android.support.v7.b.b.colorControlActivated), ft.a(context, android.support.v7.b.b.colorControlActivated)}) : colorStateList;
                                        }
                                    } else {
                                        int a2 = ft.a(context, android.support.v7.b.b.colorControlNormal);
                                        int a3 = ft.a(context, android.support.v7.b.b.colorControlActivated);
                                        c2 = new ColorStateList(new int[][]{ft.f829a, ft.f830b, ft.c, ft.d, ft.e, ft.f, ft.h}, new int[]{ft.c(context, android.support.v7.b.b.colorControlNormal), a3, a3, a3, a3, a3, a2});
                                    }
                                } else {
                                    c2 = new ColorStateList(new int[][]{ft.f829a, ft.g, ft.h}, new int[]{ft.c(context, android.support.v7.b.b.colorControlNormal), ft.a(context, android.support.v7.b.b.colorControlNormal), ft.a(context, android.support.v7.b.b.colorControlActivated)});
                                }
                            } else {
                                c2 = c(context, android.support.v7.b.b.colorAccent);
                            }
                        } else {
                            c2 = c(context, android.support.v7.b.b.colorButtonNormal);
                        }
                    } else {
                        int[][] iArr = new int[3][];
                        int[] iArr2 = new int[3];
                        ColorStateList b2 = ft.b(context, android.support.v7.b.b.colorSwitchThumbNormal);
                        if (b2 != null && b2.isStateful()) {
                            iArr[0] = ft.f829a;
                            iArr2[0] = b2.getColorForState(iArr[0], 0);
                            iArr[1] = ft.e;
                            iArr2[1] = ft.a(context, android.support.v7.b.b.colorControlActivated);
                            iArr[2] = ft.h;
                            iArr2[2] = b2.getDefaultColor();
                        } else {
                            iArr[0] = ft.f829a;
                            iArr2[0] = ft.c(context, android.support.v7.b.b.colorSwitchThumbNormal);
                            iArr[1] = ft.e;
                            iArr2[1] = ft.a(context, android.support.v7.b.b.colorControlActivated);
                            iArr[2] = ft.h;
                            iArr2[2] = ft.a(context, android.support.v7.b.b.colorSwitchThumbNormal);
                        }
                        c2 = new ColorStateList(iArr, iArr2);
                    }
                } else {
                    c2 = new ColorStateList(new int[][]{ft.f829a, ft.e, ft.h}, new int[]{ft.a(context, R.attr.colorForeground, 0.1f), ft.a(context, android.support.v7.b.b.colorControlActivated, 0.3f), ft.a(context, R.attr.colorForeground, 0.3f)});
                }
            } else {
                c2 = new ColorStateList(new int[][]{ft.f829a, ft.g, ft.h}, new int[]{ft.c(context, android.support.v7.b.b.colorControlNormal), ft.a(context, android.support.v7.b.b.colorControlNormal), ft.a(context, android.support.v7.b.b.colorControlActivated)});
            }
            if (c2 != null) {
                if (this.j == null) {
                    this.j = new WeakHashMap<>();
                }
                SparseArray<ColorStateList> sparseArray2 = this.j.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray<>();
                    this.j.put(context, sparseArray2);
                }
                sparseArray2.append(i2, c2);
            }
            return c2;
        }
        return colorStateList;
    }
}
