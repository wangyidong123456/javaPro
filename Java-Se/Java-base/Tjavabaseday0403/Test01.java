package Tjavabaseday0403;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Screen lenovoScreen=new Screen("����","black");
        Keyboard hp=new Keyboard("hp","black");
        Mouse lenoveMouse=new Mouse("����","black");
        
        Computer computer=new Computer();
        computer.setScreen(lenovoScreen);
        computer.setKeyboard(hp);
        computer.setMouse(lenoveMouse);
        
        computer.showProperties();
        Computer computer2=new Computer(lenovoScreen,hp,lenoveMouse);
        computer2.showProperties();
        
	}
	

}
