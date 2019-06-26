package gestemployee;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

import javax.swing.*;
//import javax.swing.table.DefaultTableCellRenderer;
//import javax.swing.table.JTableHeader;
//import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
//import java.io.File;
import java.util.Iterator;
import java.util.Vector;
//import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import static java.awt.event.WindowEvent.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
//import static javax.swing.JOptionPane.INFORMATION_MESSAGE;


public class GetEmployee extends JFrame {
    private JTextField jtCorpKey;
    //private JTable jtTable;
    private JPanel jPanel;
    private JTable table1;
    private JButton searchButton;
    private Vector headers = new Vector();
    static Vector data = new Vector();
    private String sSheetName = "Employee Detail";
    DefaultTableModel model = null;
    private String sFileName;
    ExcelFile oEF;

    private void fillData() {
        DataFormatter dataFormatter = new DataFormatter();
        headers.clear();

        //oEF.getSheet().getRow(0).forEach(cell -> {
        //    String cellValue = dataFormatter.formatCellValue(cell);
        //    headers.add(cellValue);
        //});
        Iterator<Row> rowIterator = oEF.getSheet().rowIterator();
        Row row = rowIterator.next();
        Iterator<Cell> cellIterator = row.cellIterator();
        Cell cell;

        System.out.println("Fill Data deader");
        headers.clear();

        while (cellIterator.hasNext()) {
            cell = cellIterator.next();
            String cellValue = dataFormatter.formatCellValue(cell);
            headers.add(cellValue);
            System.out.print(cellValue + " ");
        }
        System.out.println();

        System.out.println("Fill Data data");
        data.clear();
        while (rowIterator.hasNext()) {
            row = rowIterator.next();
            // Now let's iterate over the columns of the current row
            cellIterator = row.cellIterator();
            Vector d = new Vector();

            while (cellIterator.hasNext()) {
                cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue);
                if (cellValue.isEmpty() && cellValue.equals("")) cellValue = "-";
                d.add(cellValue);
            }
            System.out.println("\n");
            d.add("\n");
            data.add(d);
            System.out.print(d);

            //System.out.println();
        }
    }

    @Override
    protected void processWindowEvent(WindowEvent e) {
        System.out.println("processWindowEvent " + e.getID() + "=" + WINDOW_LOST_FOCUS);
        if (e.getID() == WINDOW_ACTIVATED || e.getID() == WINDOW_GAINED_FOCUS) {
            refresh();
        }
        super.processWindowEvent(e);
    }

    public void refresh() {
        model = null;
        oEF = null;
        oEF = new ExcelFile(this.sFileName, this.sSheetName);

        fillData();

        model = new DefaultTableModel(data, headers);
        table1.setModel(model);
    }

     GetEmployee(String pFileName) {
        super("Get Employee");
        sFileName = pFileName;
        oEF = new ExcelFile(sFileName, this.sSheetName);

        //TableHeader oTM = new Tab
        String rowsData[][] = {{"ACORP KEY", "NAME", "SQUAD", "TRIBE"},
                {"ACORP KEY", "NAME", "SQUAD", "TRIBE1"}};
        String column[] = {"CORP KEY", "NAME", "SQUAD", "TRIBE"};

        //DefaultTableModel model = new DefaultTableModel(column, 4);
        //DefaultTableModel model = new DefaultTableModel();
        //DefaultTableModel model = new DefaultTableModel(rowsData, column);
        System.out.println("GetEmployee Before filldata");
        fillData();
        model = new DefaultTableModel(data, headers);

        //JFrame frame = new JFrame();
        //add(table1);
        //JTable table2 = new JTable(rowsData, column);
        //table1 = table2;
        //JFrame frame = new JFrame();
        //table1 = table2;
        //this.jtTable = new JTable(rowsData, column);
        //this.jPanel.add(jtTable);
        table1.setModel(model);
        //table1.setPreferredScrollableViewportSize(new Dimension(450, 63));
        //table1.setFillsViewportHeight(true);

        //table1.setTableHeader(new JTableHeader());
        setContentPane(jPanel);

        table1.setBounds(30, 40, 200, 300);
        table1.setBackground(Color.CYAN);
        //table1 = table2;
        //JScrollPane scrollPane = new JScrollPane(table1);
        //table1.add(scrollPane);

        setSize(400, 400);
        setVisible(true);
        //pack();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean bFound = false;
                Iterator<Vector> vector = data.iterator();
                System.out.println("Serach corporatekey:" + jtCorpKey.getText() + "-");
                int i = 0;
                while (vector.hasNext() && bFound == false) {
                    Vector<String> d = vector.next();
                    System.out.println(d.get(0) + "= " + d);
                    if (d.get(0).equals(jtCorpKey.getText())) {
                        bFound = true;
                        table1.setRowSelectionInterval(i, i);
                        table1.setSelectionForeground(Color.RED);
                        table1.setSelectionBackground(Color.YELLOW);
                        //JOptionPane.showMessageDialog(null, "Not Found", jtCorpKey.getText(), INFORMATION_MESSAGE);
                        FormEmployee oFE = new FormEmployee(d);
                        break;
                    }
                    ++i;
                }
                if (!bFound) {
                    JOptionPane.showMessageDialog(null, "Not ound", jtCorpKey.getText(), ERROR_MESSAGE);
                }

            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        jPanel = new JPanel();
        jPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setText("Corp Key");
        jPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(86, 17), null, 0, false));
        jtCorpKey = new JTextField();
        jtCorpKey.setText("");
        jPanel.add(jtCorpKey, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTHWEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(10, 20), null, 0, false));
        searchButton = new JButton();
        searchButton.setText("Search");
        jPanel.add(searchButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_NORTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        jPanel.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        table1 = new JTable();
        table1.setAutoCreateColumnsFromModel(true);
        table1.setAutoCreateRowSorter(false);
        table1.setAutoResizeMode(2);
        table1.setAutoscrolls(false);
        table1.setRowSelectionAllowed(true);
        scrollPane1.setViewportView(table1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return jPanel;
    }

}


