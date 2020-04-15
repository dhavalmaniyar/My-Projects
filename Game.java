package hello;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Game extends javax.swing.JFrame {

    double x, y, xVel = randomDirection() * randomSpeed(), yVel = 3 * randomDirection();
    private boolean a = false;
    private boolean d = false;
    private boolean left = false;
    private boolean right = false;

    public Game() {
        initComponents();
        setLocationRelativeTo(null);
        background.requestFocus();
        
    }
    public int randomDirection() {
        int rand = (int) (Math.random() * 2);
        if (rand == 1) {
            return -1;
        } else {
            return 1;
        }
    }

    public int randomSpeed() {
        return (int) (Math.random() * 3 + 1);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        background = new javax.swing.JPanel();
        ball = new rojerusan.RSMaterialButtonCircle();
        divider = new javax.swing.JPanel();
        wall1 = new javax.swing.JPanel();
        slider1 = new javax.swing.JPanel();
        wall2 = new javax.swing.JPanel();
        wall3 = new javax.swing.JPanel();
        slider2 = new javax.swing.JPanel();
        wall4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game ~ by Dhaval Maniyar");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(514, 638));
        getContentPane().setLayout(null);

        background.setBackground(new java.awt.Color(0, 0, 0));
        background.setMinimumSize(new java.awt.Dimension(600, 700));
        background.setPreferredSize(new java.awt.Dimension(500, 600));
        background.setRequestFocusEnabled(false);
        background.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backgroundKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                backgroundKeyReleased(evt);
            }
        });
        new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        if (a&& slider2.getLocation().x >= 10) {
                            slider2.setLocation(slider2.getLocation().x - 5, slider2.getLocation().y);
                        } else if (d && slider2.getLocation().x <= 395) {
                            slider2.setLocation(slider2.getLocation().x + 5, slider2.getLocation().y);
                        }
                        if (left&& slider1.getLocation().x >= 10) {
                            slider1.setLocation(slider1.getLocation().x - 5, slider1.getLocation().y);
                        } else if (right&& slider1.getLocation().x <= 395) {
                            slider1.setLocation(slider1.getLocation().x + 5, slider1.getLocation().y);
                        }
                        Thread.sleep(8);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.exit(0);
                }
            }
        }).start();
        background.setLayout(null);

        ball.setBackground(new java.awt.Color(240, 240, 240));
        ball.setFocusCycleRoot(true);
        ball.setNextFocusableComponent(ball);
        background.add(ball);
        ball.setBounds(230, 279, 45, 45);

        divider.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout dividerLayout = new javax.swing.GroupLayout(divider);
        divider.setLayout(dividerLayout);
        dividerLayout.setHorizontalGroup(
            dividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        dividerLayout.setVerticalGroup(
            dividerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        background.add(divider);
        divider.setBounds(0, 300, 500, 3);

        wall1.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout wall1Layout = new javax.swing.GroupLayout(wall1);
        wall1.setLayout(wall1Layout);
        wall1Layout.setHorizontalGroup(
            wall1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        wall1Layout.setVerticalGroup(
            wall1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        background.add(wall1);
        wall1.setBounds(0, 0, 10, 300);

        slider1.setBackground(new java.awt.Color(204, 0, 51));
        slider1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout slider1Layout = new javax.swing.GroupLayout(slider1);
        slider1.setLayout(slider1Layout);
        slider1Layout.setHorizontalGroup(
            slider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        slider1Layout.setVerticalGroup(
            slider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        background.add(slider1);
        slider1.setBounds(205, 10, 90, 10);

        wall2.setBackground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout wall2Layout = new javax.swing.GroupLayout(wall2);
        wall2.setLayout(wall2Layout);
        wall2Layout.setHorizontalGroup(
            wall2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        wall2Layout.setVerticalGroup(
            wall2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        background.add(wall2);
        wall2.setBounds(490, 0, 10, 300);

        wall3.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout wall3Layout = new javax.swing.GroupLayout(wall3);
        wall3.setLayout(wall3Layout);
        wall3Layout.setHorizontalGroup(
            wall3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        wall3Layout.setVerticalGroup(
            wall3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        background.add(wall3);
        wall3.setBounds(0, 300, 10, 300);

        slider2.setBackground(new java.awt.Color(0, 0, 240));
        slider2.setToolTipText("");
        slider2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout slider2Layout = new javax.swing.GroupLayout(slider2);
        slider2.setLayout(slider2Layout);
        slider2Layout.setHorizontalGroup(
            slider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        slider2Layout.setVerticalGroup(
            slider2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        background.add(slider2);
        slider2.setBounds(205, 580, 90, 10);

        wall4.setBackground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout wall4Layout = new javax.swing.GroupLayout(wall4);
        wall4.setLayout(wall4Layout);
        wall4Layout.setHorizontalGroup(
            wall4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        wall4Layout.setVerticalGroup(
            wall4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        background.add(wall4);
        wall4.setBounds(490, 300, 10, 300);

        getContentPane().add(background);
        background.setBounds(0, 0, 500, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void backgroundKeyPressed(java.awt.event.KeyEvent evt) {                                      
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (key == KeyEvent.VK_RIGHT) {
            right = true;
        }
        if (key == KeyEvent.VK_A) {
            a = true;
        }
        if (key == KeyEvent.VK_D) {
            d = true;
        }
     
        if (key == KeyEvent.VK_SPACE) {
            t.start();
        }
    }                                     

    private void backgroundKeyReleased(java.awt.event.KeyEvent evt) {                                       
        int key = evt.getKeyCode();
               
        if (key == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (key == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (key == KeyEvent.VK_A) {
            a = false;
        }
        if (key == KeyEvent.VK_D) {
            d = false;
        }

    }                                      
    javax.swing.Timer t = new javax.swing.Timer(10, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            ball.setLocation((int) (ball.getX() + xVel), (int) (ball.getY() + yVel));
            if ((ball.getX() <= wall1.getY()) || (ball.getX() >= wall4.getX() - ball.getWidth() + 10)) {
                xVel = -xVel;
                ball.setSize(ball.getWidth() - 2, ball.getHeight() - 2);
            }
            if (ball.getY() <= 20) {
                if (ball.getX() >= slider1.getX()-25 && ball.getX() <= slider1.getX() + 90) {
                    yVel = -yVel;
                    ball.setLocation((int) (ball.getX() + xVel), (int) (ball.getY() + yVel));
                }
            }
            if (ball.getY() >= slider2.getY() - ball.getHeight()) {
                if (ball.getX() >= slider2.getX()-25 && ball.getX() <= slider2.getX() + 90) {
                    yVel = -yVel;
                }
            }
            if (ball.getY() < 5 || ball.getY() > 590 || ball.getWidth() < 15) {
                t.stop();
                if (ball.getY() < divider.getY()) {
                    Message m = new Message("Player 2(BLUE) - WON");
                    m.setVisible(true);
                    dispose();
                } else if (ball.getY() > divider.getY()) {
                    Message m = new Message("Player 1 (RED) - WON");
                    m.setVisible(true);
                    dispose();

                }
            }
        }
    });

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JPanel background;
    private rojerusan.RSMaterialButtonCircle ball;
    private javax.swing.JPanel divider;
    private javax.swing.JPanel slider1;
    private javax.swing.JPanel slider2;
    private javax.swing.JPanel wall1;
    private javax.swing.JPanel wall2;
    private javax.swing.JPanel wall3;
    private javax.swing.JPanel wall4;
    // End of variables declaration                   
}
