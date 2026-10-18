package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class ed implements ea {

    /* renamed from: a, reason: collision with root package name */
    static final Map<String, Integer> f5950a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.b f5951b;
    private final fp c;

    public ed(com.google.android.gms.ads.internal.b bVar, fp fpVar) {
        this.f5951b = bVar;
        this.c = fpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        boolean z;
        int[] iArr;
        RelativeLayout.LayoutParams layoutParams;
        char c;
        int i;
        int i2;
        int intValue = f5950a.get(map.get("a")).intValue();
        if (intValue != 5 && this.f5951b != null && !this.f5951b.a()) {
            com.google.android.gms.ads.internal.util.client.b.a("Action was blocked because no click was detected.");
            return;
        }
        switch (intValue) {
            case 1:
                fp fpVar = this.c;
                synchronized (fpVar.j) {
                    if (fpVar.l == null) {
                        fpVar.a("Not an activity context. Cannot resize.");
                        return;
                    }
                    if (fpVar.k.h() == null) {
                        fpVar.a("Webview is not yet available, size is not set.");
                        return;
                    }
                    if (fpVar.k.h().e) {
                        fpVar.a("Is interstitial. Cannot resize an interstitial.");
                        return;
                    }
                    if (fpVar.k.m()) {
                        fpVar.a("Cannot resize an expanded banner.");
                        return;
                    }
                    if (!TextUtils.isEmpty(map.get("width"))) {
                        com.google.android.gms.ads.internal.d.c();
                        fpVar.i = hk.a(map.get("width"));
                    }
                    if (!TextUtils.isEmpty(map.get("height"))) {
                        com.google.android.gms.ads.internal.d.c();
                        fpVar.f = hk.a(map.get("height"));
                    }
                    if (!TextUtils.isEmpty(map.get("offsetX"))) {
                        com.google.android.gms.ads.internal.d.c();
                        fpVar.g = hk.a(map.get("offsetX"));
                    }
                    if (!TextUtils.isEmpty(map.get("offsetY"))) {
                        com.google.android.gms.ads.internal.d.c();
                        fpVar.h = hk.a(map.get("offsetY"));
                    }
                    if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                        fpVar.c = Boolean.parseBoolean(map.get("allowOffscreen"));
                    }
                    String str = map.get("customClosePosition");
                    if (!TextUtils.isEmpty(str)) {
                        fpVar.f5981b = str;
                    }
                    if (!(fpVar.i >= 0 && fpVar.f >= 0)) {
                        fpVar.a("Invalid width and height options. Cannot resize.");
                        return;
                    }
                    Window window = fpVar.l.getWindow();
                    if (window == null || window.getDecorView() == null) {
                        fpVar.a("Activity context is not ready, cannot get window or decor view.");
                        return;
                    }
                    com.google.android.gms.ads.internal.d.c();
                    int[] b2 = hk.b(fpVar.l);
                    com.google.android.gms.ads.internal.d.c();
                    int[] c2 = hk.c(fpVar.l);
                    int i3 = b2[0];
                    int i4 = b2[1];
                    if (fpVar.i < 50 || fpVar.i > i3) {
                        com.google.android.gms.ads.internal.util.client.b.e("Width is too small or too large.");
                        z = false;
                    } else if (fpVar.f < 50 || fpVar.f > i4) {
                        com.google.android.gms.ads.internal.util.client.b.e("Height is too small or too large.");
                        z = false;
                    } else if (fpVar.f == i4 && fpVar.i == i3) {
                        com.google.android.gms.ads.internal.util.client.b.e("Cannot resize to a full-screen ad.");
                        z = false;
                    } else {
                        if (fpVar.c) {
                            String str2 = fpVar.f5981b;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    if (str2.equals("center")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1012429441:
                                    if (str2.equals("top-left")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -655373719:
                                    if (str2.equals("bottom-left")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1163912186:
                                    if (str2.equals("bottom-right")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1288627767:
                                    if (str2.equals("bottom-center")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1755462605:
                                    if (str2.equals("top-center")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    i = fpVar.g + fpVar.d;
                                    i2 = fpVar.e + fpVar.h;
                                    break;
                                case 1:
                                    i = ((fpVar.d + fpVar.g) + (fpVar.i / 2)) - 25;
                                    i2 = fpVar.e + fpVar.h;
                                    break;
                                case 2:
                                    i = ((fpVar.d + fpVar.g) + (fpVar.i / 2)) - 25;
                                    i2 = ((fpVar.e + fpVar.h) + (fpVar.f / 2)) - 25;
                                    break;
                                case 3:
                                    i = fpVar.g + fpVar.d;
                                    i2 = ((fpVar.e + fpVar.h) + fpVar.f) - 50;
                                    break;
                                case 4:
                                    i = ((fpVar.d + fpVar.g) + (fpVar.i / 2)) - 25;
                                    i2 = ((fpVar.e + fpVar.h) + fpVar.f) - 50;
                                    break;
                                case 5:
                                    i = ((fpVar.d + fpVar.g) + fpVar.i) - 50;
                                    i2 = ((fpVar.e + fpVar.h) + fpVar.f) - 50;
                                    break;
                                default:
                                    i = ((fpVar.d + fpVar.g) + fpVar.i) - 50;
                                    i2 = fpVar.e + fpVar.h;
                                    break;
                            }
                            if (i < 0 || i + 50 > i3 || i2 < c2[0] || i2 + 50 > c2[1]) {
                                z = false;
                            }
                        }
                        z = true;
                    }
                    if (!z) {
                        iArr = null;
                    } else if (fpVar.c) {
                        iArr = new int[]{fpVar.d + fpVar.g, fpVar.e + fpVar.h};
                    } else {
                        com.google.android.gms.ads.internal.d.c();
                        int[] b3 = hk.b(fpVar.l);
                        com.google.android.gms.ads.internal.d.c();
                        int[] c3 = hk.c(fpVar.l);
                        int i5 = b3[0];
                        int i6 = fpVar.g + fpVar.d;
                        int i7 = fpVar.e + fpVar.h;
                        iArr = new int[]{i6 < 0 ? 0 : fpVar.i + i6 > i5 ? i5 - fpVar.i : i6, i7 < c3[0] ? c3[0] : fpVar.f + i7 > c3[1] ? c3[1] - fpVar.f : i7};
                    }
                    if (iArr == null) {
                        fpVar.a("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    com.google.android.gms.ads.internal.client.j.a();
                    int a2 = com.google.android.gms.ads.internal.util.client.a.a(fpVar.l, fpVar.i);
                    com.google.android.gms.ads.internal.client.j.a();
                    int a3 = com.google.android.gms.ads.internal.util.client.a.a(fpVar.l, fpVar.f);
                    ViewParent parent = fpVar.k.getView().getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        fpVar.a("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ((ViewGroup) parent).removeView(fpVar.k.getView());
                    if (fpVar.p == null) {
                        fpVar.r = (ViewGroup) parent;
                        com.google.android.gms.ads.internal.d.c();
                        Bitmap a4 = hk.a(fpVar.k.getView());
                        fpVar.n = new ImageView(fpVar.l);
                        fpVar.n.setImageBitmap(a4);
                        fpVar.m = fpVar.k.h();
                        fpVar.r.addView(fpVar.n);
                    } else {
                        fpVar.p.dismiss();
                    }
                    fpVar.q = new RelativeLayout(fpVar.l);
                    fpVar.q.setBackgroundColor(0);
                    fpVar.q.setLayoutParams(new ViewGroup.LayoutParams(a2, a3));
                    com.google.android.gms.ads.internal.d.c();
                    fpVar.p = hk.a(fpVar.q, a2, a3);
                    fpVar.p.setOutsideTouchable(true);
                    fpVar.p.setTouchable(true);
                    fpVar.p.setClippingEnabled(!fpVar.c);
                    fpVar.q.addView(fpVar.k.getView(), -1, -1);
                    fpVar.o = new LinearLayout(fpVar.l);
                    com.google.android.gms.ads.internal.client.j.a();
                    int a5 = com.google.android.gms.ads.internal.util.client.a.a(fpVar.l, 50);
                    com.google.android.gms.ads.internal.client.j.a();
                    layoutParams = new RelativeLayout.LayoutParams(a5, com.google.android.gms.ads.internal.util.client.a.a(fpVar.l, 50));
                    switch (fpVar.f5981b) {
                        case "top-left":
                            layoutParams.addRule(10);
                            layoutParams.addRule(9);
                            break;
                        case "top-center":
                            layoutParams.addRule(10);
                            layoutParams.addRule(14);
                            break;
                        case "center":
                            layoutParams.addRule(13);
                            break;
                        case "bottom-left":
                            layoutParams.addRule(12);
                            layoutParams.addRule(9);
                            break;
                        case "bottom-center":
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                            break;
                        case "bottom-right":
                            layoutParams.addRule(12);
                            layoutParams.addRule(11);
                            break;
                        default:
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                            break;
                    }
                    fpVar.o.setOnClickListener(new fq(fpVar));
                    fpVar.o.setContentDescription("Close button");
                    fpVar.q.addView(fpVar.o, layoutParams);
                    try {
                        PopupWindow popupWindow = fpVar.p;
                        View decorView = window.getDecorView();
                        com.google.android.gms.ads.internal.client.j.a();
                        int a6 = com.google.android.gms.ads.internal.util.client.a.a(fpVar.l, iArr[0]);
                        com.google.android.gms.ads.internal.client.j.a();
                        popupWindow.showAtLocation(decorView, 0, a6, com.google.android.gms.ads.internal.util.client.a.a(fpVar.l, iArr[1]));
                        fpVar.k.a(new AdSizeParcel(fpVar.l, new com.google.android.gms.ads.c(fpVar.i, fpVar.f)));
                        int i8 = iArr[0];
                        int i9 = iArr[1];
                        com.google.android.gms.ads.internal.d.c();
                        try {
                            fpVar.s.a("onSizeChanged", new JSONObject().put("x", i8).put("y", i9 - hk.c(fpVar.l)[0]).put("width", fpVar.i).put("height", fpVar.f));
                        } catch (JSONException e) {
                            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching size change.", e);
                        }
                        fpVar.b("resized");
                        return;
                    } catch (RuntimeException e2) {
                        fpVar.a("Cannot show popup window: " + e2.getMessage());
                        fpVar.q.removeView(fpVar.k.getView());
                        if (fpVar.r != null) {
                            fpVar.r.removeView(fpVar.n);
                            fpVar.r.addView(fpVar.k.getView());
                            fpVar.k.a(fpVar.m);
                        }
                        return;
                    }
                }
            case 2:
            default:
                com.google.android.gms.ads.internal.util.client.b.c("Unknown MRAID command called.");
                return;
            case 3:
                fs fsVar = new fs(imVar, map);
                if (fsVar.f5986b == null) {
                    fsVar.a("Activity context is not available");
                    return;
                }
                com.google.android.gms.ads.internal.d.c();
                if (!hk.c(fsVar.f5986b).a()) {
                    fsVar.a("Feature is not supported by the device.");
                    return;
                }
                String str3 = fsVar.f5985a.get("iurl");
                if (TextUtils.isEmpty(str3)) {
                    fsVar.a("Image url cannot be empty.");
                    return;
                }
                if (!URLUtil.isValidUrl(str3)) {
                    fsVar.a("Invalid image url: " + str3);
                    return;
                }
                String lastPathSegment = Uri.parse(str3).getLastPathSegment();
                com.google.android.gms.ads.internal.d.c();
                if (!hk.b(lastPathSegment)) {
                    fsVar.a("Image type not recognized: " + lastPathSegment);
                    return;
                }
                com.google.android.gms.ads.internal.d.c();
                AlertDialog.Builder b4 = hk.b(fsVar.f5986b);
                b4.setTitle(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.store_picture_title, "Save image"));
                b4.setMessage(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.store_picture_message, "Allow Ad to store image in Picture gallery?"));
                b4.setPositiveButton(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.accept, "Accept"), new ft(fsVar, str3, lastPathSegment));
                b4.setNegativeButton(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.decline, "Decline"), new fu(fsVar));
                b4.create().show();
                return;
            case 4:
                fm fmVar = new fm(imVar, map);
                if (fmVar.f5976a == null) {
                    fmVar.a("Activity context is not available.");
                    return;
                }
                com.google.android.gms.ads.internal.d.c();
                if (!hk.c(fmVar.f5976a).b()) {
                    fmVar.a("This feature is not available on the device.");
                    return;
                }
                com.google.android.gms.ads.internal.d.c();
                AlertDialog.Builder b5 = hk.b(fmVar.f5976a);
                b5.setTitle(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.create_calendar_title, "Create calendar event"));
                b5.setMessage(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.create_calendar_message, "Allow Ad to create a calendar event?"));
                b5.setPositiveButton(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.accept, "Accept"), new fn(fmVar));
                b5.setNegativeButton(com.google.android.gms.ads.internal.d.f().a(com.google.android.gms.b.decline, "Decline"), new fo(fmVar));
                b5.create().show();
                return;
            case 5:
                fr frVar = new fr(imVar, map);
                if (frVar.f5983a == null) {
                    com.google.android.gms.ads.internal.util.client.b.e("AdWebView is null");
                    return;
                } else {
                    frVar.f5983a.setRequestedOrientation("portrait".equalsIgnoreCase(frVar.c) ? com.google.android.gms.ads.internal.d.e().b() : "landscape".equalsIgnoreCase(frVar.c) ? com.google.android.gms.ads.internal.d.e().a() : frVar.f5984b ? -1 : com.google.android.gms.ads.internal.d.e().c());
                    return;
                }
            case 6:
                this.c.a(true);
                return;
        }
    }

    static {
        android.support.v4.h.a aVar = new android.support.v4.h.a(6);
        aVar.put("resize", 1);
        aVar.put("playVideo", 2);
        aVar.put("storePicture", 3);
        aVar.put("createCalendarEvent", 4);
        aVar.put("setOrientationProperties", 5);
        aVar.put("closeResizedAd", 6);
        f5950a = Collections.unmodifiableMap(aVar);
    }
}
