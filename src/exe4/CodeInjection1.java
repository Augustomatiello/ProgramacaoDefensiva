package exe4;

import javax.script.*;
import java.io.*;

import javax.script.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeInjection1 {
	
	public static void run(String filename){
		String padrao = "[a-zA-Z0-9\\-\\_]*";
		
		Pattern p = Pattern.compile(padrao);
		Matcher m = p.matcher(filename);
		if(!m.find()){
			throw new IllegalArgumentException();
		}			
		
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("JavaScript");
			engine.eval(new java.io.FileReader("resources/" + filename + ".js"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ScriptException{
		String filePath = "filename";
		CodeInjection1.run(filePath);
		
	}
}
