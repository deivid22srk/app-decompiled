package com.google.android.wallet.common.a;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.Pair;
import java.util.List;

/* loaded from: classes.dex */
public final class p {
    public static int a(String str, CharSequence charSequence) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String valueOf = String.valueOf(str.toLowerCase());
        String concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        String valueOf2 = String.valueOf(charSequence);
        return concat.indexOf(new StringBuilder(String.valueOf(valueOf2).length() + 1).append(" ").append(valueOf2).toString().toLowerCase());
    }

    public static SpannableString a(List<Pair<Integer, Integer>> list, CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair<Integer, Integer> pair = list.get(i);
            if (((Integer) pair.second).intValue() != 0) {
                spannableString.setSpan(new StyleSpan(1), ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue() + ((Integer) pair.first).intValue(), 0);
            }
        }
        return spannableString;
    }
}
