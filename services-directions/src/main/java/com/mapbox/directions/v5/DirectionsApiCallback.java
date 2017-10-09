package com.mapbox.directions.v5;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public abstract class DirectionsApiCallback<DirectionsResponse> implements Callback<DirectionsResponse> {

  @Override
  public void onResponse(Call<DirectionsResponse> call, Response<DirectionsResponse> response) {
    if (response.body() == null) {
      try {
        onFailure(call, new Throwable(response.errorBody().string()));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    System.out.println(response.body());
  }

  @Override
  public void onFailure(Call<DirectionsResponse> call, Throwable t) {

  }
}
