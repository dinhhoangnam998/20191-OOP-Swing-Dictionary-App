package org.group.gui.vocabform;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

public class CrudForm extends AbstractForm {

	/**
	 * Create the panel.
	 */
	public CrudForm() {
		GridBagLayout gridBagLayout = (GridBagLayout) getLayout();
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 94, 94, 52};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
		
		JLabel lblFile = new JLabel("FIle");
		GridBagConstraints gbc_lblFile = new GridBagConstraints();
		gbc_lblFile.anchor = GridBagConstraints.WEST;
		gbc_lblFile.insets = new Insets(0, 0, 0, 5);
		gbc_lblFile.gridx = 0;
		gbc_lblFile.gridy = 6;
		add(lblFile, gbc_lblFile);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{194, 63, 0};
		gbl_panel.rowHeights = new int[]{25, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton button = new JButton("Image");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 0;
		panel.add(button, gbc_button);
		
		JButton button_1 = new JButton("Voice");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 0;
		panel.add(button_1, gbc_button_1);

	}

}
