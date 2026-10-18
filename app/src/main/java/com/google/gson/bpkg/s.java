package com.google.gson.bpkg;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class s extends Number {

    /* renamed from: a, reason: collision with root package name */
    public final String f7837a;

    public s(String str) {
        this.f7837a = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            return Integer.parseInt(this.f7837a);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.f7837a);
            } catch (NumberFormatException e2) {
                return new BigInteger(this.f7837a).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.f7837a);
        } catch (NumberFormatException e) {
            return new BigInteger(this.f7837a).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f7837a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f7837a);
    }

    public final String toString() {
        return this.f7837a;
    }
}
