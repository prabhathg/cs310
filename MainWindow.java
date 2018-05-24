import javax.swing.JFrame;

public class MainWindow extends JFrame {

  public MainWindow() {
	init();
  }	

  public void init() {
	this.setTitle("CS310 App");
	this.setSize(400, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
     	MainWindow mw = new MainWindow();
	mw.setVisible(true); 
  }
}
