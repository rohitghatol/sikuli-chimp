/**
 * 
 */
package com.sparklytix.android.sikulichimp.device;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.ScreenImage;

import com.android.chimpchat.ChimpManager;
import com.android.chimpchat.adb.LinearInterpolator.Point;
import com.android.chimpchat.core.IChimpDevice;
import com.android.chimpchat.core.IChimpImage;
import com.android.chimpchat.core.IChimpView;
import com.android.chimpchat.core.IMultiSelector;
import com.android.chimpchat.core.ISelector;
import com.android.chimpchat.core.PhysicalButton;
import com.android.chimpchat.core.TouchPressType;
import com.android.chimpchat.hierarchyviewer.HierarchyViewer;
import com.sparklytix.android.sikulichimp.resolver.IImageResolver;

/**
 * @author rohit
 * 
 */
public class SikuliChimpDevice implements ISikuliChimpDevice {

	private IChimpDevice device = null;
	private IImageResolver imageResolver = null;

	public SikuliChimpDevice(IChimpDevice device, IImageResolver imageResolver) {
		this.device = device;
		this.imageResolver = imageResolver;
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @param arg5
	 * @param arg6
	 * @param arg7
	 * @see com.android.chimpchat.adb.AdbChimpDevice#broadcastIntent(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String,
	 *      java.util.Collection, java.util.Map, java.lang.String, int)
	 */
	public void broadcastIntent(String arg0, String arg1, String arg2,
			String arg3, Collection<String> arg4, Map<String, Object> arg5,
			String arg6, int arg7) {
		device.broadcastIntent(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	/**
	 * 
	 * @see com.android.chimpchat.adb.AdbChimpDevice#dispose()
	 */
	public void dispose() {
		device.dispose();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @param arg5
	 * @see com.android.chimpchat.adb.AdbChimpDevice#drag(int, int, int, int,
	 *      int, long)
	 */
	public void drag(int arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
		device.drag(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	/**
	 * @param arg0
	 * @return
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object arg0) {
		return device.equals(arg0);
	}

	/**
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getHierarchyViewer()
	 */
	public HierarchyViewer getHierarchyViewer() {
		return device.getHierarchyViewer();
	}

	/**
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getManager()
	 */
	public ChimpManager getManager() {
		return device.getManager();
	}

	/**
	 * @param key
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getProperty(java.lang.String)
	 */
	public String getProperty(String key) {
		return device.getProperty(key);
	}

	/**
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getPropertyList()
	 */
	public Collection<String> getPropertyList() {
		return device.getPropertyList();
	}

	/**
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getRootView()
	 */
	public IChimpView getRootView() {
		return device.getRootView();
	}

	/**
	 * @param key
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getSystemProperty(java.lang.String)
	 */
	public String getSystemProperty(String key) {
		return device.getSystemProperty(key);
	}

	/**
	 * @param arg0
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getView(com.android.chimpchat.core.ISelector)
	 */
	public IChimpView getView(ISelector selector) {
		return device.getView(selector);
	}

	/**
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getViewIdList()
	 */
	public Collection<String> getViewIdList() {
		return device.getViewIdList();
	}

	/**
	 * @param multiSelector
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#getViews(com.android.chimpchat.core.IMultiSelector)
	 */
	public Collection<IChimpView> getViews(IMultiSelector multiSelector) {
		return device.getViews(multiSelector);
	}

	/**
	 * @return
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return device.hashCode();
	}

	/**
	 * @param packageName
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#installPackage(java.lang.String)
	 */
	public boolean installPackage(String packageName) {
		return device.installPackage(packageName);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#instrument(java.lang.String,
	 *      java.util.Map)
	 */
	public Map<String, Object> instrument(String arg0, Map<String, Object> arg1) {
		return device.instrument(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @see com.android.chimpchat.adb.AdbChimpDevice#press(com.android.chimpchat.core.PhysicalButton,
	 *      com.android.chimpchat.core.TouchPressType)
	 */
	public void press(PhysicalButton arg0, TouchPressType arg1) {
		device.press(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @see com.android.chimpchat.adb.AdbChimpDevice#press(java.lang.String,
	 *      com.android.chimpchat.core.TouchPressType)
	 */
	public void press(String arg0, TouchPressType arg1) {
		device.press(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @see com.android.chimpchat.adb.AdbChimpDevice#reboot(java.lang.String)
	 */
	public void reboot(String arg0) {
		device.reboot(arg0);
	}

	/**
	 * @param arg0
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#removePackage(java.lang.String)
	 */
	public boolean removePackage(String arg0) {
		return device.removePackage(arg0);
	}

	/**
	 * @param arg0
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#shell(java.lang.String)
	 */
	public String shell(String arg0) {
		return device.shell(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @param arg4
	 * @param arg5
	 * @param arg6
	 * @param arg7
	 * @see com.android.chimpchat.adb.AdbChimpDevice#startActivity(java.lang.String,
	 *      java.lang.String, java.lang.String, java.lang.String,
	 *      java.util.Collection, java.util.Map, java.lang.String, int)
	 */
	public void startActivity(String arg0, String arg1, String arg2,
			String arg3, Collection<String> arg4, Map<String, Object> arg5,
			String arg6, int arg7) {
		device.startActivity(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	/**
	 * @return
	 * @see com.android.chimpchat.adb.AdbChimpDevice#takeSnapshot()
	 */
	public IChimpImage takeSnapshot() {
		return device.takeSnapshot();
	}

	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return device.toString();
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @see com.android.chimpchat.adb.AdbChimpDevice#touch(int, int,
	 *      com.android.chimpchat.core.TouchPressType)
	 */
	public void touch(int arg0, int arg1, TouchPressType arg2) {
		device.touch(arg0, arg1, arg2);
	}

	/**
	 * @param arg0
	 * @see com.android.chimpchat.adb.AdbChimpDevice#type(java.lang.String)
	 */
	public void type(String arg0) {
		device.type(arg0);
	}

	/**
	 * 
	 * @see com.android.chimpchat.adb.AdbChimpDevice#wake()
	 */
	public void wake() {
		device.wake();
	}

	@Override
	public void touch(String imageName, TouchPressType pressType)
			throws IOException {
		Point point = findClickPoint(imageName);
		if (null != point) {
			device.touch(point.getX(), point.getY(), TouchPressType.DOWN_AND_UP);
		}
		else{
			//FIXME - Log
		}
	}

	@Override
	public void drag(String from, String to, int steps, long distance)
			throws IOException {
		Point fromPoint = findClickPoint(from);
		Point toPoint = findClickPoint(to);
		if(null!=fromPoint && null!=to){
			device.drag(fromPoint.getX(), fromPoint.getY(), toPoint.getX(), toPoint.getY(), steps, distance);
		}
		else{
			//FIXME - Log
		}

		
	}

	@Override
	public void waitFor(String imageName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void waitFor(String imageName, int timeout) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unlockDevice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lockDevice() {
		// TODO Auto-generated method stub

	}

	@Override
	public void startActivity(String component) {
		device.startActivity(null, null, null, null, new ArrayList<String>(),
				new HashMap<String, Object>(), component, 0);

	}

	private Finder getCurrentScreenFinder(IChimpDevice device) {
		BufferedImage buffImage = device.takeSnapshot().createBufferedImage();
		Rectangle rect = new Rectangle(0, 0, buffImage.getWidth(),
				buffImage.getHeight());
		ScreenImage screenImage = new ScreenImage(rect, buffImage);

		Finder finder = new Finder(screenImage, new Region(0, 0,
				buffImage.getWidth(), buffImage.getHeight()));

		return finder;
	}

	private void touch(Match match, IChimpDevice device) {

	}

	/**
	 * Find the Point for the given Image incurrent screen on Android
	 * 
	 * @param imageName
	 * @return
	 * @throws IOException
	 */
	private Point findClickPoint(String imageName) throws IOException {
		Point point = null;
		String actualImageName = imageResolver.getImagePath(imageName);
		Finder finder = getCurrentScreenFinder(device);
		finder.find(actualImageName, 0.7);
		if (finder.hasNext()) {
			Match match = finder.next();
			point = new Point(match.x + (match.w / 2), match.y + (match.h / 2));
		}
		return point;
	}

}
