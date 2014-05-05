package com.ait.toolkit.mousetrap.client;

import com.ait.toolkit.core.client.BaseEvent;
import com.google.gwt.core.client.JavaScriptObject;

public class MouseTrapEvent extends BaseEvent {

	protected MouseTrapEvent(JavaScriptObject peer) {
		jsObj = peer;
	}
}
