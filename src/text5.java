import java.awt.*;

import javax.swing.*;

import static java.awt.GraphicsDevice.WindowTranslucency.*;

public class text5 extends JFrame {
    public text5() {
        super("8519汪冲");

        setLayout(new GridBagLayout());

        setSize(300,200);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Add a sample button.
        add(new JButton("*********"));
        add(new JButton("汪冲是个伞兵"));
        add(new JButton("汪冲爱吃鸡巴"));
        add(new JButton("*********"));

    }

    public static void main(String[] args) {
// Determine if the GraphicsDevice supports translucency.

        GraphicsEnvironment ge =

                GraphicsEnvironment.getLocalGraphicsEnvironment();

        GraphicsDevice gd = ge.getDefaultScreenDevice();

//If translucent windows aren't supported, exit.

        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            System.err.println(

                    "Translucency is not supported");

            System.exit(0);

        }

        JFrame.setDefaultLookAndFeelDecorated(true);

// Create the GUI on the event-dispatching thread

        SwingUtilities.invokeLater(new Runnable() {
            @Override

            public void run() {
                text5 tw = new text5();

// Set the window to 55% opaque (45% translucent).

                tw.setOpacity(0.55f);

// Display the window.

                tw.setVisible(true);

            }

        });

    }

}