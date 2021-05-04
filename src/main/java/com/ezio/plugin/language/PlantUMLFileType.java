package com.ezio.plugin.language;

import com.ezio.plugin.icons.PlantUMLIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author: Ezio
 * created on 2021/5/4
 */
public class PlantUMLFileType extends LanguageFileType {

    public static final PlantUMLFileType INSTANCE = new PlantUMLFileType();

    protected PlantUMLFileType() {
        super(PlantUMLLanguage.INSTANCE);
    }


    @Override
    public @NotNull String getName() {
        return "PlantUML File";
    }

    @Override
    public @NotNull String getDescription() {
        return "PlantUML language file";
    }

    @Override
    public  @NotNull String getDefaultExtension() {
        return "puml";
    }

    @Override
    public @Nullable Icon getIcon() {
        return PlantUMLIcons.FILE;
    }
}