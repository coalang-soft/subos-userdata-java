package test;

import cpa.subos.io.file.FileFilters;
import cpa.subos.user.dataaccess.files.DirectoryReadDataAccessor;
import cpa.subos.user.Users;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.stage.Stage;

import java.net.MalformedURLException;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Users.current().getMusic().forEach(System.out::println);
	}

}
