package com.ezio.plugin.language;

import com.intellij.lang.Language;

/**
 * @author: Ezio
 * created on 2021/5/4
 */
public class PlantUMLLanguage extends Language {

    public static final PlantUMLLanguage INSTANCE = new PlantUMLLanguage();


    public PlantUMLLanguage() {
        super("PlantUML");
    }
}