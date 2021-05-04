package com.ezio.plugin.language;

import com.ezio.plugin.icons.PlantUMLIcons;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * @author: Ezio
 * created on 2021/5/4
 */
public class PlantUMLColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", PlantUMLSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", PlantUMLSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", PlantUMLSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad Value", PlantUMLSyntaxHighlighter.BAD_CHARACTER)
    };


    @Override
    public @Nullable Icon getIcon() {
        return PlantUMLIcons.FILE;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new PlantUMLSyntaxHighlighter();
    }

    @Override
    public @NotNull String getDemoText() {
        return "DEMO TEXT";
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Title) String getDisplayName() {
        return "PlantUML";
    }
}