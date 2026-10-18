package com.a.a.apkg.apkg;

import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final com.a.a.aa f891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f892b;
    public final String c;

    public ab(com.a.a.aa aaVar, int i, String str) {
        this.f891a = aaVar;
        this.f892b = i;
        this.c = str;
    }

    public static ab a(String str) {
        com.a.a.aa aaVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                aaVar = com.a.a.aa.HTTP_1_0;
            } else if (charAt == 1) {
                aaVar = com.a.a.aa.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            aaVar = com.a.a.aa.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        if (str.length() < i + 3) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i + 3));
            if (str.length() <= i + 3) {
                str2 = "";
            } else {
                if (str.charAt(i + 3) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                str2 = str.substring(i + 4);
            }
            return new ab(aaVar, parseInt, str2);
        } catch (NumberFormatException e) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f891a == com.a.a.aa.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ').append(this.f892b);
        if (this.c != null) {
            sb.append(' ').append(this.c);
        }
        return sb.toString();
    }
}
