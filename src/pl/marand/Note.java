package pl.marand;

public class Note {
    private String phone;
    private String dateTime;
    private String description;

    public Note(String phone, String dateTime, String description) {
        this.phone = phone;
        this.dateTime = dateTime;
        this.description = description;
    }

    @Override
    public String toString() {  //tu też potrzebny toString, żeby każda z notatek wyświetliła swoje wewnętrzne informacje
        return "Note{" +
                "phone='" + phone + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
