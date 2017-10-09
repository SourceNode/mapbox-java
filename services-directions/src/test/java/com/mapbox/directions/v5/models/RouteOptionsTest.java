package com.mapbox.directions.v5.models;

import com.mapbox.services.TestUtils;
import org.junit.Assert;
import org.junit.Test;

public class RouteOptionsTest extends TestUtils {

  @Test
  public void sanity() throws Exception {
    RouteOptions routeOptions = RouteOptions.builder().profile("hello").build();
    Assert.assertNotNull(routeOptions);
    Assert.assertEquals("hello", routeOptions.profile());
  }
}
