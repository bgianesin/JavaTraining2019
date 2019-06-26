package gestemployee;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEmployee {
    FormEmployee   oFE = null;
    GetEmployee     oGE = null;

    public void display() {
        final String inputFilePath = System.getProperty("user.dir") + "/src/resources/" + "Employee.xlsx";

        JFrame frame = new JFrame("Gestion Employee");
        frame.setBounds(100, 100, 100, 100);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        //File category
        JMenu lfile = new JMenu("File");
        menubar.add(lfile);
        JMenuItem lIE = new JMenuItem("InsertEmployee");
        JMenuItem lGE  = new JMenuItem("GetEmployee");
        JMenuItem lExit  = new JMenuItem("Exit");
        lfile.add(lIE);
        lfile.add(lGE);
        lfile.add(lExit);

        //Edit category
        JMenu help = new JMenu("Help");
        menubar.add(help);
        JMenuItem about = new JMenuItem("About");
        help.add(about);

        frame.setVisible(true);

        //Exit option action listener
        class exitAction implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        lExit.addActionListener(new exitAction());

        class insertEmployee implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (oFE == null) {
                    oFE = new FormEmployee(inputFilePath);
                }
                else {
                    oFE.setVisible(true);
                }
            }
        }
        lIE.addActionListener(new insertEmployee());

        class getEmployee implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                if (oGE == null) {
                    oGE = new GetEmployee(inputFilePath);
                }
                else {
                    oGE = null;
                    oGE = new GetEmployee(inputFilePath);
                    //oGE.refresh();
                    //oGE.setVisible(true);
                }
            }
        }
        lGE.addActionListener(new getEmployee());

        class clearAction implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                //        lclear.setEnabled(false);
            }
        }
    }
    private static final String inputFilePath= System.getProperty("user.dir")+"/src/resources/" + "Employee.xlsx";

    public static void main(String[] args) {
        MenuEmployee oME = new MenuEmployee();
        oME.display();
    }
}

