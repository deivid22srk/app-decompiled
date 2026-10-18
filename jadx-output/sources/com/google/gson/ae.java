package com.google.gson;

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
public abstract class ae {

    /* renamed from: a, reason: collision with root package name */
    public static final ae f7761a;

    /* renamed from: b, reason: collision with root package name */
    public static final ae f7762b;
    private static final /* synthetic */ ae[] c;

    private ae(String str, int i) {
    }

    /* synthetic */ ae(String str, int i, byte b2) {
        this(str, i);
    }

    public static ae valueOf(String str) {
        return (ae) Enum.valueOf(ae.class, str);
    }

    public static ae[] values() {
        return (ae[]) c.clone();
    }

    static {
        final String str = "DEFAULT";
        f7761a = new ae(str) { // from class: com.google.gson.af
            {
                byte b2 = 0;
            }
        };
        final String str2 = "STRING";
        f7762b = new ae(str2) { // from class: com.google.gson.ag
            {
                int i = 1;
                byte b2 = 0;
            }
        };
        c = new ae[]{f7761a, f7762b};
    }
}
