package Entity;

import main.panelGame;

public class NPC_Bakul extends Entity {

	public NPC_Bakul(panelGame gp) {
		super(gp);
		// TODO Auto-generated constructor stub
		
		direction = "down";
		speed = 0;
		
		getImage();
		setDialogue();
	}
	
	public void getImage() {
		
	up1 = setup("/npc/npc1");
	up2 = setup("/npc/npc2");
	up3 =setup("/npc/npc3");
	down1 = setup("/npc/npc1");
	down2 = setup("/npc/npc2");
	down3 = setup("/npc/npc3");
	right1 = setup("/npc/npc1");
	right2 = setup("/npc/npc2");
	right3 = setup("/npc/npc3");
	left1 = setup("/npc/npc1");
	left2 = setup("/npc/npc2");	
	left3 = setup("/npc/npc3");

	}
	
	public void setDialogue() {
		dialogues[0] = "Halo, nak.\nSepertinya kamu sudah bangun...";
		dialogues[1] = "Kamu tertidur di dekat kolam.\nAku menjagamu semalaman.";
		dialogues[2] = "Kakekmu sangat khawatir denganmu\nIa mencarimu...";
		dialogues[3] = "Cepat kembalilah ke rumah menemui\nkakek mu!";
		dialogues[4] = "Aku akan disini jika kau butuh\nbantuanku";	
	}
	
	
	public void setAction() {
		
		//actionLockCounter++;
		//
		//if(actionLockCounter == 20) {
		//	
		//	Random rand = new Random();
		//	int i = rand.nextInt(20)+1;
		//	
		//	if(i <= 10) {
		//		direction = "up";
		//	}if(i> 10 && i <= 20) {
		//		direction = "down";
		//	}
		//	actionLockCounter = 0;
		//}
		//
	}
	
	public void speak() {
		
		super.speak();
	}

}
