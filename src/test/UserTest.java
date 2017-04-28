package test;

import java.io.File;

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
		u.getDirectory()
			.listFilesDeep()
			.filter(new FileExtensionFilter(new String[]{"jpg","png","gif"}))
			.forEach(new Func<File,Void>() {
				public Void call(File p) {
					System.out.println(p);
					return null;
				}
			});
	}

}
