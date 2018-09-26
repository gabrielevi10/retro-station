package gdx.tetris.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import gdx.tetris.GameEngine;
import gdx.tetris.GameUserInterface;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Tetris";
		config.width = 800;
		config.height = 600;
		new LwjglApplication(new GameUserInterface(), config);
		
	}
}
