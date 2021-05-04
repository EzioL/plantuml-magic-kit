package com.ezio.plugin.language.psi;

import com.ezio.plugin.language.PlantUMLLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * @author: Ezio
 * created on 2021/5/4
 */
public class PlantUMLElementType extends IElementType {

    public PlantUMLElementType(@NotNull String debugName) {
        super(debugName, PlantUMLLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PlantUMLElementType." + super.toString();
    }
}