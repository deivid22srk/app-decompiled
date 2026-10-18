package com.google.android.d;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHeader;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f1432a = ".".codePointAt(0);

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f1433b = {"google.com", "googleapis.com"};
    private static final Pattern c = Pattern.compile("[^()<>@,;:\\\"/\\[\\]\\?={}\\s]+");
    private static final Pattern d = Pattern.compile("[^,;\\s\"]+");
    private static final Pattern e = Pattern.compile("(^|[\\s;,]+)([^()<>@,;:\\\"/\\[\\]\\?={}\\s]+)\\s*=\\s*(\"[^\"]*\"|[^,;\\s\"]+)");

    public static HttpUriRequest a(HttpUriRequest httpUriRequest, a aVar) {
        boolean z;
        HttpUriRequest httpUriRequest2;
        boolean z2;
        if (!b(httpUriRequest, aVar)) {
            return httpUriRequest;
        }
        String a2 = aVar.a();
        String b2 = aVar.b();
        Header[] headers = httpUriRequest.getHeaders("Cookie");
        int length = headers.length;
        int i = 0;
        boolean z3 = false;
        HttpUriRequest httpUriRequest3 = httpUriRequest;
        while (i < length) {
            Header header = headers[i];
            Matcher matcher = e.matcher(header.getValue());
            while (true) {
                if (!matcher.find()) {
                    z = false;
                    break;
                }
                if (matcher.group(2).equals(a2)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                if (!z3 && !(httpUriRequest3 instanceof RequestWrapper)) {
                    httpUriRequest3 = a(httpUriRequest3);
                }
                httpUriRequest3.removeHeader(header);
                httpUriRequest3.addHeader(new BasicHeader(header.getName(), a(header.getValue(), a2, b2)));
                httpUriRequest2 = httpUriRequest3;
                z2 = true;
            } else {
                boolean z4 = z3;
                httpUriRequest2 = httpUriRequest3;
                z2 = z4;
            }
            i++;
            boolean z5 = z2;
            httpUriRequest3 = httpUriRequest2;
            z3 = z5;
        }
        if (!z3) {
            httpUriRequest3.addHeader(new BasicHeader("Cookie", a2 + "=" + a(b2)));
            return httpUriRequest3;
        }
        return httpUriRequest3;
    }

    public static HttpResponse a(HttpUriRequest httpUriRequest, HttpResponse httpResponse, a aVar) {
        if (b(httpUriRequest, aVar)) {
            String a2 = aVar.a();
            for (Header header : httpResponse.getHeaders("Set-Cookie")) {
                a(header.getValue(), a2);
            }
            for (Header header2 : httpResponse.getHeaders("Set-Cookie2")) {
                a(header2.getValue(), a2);
            }
        }
        return httpResponse;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059 A[LOOP:0: B:4:0x0008->B:11:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(org.apache.http.client.methods.HttpUriRequest r11, com.google.android.d.a r12) {
        /*
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L5f
            java.lang.String[] r5 = com.google.android.d.b.f1433b
            int r6 = r5.length
            r4 = r1
        L8:
            if (r4 >= r6) goto L5d
            r7 = r5[r4]
            java.net.URI r2 = r11.getURI()
            java.lang.String r8 = r2.getHost()
            int r2 = r7.length()
            int r3 = r8.length()
            if (r2 > r3) goto L57
            boolean r2 = r7.equalsIgnoreCase(r8)
            if (r2 == 0) goto L28
            r2 = r0
        L25:
            if (r2 == 0) goto L59
        L27:
            return r0
        L28:
            int r2 = r8.length()
            int r3 = r2 + (-1)
            int r2 = r7.length()
            int r2 = r2 + (-1)
        L34:
            if (r2 < 0) goto L4d
            int r9 = r8.codePointAt(r3)
            int r9 = java.lang.Character.toLowerCase(r9)
            int r10 = r7.codePointAt(r2)
            int r10 = java.lang.Character.toLowerCase(r10)
            if (r9 != r10) goto L57
            int r3 = r3 + (-1)
            int r2 = r2 + (-1)
            goto L34
        L4d:
            int r2 = r8.codePointAt(r3)
            int r3 = com.google.android.d.b.f1432a
            if (r2 != r3) goto L57
            r2 = r0
            goto L25
        L57:
            r2 = r1
            goto L25
        L59:
            int r2 = r4 + 1
            r4 = r2
            goto L8
        L5d:
            r0 = r1
            goto L27
        L5f:
            r0 = r1
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.d.b.b(org.apache.http.client.methods.HttpUriRequest, com.google.android.d.a):boolean");
    }

    private static RequestWrapper a(HttpUriRequest httpUriRequest) {
        RequestWrapper requestWrapper;
        try {
            if (httpUriRequest instanceof HttpEntityEnclosingRequest) {
                requestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpUriRequest);
            } else {
                requestWrapper = new RequestWrapper(httpUriRequest);
            }
            requestWrapper.resetHeaders();
            return requestWrapper;
        } catch (ProtocolException e2) {
            throw new ClientProtocolException(e2);
        }
    }

    private static String a(String str, String str2, String str3) {
        Matcher matcher = e.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            if (matcher.group(2).equals(str2)) {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + str2 + "=" + a(str3));
            } else {
                matcher.appendReplacement(stringBuffer, matcher.group());
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static String a(String str, String str2) {
        Matcher matcher = e.matcher(str);
        while (matcher.find()) {
            if (matcher.group(2).equals(str2)) {
                String group = matcher.group();
                String trim = group.substring(group.indexOf("=") + 1).trim();
                if (trim.startsWith("\"")) {
                    return trim.substring(1, trim.length() - 1);
                }
                return trim;
            }
        }
        return null;
    }

    private static String a(String str) {
        if (str == null) {
            return "\"\"";
        }
        return !d.matcher(str).matches() ? "\"" + str + "\"" : str;
    }
}
