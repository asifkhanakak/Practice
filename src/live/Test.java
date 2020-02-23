package live;

import music.Playable;
import music.String.Veena;
import music.wind.Saxophone;

public class Test {
	
	public static void main(String[] args) {
		
		Veena obj1=new Veena();
		obj1.play();
		
		Saxophone obj2=new Saxophone();
		obj2.play();
		
		 Playable  x= new Playable() {
			
			@Override
			public void play() {
					
			}
		};
		Playable y= new Playable() {
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
