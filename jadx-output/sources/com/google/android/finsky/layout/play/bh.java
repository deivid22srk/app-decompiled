package com.google.android.finsky.layout.play;

import com.android.vending.R;

/* loaded from: classes.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private static final as[] f3435a = new as[6];

    /* renamed from: b, reason: collision with root package name */
    private static final as[] f3436b = new as[6];

    static {
        at atVar = new at(R.layout.play_card_rate, 6, 3, 1.0f);
        at atVar2 = new at(R.layout.play_card_rate, 6, 4, 1.441f);
        at atVar3 = new at(R.layout.play_card_quick_suggestion_mini, 2, 3, 1.0f);
        at atVar4 = new at(R.layout.play_card_quick_suggestion_mini, 2, 4, 1.441f);
        at atVar5 = new at(R.layout.play_card_rate, 4, 3, 1.0f);
        at atVar6 = new at(R.layout.play_card_rate, 4, 4, 1.441f);
        at atVar7 = new at(R.layout.play_card_quick_suggestion_small, 2, 3, 1.0f);
        at atVar8 = new at(R.layout.play_card_quick_suggestion_small, 2, 4, 1.441f);
        as[] asVarArr = f3435a;
        as asVar = new as(12, 3);
        asVar.c = 6;
        asVarArr[0] = asVar.a(atVar, 0, 0).a(atVar3, 6, 0).a(atVar3, 8, 0).a(atVar3, 10, 0);
        as[] asVarArr2 = f3435a;
        as asVar2 = new as(14, 3);
        asVar2.c = 8;
        asVarArr2[1] = asVar2.a(atVar, 0, 0).a(atVar3, 6, 0).a(atVar3, 8, 0).a(atVar3, 10, 0).a(atVar3, 12, 0);
        as[] asVarArr3 = f3435a;
        as asVar3 = new as(10, 3);
        asVar3.c = 6;
        asVarArr3[2] = asVar3.a(atVar5, 0, 0).a(atVar7, 4, 0).a(atVar7, 6, 0).a(atVar7, 8, 0);
        as[] asVarArr4 = f3435a;
        as asVar4 = new as(12, 3);
        asVar4.c = 8;
        asVarArr4[3] = asVar4.a(atVar5, 0, 0).a(atVar7, 4, 0).a(atVar7, 6, 0).a(atVar7, 8, 0).a(atVar7, 10, 0);
        as[] asVarArr5 = f3435a;
        as asVar5 = new as(12, 3);
        asVar5.c = 8;
        asVarArr5[4] = asVar5.a(atVar5, 0, 0).a(atVar7, 4, 0).a(atVar7, 6, 0).a(atVar7, 8, 0).a(atVar7, 10, 0);
        as[] asVarArr6 = f3435a;
        as asVar6 = new as(14, 3);
        asVar6.c = 10;
        asVarArr6[5] = asVar6.a(atVar5, 0, 0).a(atVar7, 4, 0).a(atVar7, 6, 0).a(atVar7, 8, 0).a(atVar7, 10, 0).a(atVar7, 12, 0);
        as[] asVarArr7 = f3436b;
        as asVar7 = new as(12, 4);
        asVar7.c = 6;
        asVarArr7[0] = asVar7.a(atVar2, 0, 0).a(atVar4, 6, 0).a(atVar4, 8, 0).a(atVar4, 10, 0);
        as[] asVarArr8 = f3436b;
        as asVar8 = new as(14, 4);
        asVar8.c = 8;
        asVarArr8[1] = asVar8.a(atVar2, 0, 0).a(atVar4, 6, 0).a(atVar4, 8, 0).a(atVar4, 10, 0).a(atVar4, 12, 0);
        as[] asVarArr9 = f3436b;
        as asVar9 = new as(10, 4);
        asVar9.c = 6;
        asVarArr9[2] = asVar9.a(atVar6, 0, 0).a(atVar8, 4, 0).a(atVar8, 6, 0).a(atVar8, 8, 0);
        as[] asVarArr10 = f3436b;
        as asVar10 = new as(12, 4);
        asVar10.c = 8;
        asVarArr10[3] = asVar10.a(atVar6, 0, 0).a(atVar8, 4, 0).a(atVar8, 6, 0).a(atVar8, 8, 0).a(atVar8, 10, 0);
        as[] asVarArr11 = f3436b;
        as asVar11 = new as(12, 4);
        asVar11.c = 8;
        asVarArr11[4] = asVar11.a(atVar6, 0, 0).a(atVar8, 4, 0).a(atVar8, 6, 0).a(atVar8, 8, 0).a(atVar8, 10, 0);
        as[] asVarArr12 = f3436b;
        as asVar12 = new as(14, 4);
        asVar12.c = 10;
        asVarArr12[5] = asVar12.a(atVar6, 0, 0).a(atVar8, 4, 0).a(atVar8, 6, 0).a(atVar8, 8, 0).a(atVar8, 10, 0).a(atVar8, 12, 0);
    }

    public static as a(int i, int i2, boolean z) {
        return ((as.b(i) > 1.0f ? 1 : (as.b(i) == 1.0f ? 0 : -1)) == 0 ? f3435a : f3436b)[av.a(i2, z)];
    }
}
