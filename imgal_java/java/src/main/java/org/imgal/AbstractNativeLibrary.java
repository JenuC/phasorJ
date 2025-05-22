package org.imgal;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Abstract class for all Java bindings.
 *
 * @author Edward Evans
 */
public abstract class AbstractNativeLibrary {
	// Use Windows DLL extension for Windows
	private static String libPath = "/native/imgal_java.dll";
	public static final SymbolLookup libLookup;
	public static final Linker linker = Linker.nativeLinker();

	// copy the Rust library from resources and then load it (for SymbolLookup)
	static {
		try {
			URL url = AbstractNativeLibrary.class.getResource(libPath);
			if (url == null) {
				throw new RuntimeException("Could not find library at path: " + libPath);
			}
			Path tmpLib = Files.createTempFile("imgal_java", ".dll");
			try (InputStream is = url.openStream()) {
				Files.copy(is, tmpLib, StandardCopyOption.REPLACE_EXISTING);
			}
			tmpLib.toFile().deleteOnExit();
			// Use Arena.global() for global scope
			libLookup = SymbolLookup.libraryLookup(tmpLib, Arena.global());
		} catch (Exception e) {
			throw new RuntimeException("Failed to load library.", e);
		}
	}
}
