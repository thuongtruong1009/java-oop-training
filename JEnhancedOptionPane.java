import java.awt.HeadlessException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JEnhancedOptionPane extends JOptionPane  {
	private static final long serialVersionUID = 1L;

	public static void showInputDialog(final Object message, final Object[] options) throws HeadlessException {
      final JOptionPane pane = new JOptionPane(message, QUESTION_MESSAGE, OK_CANCEL_OPTION, null, options, null);
      pane.setWantsInput(false); //tao o input
      pane.setComponentOrientation((getRootFrame()).getComponentOrientation());
      pane.setMessageType(QUESTION_MESSAGE);
      pane.selectInitialValue();
      final String title = UIManager.getString("OptionPane.messageDialogTitle", null);
      final JDialog dialog = pane.createDialog(null, title);
      dialog.setVisible(true);
      dialog.dispose();
      final Object value = pane.getInputValue();
      System.out.println(value);
      return (value == UNINITIALIZED_VALUE) ? null : (String) value;

	}

	public static void main(String[] args) {
    	JEnhancedOptionPane.showInputDialog("Number:", new Object[]{"Paypal", "MoMo", "Banking"});
	}
}
