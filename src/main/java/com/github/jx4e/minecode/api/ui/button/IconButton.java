package com.github.jx4e.minecode.api.ui.button;

import com.github.jx4e.minecode.api.ui.theme.Theme;
import com.github.jx4e.minecode.impl.manager.RenderManager;
import com.github.jx4e.minecode.impl.manager.ResourceManager;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.math.MatrixStack;

import java.awt.*;

public class IconButton extends AbstractButton {
    private final String iconName;

    public IconButton(int x, int y, int width, int height, Theme theme, String iconName) {
        super(x, y, width, height, theme);
        this.iconName = iconName;
    }

    @Override
    public void draw(MatrixStack matrices, int mouseX, int mouseY) {
        NativeImageBackedTexture texture = ResourceManager.instance().getNativeImageTexture(iconName);
        RenderManager.instance().getRenderer().image(matrices, texture.getGlId(),
                getX(),
                getY(),
                getHeight(), getHeight()
        );
        texture.close();
    }

    @Override
    public void onLeftClick() {
        super.onLeftClick();
    }

    @Override
    public void onRightClick() {
        super.onRightClick();
    }
}
