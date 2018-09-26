package gdx.tetris;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import javax.xml.soap.Text;

public class GameUserInterface extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture piece, white;
    private Texture gameboard;
    private Sprite sprite1, sprite2;
    private Boolean first = true;
    private GameEngine ge = new GameEngine();
    private int x = 0, y = 0;

	@Override
	public void create () {
		float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();
		batch = new SpriteBatch();
		gameboard = new Texture("gameboard.jpg");
		piece = new Texture("piece.png");
		white = new Texture("white.png");
		sprite1 = new Sprite(piece);
		sprite2 = new Sprite(white);
//		GameEngine ge = new GameEngine(); //used to start the tests
	}

	@Override
	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
//			 if(Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT))
//	                sprite.translateX(-1f);
//	            else
//	                sprite.translateX(-10.0f);
//	    }
//    	if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
//    		if(Gdx.input.isKeyPressed(Input.Keys.CONTROL_LEFT))
//    			sprite.translateX(1f);
//    		else
//    			sprite.translateX(10.0f);
//    	}
        batch.begin();
        if(first) {
			batch.draw(gameboard, 0, 0);
//			sprite.draw(batch);
			first = false;
		}
		else {
			for(x = 49; x >= 0; x--) {
				for (y = 0; y < 50; y++) {
					if (ge.board[x][y] != 0) {
						batch.draw(piece, x , y );
					}
					else {
                        batch.draw(white, x, y );
                    }
				}
			}
		}
        batch.end();
    }
	
	@Override
	public void dispose () {
		batch.dispose();
		piece.dispose();
	}
}
