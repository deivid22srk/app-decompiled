package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
enum dd {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;

    private static final Map<String, dd> G = new HashMap();

    public static dd a(String str) {
        dd ddVar = G.get(str);
        if (ddVar == null) {
            if (str.equals("switch")) {
                G.put(str, SWITCH);
                return SWITCH;
            }
            try {
                dd valueOf = valueOf(str);
                if (valueOf != SWITCH) {
                    G.put(str, valueOf);
                    return valueOf;
                }
            } catch (IllegalArgumentException e) {
            }
            G.put(str, UNSUPPORTED);
            return UNSUPPORTED;
        }
        return ddVar;
    }
}
