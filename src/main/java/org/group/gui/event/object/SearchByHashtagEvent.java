package org.group.gui.event.object;

import java.util.EventObject;

public class SearchByHashtagEvent extends EventObject {
	private String keyword;

	public SearchByHashtagEvent(Object source) {
		super(source);
	}

	public SearchByHashtagEvent(Object source, String keyword) {
		super(source);
		this.keyword = keyword;
	}

	public String getKeyword() {
		return keyword;
	}

}
