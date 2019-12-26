package interfaces;

interface Radio{
	
	int frequency = 120;
	void start();
		
}


interface ModernRadio extends Radio{
	
	void addBooster();
}



class MusicPlayer implements Radio {
	@Override
	public void start() {
		System.out.println("Radio started!");
	}
}

public class interface_demo {

}
