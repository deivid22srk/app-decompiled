package com.google.android.finsky.layout.play;

import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private static final as[] f3449a = new as[6];

    static {
        at atVar = new at(R.layout.play_card_rate, 4, 2, 1.0f);
        at atVar2 = new at(R.layout.play_card_rate, 6, 2, 1.0f);
        at atVar3 = new at(R.layout.play_card_rate, 5, 2, 1.0f);
        as[] asVarArr = f3449a;
        as a2 = new as(4, 2).a(atVar, 0, 0).a(atVar, 4, 0);
        a2.f = true;
        asVarArr[0] = a2;
        as[] asVarArr2 = f3449a;
        as a3 = new as(6, 2).a(atVar2, 0, 0).a(atVar2, 6, 0);
        a3.f = true;
        asVarArr2[1] = a3;
        as[] asVarArr3 = f3449a;
        as a4 = new as(8, 2).a(atVar, 0, 0).a(atVar, 4, 0).a(atVar, 8, 0);
        a4.f = true;
        asVarArr3[3] = a4;
        as[] asVarArr4 = f3449a;
        as a5 = new as(10, 2).a(atVar3, 0, 0).a(atVar3, 5, 0).a(atVar3, 10, 0);
        a5.f = true;
        asVarArr4[5] = a5;
    }

    public static as a(int i) {
        return f3449a[av.a(i, false)];
    }
}
