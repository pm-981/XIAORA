import javax.swing.*;
import java.awt.*;

/**
 * @author 1111
 */
public class text3 extends JFrame {
    private static final long serialVersionUID = 1L;
    JPanel jp1, jp2;
    JButton jb1, jb2, jb3, jb4, jb5, jb6,jb7;

    public static void main(String[] args) {
        new text3();
    }

    public text3() {

        jp1 = new JPanel();
        jp2 = new JPanel();

        jb1 = new JButton("盛");
        jb2 = new JButton("饶");
        jb3 = new JButton("钱");
        jb4 = new JButton("唐");
        jb5 = new JButton("汪1");
        jb6 = new JButton("汪2");
        jb7 = new JButton("东莞六君子");

        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb6);

        // 把Panel加入JFrame
        this.add(jp1, BorderLayout.NORTH);
        this.add(jb7, BorderLayout.CENTER);
        this.add(jp2, BorderLayout.SOUTH);


        this.setSize(300, 250);

        this.setLocation(200, 200);

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
