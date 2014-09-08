package com.halilayyildiz.test.j8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptExamples {

	private static final String JS_ENGINE = "nashorn";
	
	public static void main(String[] args) {

		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName(JS_ENGINE);

		try 
		{
			engine.eval("function p(s) { print(s) }");
			engine.eval("p('Hello Nashorn');");
		} 
		catch (ScriptException e) 
		{
			e.printStackTrace();
		}
	}
}
