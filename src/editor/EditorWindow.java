package editor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class EditorWindow extends JFrame implements ActionListener {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorWindow frame = new EditorWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditorWindow() {

		jPanel3 = new JPanel();
		jLabel1 = new JLabel();
		jPanel4 = new JPanel();
		jButton1 = new JButton();
		jButton2 = new JButton();
		formPanel = new JPanel();
		pseudocodeScrollPane = new JScrollPane();
		jTextArea1 = new JTextArea();
		formLabel = new JLabel();
		pseudocodeLabel = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Topic: Exercise 1");

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel1)
						.addContainerGap(789, Short.MAX_VALUE)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				Alignment.LEADING).addGroup(
				jPanel3Layout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jLabel1)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel3.setLayout(jPanel3Layout);

		jButton1.setText("Check work >>");

		jButton2.setText("<< Description");
		getContentPane().setLayout(new BorderLayout(0, 0));

		jTextArea1.setEditable(false);
		jTextArea1.setBackground(UIManager.getDefaults().getColor(
				"ToolTip.background"));
		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1
				.setText("start\n   output to terminal \"Hello world!\"\n   report success to operating system\nfinish");
		pseudocodeScrollPane.setViewportView(jTextArea1);

		formLabel.setText("Your work:");

		pseudocodeLabel.setText("Pseudocode:");

		formPanel.setLayout(new BorderLayout(0, 0));
		formPanel.add(formLabel, BorderLayout.NORTH);

		splitPane = new JSplitPane();
		getContentPane().add(splitPane, BorderLayout.CENTER);

		JPanel pseudocodePanel = new JPanel();
		splitPane.setLeftComponent(pseudocodePanel);
		pseudocodePanel.setLayout(new BorderLayout(0, 0));
		getContentPane().add(jPanel4, BorderLayout.SOUTH);
		jPanel4.setLayout(new BorderLayout(0, 0));
		jPanel4.add(jButton2, BorderLayout.WEST);
		jPanel4.add(jButton1, BorderLayout.EAST);
		getContentPane().add(jPanel3, BorderLayout.NORTH);
		pseudocodePanel.add(pseudocodeScrollPane, BorderLayout.CENTER);
		pseudocodePanel.add(pseudocodeLabel, BorderLayout.NORTH);
		splitPane.setRightComponent(formPanel);

		formScrollPane = new JScrollPane();
		formPanel.add(formScrollPane, BorderLayout.CENTER);
		formSubPanel = new JPanel();

		formSubPanel.setBackground(java.awt.SystemColor.text);
		formSubPanel.setLayout(new BoxLayout(formSubPanel, BoxLayout.Y_AXIS));

		linePanel1 = new JPanel();
		FlowLayout fl_linePanel1 = (FlowLayout) linePanel1.getLayout();
		fl_linePanel1.setAlignment(FlowLayout.LEFT);
		formSubPanel.add(linePanel1);
		lineLabel1 = new JLabel();
		linePanel1.add(lineLabel1);

		lineLabel1.setText("<html><code>#include &lt;stdio.h&gt;</code></html>");
		linePanel2 = new JPanel();
		FlowLayout fl_linePanel2 = (FlowLayout) linePanel2.getLayout();
		fl_linePanel2.setAlignment(FlowLayout.LEFT);
		formSubPanel.add(linePanel2);
		lineLabel2 = new JLabel();
		linePanel2.add(lineLabel2);

		lineLabel2.setText("<html><code>int main(void){</code></html>");

		linePanel3 = new JPanel();
		FlowLayout fl_linePanel3 = (FlowLayout) linePanel3.getLayout();
		fl_linePanel3.setAlignment(FlowLayout.LEFT);
		formSubPanel.add(linePanel3);

		lineLabel3_1 = new JLabel();
		lineLabel3_1.setText("<html><code>    </code></html>");
		linePanel3.add(lineLabel3_1);
		lineComboBox3_2 = new JComboBox<String>();
		linePanel3.add(lineComboBox3_2);

		lineComboBox3_2.setModel(new DefaultComboBoxModel<String>(new String[] {
				"<html><code>printf</code></html>", "<html><code>scanf</code></html>" }));
		lineComboBox3_2.setSelectedIndex(-1);
		lineLabel3_3 = new JLabel();
		linePanel3.add(lineLabel3_3);

		lineLabel3_3.setText("<html><code>(\"Hello world!\");</code></html>");

		linePanel4 = new JPanel();
		FlowLayout fl_linePanel4 = (FlowLayout) linePanel4.getLayout();
		fl_linePanel4.setAlignment(FlowLayout.LEFT);
		formSubPanel.add(linePanel4);

		lineLabel4_1 = new JLabel();
		linePanel4.add(lineLabel4_1);
		lineLabel4_1.setText("<html><code>    </code></html>");
		lineLabel4_2 = new JLabel();
		linePanel4.add(lineLabel4_2);

		lineLabel4_2.setText("<html><code>return 0;</code></html>");

		linePanel5 = new JPanel();
		FlowLayout fl_linePanel5 = (FlowLayout) linePanel5.getLayout();
		fl_linePanel5.setAlignment(FlowLayout.LEFT);
		formSubPanel.add(linePanel5);
		lineLabel5 = new JLabel();
		linePanel5.add(lineLabel5);

		lineLabel5.setText("<html><code>}</code></html>");
		formScrollPane.setViewportView(formSubPanel);

		jButton1.addActionListener(this);
		pack();
	}

	private JButton jButton1;
	private JButton jButton2;
	private JComboBox<String> lineComboBox3_2;
	private JLabel jLabel1;
	private JLabel lineLabel2;
	private JLabel lineLabel3_3;
	private JLabel lineLabel4_2;
	private JLabel lineLabel5;
	private JLabel lineLabel1;
	private JLabel formLabel;
	private JLabel pseudocodeLabel;
	private JPanel formSubPanel;
	private JPanel jPanel3;
	private JPanel jPanel4;
	private JPanel formPanel;
	private JScrollPane pseudocodeScrollPane;
	private JTextArea jTextArea1;
	private JPanel linePanel1;
	private JPanel linePanel3;
	private JPanel linePanel4;
	private JPanel linePanel5;
	private JPanel linePanel2;
	private JLabel lineLabel3_1;
	private JLabel lineLabel4_1;
	private JSplitPane splitPane;
	private JScrollPane formScrollPane;

	public void actionPerformed(ActionEvent e) {
		if (lineComboBox3_2.getSelectedItem() == "<html><code>printf</code></html>")
			JOptionPane.showMessageDialog(null, "<html>"
					+ "Great job!<br><br>"
					+ "Program output:<br>"
					+ "<code>Hello World!</code>"
					+ "</html>", "Results",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "<html>"
					+ "Try again!<br><br>"
					+ "Hint: <code>printf()</code> sends text to the user,<br>"
					+ "while <code>scanf()</code> gets text from the user."
					+ "</html>", "Results",
					JOptionPane.ERROR_MESSAGE);
	}
}
