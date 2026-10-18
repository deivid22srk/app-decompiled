package com.google.android.finsky.layout.play;

import com.android.vending.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class as {
    public static final at j = new at(R.layout.play_card_mini, 2, 3, 1.0f);
    public static final at k = new at(R.layout.play_card_small, 2, 3, 1.0f);
    public static final at l = new at(R.layout.play_card_medium, 4, 2, 1.0f);
    public static final at m = new at(R.layout.play_card_medium_plus, 4, 3, 1.0f);
    public static final at n = new at(R.layout.play_card_large, 4, 6, 1.0f);
    public static final at o = new at(R.layout.play_card_mini, 2, 4, 1.441f);
    public static final at p = new at(R.layout.play_card_small, 2, 4, 1.441f);
    public static final at q = new at(R.layout.play_card_medium, 4, 2, 1.441f);
    public static final at r = new at(R.layout.play_card_medium_plus, 4, 4, 1.441f);
    public static final at s = new at(R.layout.play_card_large_minus, 6, 4, 1.441f);
    public static final at t = new at(R.layout.play_card_large, 4, 8, 1.441f);
    public static final at u = new at(R.layout.play_card_person, 2, 3, 1.0f);
    public static final at v = new at(R.layout.play_card_avatar, 2, 3, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    int f3411a;

    /* renamed from: b, reason: collision with root package name */
    int f3412b;
    int c;
    List<au> d = new ArrayList();
    boolean e;
    boolean f;
    at g;
    int h;
    boolean i;

    public as(int i, int i2) {
        this.f3411a = i;
        this.f3412b = i2;
        this.c = i;
    }

    public as a(at atVar, int i, int i2) {
        this.d.add(new au(atVar, i, i2, false));
        return this;
    }

    public final as b(at atVar, int i, int i2) {
        this.d.add(new au(atVar, i, i2, true));
        return this;
    }

    public final int a() {
        return this.d.size();
    }

    public final au a(int i) {
        return this.d.get(i);
    }

    public int b() {
        return 0;
    }

    public static float b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 8:
            case 18:
            case 19:
            case 20:
            case 24:
            case 25:
            case 30:
            case 44:
                return 1.0f;
            case 3:
                return 0.5f;
            default:
                return 1.441f;
        }
    }
}
