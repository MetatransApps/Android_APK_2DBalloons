package org.metatrans.apps.balloons.app;


import org.metatrans.apps.balloons.cfg.ads.AdsConfigurations_StopTheBalls;
import org.metatrans.commons.ads.api.IAdsConfigurations;
import org.metatrans.commons.cfg.appstore.IAppStore;


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
