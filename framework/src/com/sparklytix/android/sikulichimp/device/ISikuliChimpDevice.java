/**
 * 
 */
package com.sparklytix.android.sikulichimp.device;

import java.io.IOException;

import com.android.chimpchat.core.IChimpDevice;
import com.android.chimpchat.core.TouchPressType;

/**
 * @author rohit
 *
 */
public interface ISikuliChimpDevice extends IChimpDevice {

	public void touch(String imageName,TouchPressType pressType) throws IOException;
	
	public void drag(String from, String to, int steps, long distance) throws IOException;
	
	public void waitFor(String imageName) throws IOException;
	
	public void waitFor(String imageName, int timeout) throws IOException;
	
	public void unlockDevice();
	
	public void lockDevice();
	
	public void startActivity(String component);
}
