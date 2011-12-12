/**
 * 
 */
package com.sparklytix.android.sikulichimp.resolver;

/**
 * @author rohit
 * 
 */
public class PrefixPostFixImageResolver implements IImageResolver {

	private String prefix;
	private String postFix;
	
	public PrefixPostFixImageResolver(String prefix,String postFix){
		this.prefix=prefix;
		this.postFix=postFix;
	}
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
		return prefix + imageName + postFix;
	}

}
