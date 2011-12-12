/**
 * 
 */
package com.sparklytix.android.sikulichimp.example;

import java.io.IOException;
import java.util.TreeMap;

import com.android.chimpchat.ChimpChat;
import com.android.chimpchat.core.TouchPressType;
import com.sparklytix.android.sikulichimp.device.ISikuliChimpDevice;
import com.sparklytix.android.sikulichimp.device.SikuliChimpDevice;
import com.sparklytix.android.sikulichimp.resolver.PrefixPostFixImageResolver;

/**
 * @author rohit
 *
 */
public class Calc2runner {
	private static final String ADB = "/Tools/android-sdk-macosx/platform-tools/adb";
	private static final long TIMEOUT = 5000;
	private ChimpChat chimpChat;
	private ISikuliChimpDevice device;

	/**
	 * NotePadRunner
	 */
	public Calc2runner() {
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
		device = new SikuliChimpDevice(chimpChat.waitForConnection(TIMEOUT, ".*"), new PrefixPostFixImageResolver("screenshots/",".png"));
		if (device == null) {
			throw new RuntimeException("Couldn't connect.");
		}
		device.wake();
	}

	/**
	 * 
	 * 
	 * @throws IOException
	 */
	public void openCalc() throws IOException {
		if (null!=device) {
			device.startActivity("com.android.calculator2/com.android.calculator2.Calculator");
			sleep(1);
			device.touch("calc-button-clear", TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.touch("calc-button-8", TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.touch("calc-button-3", TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.touch("calc-button-addition", TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.touch("calc-button-2", TouchPressType.DOWN_AND_UP);
			sleep(1);
			device.touch("calc-button-evaluate", TouchPressType.DOWN_AND_UP);
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
		final Calc2runner runner = new Calc2runner();
		runner.init();
		runner.openCalc();

		runner.shutdown();

	}

}
