package org.group.gui.event.object;

import java.util.EventObject;

public class SearchByWordEvent extends EventObject {
	private String keyword;

	public SearchByWordEvent(Object source) {
		super(source);
	}

	public SearchByWordEvent(Object source, String keyword) {
		super(source);
		this.keyword = keyword;
	}

	public String getKeyword() {
		return keyword;
	}

}
