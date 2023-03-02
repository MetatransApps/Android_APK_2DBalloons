package org.metatrans.apps.balloons.app;


import org.metatrans.apps.balloons.cfg.ads.AdsConfiguration_StopTheBalls;
import org.metatrans.commons.ads.api.IAdsProviders;
import org.metatrans.commons.ads.impl.AdsConfigurations_DynamicImpl;
import org.metatrans.commons.cfg.appstore.IAppStore;


public class Application_2DBalloons extends Application_StopTheBalls {


	@Override
	public void onCreate() {

		super.onCreate();

		getAdsConfigurations().addProviderConfig(
				IAdsProviders.ID_HOME_ADS,
				new AdsConfiguration_StopTheBalls()
		);
	}


	@Override
	public AdsConfigurations_DynamicImpl getAdsConfigurations() {

		return (AdsConfigurations_DynamicImpl) super.getAdsConfigurations();
	}


	@Override
	public IAppStore getAppStore() {
		return IAppStore.OBJ_FDROID_OFFICIAL;
	}
}
