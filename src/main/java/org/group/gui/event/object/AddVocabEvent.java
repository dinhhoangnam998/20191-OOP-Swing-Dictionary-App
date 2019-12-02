package org.group.gui.event.object;

import java.util.EventObject;

import org.group.model.Vocabulary;

import lombok.Getter;

public class AddVocabEvent extends EventObject {
	private Vocabulary vocab;

	public AddVocabEvent(Object source, Vocabulary vocab) {
		super(source);
		this.vocab = vocab;
	}

	public Vocabulary getVocab() {
		return vocab;
	}

}
