/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.renderdoc;

import org.lwjgl.system.*;

/** Initializes the renderdoc shared library. */
final class LibRenderdoc {

    static {
        String libName = Platform.mapLibraryNameBundled("lwjgl_renderdoc");
        Library.loadSystem(System::load, System::loadLibrary, LibRenderdoc.class, "org.lwjgl.renderdoc", libName);
    }

    private LibRenderdoc() {
    }

    static void initialize() {
        // intentionally empty to trigger static initializer
    }

}
