
public class ReferenceMystery2 {
	public static void main(String[] args) {
		int hp=10;
		Pokemon squrite=new Pokemon(5);
		battle(squrite,hp);
		System.out.println("Level "+squrite.level+", "+hp+"hp");
		hp+=squrite.level;
		battle(squrite, hp+1);
		System.out.println("Level "+squrite.level+", "+hp+"hp");
	}
	public static void battle(Pokemon poke,int hp) {
		poke.level++;
		hp-=5;
		System.out.println("Level "+poke.level+", "+hp+"hp");
	}

}
