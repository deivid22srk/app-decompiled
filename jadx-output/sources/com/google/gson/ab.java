package com.google.gson;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class ab extends y {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f7759b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f7760a;

    public ab(Boolean bool) {
        a(bool);
    }

    public ab(Number number) {
        a(number);
    }

    public ab(String str) {
        a(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r2 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.Object r8) {
        /*
            r7 = this;
            r1 = 1
            r0 = 0
            boolean r2 = r8 instanceof java.lang.Character
            if (r2 == 0) goto L13
            java.lang.Character r8 = (java.lang.Character) r8
            char r0 = r8.charValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.f7760a = r0
        L12:
            return
        L13:
            boolean r2 = r8 instanceof java.lang.Number
            if (r2 != 0) goto L1e
            boolean r2 = r8 instanceof java.lang.String
            if (r2 == 0) goto L25
            r2 = r1
        L1c:
            if (r2 == 0) goto L1f
        L1e:
            r0 = r1
        L1f:
            com.google.gson.b.a.a(r0)
            r7.f7760a = r8
            goto L12
        L25:
            java.lang.Class r3 = r8.getClass()
            java.lang.Class<?>[] r4 = com.google.gson.ab.f7759b
            int r5 = r4.length
            r2 = r0
        L2d:
            if (r2 >= r5) goto L3c
            r6 = r4[r2]
            boolean r6 = r6.isAssignableFrom(r3)
            if (r6 == 0) goto L39
            r2 = r1
            goto L1c
        L39:
            int r2 = r2 + 1
            goto L2d
        L3c:
            r2 = r0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.ab.a(java.lang.Object):void");
    }

    @Override // com.google.gson.y
    public final Number a() {
        return this.f7760a instanceof String ? new com.google.gson.b.s((String) this.f7760a) : (Number) this.f7760a;
    }

    public final int hashCode() {
        if (this.f7760a == null) {
            return 31;
        }
        if (a(this)) {
            long longValue = a().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        }
        if (this.f7760a instanceof Number) {
            long doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return this.f7760a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ab abVar = (ab) obj;
        if (this.f7760a == null) {
            return abVar.f7760a == null;
        }
        if (a(this) && a(abVar)) {
            return a().longValue() == abVar.a().longValue();
        }
        if ((this.f7760a instanceof Number) && (abVar.f7760a instanceof Number)) {
            double doubleValue = a().doubleValue();
            double doubleValue2 = abVar.a().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        }
        return this.f7760a.equals(abVar.f7760a);
    }

    private static boolean a(ab abVar) {
        if (!(abVar.f7760a instanceof Number)) {
            return false;
        }
        Number number = (Number) abVar.f7760a;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.y
    public final boolean f() {
        return this.f7760a instanceof Boolean ? ((Boolean) this.f7760a).booleanValue() : Boolean.parseBoolean(b());
    }

    @Override // com.google.gson.y
    public final String b() {
        if (this.f7760a instanceof Number) {
            return a().toString();
        }
        if (this.f7760a instanceof Boolean) {
            return ((Boolean) this.f7760a).toString();
        }
        return (String) this.f7760a;
    }

    @Override // com.google.gson.y
    public final double c() {
        return this.f7760a instanceof Number ? a().doubleValue() : Double.parseDouble(b());
    }

    @Override // com.google.gson.y
    public final long d() {
        return this.f7760a instanceof Number ? a().longValue() : Long.parseLong(b());
    }

    @Override // com.google.gson.y
    public final int e() {
        return this.f7760a instanceof Number ? a().intValue() : Integer.parseInt(b());
    }
}
