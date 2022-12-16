package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInputHandler implements KeyListener{
	
	panelGame gp;
	public boolean UpFlag, DownFlag, LeftFlag, RightFlag, enterPressed;
	
	public KeyInputHandler(panelGame gp) {
		this.gp = gp;
		
	}
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int kode = e.getKeyCode();
		//title state

		if(gp.gameState == gp.titleState) {
			
			if(kode == KeyEvent.VK_W) {
				gp.ui.command--;
				gp.playSE(3);
				if(gp.ui.command < 0) {
					gp.ui.command = 2;
				}
			}
			if(kode == KeyEvent.VK_S) {
				gp.ui.command++;
				gp.playSE(3);
				if(gp.ui.command > 2) {
					gp.ui.command = 0;
				}		
		}
			if(kode == KeyEvent.VK_ENTER) {
				gp.playSE(3);
				if(gp.ui.command == 0) {
					gp.gameState = gp.playState;
					gp.playMusic(4);
				}
				if(gp.ui.command == 1) {
			
				}
				if(gp.ui.command == 2) {
					System.exit(0);
				}
			}
	}
		

		//playstate
		if(gp.gameState == gp.playState) {
			
			if(kode == KeyEvent.VK_W) {
				UpFlag = true;
			}if(kode == KeyEvent.VK_A) {
				LeftFlag = true;
			}if(kode == KeyEvent.VK_S) {
				DownFlag = true;
			}if(kode == KeyEvent.VK_D) {
				RightFlag = true;
			}if(kode == KeyEvent.VK_P) {
				gp.playSE(7);
				gp.gameState = gp.pauseState;
			}if(kode == KeyEvent.VK_ENTER) {
				enterPressed = true;
			}if(kode == KeyEvent.VK_ESCAPE) {
				gp.playSE(7);
				gp.gameState = gp.optionState;
			}if(kode == KeyEvent.VK_I) {
				gp.playSE(7);
				gp.gameState = gp.characterState;
			}
		}
		
		//pause state 
		else if(gp.gameState == gp.pauseState) {
			if(kode == KeyEvent.VK_P) {
				gp.playSE(7);
				gp.gameState = gp.playState;
			}
		}
		
		// dialogue state
		else if(gp.gameState == gp.dialogueState) {
			if(kode == KeyEvent.VK_ENTER) {
				gp.gameState = gp.playState;
			}
		}
		//options state
		else if(gp.gameState == gp.optionState) {
			if(kode == KeyEvent.VK_ESCAPE) {
				gp.playSE(7);
				gp.gameState = gp.playState;
			}
			if(kode == KeyEvent.VK_ENTER) {
				enterPressed = true;
			}
			int maxCommand = 0;
			switch(gp.ui.subState) {
			case 0 : maxCommand = 3;
			}
			if(kode == KeyEvent.VK_W) {
				gp.ui.command--;
				gp.playSE(3);
				if(gp.ui.command < 0) {
					gp.ui.command = maxCommand;
				}
			}
			if(kode == KeyEvent.VK_S) {
				gp.ui.command++;
				gp.playSE(3);
				if(gp.ui.command > maxCommand) {
					gp.ui.command = 0;
				}
			}
		//character state
		}else if (gp.gameState == gp.characterState) {
			if(kode == KeyEvent.VK_I || kode == KeyEvent.VK_ESCAPE) {
				gp.playSE(7);
				gp.gameState = gp.playState;
			}
			if(kode == KeyEvent.VK_W) {
				if(gp.ui.slotRow != 0) {
					gp.ui.slotRow--;
					gp.playSE(6);
				}

			}
			if(kode == KeyEvent.VK_A) {
				if(gp.ui.slotCol != 0) {
					gp.ui.slotCol--;
					gp.playSE(6);
				}

			}
			if(kode == KeyEvent.VK_S) {
				if(gp.ui.slotRow != 3) {
					gp.ui.slotRow++;
					gp.playSE(6);
				}

			}
			if(kode == KeyEvent.VK_D) {
				if(gp.ui.slotCol != 4) {
					gp.ui.slotCol++;
					gp.playSE(6);
				}

			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int kode = e.getKeyCode();
		
		if(kode == KeyEvent.VK_W) {
			UpFlag = false;
		}if(kode == KeyEvent.VK_A) {
			LeftFlag = false;
		}if(kode == KeyEvent.VK_S) {
			DownFlag = false;
		}if(kode == KeyEvent.VK_D) {
			RightFlag = false;
		}
	}

}
