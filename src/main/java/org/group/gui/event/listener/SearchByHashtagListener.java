package org.group.gui.event.listener;

import java.util.EventListener;

import org.group.gui.event.object.SearchByHashtagEvent;

public interface SearchByHashtagListener extends EventListener {
	void searchByHashtagOccur(SearchByHashtagEvent sbhe);
}
