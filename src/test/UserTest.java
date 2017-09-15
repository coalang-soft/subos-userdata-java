package test;

import java.io.File;
import java.util.Properties;

import cpa.subos.io.file.FileIOBase;
import cpa.subos.user.SearchBasedDRDA;
import cpa.subos.user.embed.fx.FXMusicHelper;
import io.github.coalangsoft.lib.data.Func;
import cpa.subos.io.file.FileExtensionFilter;
import cpa.subos.user.User;
import cpa.subos.user.Users;
import cpa.subos.user.dataaccess.core.ReadDataAccessorBase;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.stage.Stage;

public class UserTest extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		ReadDataAccessorBase<FileIOBase> music = Users.current().getMusic();

		BorderPane layout = new BorderPane();
		ListView<Media> musicList = new ListView<Media>();
		musicList.getItems().addAll(FXMusicHelper.convert(music));

		layout.setCenter(musicList);

		stage.setScene(new Scene(layout));
		stage.show();
	}
}
