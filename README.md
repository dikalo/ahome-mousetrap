# Ahomé-MouseTrap

## About Ahomé-Enquire

Built on-top of Mousetrap.js, Ahomé-Enquire is a GWT-based library that helps you easely handle keyboard events in your web application.

##Enterprise Support
Get high quality support through Ahomé (Note that all Ahomé Tools are FREE to use with an Apache 2 License).

* <a href="http://opensource.ahome-it.com/pricing/">Buy Enterprise Support</a>


##Community
* [Ahomé Google+ Community](https://plus.google.com/u/0/communities/106380618381566688303) - See whats happening in the community.


## Getting Started with Ahomé-MouseTrap
1)  <a href="http://opensource.ahome-it.com/">Download the jar file</a>

2)  Inherit the ahome-enquire module
```xml
<inherits name='com.ait.toolkit.mouseTrap.MouseTrap'/>
```

3)  Start coding
```java
package com.ait.toolkit.playground.client;

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

```

4) Find more code in the  <a href="https://github.com/ahome-it/ahome-mousetrap/tree/master/ahome-mousetrap/examples/com/ait/toolkit/mousetrap/examples">Examples folder</a>

5) Learn more about our Open Source tools  <a href="http://opensource.ahome-it.com/">HERE</a>



