package Org;

import java.awt.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayDeque;

public class Person extends ArrayDeque<Person> implements Serializable {
    private static long ID = 0;
    private Long id = ++ID;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private Double height;
    private ColorEye eyeColor;
    private ColorHair hairColor;
    private Country nationality;
    private Location location;

    public Person(Long id, String name, Coordinates coordinates, LocalDateTime creationDate, Double height, ColorEye eyeColor, ColorHair hairColor, Country nationality, Location location) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.height = height;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.nationality = nationality;
        this.location = location;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setEyeColor(ColorEye eyeColor) {
        this.eyeColor = eyeColor;
    }

    public ColorEye getEyeColor(){return eyeColor;}

    public void setHairColor(ColorHair hairColor) {
        this.hairColor = hairColor;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return String.format("Идентификатор: %s%n" +
                        "Имя: %s%n" +
                        "Координата X : %s%n" +
                        "Координата Y : %s%n" +
                        "Дата создания: %s%n" +
                        "Рост: %s%n" +
                        "Цвет глаз: %s%n" +
                        "Цвет волос: %s%n" +
                        "Национальность: %s%n" +
                        "Локация: %n" +
                        "X: %d%n"+
                        "y: %d%n"+
                        "z: %d",
                id, name, coordinates.getX(), coordinates.getY(), creationDate, height, eyeColor, hairColor, nationality, location.getX(),location.getY(),location.getZ());
    }

    public ColorEye getColor() {
        return eyeColor;
    }

    public ColorHair getColorHair() {
        return hairColor;
    }

    public Country getCountry() {
        return nationality;
    }


    public Location getLocation() {
        return location;
    }
}