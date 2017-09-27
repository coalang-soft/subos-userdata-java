package cpa.subos.user;

import cpa.subos.io.file.FileIOBase;
import cpa.subos.user.dataaccess.files.DirectoryReadDataAccessor;

public interface User {

	String getName();
	FileIOBase getDirectory();
	DirectoryReadDataAccessor getMusic();
	DirectoryReadDataAccessor getVideos();
	DirectoryReadDataAccessor getPictures();
	String translateFor(String from, String phrase) throws Exception;
	
}
