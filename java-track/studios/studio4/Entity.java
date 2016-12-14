package studio4;

abstract class Entity {

	private final int uid;
	private static int counter = 1;
	
	public Entity(){
		this.uid = counter;
		counter+= 1;
	}
	
	public int getUid(){
		return this.uid;
	}
	
}
