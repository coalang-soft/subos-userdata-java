package cpa.subos.user;

import java.io.File;
import java.util.Locale;

import cpa.subos.io.IO;
import cpa.subos.io.file.FileFilters;
import cpa.subos.io.file.FileIOBase;
import cpa.subos.user.dataaccess.files.DirectoryReadDataAccessor;
import io.github.coalangsoft.data.web.glosbe.translate.GlosbeTranslations;
import io.github.coalangsoft.data.web.glosbe.translate.GlosbeTranslator;
import io.github.coalangsoft.jsearch.JSearchEngine;

public class UserImpl implements User {

	public String getName() {
		return System.getProperty("user.name");
	}

	public FileIOBase getDirectory() {
		return IO.file(new File(System.getProperty("user.home")));
	}

	private SearchBasedDRDA getSearchDir(String search){
		JSearchEngine<FileIOBase> engine = new JSearchEngine<>();
		getDirectory().listFiles().forEach((f) -> {
			engine.add(f.getPath(), f);
			return null;
		});
		String translated = null;
		try {
			translated = translateFor("en", search);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(translated != null){
			return new SearchBasedDRDA(engine.query(translated, search));
		}
		return new SearchBasedDRDA(engine.query(search));
	}

	@Override
	public DirectoryReadDataAccessor getMusic() {
		return getSearchDir("Music").filter(FileFilters.AUDIO);
	}

	@Override
	public String translateFor(String from, String phrase) throws Exception {
		GlosbeTranslations ts = GlosbeTranslator.translate(from, Locale.getDefault().getLanguage(), phrase);
		if(ts.getResultCount() < 0){
			return null;
		}
		return ts.get(0).getPhraseText();
	}

	@Override
	public DirectoryReadDataAccessor getVideos() {
		return getSearchDir("Videos").filter(FileFilters.VIDEO);
	}

	@Override
	public DirectoryReadDataAccessor getPictures() {
		return getSearchDir("Pictures").filter(FileFilters.PICTURE);
	}

}
