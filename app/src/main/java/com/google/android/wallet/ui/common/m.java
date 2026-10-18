package com.google.android.wallet.ui.common;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes2.dex */
final class m implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ExpDateEditText f7525a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7526b;
    private StringBuilder c;
    private int d;
    private boolean e = false;
    private String f;
    private boolean g;
    private int h;
    private int i;
    private int j;

    m(ExpDateEditText expDateEditText) {
        this.f7525a = expDateEditText;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beforeTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r3 = -1
            r2 = 0
            r1 = 1
            boolean r0 = r4.e
            if (r0 == 0) goto L8
        L7:
            return
        L8:
            java.lang.String r0 = r5.toString()
            r4.f = r0
            com.google.android.wallet.ui.common.ExpDateEditText r0 = r4.f7525a
            com.google.android.wallet.ui.common.ExpDateEditText.a(r0, r2)
            r4.h = r3
            r4.i = r3
            r4.j = r3
            r4.f7526b = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r4.c = r0
            r4.d = r6
            if (r7 != r1) goto L6a
            if (r8 != 0) goto L6a
            r4.f7526b = r1
            int r0 = r6 + r7
            java.lang.CharSequence r0 = r5.subSequence(r6, r0)
            java.lang.String r0 = r0.toString()
            com.google.android.wallet.ui.common.ExpDateEditText r3 = r4.f7525a
            java.lang.String r3 = com.google.android.wallet.ui.common.ExpDateEditText.a(r3)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6a
            r0 = r1
        L41:
            if (r0 == 0) goto L62
            if (r6 <= 0) goto L5c
            java.lang.StringBuilder r0 = r4.c
            int r3 = r6 + (-1)
            r0.deleteCharAt(r3)
            int r0 = r4.d
            int r0 = r0 + (-1)
            r4.d = r0
            r4.g = r1
            int r0 = r6 + (-1)
            r4.h = r0
            r4.i = r2
            r4.j = r1
        L5c:
            com.google.android.wallet.ui.common.ExpDateEditText r0 = r4.f7525a
            com.google.android.wallet.ui.common.ExpDateEditText.a(r0, r1)
            goto L7
        L62:
            java.lang.StringBuilder r0 = r4.c
            int r1 = r6 + r7
            r0.delete(r6, r1)
            goto L7
        L6a:
            r0 = r2
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.wallet.ui.common.m.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.e) {
            this.c.insert(this.d, charSequence, i, i + i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String formattedDate;
        InputFilter[] inputFilterArr;
        InputFilter[] inputFilterArr2;
        if (!this.e) {
            int a2 = ExpDateEditText.a(this.f7525a, this.c);
            formattedDate = this.f7525a.getFormattedDate();
            this.e = true;
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!formattedDate.equals(editable.toString())) {
                ExpDateEditText expDateEditText = this.f7525a;
                inputFilterArr = ExpDateEditText.f7440a;
                expDateEditText.setFilters(inputFilterArr);
                editable.replace(0, editable.length(), formattedDate);
                ExpDateEditText expDateEditText2 = this.f7525a;
                inputFilterArr2 = this.f7525a.g;
                expDateEditText2.setFilters(inputFilterArr2);
            }
            if (this.g) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(16);
                obtain.setBeforeText(this.f);
                obtain.setFromIndex(this.h);
                obtain.setAddedCount(this.i);
                obtain.setRemovedCount(this.j);
                this.f7525a.sendAccessibilityEventUnchecked(obtain);
            }
            this.e = false;
            this.g = false;
            if (selectionStart == selectionEnd) {
                ExpDateEditText.a(this.f7525a, a2 + selectionStart, this.f7526b);
            }
        }
    }
}
