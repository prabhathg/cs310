import javax.swing.JFrame;

public class MainWindow extends JFrame {

  public MainWindow() {
	init();
  }	

  public void init() {

	this.setTitle("CS310-Cjkbhr");


	this.setTitle("CS310 pramuka weerasinghe");
  this.setTitle("CS310-Chr");
  this.setTitle("CS310-yooo");
	this.setSize(600, 400);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
       MainWindow mw = new MainWindow();
      Thread.sleep(1000); 
	    mw.setVisible(true); 
  }
}
