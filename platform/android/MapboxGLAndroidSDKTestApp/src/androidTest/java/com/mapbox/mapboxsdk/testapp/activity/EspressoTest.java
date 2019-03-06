package com.mapbox.mapboxsdk.testapp.activity;

import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.testapp.activity.espresso.EspressoTestActivity;
import com.mapbox.mapboxsdk.testapp.utils.LoadStyleIdlingResource;

/**
 * Base class for all tests using EspressoTestActivity as wrapper.
 * <p>
 * Uses {@link LoadStyleIdlingResource} to load "assets/streets.json" as style.
 * </p>
 */
public class EspressoTest extends BaseTest {

  @Override
  protected final Class getActivityClass() {
    return EspressoTestActivity.class;
  }

  @Override
  protected void initMap(MapboxMap mapboxMap) {
    super.initMap(mapboxMap);
    mapboxMap.setStyle("asset://streets.json");
  }
}
