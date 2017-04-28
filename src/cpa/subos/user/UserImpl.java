package cpa.subos.user;

import java.io.File;

import cpa.subos.io.file.Directory;
import cpa.subos.io.file.DirectoryImpl;

public class UserImpl implements User {

	public String getName() {
		return System.getProperty("user.name");
	}

	public Directory getDirectory() {
		return new DirectoryImpl(new File(System.getProperty("user.home")));
	}

}
