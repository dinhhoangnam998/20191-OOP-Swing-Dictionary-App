package org.group.gui.event.listener;

import java.util.EventListener;

import org.group.gui.event.object.SearchByWordEvent;

public interface SearchByWordListener extends EventListener {
	void searchByWordOccur(SearchByWordEvent sbwe);
}
