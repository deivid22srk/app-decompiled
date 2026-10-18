package com.google.android.volley.ok.a;

import a.f;
import android.util.Base64;
import android.util.Log;
import com.a.a.ab;
import com.a.a.ad;
import com.a.a.af;
import com.a.a.t;
import com.a.a.v;
import com.a.a.w;
import com.a.a.x;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements v {
    @Override // com.a.a.v
    public final af a(w wVar) {
        ad adVar;
        ab a2 = wVar.a();
        String str = com.android.volley.w.f1257a;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        sb.append("-X ");
        sb.append(a2.f1007b);
        sb.append(" ");
        for (String str2 : a2.c.a()) {
            sb.append("--header \"");
            sb.append(str2);
            sb.append(": ");
            List<String> c = a2.c.c(str2);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                sb.append(c.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("\" ");
        }
        URI b2 = a2.b();
        sb.append("\"");
        sb.append(b2);
        sb.append("\"");
        if (a2.d != null && (adVar = a2.d) != null) {
            if (adVar.b() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                f fVar = new f();
                adVar.a(fVar);
                fVar.a(byteArrayOutputStream, fVar.f10b);
                fVar.a(byteArrayOutputStream, 0L, fVar.f10b);
                if (a(a2.c, adVar.a())) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    sb.append(" --data-binary @/tmp/$$.bin");
                } else {
                    sb.append(" --data-ascii \"").append(byteArrayOutputStream.toString()).append("\"");
                }
            } else {
                sb.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        Log.v(str, sb.toString());
        return wVar.a(a2);
    }

    private static boolean a(t tVar, x xVar) {
        List<String> c = tVar.c("Content-Encoding");
        if (c != null) {
            Iterator<String> it = c.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase("gzip")) {
                    return true;
                }
            }
        }
        String str = xVar.f1051a;
        String str2 = xVar.f1052b;
        if (str != null) {
            if (str.equals("text")) {
                return false;
            }
            if (str.equals("application") && str2 != null) {
                return (str2.equals("xml") || str2.equals("json")) ? false : true;
            }
        }
        return true;
    }
}
