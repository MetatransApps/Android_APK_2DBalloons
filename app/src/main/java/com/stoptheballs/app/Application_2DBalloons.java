package com.stoptheballs.app;


import org.metatransapps.commons.ads.api.IAdsConfigurations;
import org.metatransapps.commons.cfg.appstore.IAppStore;

import com.stoptheballs.cfg.ads.AdsConfigurations_StopTheBalls;


public class Application_2DBalloons extends Application_StopTheBalls {


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}


	protected IAdsConfigurations adsConfigurations 	= new AdsConfigurations_StopTheBalls(this);
	
	
	@Override
	public IAdsConfigurations getAdsConfigurations() {
		return adsConfigurations;
	}
}
