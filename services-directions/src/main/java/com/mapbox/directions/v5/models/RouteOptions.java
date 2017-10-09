package com.mapbox.directions.v5.models;

import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.mapbox.directions.v5.DirectionsCriteria.ProfileCriteria;

/**
 * Provides information connected to your request that help when a new directions request is needing
 * using the identical parameters as the original request.
 *
 * For example, if I request a driving (profile) with alternatives and continueStraight set to true.
 * I make the request but loose reference and information which built the original request. Thus, If
 * I only want to change a single variable such as the destination coordinate, i'd have to have all
 * the other route information stores so the request was made identical to the previous but only now
 * using this new destination point.
 *
 * Using this class can provide you wth the information used when the {@link DirectionsRoute} was
 * made.
 *
 * @since 3.0.0
 */
@AutoValue
public abstract class RouteOptions {

  public static Builder builder() {
    return new AutoValue_RouteOptions.Builder();
  }

  @Nullable
  public abstract String user();

  @Nullable
  public abstract String profile();

  @Nullable
  public abstract Boolean alternatives();

  @Nullable
  public abstract String language();

  @Nullable
  abstract String radiuses();

  @Nullable
  abstract String bearings();

  @Nullable
  abstract Boolean continueStraight();

  @Nullable
  abstract String annotations();

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder user(String user);

    public abstract Builder profile(@Nullable @ProfileCriteria String Profile);

    public abstract Builder alternatives(Boolean alternatives);

    public abstract Builder language(String language);

    public abstract Builder radiuses(String radiuses);

    public abstract Builder bearings(String bearings);

    public abstract Builder continueStraight(Boolean continueStraight);

    public abstract Builder annotations(String annotations);


    public abstract RouteOptions build();
  }
}