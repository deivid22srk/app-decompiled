package com.google.android.finsky.utils;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.DecoratedTextView;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.StarRatingBar;
import java.text.NumberFormat;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f5058a;

    /* renamed from: b, reason: collision with root package name */
    private static NumberFormat f5059b;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        f5059b = numberInstance;
        numberInstance.setMinimumFractionDigits(1);
        f5059b.setMaximumFractionDigits(1);
    }

    public static boolean a() {
        if (f5058a == null) {
            f5058a = Boolean.valueOf(FinskyApp.a().e().a(12603097L));
        }
        return f5058a.booleanValue();
    }

    public static com.google.android.finsky.protos.ds a(com.google.android.finsky.protos.an anVar) {
        for (com.google.android.finsky.protos.ds dsVar : anVar.e) {
            if (dsVar.f3746a == 6) {
                return dsVar;
            }
        }
        return null;
    }

    public static void a(Document document, com.google.android.play.image.e eVar, DecoratedTextView decoratedTextView) {
        a(document.Y() ? document.Z() : null, eVar, decoratedTextView);
    }

    public static void a(com.google.android.finsky.protos.an anVar, com.google.android.play.image.e eVar, DecoratedTextView decoratedTextView) {
        CharSequence text = decoratedTextView.getText();
        if (anVar != null) {
            int textSize = (int) decoratedTextView.getTextSize();
            com.google.android.finsky.protos.ds a2 = a(anVar);
            if (a2 != null) {
                decoratedTextView.a(eVar, a2, textSize);
                decoratedTextView.setContentDescription(decoratedTextView.getResources().getString(R.string.content_description_item_subtitle, text, anVar.f3598a));
                return;
            } else {
                decoratedTextView.setContentDescription(text);
                return;
            }
        }
        decoratedTextView.setCompoundDrawables(null, null, null, null);
        decoratedTextView.setContentDescription(text);
    }

    public static void a(Document document, StarRatingBar starRatingBar, DecoratedTextView decoratedTextView) {
        if (decoratedTextView != null) {
            decoratedTextView.setVisibility(8);
        }
        if (decoratedTextView != null && document.ab()) {
            decoratedTextView.setVisibility(0);
            com.google.android.finsky.protos.an anVar = document.f1963a.C.m[0];
            int textSize = (int) decoratedTextView.getTextSize();
            com.google.android.finsky.protos.ds a2 = a(anVar);
            if (a2 != null) {
                decoratedTextView.a(FinskyApp.a().d, a2, textSize);
            }
            decoratedTextView.setText(anVar.f3598a.toUpperCase());
            ColorStateList colorStateList = decoratedTextView.getResources().getColorStateList(R.color.play_secondary_text);
            decoratedTextView.setTextColor(colorStateList);
            decoratedTextView.f6977b = false;
            if (decoratedTextView.f6977b) {
                decoratedTextView.f6976a.setColor(colorStateList.getDefaultColor());
            }
            decoratedTextView.invalidate();
            android.support.v4.view.by.a(decoratedTextView, 0, decoratedTextView.getPaddingTop(), 0, decoratedTextView.getPaddingBottom());
            return;
        }
        if (decoratedTextView != null && (document.aK() || document.aL())) {
            a(document, decoratedTextView);
            int dimensionPixelSize = decoratedTextView.getResources().getDimensionPixelSize(R.dimen.play_tipper_sticker_padding);
            android.support.v4.view.by.a(decoratedTextView, dimensionPixelSize, decoratedTextView.getPaddingTop(), dimensionPixelSize, decoratedTextView.getPaddingBottom());
            return;
        }
        if (decoratedTextView == null || document.f1963a.e != 20) {
            if (starRatingBar != null) {
                starRatingBar.setCompactMode(true);
                if (document.z() && document.B() > 0) {
                    starRatingBar.setRating(document.A());
                    starRatingBar.setVisibility(0);
                    return;
                } else {
                    starRatingBar.setVisibility(4);
                    return;
                }
            }
            return;
        }
        if (document.J() != null && !TextUtils.isEmpty(document.J().e)) {
            decoratedTextView.setVisibility(0);
            decoratedTextView.a(R.color.grey, false);
            decoratedTextView.setText(document.J().e);
            decoratedTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        android.support.v4.view.by.a(decoratedTextView, 0, decoratedTextView.getPaddingTop(), 0, decoratedTextView.getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.google.android.finsky.api.model.Document r6, com.google.android.play.layout.PlayTextView r7) {
        /*
            r4 = 0
            r2 = -1
            r3 = 0
            r0 = 2131755291(0x7f10011b, float:1.9141457E38)
            boolean r1 = r6.aK()
            if (r1 == 0) goto L19
            com.google.android.finsky.protos.gx r1 = r6.f1963a
            com.google.android.finsky.protos.gp r1 = r1.z
            com.google.android.finsky.protos.w r1 = r1.f3875b
            com.google.android.finsky.protos.jy r1 = r1.c
            int r1 = r1.f4017a
            switch(r1) {
                case 1: goto L4e;
                case 2: goto L58;
                default: goto L19;
            }
        L19:
            r1 = r0
            r0 = r2
        L1b:
            if (r0 != r2) goto L32
            boolean r2 = r6.aL()
            if (r2 == 0) goto L32
            com.google.android.finsky.protos.gx r2 = r6.f1963a
            com.google.android.finsky.protos.gp r2 = r2.z
            com.google.android.finsky.protos.w r2 = r2.f3875b
            com.google.android.finsky.protos.jy r2 = r2.c
            int[] r2 = r2.c
            r2 = r2[r4]
            switch(r2) {
                case 0: goto L67;
                case 1: goto L5f;
                case 2: goto L63;
                default: goto L32;
            }
        L32:
            if (r0 < 0) goto L6b
            r7.setVisibility(r4)
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r0 = r0.toUpperCase()
            r7.setText(r0)
            r0 = 1
            r7.a(r1, r0)
            r7.setCompoundDrawables(r3, r3, r3, r3)
        L4d:
            return
        L4e:
            r1 = 2131362819(0x7f0a0403, float:1.834543E38)
            r0 = 2131755292(0x7f10011c, float:1.914146E38)
            r5 = r0
            r0 = r1
            r1 = r5
            goto L1b
        L58:
            r1 = 2131362818(0x7f0a0402, float:1.8345427E38)
            r5 = r0
            r0 = r1
            r1 = r5
            goto L1b
        L5f:
            r0 = 2131362817(0x7f0a0401, float:1.8345425E38)
            goto L32
        L63:
            r0 = 2131362820(0x7f0a0404, float:1.8345431E38)
            goto L32
        L67:
            r0 = 2131362821(0x7f0a0405, float:1.8345433E38)
            goto L32
        L6b:
            r0 = 8
            r7.setVisibility(r0)
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.utils.v.a(com.google.android.finsky.api.model.Document, com.google.android.play.layout.PlayTextView):void");
    }

    public static String a(float f) {
        return f5059b.format(f);
    }

    public static float b(float f) {
        String a2 = a(f);
        try {
            return f5059b.parse(a2).floatValue();
        } catch (ParseException e) {
            FinskyLog.e("Cannot parse %s. Exception %s", a2, e);
            return f;
        }
    }

    public static void a(Document document, com.google.android.play.image.e eVar, ViewGroup viewGroup) {
        if (document.f1963a.e != 1 && document.f1963a.e != 6) {
            viewGroup.setVisibility(8);
            return;
        }
        com.google.android.finsky.protos.an ac = document.ac();
        if (ac == null) {
            viewGroup.setVisibility(8);
            return;
        }
        DecoratedTextView decoratedTextView = (DecoratedTextView) viewGroup.findViewById(R.id.title_content_rating);
        if (ac.j) {
            decoratedTextView.setText(ac.i);
            decoratedTextView.setVisibility(0);
        } else {
            decoratedTextView.setVisibility(8);
        }
        FifeImageView fifeImageView = (FifeImageView) viewGroup.findViewById(R.id.title_content_rating_icon);
        if (ac.e == null || ac.e.length == 0) {
            fifeImageView.setVisibility(8);
            return;
        }
        com.google.android.finsky.utils.a.a.a(fifeImageView, ac.e[0]);
        fifeImageView.a(ac.e[0].f, true, eVar);
        fifeImageView.setVisibility(0);
    }
}
