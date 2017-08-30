package com.mapbox.services.api.directions.v5.models;

public class Voice {

  private String announcement;
  private String ssmlAnnouncement;
  private double[] announceAt;
  private double bearing;
  private double announceDistance;

  public String getAnnouncement() {
    return announcement;
  }

  public void setAnnouncement(String announcement) {
    this.announcement = announcement;
  }

  public String getSsmlAnnouncement() {
    return ssmlAnnouncement;
  }

  public void setSsmlAnnouncement(String ssmlAnnouncement) {
    this.ssmlAnnouncement = ssmlAnnouncement;
  }

  public double[] getAnnounceAt() {
    return announceAt;
  }

  public void setAnnounceAt(double[] announceAt) {
    this.announceAt = announceAt;
  }

  public double getBearing() {
    return bearing;
  }

  public void setBearing(double bearing) {
    this.bearing = bearing;
  }

  public double getAnnounceDistance() {
    return announceDistance;
  }

  public void setAnnounceDistance(double announceDistance) {
    this.announceDistance = announceDistance;
  }
}
