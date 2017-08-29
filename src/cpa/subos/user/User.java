package cpa.subos.user;

import cpa.subos.io.file.FileIOBase;

public interface User {

	String getName();
	FileIOBase getDirectory();
	
}
