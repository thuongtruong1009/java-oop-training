package wareHouseManagment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchFrame extends JFrame{
    private String productSearch;
	private ArrayList<Item> items;
	public SearchFrame() {
		inputDialog();
	}
	public void inputDialog() {
		JPanel panel= new JPanel();
		panel.setLayout(null);
		JLabel pInput= new JLabel("Product Name");
		pInput.setBounds(10, 10, 130, 20);
		add(pInput);
		JTextField ppInput= new JTextField();
		ppInput.setBounds(100, 10, 150, 30);
		add(ppInput);
		
		JLabel aInput= new JLabel("Amount");
		aInput.setBounds(40, 60, 60, 20);
		panel.add(aInput);
		
		JLabel dInput= new JLabel("Description");
		dInput.setBounds(20, 110, 90, 20);
		panel.add(dInput);		
	
		JButton iSearch= new JButton("Search");
		iSearch.setBounds(300, 10, 100, 30);
		iSearch.setBackground(Color.LIGHT_GRAY);
		panel.add(iSearch);
		
		add(panel);
		setTitle("SEARCH INFORMATION");
		setSize(450, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		iSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    FileInputStream fis = new FileInputStream("D:/THUONG TRUONG INC/CODE PROGRAMMING/Java Code/Lab6-OOP-ITITIU19228/src/wareHouseManagment/lab6Text.txt");
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    items = (ArrayList<Item>) ois.readObject();

                    fis.close();
                    ois.close();

                } catch (IOException | ClassNotFoundException ex) {
                    System.out.println(ex.toString());
                    ex.printStackTrace();
                }

                String productSearch = ppInput.getText();

                // add amount label information to the search window
                JLabel aaInput = new JLabel("");
                aaInput.setBounds(100, 60, 150, 30);
                panel.add(aaInput);
                aaInput.setText(String.valueOf(checkAmountInfor(productSearch)));

                // add description information to the search window
                JLabel ddInput = new JLabel("");
                ddInput.setBounds(100, 110, 150, 30);
                panel.add(ddInput);
                ddInput.setText(checkDescriptInfor(productSearch));

            }
        });
    }
		private int checkAmountInfor(String productSearch) {
	        for (Item item : items) {
	            if (item.getProductName().equals(productSearch)) {
	                return item.getAmount();
	            }
	        }
	        return 0;
	    }

	    private String checkDescriptInfor(String productSearch) {
	        for (Item item : items) {
	            if (item.getProductName().equals(productSearch)) {
	                return item.getDescription();
	            }
	        }
	        return "";
	    }
}

