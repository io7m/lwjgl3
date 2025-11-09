/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */

package org.lwjgl.renderdoc;

/**
 * An exception raised when an attempt is made to load the RenderDoc library, but the
 * RenderDoc debugger is not debugging the application.
 */

public final class RenderDocNotPresentException extends RuntimeException {
    static final long serialVersionUID = 0x72656E6472646F63L;

    public RenderDocNotPresentException(String message) {
        super(message);
    }
    public RenderDocNotPresentException(UnsatisfiedLinkError error) {
        super("The RenderDoc library could not be loaded.", error);
    }
}
