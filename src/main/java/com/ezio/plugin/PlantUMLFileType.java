package com.ezio.plugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts.Label;
import com.intellij.openapi.util.NlsSafe;
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
    public @Label @NotNull String getDescription() {
        return "PlantUML language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "plant";
    }

    @Override
    public @Nullable Icon getIcon() {
        return PlantUMLIcons.FILE;
    }
}