package LDTcode;

public class ChampPool {
	public String Name;
	public int AD;
	public int AP;
	public int HP;
	public int MP;

	public ChampPool(String Name, int AD, int AP, int HP, int MP) {
		this.Name = Name;
		this.AD = AD;
		this.AP = AP;
		this.HP = HP;
		this.MP = MP;
	}

	public int getAD() {
		return AD;
	}

	public int getAP() {
		return AP;
	}

	public int getMP() {
		return MP;
	}

	public int getHP() {
		return HP;
	}

	public String getName() {
		return Name;
	}

	public void setAD(int ad) {
		this.AD = ad;
	}

	public void setAP(int ap) {
		this.AP = ap;
	}

	public void setMP(int mp) {
		this.MP = mp;
	}

	public void setHP(int hp) {
		this.HP = hp;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public void print() {
		System.out.println("챔피언 이름 : " + getName());
		System.out.println("AD : " + getAD());
		System.out.println("AP : " + getAP());
		System.out.println("HP : " + getHP());
		System.out.println("MP : " + getMP());
	}
	

}
