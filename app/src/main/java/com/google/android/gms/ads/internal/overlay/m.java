package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.im;
import java.util.HashMap;

@gw
/* loaded from: classes.dex */
public final class m extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final im f5327a;

    /* renamed from: b, reason: collision with root package name */
    final FrameLayout f5328b;
    public final q c;
    public k d;
    public boolean e;
    public boolean f;
    TextView g;
    long h;
    public String i;
    private String j;

    public static void a(im imVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        imVar.a("onVideoEvent", hashMap);
    }

    public final void a() {
        if (this.d == null) {
            return;
        }
        if (TextUtils.isEmpty(this.i)) {
            a("no_src", new String[0]);
        } else {
            this.d.setMimeType(this.j);
            this.d.setVideoPath(this.i);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3 + 2, i4 + 2);
        layoutParams.setMargins(i - 1, i2 - 1, 0, 0);
        this.f5328b.setLayoutParams(layoutParams);
        requestLayout();
    }

    final void a(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        int length = strArr.length;
        int i = 0;
        String str2 = null;
        while (i < length) {
            String str3 = strArr[i];
            if (str2 != null) {
                hashMap.put(str2, str3);
                str3 = null;
            }
            i++;
            str2 = str3;
        }
        this.f5327a.a("onVideoEvent", hashMap);
    }

    public final void b() {
        if (this.d == null) {
            return;
        }
        TextView textView = new TextView(this.d.getContext());
        textView.setText("AdMob - " + this.d.a());
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f5328b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f5328b.bringChildToFront(textView);
    }

    final boolean c() {
        return this.g.getParent() != null;
    }

    public final void setMimeType(String str) {
        this.j = str;
    }

    public m(Context context, im imVar) {
        super(context);
        this.f5327a = imVar;
        this.f5328b = new FrameLayout(context);
        addView(this.f5328b, new FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.e.a(imVar.e());
        this.d = imVar.e().f5283b.a();
        if (this.d != null) {
            this.f5328b.addView(this.d, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        this.g = new TextView(context);
        this.g.setBackgroundColor(-16777216);
        if (!c()) {
            this.f5328b.addView(this.g, new FrameLayout.LayoutParams(-1, -1));
            this.f5328b.bringChildToFront(this.g);
        }
        this.c = new q(this);
        this.c.a();
        if (this.d == null) {
            a("error", "what", "AdVideoUnderlay Error", "extra", "Allocating player failed.");
        }
    }
}
