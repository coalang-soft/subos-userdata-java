package cpa.subos.user;

import cpa.subos.io.file.FileIOBase;
import io.github.coalangsoft.data.web.glosbe.translate.GlosbeTranslator;

import javax.script.ScriptException;
import java.io.IOException;

public interface User {

	String getName();
	FileIOBase getDirectory();
	MusicStorage getMusic();
	String translateFor(String from, String phrase) throws Exception;
	
}
