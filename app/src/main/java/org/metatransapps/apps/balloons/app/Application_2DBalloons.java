package org.metatransapps.apps.balloons.app;


import org.metatransapps.apps.balloons.app.Application_StopTheBalls;
import org.metatransapps.apps.balloons.cfg.ads.AdsConfigurations_StopTheBalls;
import org.metatransapps.commons.ads.api.IAdsConfigurations;
import org.metatransapps.commons.cfg.appstore.IAppStore;


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
