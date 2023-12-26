import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.awt.event.*;

public class sample3 extends JFrame implements ActionListener {
        JMenu mainmenu, logout;
        JButton item1, item2, item3, b1, b2, b3, b4, b5, b6;
        JFrame frame;
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
        JTextArea ta1, ta2, th, tf, tb, tt, ta3;
        JTextField t1, t2, t3, t4, t5, t6, t7, tf1, tf2;
        JDialog dd, df;
        JPanel panel;
        public String[] str = new String[50];
        public String b, ff = "SAN_SERIF";
        public int i = 0, amount = 0, amo, totalitem;

        sample3() {

                abc();

                frame = new JFrame();
                JMenuBar mb = new JMenuBar();
                mainmenu = new JMenu("Make a order");
                logout = new JMenu("Logout");
                item2 = new JButton("Make new order");
                item3 = new JButton("Exit");
                item3.addActionListener(new exit());
                mainmenu.add(item2);
                logout.add(item3);
                mb.add(mainmenu);
                mb.add(logout);
                frame.setJMenuBar(mb);
                JPanel p1, p2, p3;
                p1 = new JPanel();
                p2 = new JPanel();
                p3 = new JPanel();
                Font ff = new Font("Arial", Font.BOLD, 20);
                JPanel panel = new JPanel();
                panel.setBounds(910, 88, 720, 680);
                panel.setBackground(Color.gray);
                panel.setLayout(null);
                JTabbedPane jtp = new JTabbedPane();
                jtp.setBounds(50, 20, 800, 800);
                jtp.setFont(ff);
                jtp.addTab("Beverages", p1);
                jtp.addTab("Soups", p2);
                jtp.addTab("Pizzas", p3);
                JButton b1 = new JButton(new ImageIcon("coffee.jpg"));
                JButton b2 = new JButton(new ImageIcon("smoothie.jpg"));
                JButton b3 = new JButton(new ImageIcon("milkshake.jpg"));
                JButton b4 = new JButton(new ImageIcon("juices.jpg"));
                JButton b5 = new JButton(new ImageIcon("lemonda.jpg"));
                JButton b6 = new JButton(new ImageIcon("oreoshake.jpg"));
                JButton b7 = new JButton(new ImageIcon("brown soup.jpg"));
                JButton b8 = new JButton(new ImageIcon("cookes ramen soup.jpg"));
                JButton b9 = new JButton(new ImageIcon("noodele soup.jpg"));
                JButton b10 = new JButton(new ImageIcon("shrimp soup.jpg"));
                JButton b11 = new JButton(new ImageIcon("creamy soup.jpg"));
                JButton b12 = new JButton(new ImageIcon("pumpkin soup.jpg"));
                JButton b13 = new JButton(new ImageIcon("cooked pizza.jpg"));
                JButton b14 = new JButton(new ImageIcon("one cheese pizza.jpg"));
                JButton b15 = new JButton(new ImageIcon("pepporoni pizza.jpg"));
                JButton b16 = new JButton(new ImageIcon("pizza with olivetoppings.jpg"));
                JButton b17 = new JButton(new ImageIcon("panner.jpg"));
                JButton b18 = new JButton(new ImageIcon("tomato pizza.jpg"));
                b1.addActionListener(new coffe());
                b2.addActionListener(new smoothie());
                b3.addActionListener(new milkshake());
                b4.addActionListener(new juices());
                b5.addActionListener(new lemonda());
                b6.addActionListener(new oreoshake());
                b7.addActionListener(new browns());
                b8.addActionListener(new cookesrs());
                b9.addActionListener(new noodles());
                b10.addActionListener(new shrimps());
                b11.addActionListener(new creamys());
                b12.addActionListener(new pumpkins());
                b13.addActionListener(new cookedpizza());
                b14.addActionListener(new cheesep());
                b15.addActionListener(new pepporonip());
                b16.addActionListener(new olivetoppingsp());
                b17.addActionListener(new seafoodp());
                b18.addActionListener(new tomatop());

                p1.setLayout(new GridLayout(3, 3, 3, 3));
                p1.add(b1);
                p1.add(b2);
                p1.add(b3);
                p1.add(b4);
                p1.add(b5);
                p1.add(b6);

                p2.setLayout(new GridLayout(3, 3, 3, 3));
                p2.add(b7);
                p2.add(b8);
                p2.add(b9);
                p2.add(b10);
                p2.add(b11);
                p2.add(b12);

                p3.setLayout(new GridLayout(3, 3, 3, 3));
                p3.add(b13);
                p3.add(b14);
                p3.add(b15);
                p3.add(b16);
                p3.add(b17);
                p3.add(b18);

                th = new JTextArea();
                th.setText("\n" + "                                                 Hot_s N Cold" + "\n"
                                + " Contac No-2355583" + "\n" + " Adress- Pune, Maharashtra, India" + "\n"
                                + "=========================================================");
                tt = new JTextArea("=========================================================" + "\n"
                                + " Thank you for coming...!" + "\n");
                l1 = new JLabel("Hot_s N Cold");
                l1.setBounds(200, 20, 500, 60);
                l1.setFont(new Font("Bold", 20, 50));
                panel.add(l1);
                l2 = new JLabel("Coustmer Name : ");
                l2.setBounds(10, 120, 120, 20);
                panel.add(l2);
                t1 = new JTextField(10);
                t1.setBounds(130, 117, 150, 30);
                panel.add(t1);
                l3 = new JLabel("Address : ");
                l3.setBounds(10, 170, 100, 20);
                panel.add(l3);
                ta1 = new JTextArea(10, 20);
                ta1.setBounds(130, 167, 150, 80);
                panel.add(ta1);
                l4 = new JLabel("Total Food Items : ");
                l4.setBounds(10, 270, 100, 20);
                panel.add(l4);
                t2 = new JTextField(10);
                t2.setEditable(false);
                t2.setBounds(130, 267, 150, 30);
                panel.add(t2);
                l5 = new JLabel("Date : ");
                l5.setBounds(10, 320, 100, 20);
                panel.add(l5);
                t3 = new JTextField(10);
                t3.setBounds(130, 317, 150, 30);
                panel.add(t3);
                l6 = new JLabel("Amount : ");
                l6.setBounds(10, 370, 100, 20);
                panel.add(l6);
                t4 = new JTextField(10);
                t4.setEditable(false);
                String c = Integer.toString(amount);
                t4.setText(c);
                t4.setBounds(130, 367, 150, 30);
                panel.add(t4);
                l7 = new JLabel("CGST : ");
                l7.setBounds(10, 420, 100, 20);
                panel.add(l7);
                t5 = new JTextField("18%");
                t5.setBounds(130, 417, 150, 30);
                t5.setEditable(false);
                panel.add(t5);
                l8 = new JLabel("Total Amount : ");
                l8.setBounds(10, 470, 100, 20);
                panel.add(l8);
                t6 = new JTextField(10);
                t6.setBounds(130, 467, 150, 30);
                t6.setEditable(false);
                panel.add(t6);
                ta2 = new JTextArea(th.getText());
                ta2.setBounds(300, 118, 400, 76);
                panel.add(ta2);
                b1 = new JButton("Calculate Bill");
                b1.setBounds(43, 530, 210, 30);
                panel.add(b1);
                b3 = new JButton("Print");
                b3.setBounds(43, 585, 103, 30);
                panel.add(b3);
                ta3 = new JTextArea();
                ta3.setBackground(Color.white);
                ta3.setBounds(300, 237, 400, 347);
                panel.add(ta3);
                tf = new JTextArea();
                tf.setBackground(Color.white);
                tf.setBounds(300, 194, 400, 43);
                panel.add(tf);
                tf.setText(" Customer Name -\n" + " Date -\n"
                                + "=========================================================");
                b2 = new JButton("Clear");
                panel.add(b2);
                b2.setBounds(146, 585, 103, 30);
                tt.setBounds(300, 579, 400, 34);
                panel.add(tt);

                b1.addActionListener(new bill());
                b2.addActionListener(new clear());
                b3.addActionListener(new print());

                frame.add(jtp);
                frame.add(panel);

                mainmenu.setFont(ff);
                logout.setFont(ff);
                frame.setSize(900, 900);
                frame.setLayout(null);
                frame.setVisible(false);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

        public class print implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        try {
                                // print the file

                                ta3.print();
                        } catch (Exception evt) {
                        }
                }

        }

        public void abc() {

                dd = new JDialog(frame, ";login");
                dd.setSize(400, 200);
                dd.setVisible(true);
                dd.setLocationRelativeTo(this);
                JPanel pd = new JPanel();
                dd.add(pd);
                pd.setBounds(0, 0, 400, 250);
                pd.setBackground(Color.WHITE);
                pd.setLayout(null);
                JLabel lj = new JLabel("Hots N Cold");
                JLabel lj1 = new JLabel("Username - ");
                JLabel lj2 = new JLabel("Password - ");
                pd.add(lj);
                lj.setBounds(140, 0, 150, 40);
                lj.setFont(new Font(ff, Font.PLAIN, 20));
                pd.add(lj1);
                pd.add(lj2);
                lj1.setBounds(80, 48, 100, 20);
                lj2.setBounds(80, 90, 100, 20);
                tf1 = new JTextField();
                tf2 = new JPasswordField();
                pd.add(tf1);
                pd.add(tf2);
                tf1.setBounds(150, 50, 150, 20);
                tf2.setBounds(150, 90, 150, 20);
                JButton bf = new JButton("Login");
                pd.add(bf);
                bf.setBounds(150, 130, 100, 20);
                bf.addActionListener(new xc());

        }

        class xc implements ActionListener {

                public void actionPerformed(ActionEvent ae) {

                        String user = tf1.getText();
                        String pass = tf2.getText();
                        if (user.equals("nikhil") && pass.equals("7756")) {
                                frame.setVisible(true);
                                dd.dispose();

                        }

                        else {

                                df = new JDialog(frame, "Login Page");
                                df.setSize(230, 100);
                                df.setVisible(true);
                                df.setLocationRelativeTo(dd);
                                JPanel pf = new JPanel();
                                df.add(pf);
                                pf.setBounds(0, 0, 230, 100);
                                pf.setBackground(Color.WHITE);
                                pf.setLayout(null);
                                JLabel lj = new JLabel("Wrong username or password.");
                                pf.add(lj);
                                lj.setBounds(20, 20, 230, 20);

                        }

                }
        }

        public class clear implements ActionListener {

                public void actionPerformed(ActionEvent e) {

                        ta3.setText("");
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t6.setText("");
                        ta1.setText("");
                        tf.setText(" Customer Name -\n" + " Date -\n"
                                        + "=========================================================");
                        i = 0;
                        amount = 0;

                }

        }

        public class exit implements ActionListener {

                public void actionPerformed(ActionEvent e) {

                        frame.setVisible(false);
                        abc();

                }
        }

        public class coffe implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Coffe";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 30;

                }
        }

        public class smoothie implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Smoothie";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 50;
                }

        }

        public class milkshake implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Milkshake";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 60;
                }

        }

        public class juices implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Juice";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 50;
                }

        }

        public class lemonda implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Lemonade";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 30;
                }

        }

        public class oreoshake implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Oreoshake";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 80;
                }

        }

        public class browns implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Brown Soup";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 130;
                }

        }

        public class cookesrs implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Ramen Soup";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 150;
                }

        }

        public class noodles implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Noodle Soup";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 160;

                }

        }

        public class shrimps implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Shrimp Soup";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 150;

                }

        }

        public class creamys implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Creamy Soup";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 130;

                }

        }

        public class pumpkins implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Pumpkin Soup";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 180;

                }

        }

        public class cookedpizza implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Cooked Pizza";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 130;
                }

        }

        public class cheesep implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Cheese Pizza";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 150;
                }

        }

        public class pepporonip implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Pepporonip";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 160;
                }

        }

        public class olivetoppingsp implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Olive Toppings Pizza";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 150;

                }

        }

        public class seafoodp implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Seafood Pizza";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 130;

                }

        }

        public class tomatop implements ActionListener

        {

                public void actionPerformed(ActionEvent e) {

                        str[i] = "Tomato Pizza";
                        ta3.setText(" " + str[i] + "\t\t\t 1" + "\n" + ta3.getText());
                        i++;
                        amount = amount + 180;
                }

        }

        public class bill implements ActionListener {

                public void actionPerformed(ActionEvent ae) {

                        double am = amount + (amount * 0.18);
                        amo = (int) am;
                        String b = Double.toString(amo);
                        t6.setText(b);
                        String c = Integer.toString(amount);
                        t4.setText(c);
                        String items = Integer.toString(i);
                        t2.setText(items);

                        ta3.setText(ta3.getText() + "\n\n" + " Total Items -\t\t\t" + i + "\n" + " Total Amount -\t\t\t"
                                        + b + "Rs");
                        tf.setText(" Customer Name - " + t1.getText() + "\n Date -" + t3.getText()
                                        + "\n=========================================================");

                                        String s=ae.getActionCommand();
                         if(s.equals("Calculate Bill")){
                             String s1=t1.getText();
                             String s2=ta1.getText();
                             String s3=t2.getText();
                             String s4=t3.getText();
                             String s5=t6.getText();
                              //String q="insert into resturant values(?,?,?,?,?)";
                             try 
                                {
                                   Class.forName("com.mysql.cj.jdbc.Driver");
                                   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant","root","");
                                   PreparedStatement stmt=con.prepareStatement("insert into bill values(?,?,?,?,?)");
                                   stmt.setString(1,s1);
                                   stmt.setString(2,s2);
                                   stmt.setString(3,s3);
                                   stmt.setString(4,s4);
                                   stmt.setString(5,s5);
                                   int i=stmt.executeUpdate();
                                   //lb.setText(i+"records inserted");
                                    con.close();
                                 }
                                  catch (Exception e) {
                                     //TODO: handle exception
                                            System.out.println(e);
                                                }
                                                 }


                }

        }

        public static void main(String args[]) {
                new sample3();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
}