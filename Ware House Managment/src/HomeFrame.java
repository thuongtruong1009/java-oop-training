package com.thuongtruong1009;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HomeFrame extends JFrame{
	private JList list;
	private final ArrayList<Item> items = new ArrayList<>();
	private static final DefaultListModel<String> listOfProduct = new DefaultListModel<>();

	public void initGUI() {
	
		JLabel p= new JLabel("Product Name");
		JPanel panel= new JPanel();		
		
		p.setBounds(10, 10, 130, 20);
		JTextField pp= new JTextField();
		pp.setBounds(100, 10, 150, 30);
		
		JLabel a= new JLabel("Amount");
		a.setBounds(10, 50, 60, 20);
		JTextField aa= new JTextField();
		aa.setBounds(100, 50, 150, 30);
		
		JLabel d= new JLabel("Description");
		d.setBounds(10, 90, 90, 20);
		JTextArea dd= new JTextArea();
		dd.setBounds(100, 90, 150, 100);
		
		JButton add= new JButton("Add");
		add.setBounds(100, 210, 60, 30);
		add.setBackground(Color.LIGHT_GRAY);
		add.setMnemonic(KeyEvent.VK_A);
		add.setToolTipText("Click to add infor");
		
		JButton remove= new JButton("Remove");
		remove.setBounds(165, 210, 90, 30);
		remove.setBackground(Color.LIGHT_GRAY);
		remove.setMnemonic(KeyEvent.VK_R);
		
		JButton search= new JButton("Search");
		search.setBounds(260, 210, 90, 30);
		search.setBackground(Color.LIGHT_GRAY);
		search.setMnemonic(KeyEvent.VK_S);
		
		JLabel label= new JLabel("Product List");
		label.setBounds(310, 5, 200, 50);
		label.setFont(new Font("Hi Bold", Font.PLAIN, 20));
		
		DefaultListModel model = new DefaultListModel();
		JList list= new JList(model);
		list.setFont(new Font("My Boli", Font.PLAIN, 15));
		JScrollPane jscrollPane= new JScrollPane(list);
		jscrollPane.setBounds(270, 50, 200, 140);
		add(jscrollPane);
					
		//khi nhan add
		add.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent event) {     	      	
	            //get text
	        	 String ppText= pp.getText().strip();
	        	 int aaText= Integer.parseInt(aa.getText().strip());
	        	 String ddText= dd.getText().strip();
	        	 
	        	 checkDuplicate(ppText, aaText, ddText);
	        	 
	        	 //add new item
	        	 Item item= new Item(ppText, aaText, ddText);
	        	 items.add(item);
	        	 writeInfor(items);
	        	 
	        	// print elements in list
	                ListPrint();
	                list.setModel(listOfProduct);
	        	 
	        	 //clean textField
	        	 pp.setText("");
	        	 aa.setText("");
	        	 dd.setText("");
	         }
	    });	
		add(p);
		add(pp);
		add(a);
		add(aa);
		add(d);
		add(dd);	
		add(label);
		add(add);
		add(remove);
		add(search);	
		add(panel);
		
		setTitle("WAREHOUSE-MANAGNMENT");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//khi nhan remove
		remove.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent event) {	     
	        	 if (list.getSelectedIndex() != -1) {
	                    String selectedValue = (String) list.getSelectedValue();
	                    System.out.println(selectedValue);
	                    decreaseAmount(selectedValue);
	                }
		     }
		});
		
		//khi nhan search
		search.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent event) {	     
	        	 SearchFrame search= new SearchFrame();
	        	 search.inputDialog();
		     }
		});  
	}
		public void writeInfor(ArrayList arrayList) {
	        try {
	            FileOutputStream fos = new FileOutputStream("D:/THUONG TRUONG INC/CODE PROGRAMMING/Java Code/Lab6-OOP-ITITIU19228/src/wareHouseManagment/lab6Text.txt");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);

	            oos.writeObject(arrayList);

	            fos.close();
	            oos.close();

	        } catch (IOException ex) {
	            ex.printStackTrace();
	            System.out.println(ex.toString());
	            System.out.println(ex.getMessage());
	        }
		}
	    private String getProductName(String s) {
	        String[] part = s.split(" ");
	        return part[1];
	    }

	    private void decreaseAmount(String selectedValue) {
	        for (int i = 0; i < items.size(); i++) {
	            if (items.get(i).getProductName().equals(getProductName(selectedValue))) {
	                int newAmount = items.get(i).getAmount() - 1;
	                if (newAmount >= 0) {
	                    items.get(i).setAmount(newAmount);

	                    writeInfor(items);
	                } else {
	                    listOfProduct.removeElementAt(list.getSelectedIndex());
	                }
	            }
	        }

	    }

	    private void checkDuplicate(String ppText, int aaText, String ddText ) {
	        for (int i = 0; i < items.size(); i++) {
	            if (items.get(i).getProductName().equals(ppText)) {
	                int newAmount = items.get(i).getAmount() + aaText;
	                items.get(i).setAmount(newAmount);
	                items.get(i).setDescription(ddText);
	                writeInfor(items);
	                System.out.println("data has been updated");
	            }
	        }
	    }

	    private void ListPrint() {
	        listOfProduct.addElement((listOfProduct.getSize() + 1) + "." + " " +
	                items.get(listOfProduct.size()).getProductName()
	                + " "
	                + items.get(listOfProduct.size()).getAmount());
	    }	
}
