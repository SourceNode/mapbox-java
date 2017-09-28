package com.mapbox.services.api.directions.v5.models;

public class Voice {

  private String announcement;
  private String ssmlAnnouncement;
  private double distanceAlongGeometry;

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

  public double getDistanceAlongGeometry() {
    return distanceAlongGeometry;
  }

  public void setDistanceAlongGeometry(double distanceAlongGeometry) {
    this.distanceAlongGeometry = distanceAlongGeometry;
  }
}
