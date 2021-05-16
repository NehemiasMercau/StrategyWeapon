
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		King kingCharacter = new King();
		Queen queenCharacter = new Queen();
	
		
		kingCharacter.setWeapon(new Knife());
		kingCharacter.fight();
		kingCharacter.setWeapon(new Axe());
		kingCharacter.fight();
		
		queenCharacter.setWeapon(new Axe());
		queenCharacter.fight();
		queenCharacter.setWeapon(new Sword());
		queenCharacter.fight();
		kingCharacter.fight();
	}

}
