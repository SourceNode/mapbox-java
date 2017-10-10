package com.mapbox.directions.v5;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

/**
 * A wrapper class for the RetroFit callback which is used to add the direction request information
 * {@link com.mapbox.directions.v5.models.RouteOptions} object inside
 * {@link com.mapbox.directions.v5.models.DirectionsRoute}.
 *
 * @since 3.0.0
 */
abstract class DirectionsApiCallback<T> implements Callback<T> {

  @Override
  public void onResponse(Call<T> call, Response<T> response) {
    if (response.body() == null) {
      try {
        onFailure(call, new Throwable(response.errorBody().string()));
      } catch (IOException ioException) {
        ioException.printStackTrace();
      }
    }
  }

  @Override
  public void onFailure(Call<T> call, Throwable throwable) {

  }
}
