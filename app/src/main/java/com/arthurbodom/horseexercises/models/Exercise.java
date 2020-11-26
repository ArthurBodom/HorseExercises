package com.arthurbodom.horseexercises.models;

public class Exercise {

    private Integer id;
    private String name;
    private String category;
    private String level;
    private String strImage;
    private String description;
    private String objectives;
    private String warnings;
    private String pace;

    public Exercise(Integer id, String name, String category, String level, String strImage, String description, String objectives, String attention, String pace) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.level = level;
        this.strImage = strImage;
        this.description = description;
        this.objectives = objectives;
        this.warnings = attention;
        this.pace = pace;
    }

    public Exercise() {

    }

    public Integer getId() {
        return id;
    }

//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStrImage() {
        return strImage;
    }

    public void setStrImage(String strImage) {
        this.strImage = strImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }

    public String getWarnings() {
        return warnings;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getPace() {
        return pace;
    }

    public void setPace(String pace) {
        this.pace = pace;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", level='" + level + '\'' +
                ", strImage='" + strImage + '\'' +
                ", description='" + description + '\'' +
                ", objectives='" + objectives + '\'' +
                ", warnings='" + warnings + '\'' +
                ", pace='" + pace + '\'' +
                '}';
    }
}
