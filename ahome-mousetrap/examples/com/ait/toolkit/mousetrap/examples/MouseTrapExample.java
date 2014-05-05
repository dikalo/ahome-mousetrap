package com.ait.toolkit.mousetrap.examples;

import com.ait.toolkit.mousetrap.client.MouseTrap;
import com.ait.toolkit.mousetrap.client.MouseTrapEvent;
import com.ait.toolkit.mousetrap.client.MouseTrapHandler;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class MouseTrapExample implements EntryPoint {

	@Override
	public void onModuleLoad() {
		MouseTrap.bind("command+shift+k", new MouseTrapHandler() {
			@Override
			public void onEvent(MouseTrapEvent event, String combo) {
				Window.alert("You pressed command+shift+k !");
			}
		});

	}

}
