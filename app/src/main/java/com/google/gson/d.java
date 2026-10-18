package com.google.gson;

import java.lang.reflect.Field;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public abstract class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7848a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f7849b;
    public static final d c;
    public static final d d;
    public static final d e;
    private static final /* synthetic */ d[] f;

    private d(String str, int i) {
    }

    /* synthetic */ d(String str, int i, byte b2) {
        this(str, i);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f.clone();
    }

    static {
        final String str = "IDENTITY";
        f7848a = new d(str) { // from class: com.google.gson.e
            {
                byte b2 = 0;
            }

            @Override // com.google.gson.j
            public final String a(Field field) {
                return field.getName();
            }
        };
        final String str2 = "UPPER_CAMEL_CASE";
        f7849b = new d(str2) { // from class: com.google.gson.f
            {
                int i = 1;
                byte b2 = 0;
            }

            @Override // com.google.gson.j
            public final String a(Field field) {
                return d.a(field.getName());
            }
        };
        final String str3 = "UPPER_CAMEL_CASE_WITH_SPACES";
        c = new d(str3) { // from class: com.google.gson.g
            {
                int i = 2;
                byte b2 = 0;
            }

            @Override // com.google.gson.j
            public final String a(Field field) {
                return d.a(d.a(field.getName(), " "));
            }
        };
        final String str4 = "LOWER_CASE_WITH_UNDERSCORES";
        d = new d(str4) { // from class: com.google.gson.h
            {
                int i = 3;
                byte b2 = 0;
            }

            @Override // com.google.gson.j
            public final String a(Field field) {
                return d.a(field.getName(), "_").toLowerCase();
            }
        };
        final String str5 = "LOWER_CASE_WITH_DASHES";
        e = new d(str5) { // from class: com.google.gson.i
            {
                int i = 4;
                byte b2 = 0;
            }

            @Override // com.google.gson.j
            public final String a(Field field) {
                return d.a(field.getName(), "-").toLowerCase();
            }
        };
        f = new d[]{f7848a, f7849b, c, d, e};
    }

    static /* synthetic */ String a(String str) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        while (i < str.length() - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (i == str.length()) {
            return sb.toString();
        }
        if (!Character.isUpperCase(charAt)) {
            char upperCase = Character.toUpperCase(charAt);
            int i2 = i + 1;
            return sb.append(i2 < str.length() ? upperCase + str.substring(i2) : String.valueOf(upperCase)).toString();
        }
        return str;
    }

    static /* synthetic */ String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
