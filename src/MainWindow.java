import javax.swing.*;
public class MainWindow extends JFrame{

    public MainWindow(){
        setTitle("Змеёнышь");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(330, 355);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
