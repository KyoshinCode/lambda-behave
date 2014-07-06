package com.insightfullogic.lambdabehave.impl.generators;

import com.insightfullogic.lambdabehave.generators.SourceGenerator;

import static java.lang.Integer.MAX_VALUE;

public final class Generators {

    public static final char ASCII_CHAR_START = ' ';
    public static final char ASCII_CHAR_END = '~';
    public static final int GAP = ASCII_CHAR_END - ASCII_CHAR_START;

    private Generators() {}

    public static long longs(SourceGenerator ng) {
        return ((long) ng.generateInt(MAX_VALUE)) << 32 + ng.generateInt(MAX_VALUE);
    }

}
