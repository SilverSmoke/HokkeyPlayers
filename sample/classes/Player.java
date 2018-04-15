package sample.classes;

import java.time.LocalDate;

public class Player {
    private String name;
    private String patronymic;
    private String surname;

    private String citizenship;
    private String city;

    private String phonePlayer;
    private String phoneParental;

    private String emaiPlayer;
    private String emailParenal;

    private String role;

    private short sizeSweater;

    private boolean packageMain;
    private boolean packageAdditional;

    private LocalDate seasonStart;
    private LocalDate seasonEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhonePlayer() {
        return phonePlayer;
    }

    public void setPhonePlayer(String phonePlayer) {
        this.phonePlayer = phonePlayer;
    }

    public String getPhoneParental() {
        return phoneParental;
    }

    public void setPhoneParental(String phoneParental) {
        this.phoneParental = phoneParental;
    }

    public String getEmaiPlayer() {
        return emaiPlayer;
    }

    public void setEmaiPlayer(String emaiPlayer) {
        this.emaiPlayer = emaiPlayer;
    }

    public String getEmailParenal() {
        return emailParenal;
    }

    public void setEmailParenal(String emailParenal) {
        this.emailParenal = emailParenal;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public short getSizeSweater() {
        return sizeSweater;
    }

    public void setSizeSweater(short sizeSweater) {
        this.sizeSweater = sizeSweater;
    }

    public boolean isPackageMain() {
        return packageMain;
    }

    public void setPackageMain(boolean packageMain) {
        this.packageMain = packageMain;
    }

    public boolean isPackageAdditional() {
        return packageAdditional;
    }

    public void setPackageAdditional(boolean packageAdditional) {
        this.packageAdditional = packageAdditional;
    }

    public LocalDate getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(LocalDate seasonStart) {
        this.seasonStart = seasonStart;
    }

    public LocalDate getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(LocalDate seasonEnd) {
        this.seasonEnd = seasonEnd;
    }
}
