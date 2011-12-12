/**
 * 
 */
package com.sparklytix.android.sikulichimp.resolver;

/**
 * @author rohit
 * 
 */
public class ScreenShotsPNGImageResolver implements IImageResolver {

	public static final String PREFIX = "screenshots/";
	public static final String POSTFIX = ".png";

	/**
	 * Given that the imageName is "button", this method returns
	 * "screenshots/button.png"
	 * 
	 * @param imageName
	 *            Name of the Image
	 * @return screenhots/<<imageName>>.png
	 */
	@Override
	public String getImagePath(String imageName) {
		return PREFIX + imageName + POSTFIX;
	}

}
