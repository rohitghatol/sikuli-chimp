/**
 * 
 */
package com.sparklytix.android.sikulichimp.example;

import java.io.IOException;
import java.util.TreeMap;

import com.android.chimpchat.ChimpChat;
import com.android.chimpchat.core.PhysicalButton;
import com.android.chimpchat.core.TouchPressType;
import com.sparklytix.android.sikulichimp.device.ISikuliChimpDevice;
import com.sparklytix.android.sikulichimp.device.SikuliChimpDevice;
import com.sparklytix.android.sikulichimp.resolver.ScreenShotsPNGImageResolver;

/**
 * @author rohit
 *
 */
public class NotePadRunner {
	private static final String ADB = "/Tools/android-sdk-macosx/platform-tools/adb";
	private static final long TIMEOUT = 5000;
	private ChimpChat chimpChat;
	private ISikuliChimpDevice device;

	/**
	 * NotePadRunner
	 */
	public NotePadRunner() {
		super();
		TreeMap<String, String> options = new TreeMap<String, String>();
		options.put("backend", "adb");
		options.put("adbLocation", ADB);
		chimpChat = ChimpChat.getInstance(options);
	}

	/**
	 * Initializes the JavaMonkey.
	 */
	private void init() {
		device = new SikuliChimpDevice(chimpChat.waitForConnection(TIMEOUT, ".*"), new ScreenShotsPNGImageResolver());
		if (device == null) {
			throw new RuntimeException("Couldn't connect.");
		}
		device.wake();
	}

	/**
	 * Open QuickOffice using MonkeyRunner, but instead of hard coding co ordinates, using sikuli OpenCV libray
	 * to determine the co ordinates at run time by capturing image from MonkeyRunner and finding co ordinates of 
	 * certain button at run time and then using these co ordinates to click on the buttons.
	 * 
	 * @throws IOException
	 */
	public void openNotePad() throws IOException {
		if (null!=device) {
			device.press(PhysicalButton.HOME, TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.touch("notepad-launcher", TouchPressType.DOWN_AND_UP);
			//sleep(1);
			device.press(PhysicalButton.MENU, TouchPressType.DOWN_AND_UP);
			//sleep(1);
			//mDevice.touch("add-note-menu", TouchPressType.DOWN_AND_UP);
			device.press(PhysicalButton.DPAD_UP, TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.press(PhysicalButton.DPAD_CENTER, TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.type("Hello World");
			sleep(1);
		}
	}
	
	/**
	 * Terminates this JavaMonkey.
	 */
	private void shutdown() {
		chimpChat.shutdown();
		device = null;
	}
			
	private void sleep(float seconds) {
		try {
			Thread.currentThread().sleep((int)(seconds * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		final NotePadRunner runner = new NotePadRunner();
		runner.init();
		runner.openNotePad();

		runner.shutdown();

	}

}
