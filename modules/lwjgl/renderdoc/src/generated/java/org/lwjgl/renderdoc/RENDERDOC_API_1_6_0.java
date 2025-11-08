/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

public class RENDERDOC_API_1_6_0 extends Struct<RENDERDOC_API_1_6_0> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    static {
        LibRenderdoc.initialize();

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(1);
            SIZEOF = offsets(memAddress(offsets));
            ALIGNOF = offsets.get(0);
        }
    }

    private static native int offsets(long buffer);

    protected RENDERDOC_API_1_6_0(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RENDERDOC_API_1_6_0 create(long address, @Nullable ByteBuffer container) {
        return new RENDERDOC_API_1_6_0(address, container);
    }

    /**
     * Creates a {@code RENDERDOC_API_1_6_0} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RENDERDOC_API_1_6_0(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@code RENDERDOC_API_1_6_0} instance for the specified memory address. */
    public static RENDERDOC_API_1_6_0 create(long address) {
        return new RENDERDOC_API_1_6_0(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RENDERDOC_API_1_6_0 createSafe(long address) {
        return address == NULL ? null : new RENDERDOC_API_1_6_0(address, null);
    }

    /**
     * Create a {@link RENDERDOC_API_1_6_0.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RENDERDOC_API_1_6_0.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RENDERDOC_API_1_6_0.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    // -----------------------------------

    /** An array of {@link RENDERDOC_API_1_6_0} structs. */
    public static class Buffer extends StructBuffer<RENDERDOC_API_1_6_0, Buffer> {

        private static final RENDERDOC_API_1_6_0 ELEMENT_FACTORY = RENDERDOC_API_1_6_0.create(-1L);

        /**
         * Creates a new {@code RENDERDOC_API_1_6_0.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RENDERDOC_API_1_6_0#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected RENDERDOC_API_1_6_0 getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}