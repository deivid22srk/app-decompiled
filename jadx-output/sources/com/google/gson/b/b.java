package com.google.gson.b;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f7813a = new Type[0];

    private static GenericArrayType f(Type type) {
        return new c(type);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new c(a((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new d(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new c(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new e(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static Class<?> b(Type type) {
        Type type2 = type;
        while (!(type2 instanceof Class)) {
            if (type2 instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type2).getRawType();
                a.a(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type2 instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
            }
            if (type2 instanceof TypeVariable) {
                return Object.class;
            }
            if (type2 instanceof WildcardType) {
                type2 = ((WildcardType) type2).getUpperBounds()[0];
            } else {
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + (type2 == null ? "null" : type2.getClass().getName()));
            }
        }
        return (Class) type2;
    }

    public static boolean a(Type type, Type type2) {
        Type type3 = type;
        for (Object obj = type2; type3 != obj; obj = ((GenericArrayType) obj).getGenericComponentType()) {
            if (type3 instanceof Class) {
                return type3.equals(obj);
            }
            if (type3 instanceof ParameterizedType) {
                if (!(obj instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type3;
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type3 instanceof GenericArrayType) {
                if (!(obj instanceof GenericArrayType)) {
                    return false;
                }
                type3 = ((GenericArrayType) type3).getGenericComponentType();
            } else {
                if (type3 instanceof WildcardType) {
                    if (!(obj instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type3;
                    WildcardType wildcardType2 = (WildcardType) obj;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if ((type3 instanceof TypeVariable) && (obj instanceof TypeVariable)) {
                    TypeVariable typeVariable = (TypeVariable) type3;
                    TypeVariable typeVariable2 = (TypeVariable) obj;
                    return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
                }
                return false;
            }
        }
        return true;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type a(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> cls3 = cls;
        Type type2 = type;
        while (cls2 != cls3) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls3.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    if (interfaces[i] == cls2) {
                        return cls3.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(interfaces[i])) {
                        Type type3 = cls3.getGenericInterfaces()[i];
                        cls3 = interfaces[i];
                        type2 = type3;
                        break;
                    }
                }
            }
            if (!cls3.isInterface()) {
                while (cls3 != Object.class) {
                    Class<? super Object> superclass = cls3.getSuperclass();
                    if (superclass == cls2) {
                        return cls3.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        Type genericSuperclass = cls3.getGenericSuperclass();
                        cls3 = superclass;
                        type2 = genericSuperclass;
                    } else {
                        cls3 = superclass;
                    }
                }
                return cls2;
            }
            return cls2;
        }
        return type2;
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type a(Type type, Class<?> cls) {
        Type b2 = b(type, cls, Collection.class);
        if (b2 instanceof WildcardType) {
            b2 = ((WildcardType) b2).getUpperBounds()[0];
        }
        return b2 instanceof ParameterizedType ? ((ParameterizedType) b2).getActualTypeArguments()[0] : Object.class;
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b2 = b(type, cls, Map.class);
        if (b2 instanceof ParameterizedType) {
            return ((ParameterizedType) b2).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        Type a2;
        TypeVariable typeVariable;
        do {
            Type type3 = type2;
            if (!(type3 instanceof TypeVariable)) {
                if ((type3 instanceof Class) && ((Class) type3).isArray()) {
                    Class cls2 = (Class) type3;
                    Class<?> componentType = cls2.getComponentType();
                    Type a3 = a(type, cls, (Type) componentType);
                    return componentType != a3 ? f(a3) : cls2;
                }
                if (type3 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type3;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type a4 = a(type, cls, genericComponentType);
                    return genericComponentType != a4 ? f(a4) : genericArrayType;
                }
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type a5 = a(type, cls, ownerType);
                    boolean z = a5 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    boolean z2 = z;
                    Type[] typeArr = actualTypeArguments;
                    for (int i = 0; i < length; i++) {
                        Type a6 = a(type, cls, typeArr[i]);
                        if (a6 != typeArr[i]) {
                            if (!z2) {
                                typeArr = (Type[]) typeArr.clone();
                                z2 = true;
                            }
                            typeArr[i] = a6;
                        }
                    }
                    if (!z2) {
                        return parameterizedType;
                    }
                    return new d(a5, parameterizedType.getRawType(), typeArr);
                }
                if (type3 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type3;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type a7 = a(type, cls, lowerBounds[0]);
                        if (a7 == lowerBounds[0]) {
                            return wildcardType;
                        }
                        return new e(new Type[]{Object.class}, new Type[]{a7});
                    }
                    if (upperBounds.length != 1 || (a2 = a(type, cls, upperBounds[0])) == upperBounds[0]) {
                        return wildcardType;
                    }
                    return new e(new Type[]{a2}, f7813a);
                }
                return type3;
            }
            typeVariable = (TypeVariable) type3;
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type a8 = a(type, cls, (Class<?>) cls3);
                if (a8 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    for (int i2 = 0; i2 < typeParameters.length; i2++) {
                        if (typeVariable.equals(typeParameters[i2])) {
                            type2 = ((ParameterizedType) a8).getActualTypeArguments()[i2];
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type2 = typeVariable;
        } while (type2 != typeVariable);
        return type2;
    }

    static /* synthetic */ int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
