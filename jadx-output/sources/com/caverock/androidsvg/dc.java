package com.caverock.androidsvg;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
enum dc {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    id,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;

    private static final Map<String, dc> aO = new HashMap();

    public static dc a(String str) {
        dc dcVar = aO.get(str);
        if (dcVar == null) {
            if (str.equals("class")) {
                aO.put(str, CLASS);
                return CLASS;
            }
            if (str.indexOf(95) != -1) {
                aO.put(str, UNSUPPORTED);
                return UNSUPPORTED;
            }
            try {
                dc valueOf = valueOf(str.replace('-', '_'));
                if (valueOf != CLASS) {
                    aO.put(str, valueOf);
                    return valueOf;
                }
            } catch (IllegalArgumentException e) {
            }
            aO.put(str, UNSUPPORTED);
            return UNSUPPORTED;
        }
        return dcVar;
    }
}
