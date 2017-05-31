package cpa.subos.user;

import java.io.File;

import cpa.subos.io.IO;
import cpa.subos.io.file.Directory;

public class UserImpl implements User {

	public String getName() {
		return System.getProperty("user.name");
	}

	public Directory getDirectory() {
		return IO.file(new File(System.getProperty("user.home")));
	}

}
