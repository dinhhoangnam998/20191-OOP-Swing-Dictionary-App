package org.group.gui;

import java.awt.CardLayout;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.group.gui.event.listener.AddVocabListener;
import org.group.gui.event.listener.SearchByHashtagListener;
import org.group.gui.event.listener.SearchByWordListener;
import org.group.gui.event.object.AddVocabEvent;
import org.group.gui.event.object.SearchByHashtagEvent;
import org.group.gui.event.object.SearchByWordEvent;
import org.group.gui.findword.FindWord;
import org.group.gui.vocabform.AddForm;
import org.group.model.Vocabulary;
import org.group.service.VocabularyS;
import org.group.utils.ConstanceUtil;
import org.group.utils.FileIO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainFrame {

	private JFrame frame;

	@Autowired
	private VocabularyS vocabS;

	protected FindWord findWord;

	protected AddForm addForm;

	public MainFrame() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 854, 701);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel main = new JPanel();

		JPanel navbar = new JPanel();

		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(main, GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(navbar, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addComponent(main, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
								.addComponent(navbar, GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))));
		layeredPane.setLayout(new CardLayout(0, 0));

		JTabbedPane layer1 = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(layer1, "name_44069459764000");

		addForm = new AddForm();
		addForm.setAddVocabHandler(new AddVocabHandler());
		layer1.addTab("Add Vocab", null, addForm, null);

		findWord = new FindWord();
		findWord.setSbwHandler(new SearchByWordHandler());
		findWord.setSbhHandler(new SearchByHashtagHandler());
		layer1.addTab("Search", null, findWord, null);
		frame.getContentPane().setLayout(groupLayout);
	}

	class AddVocabHandler implements AddVocabListener {
		@Override
		public void addVocabOccur(AddVocabEvent addVocabEvent) {
			Vocabulary v = addVocabEvent.getVocab();
			v.setModifyDate(new Date());
			if (v.getImgPath() != null) {
				FileIO.copyFile(v.getImgPath(), ConstanceUtil.imgDirPath + v.getEnglish() + ".png");
			}

			if (v.getVoicePath() != null) {
				FileIO.copyFile(v.getVoicePath(), ConstanceUtil.voiceDirPath + v.getEnglish() + ".mp3");
			}
			try {
				vocabS.vocabR.save(v);
				Icon icon = new ImageIcon("G:\\Resource\\icon\\icons8_ok_48px.png");
				JOptionPane.showMessageDialog(frame, "Add vocab success.", "Success", JOptionPane.INFORMATION_MESSAGE,
						icon);
			} catch (Exception e) {
				Icon icon = new ImageIcon("G:\\Resource\\icon\\icons8_cancel_48px.png");
				JOptionPane.showMessageDialog(frame, v.getEnglish() + " already exist!", "Add vocab fail",
						JOptionPane.ERROR_MESSAGE, icon);
			}
		}

	}

	class SearchByWordHandler implements SearchByWordListener {
		@Override
		public void searchByWordOccur(SearchByWordEvent sbwe) {
			String keyword = sbwe.getKeyword();
			List<Vocabulary> vocabs = vocabS.vocabR.findByEnglishContaining(keyword);
			findWord.displayData(vocabs);
		}

	}

	class SearchByHashtagHandler implements SearchByHashtagListener {
		@Override
		public void searchByHashtagOccur(SearchByHashtagEvent sbhe) {
			String keyword = sbhe.getKeyword();
			List<Vocabulary> vocabs = vocabS.vocabR.findByHashtagContaining(keyword);
			findWord.displayData(vocabs);
		}

	}
}
