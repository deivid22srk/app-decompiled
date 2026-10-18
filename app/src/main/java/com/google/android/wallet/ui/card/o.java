package com.google.android.wallet.ui.card;

import android.text.TextWatcher;

/* loaded from: classes.dex */
final class o implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CardNumberEditText f7433a;

    o(CardNumberEditText cardNumberEditText) {
        this.f7433a = cardNumberEditText;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        r3.f7433a.setTextColor(r3.f7433a.getResources().getColor(com.google.android.wallet.e.e.wallet_uic_credit_card_invalid_text_color));
        com.google.android.wallet.ui.common.bj.a(r3.f7433a.getContext(), r3.f7433a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r3.f7433a.ag_() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r4) {
        /*
            r3 = this;
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r0 = com.google.android.wallet.ui.card.CardNumberEditText.c(r0)
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            com.google.android.wallet.ui.card.CardNumberEditText.e(r1)
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r1 = com.google.android.wallet.ui.card.CardNumberEditText.c(r1)
            boolean r0 = com.google.android.wallet.common.util.i.a(r0, r1)
            if (r0 != 0) goto L6a
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r0 = com.google.android.wallet.ui.card.CardNumberEditText.c(r0)
            if (r0 == 0) goto Lad
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r0 = com.google.android.wallet.ui.card.CardNumberEditText.c(r0)
            com.google.b.a.a.a.b.a.bpkg.m r0 = r0.c
            if (r0 == 0) goto Lad
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r1 = com.google.android.wallet.ui.card.CardNumberEditText.c(r1)
            com.google.b.a.a.a.b.a.bpkg.m r1 = r1.c
            r0.setTemplateFormattingScheme(r1)
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r0 = com.google.android.wallet.ui.card.CardNumberEditText.c(r0)
            int r0 = r0.d
            if (r0 < 0) goto L57
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r1 = com.google.android.wallet.ui.card.CardNumberEditText.c(r1)
            int r1 = r1.d
            com.google.android.wallet.ui.card.CardNumberEditText r2 = r3.f7433a
            java.util.ArrayList r2 = com.google.android.wallet.ui.card.CardNumberEditText.f(r2)
            int r2 = r2.size()
            r0.a(r1, r2)
        L57:
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.android.wallet.ui.card.p r0 = r0.f7415b
            if (r0 == 0) goto L6a
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.android.wallet.ui.card.p r0 = r0.f7415b
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r1 = com.google.android.wallet.ui.card.CardNumberEditText.c(r1)
            r0.a(r1)
        L6a:
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            boolean r0 = r0.f7414a
            if (r0 == 0) goto Lb7
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            boolean r0 = com.google.android.wallet.ui.card.CardNumberEditText.b(r0)
            if (r0 != 0) goto L80
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.b.a.a.a.b.a.apkg.bpkg.apkg.i r0 = com.google.android.wallet.ui.card.CardNumberEditText.c(r0)
            if (r0 == 0) goto L90
        L80:
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            boolean r0 = r0.ah_()
            if (r0 == 0) goto Lb7
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            boolean r0 = r0.ag_()
            if (r0 != 0) goto Lb7
        L90:
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.wallet.e.e.wallet_uic_credit_card_invalid_text_color
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            android.content.Context r0 = r0.getContext()
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            com.google.android.wallet.ui.common.bj.a(r0, r1)
        Lac:
            return
        Lad:
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.b.a.a.a.b.a.bpkg.m r1 = com.google.android.wallet.ui.card.CardNumberEditText.b()
            r0.setTemplateFormattingScheme(r1)
            goto L57
        Lb7:
            com.google.android.wallet.ui.card.CardNumberEditText r0 = r3.f7433a
            com.google.android.wallet.ui.card.CardNumberEditText r1 = r3.f7433a
            android.content.res.ColorStateList r1 = com.google.android.wallet.ui.card.CardNumberEditText.g(r1)
            r0.setTextColor(r1)
            goto Lac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.card.o.afterTextChanged(android.text.Editable):void");
    }
}
