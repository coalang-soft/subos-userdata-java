package test;

import java.io.File;

import cpa.subos.io.file.FileIOBase;
import io.github.coalangsoft.lib.data.Func;
import cpa.subos.io.file.FileExtensionFilter;
import cpa.subos.user.User;
import cpa.subos.user.Users;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User u = Users.current();
		u.getDirectory().listFilesDeep()
				.filter(new FileExtensionFilter("jpg"))
				.forEach(new Func<FileIOBase, Void>(){
					public Void call(FileIOBase fileIOBase) {
						System.out.println(fileIOBase.getPath());
						return null;
					}
				});
	}

}
