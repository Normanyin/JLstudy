package com.geekle.fileTools;

import java.io.File;
import java.io.FileFilter;

public class FileFilterTool implements FileFilter {

	@Override
	public boolean accept(File pathname) {
        if (pathname.isFile()) {
            return true;
        }
		return false;
	}

}
