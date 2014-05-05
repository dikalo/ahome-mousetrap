package com.ait.toolkit.mousetrap.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface MouseTrapResources extends ClientBundle {

	@Source("mt.js")
	public TextResource js();

	@Source("mt.min.js")
	public TextResource jsMin();

	@Source("mt.global.min.js")
	public TextResource jsGlobal();

	@Source("mt.pause.min.js")
	public TextResource jsPause();
}
