/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.mousetrap.client;

import com.ait.toolkit.mousetrap.client.resources.MouseTrapResources;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.ScriptInjector;

public class MouseTrap {

	private MouseTrap() {

	}

	static {
		load();
	}

	static void load() {
		if (!isLoaded()) {
			MouseTrapResources resources = GWT.create(MouseTrapResources.class);
			ScriptInjector.fromString(resources.jsMin().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			ScriptInjector.fromString(resources.jsPause().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			ScriptInjector.fromString(resources.jsGlobal().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
	}

	/**
	 * This will bind a specified keyboard command to a callback method.
	 * 
	 * @param key
	 *            , the keyboard command
	 * @param callback
	 *            , the callback
	 */
	public static native void bind(String key, MouseTrapHandler callback)/*-{
		$wnd.Mousetrap
				.bind(
						key,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}));
	}-*/;

	public static native void bindGlobal(String key, MouseTrapHandler callback)/*-{
		$wnd.Mousetrap
				.bindGlobal(
						values,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}));
	}-*/;

	/**
	 * This will bind a specified keyboard command to a callback method. There is a third argument you can use to specify the type of event to listen for. It can be keypress,
	 * keydown or keyup.
	 * <p>
	 * It is recommended that you leave this argument out if you are unsure. Mousetrap will look at the keys you are binding and determine whether it should default to keypress or
	 * keydown.
	 */
	public static native void bind(String key, MouseTrapHandler callback, String nativeEvent)/*-{
		$wnd.Mousetrap
				.bind(
						key,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}), nativeEvent);
	}-*/;

	public static native void bindGlobal(String key, MouseTrapHandler callback, String nativeEvent)/*-{
		$wnd.Mousetrap
				.bindGlobal(
						key,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}), nativeEvent);
	}-*/;

	/**
	 * This will bind a specified keyboard command to a callback method. There is a third argument you can use to specify the type of event to listen for. It can be keypress,
	 * keydown or keyup.
	 * <p>
	 * It is recommended that you leave this argument out if you are unsure. Mousetrap will look at the keys you are binding and determine whether it should default to keypress or
	 * keydown.
	 */
	public static native void bind(JsArrayString keys, MouseTrapHandler callback, String nativeEvent)/*-{
		var values = new $wnd.Array();
		for (v in keys) {
			values.push(v);
		}
		$wnd.Mousetrap
				.bind(
						values,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}), nativeEvent);
	}-*/;

	public static native void bindGlobal(JsArrayString keys, MouseTrapHandler callback, String nativeEvent)/*-{
		var values = new $wnd.Array();
		for (v in keys) {
			values.push(keys[v]);
		}
		$wnd.Mousetrap
				.bindGlobal(
						values,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}), nativeEvent);
	}-*/;

	/**
	 * If you want to bind multiple key commands to the same callback you can pass in an array for the first argument
	 */
	public static native void bind(JsArrayString keys, MouseTrapHandler callback)/*-{
		var values = new $wnd.Array();
		for (v in keys) {
			values.push(keys[v]);
		}
		$wnd.Mousetrap
				.bind(
						values,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}));
	}-*/;

	public static native void bindGlobal(JsArrayString keys, MouseTrapHandler callback)/*-{
		var values = new $wnd.Array();
		for (v in keys) {
			values.push(keys[v]);
		}
		$wnd.Mousetrap
				.bindGlobal(
						values,
						$entry(function(e, c) {
							var event = @com.ait.toolkit.mousetrap.client.MouseTrapEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							callback.@com.ait.toolkit.mousetrap.client.MouseTrapHandler::onEvent(Lcom/ait/toolkit/mousetrap/client/MouseTrapEvent;Ljava/lang/String;)(event,c);
						}));
	}-*/;

	/**
	 * If you want to bind multiple key commands to the same callback you can pass in an array for the first argument
	 */
	public static void bind(MouseTrapHandler callback, String... commands) {
		JsArrayString values = JsArrayString.createArray().cast();
		for (String c : commands) {
			values.push(c);
		}
		bind(values, callback);
	}

	public static void bindGlobal(MouseTrapHandler callback, String... commands) {
		JsArrayString values = JsArrayString.createArray().cast();
		for (String c : commands) {
			values.push(c);
		}
		bindGlobal(values, callback);
	}

	/**
	 * This method will unbind a single keyboard event or an array of keyboard events. You should pass in the key combination exactly as it was passed in originally to
	 * <code>bind</code>.
	 */
	public static native void unbind(String key)/*-{
		$wnd.Mousetrap.unbind(key);
	}-*/;

	/**
	 * This method will unbind a single keyboard event or an array of keyboard events. You should pass in the key combination exactly as it was passed in originally to
	 * <code>bind</code>.Any keyboard event that has been bound can be triggered by passing in the string you used when you bound it originally.
	 * <p>
	 * Note that this is not actually triggering a key event in the browser. It is simply firing the event you bound to that key within mousetrap
	 */
	public static native void trigger(String key)/*-{
		$wnd.Mousetrap.trigger(key);
	}-*/;

	/**
	 * This method will unbind a single keyboard event or an array of keyboard events. You should pass in the key combination exactly as it was passed in originally to
	 * <code>bind</code>.Any keyboard event that has been bound can be triggered by passing in the string you used when you bound it originally.
	 * <p>
	 * Note that this is not actually triggering a key event in the browser. It is simply firing the event you bound to that key within mousetrap
	 */
	public static native void trigger(String key, String event)/*-{
		$wnd.Mousetrap.trigger(key, event);
	}-*/;

	/**
	 * The reset method will remove anything you have bound to mousetrap. This can be useful if you want to change contexts in your application without refreshing the page in your
	 * browser. You can ajax in a new page, call reset, and then bind the key events needed for that page.
	 * <p>
	 * Internally mousetrap keeps an associative array of all the events to listen for so reset does not actually remove or add event listeners on the document. It just sets the
	 * array to be empty.
	 */
	public static native void reset()/*-{
		$wnd.Mousetrap.reset();
	}-*/;

	/**
	 * stop Mousetrap events from firing
	 */
	public static native void pause()/*-{
		$wnd.Mousetrap.pause();
	}-*/;

	/**
	 * allow Mousetrap events to fire again
	 */
	public static native void unpause()/*-{
		$wnd.Mousetrap.unpause();
	}-*/;

	static native boolean isLoaded()/*-{
		if (typeof $wnd.Mousetrap === "undefined" || $wnd.Mousetrap === null) {
			return false;
		}
		return true;
	}-*/;

}