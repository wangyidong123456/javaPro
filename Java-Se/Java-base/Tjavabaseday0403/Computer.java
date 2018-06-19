package Tjavabaseday0403;

public class Computer {
	private Screen screen;
	private Keyboard keyboard;
	private Mouse mouse;

	public Computer() {

	}

	public Computer(Screen screen,Keyboard keyboard,Mouse mouse) {
       this.screen=screen;
       this.keyboard=keyboard;
       this.mouse=mouse;
	}
	public Screen getScreen(){
		return this.screen;
	}
	public Keyboard getKeyboard(){
		return this.keyboard;
	}
	public Mouse getMouse(){
		return this.mouse;
	}
	public void setScreen(Screen screen){
		this.screen=screen;
	}
	public void setKeyboard(Keyboard keyboard){
		this.keyboard=keyboard;
	}
	public void setMouse(Mouse mouse){
		this.mouse=mouse;
	}
	public void startWindows(){
		System.out.println("�����ڿ�����");
	}
	public void closeWindows(){
		System.out.println("�����ڹػ���");
	}
	public void showProperties(){
		System.out.println("---------����������Ϣ-------");
		this.screen.showProperties();
		this.keyboard.showProperties();
		this.mouse.showProperties();
	}
}
