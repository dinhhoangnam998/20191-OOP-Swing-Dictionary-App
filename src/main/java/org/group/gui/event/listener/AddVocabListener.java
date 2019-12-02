package org.group.gui.event.listener;

import java.util.EventListener;

import org.group.gui.event.object.AddVocabEvent;

public interface AddVocabListener extends EventListener {
	void addVocabOccur(AddVocabEvent addVocabEvent);
}
